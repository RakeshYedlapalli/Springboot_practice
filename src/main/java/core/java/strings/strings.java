package core.java.strings;

public class strings {

    public static void main(String[] args){

        String s1 = "Print world";

        String s2 = "Print world";

        String s3  = new String("Print world");

        String s4 = new String("Print world");


        System.out.println(s1==s2);
        System.out.println(s3==s4);
        //System.out.println(s1==s4);



        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());



        String constantString1 = "Baeldung";
        String constantString2 = "Baeldung";

        strings string = new strings();
        string.throwAndException();

    }

    public  void throwAndException() throws OutOfMemoryError{

        //throw new NullPointerException("fafad");
    }

    public void callMethod () throws Exception {
        throwAndException();
    }
}
