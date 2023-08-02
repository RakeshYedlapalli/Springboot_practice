package newpackage;

import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.bouncycastle.openpgp.PGPCompressedData;
import org.bouncycastle.openpgp.PGPCompressedDataGenerator;
import org.bouncycastle.openpgp.PGPEncryptedDataGenerator;
import org.bouncycastle.openpgp.PGPEncryptedDataList;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.openpgp.PGPLiteralData;
import org.bouncycastle.openpgp.PGPObjectFactory;
import org.bouncycastle.openpgp.PGPPrivateKey;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPPublicKeyEncryptedData;
import org.bouncycastle.openpgp.PGPPublicKeyRing;
import org.bouncycastle.openpgp.PGPPublicKeyRingCollection;
import org.bouncycastle.openpgp.PGPSecretKey;
import org.bouncycastle.openpgp.PGPSecretKeyRingCollection;
import org.bouncycastle.openpgp.PGPUtil;
import org.bouncycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;
import org.bouncycastle.openpgp.operator.jcajce.JcePBESecretKeyDecryptorBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcePGPDataEncryptorBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcePublicKeyDataDecryptorFactoryBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcePublicKeyKeyEncryptionMethodGenerator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Iterator;

public class PGPFileEncryption {

    static String  inputFile = "/Users/yadlapallirakesh/Documents/rakesh-yedlapalli-git-workspace/Spring-boot/SpringBootPracticeworkspace/Springboot_practice/src/main/java/newpackage/file.txt";
    static String publicKeyFile = "/Users/yadlapallirakesh/Documents/rakesh-yedlapalli-git-workspace/Spring-boot/SpringBootPracticeworkspace/Springboot_practice/src/main/java/newpackage/publickey.asc";
    static String encryptedOutputFile = "/Users/yadlapallirakesh/Documents/rakesh-yedlapalli-git-workspace/Spring-boot/SpringBootPracticeworkspace/Springboot_practice/src/main/java/newpackage/encrypted_file.pgp";
    static String decryptedOutputFile = "/Users/yadlapallirakesh/Documents/rakesh-yedlapalli-git-workspace/Spring-boot/SpringBootPracticeworkspace/Springboot_practice/src/main/java/newpackage/decrypted.txt";

    public static void main(String[] args) {
        // Replace the following variables with the appropriate values

        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

        try {
            // Load public key
            PGPPublicKey publicKey = loadPublicKey(publicKeyFile);

            // Encrypt the file
            encryptFile(inputFile, encryptedOutputFile, publicKey);

            System.out.println("File encryption complete.");

            // Decrypt the file
            decryptFile(encryptedOutputFile, decryptedOutputFile);

            System.out.println("File decryption complete.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static PGPPublicKey loadPublicKey(String publicKeyFile) throws IOException, PGPException {
        InputStream keyIn = new BufferedInputStream(new FileInputStream(publicKeyFile));
        PGPPublicKeyRingCollection pgpPub = new PGPPublicKeyRingCollection(PGPUtil.getDecoderStream(keyIn), new JcaKeyFingerprintCalculator());
        PGPPublicKey publicKey = null;

        // Iterate through the key rings to find the encryption key
        Iterator<PGPPublicKeyRing> keyRingIter = pgpPub.getKeyRings();
        while (publicKey == null && keyRingIter.hasNext()) {
            PGPPublicKeyRing keyRing = keyRingIter.next();

            Iterator<PGPPublicKey> keyIter = keyRing.getPublicKeys();
            while (publicKey == null && keyIter.hasNext()) {
                PGPPublicKey key = keyIter.next();

                if (key.isEncryptionKey()) {
                    publicKey = key;
                }
            }
        }

        if (publicKey == null) {
            throw new IllegalArgumentException("No encryption key found in the public key file!");
        }

        return publicKey;
    }

    private static void encryptFile(String inputFile, String outputFile, PGPPublicKey publicKey)
            throws IOException, PGPException {
        OutputStream encryptedOut = new BufferedOutputStream(new FileOutputStream(outputFile));

        PGPEncryptedDataGenerator encryptedDataGenerator = new PGPEncryptedDataGenerator(
                new JcePGPDataEncryptorBuilder(SymmetricKeyAlgorithmTags.CAST5)
                        .setWithIntegrityPacket(true)
                        .setSecureRandom(new SecureRandom())
        );
        encryptedDataGenerator.addMethod(new JcePublicKeyKeyEncryptionMethodGenerator(publicKey).setProvider("BC"));

        OutputStream encryptedStream = encryptedDataGenerator.open(encryptedOut, new byte[4096]);

        PGPCompressedDataGenerator compressedDataGenerator = new PGPCompressedDataGenerator(PGPCompressedData.ZIP);
        OutputStream compressedStream = compressedDataGenerator.open(encryptedStream, new byte[4096]);

        PGPUtil.writeFileToLiteralData(
                compressedStream,
                PGPLiteralData.BINARY,
                new File(inputFile),
                new byte[4096]
        );

        compressedStream.close();
        compressedDataGenerator.close();
        encryptedStream.close();
        encryptedDataGenerator.close();
        encryptedOut.close();
    }

    private static void decryptFile(String inputFile, String outputFile)
            throws IOException, PGPException {
        InputStream encryptedIn = new BufferedInputStream(new FileInputStream(inputFile));
        InputStream decodedIn = PGPUtil.getDecoderStream(encryptedIn);

        PGPObjectFactory pgpFactory = new PGPObjectFactory(decodedIn, new JcaKeyFingerprintCalculator());
        Object object = pgpFactory.nextObject();

        if (object instanceof PGPEncryptedDataList) {
            PGPEncryptedDataList encryptedDataList = (PGPEncryptedDataList) object;

            // Find the private key for decryption
            PGPPublicKeyEncryptedData encryptedData = (PGPPublicKeyEncryptedData) encryptedDataList.get(0);
            PGPPrivateKey privateKey = findDecryptionKey(encryptedData.getKeyID());

            InputStream decryptedData = encryptedData.getDataStream(
                    new JcePublicKeyDataDecryptorFactoryBuilder().setProvider("BC").build(privateKey));

            PGPObjectFactory decryptedFactory = new PGPObjectFactory(decryptedData, new JcaKeyFingerprintCalculator());
            Object decryptedObject = decryptedFactory.nextObject();

            if (decryptedObject instanceof PGPLiteralData) {
                PGPLiteralData literalData = (PGPLiteralData) decryptedObject;
                InputStream literalIn = literalData.getInputStream();

                OutputStream decryptedOut = new BufferedOutputStream(new FileOutputStream(outputFile));

                int ch;
                while ((ch = literalIn.read()) >= 0) {
                    decryptedOut.write(ch);
                }

                decryptedOut.close();
            }
        } else {
            throw new PGPException("PGP encrypted data not found in the input file!");
        }

        encryptedIn.close();
    }

    private static PGPPrivateKey findDecryptionKey(long keyId) throws IOException, PGPException {
        PGPSecretKeyRingCollection secretKeys = new PGPSecretKeyRingCollection(
                PGPUtil.getDecoderStream(new FileInputStream(publicKeyFile)), new JcaKeyFingerprintCalculator());

        PGPSecretKey secretKey = secretKeys.getSecretKey(keyId);
        if (secretKey == null) {
            throw new IllegalArgumentException("No secret key found for key ID: " + Long.toHexString(keyId));
        }

        return secretKey.extractPrivateKey(
                new JcePBESecretKeyDecryptorBuilder().setProvider("BC").build("your_passphrase".toCharArray()));
    }
}
