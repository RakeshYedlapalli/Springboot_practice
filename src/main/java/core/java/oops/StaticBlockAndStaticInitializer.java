package core.java.oops;

public class StaticBlockAndStaticInitializer extends  ParentStaticBlockAndStaticInitializer {

    static  {
        System.out.println("hello world");
    }

    static  {
        System.out.println("hello world 2");
    }

    static  {
        System.out.println("hello world 3");
    }



    static  {
        System.out.println("hello world4");
    }

    static  {
        System.out.println("hello world5");
    }

    static  {
        System.out.println("hello world6");
    }


    {
        System.out.println("THis is instance block");
    }


    public static void main(String[] args) {

        System.out.println("system");

        StaticBlockAndStaticInitializer s = new StaticBlockAndStaticInitializer();
    }
}
