package core.java.threads;

public class EqualsTesting {

    public static void main(String[] args) {


        String server1 = "ssh SA_Yrakesh@g-vmx-2p-spcdb-gamongors-001.prod.azeus.gaptech.com";
        String server2 = "ssh SA_Yrakesh@g-vmx-2p-spcdb-gamongors-001.prod.azeus.gaptech.com";
        String server3 = "ssh SA_Yrakesh@g-vmx-2p-spcdb-gamongors-002.prod.azeus.gaptech.com";

        System.out.println(server1.equals(server2));
    }
}
