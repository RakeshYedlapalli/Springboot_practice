package core.java.innerclass;

public class InnerClassExample {


    private String name;
    private String age;


    static class InnerClass {

        public void innerClassMethod() {
            System.out.println("This is inner class method");
        }
    }

    public static void main(String[] args) {
        InnerClassExample.InnerClass innerClass = new InnerClassExample.InnerClass();

        innerClass.innerClassMethod();
    }
}
