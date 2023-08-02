package core.java.threads;

public class JavaClassLock {


    public static String hell = "hello";
    public static void main(String[] args) {


        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();

        thread3.start();
        thread4.start();

    }

    public void hel(){

        String ss = hell;
        String what = hell;
    }

    public static synchronized void m1() {
        System.out.println("M1 run method being call ->" + Thread.currentThread().getName());
    }

    public static synchronized void m2() {
        System.out.println("M2 run method being call ->" + Thread.currentThread().getName());
    }
}

class Thread3 extends Thread {

    JavaClassLock javaClassLock;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            javaClassLock.m1();
            JavaClassLock.m2();
        }
    }
}

class Thread4 extends Thread {

    JavaClassLock javaClassLock ;
    @Override
    public void run() {

        JavaClassLock javaClassLock  = new JavaClassLock();
        String mm = javaClassLock.hell;

        for (int i = 0; i < 10; i++) {
            JavaClassLock.m1();
            JavaClassLock.m2();
        }

    }
}
