package core.java.practice.serialization.util;

import core.java.practice.serialization.AppleProduct;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DeserializationUtility {

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        String serializedObj ="rO0ABXNyAC1jb3JlLmphdmEucHJhY3RpY2Uuc2VyaWFsaXphdGlvbi5BcHBsZVByb2R1Y3QAAAAAABLWhwIAAkwADWhlYWRwaG9uZVBvcnR0ABJMamF2YS9sYW5nL1N0cmluZztMAA90aHVuZGVyYm9sdFBvcnRxAH4AAXhwdAARaGVhZHBob25lUG9ydDIwMjB0ABN0aHVuZGVyYm9sdFBvcnQyMDIw";
        System.out.println(
                "Deserializing AppleProduct...");

        AppleProduct deserializedObj = (AppleProduct) deSerializeObjectFromString(
                serializedObj);

        System.out.println(
                "Headphone port of AppleProduct:"
                        + deserializedObj.getHeadphonePort());
        System.out.println(
                "Thunderbolt port of AppleProduct:"
                        + deserializedObj.getThunderboltPort());
    }

    public static Object deSerializeObjectFromString(String s)
            throws IOException, ClassNotFoundException {

        byte[] data = Base64.getDecoder().decode(s);
        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(data));
        Object o = ois.readObject();
        ois.close();


        List<String> list =  new ArrayList<>();
        //CompletableFuture
        return o;
    }
}
