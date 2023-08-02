package core.java.innerclass;

public class LocalInnerClass {


    public void display() {

        //for (int i = 0; i < 1000; i++) {
            class LocalMethodInnerClass {

                public void m1(){
                    System.out.println("Local inner class is been called");
                }
            }
        //}

        LocalMethodInnerClass localInnerClass = new LocalMethodInnerClass();

            localInnerClass.m1();


    }

    public static void main(String[] args) {

        LocalInnerClass l
                 = new LocalInnerClass();
        l.display();
    }
}
