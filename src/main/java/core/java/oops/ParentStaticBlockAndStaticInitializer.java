package core.java.oops;

public class ParentStaticBlockAndStaticInitializer {


    {
        System.out.println("I am from Student class static block");
    }

    public void callParent() {
        System.out.println("I am  parent class");
    }


    public static void main(String[] args) {

        for (int i = 0 ; i<=255;i++) {
            System.out.println((char) i);
        }
    }
}
