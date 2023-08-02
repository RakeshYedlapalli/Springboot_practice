package core.java.threads;

public class JavaObjectLockClassLock {

    public static void main(String[] args) {


        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();

    }

    public static synchronized void m1() {
        System.out.println("M1 run method being call ->" + Thread.currentThread().getName());
    }

    public static synchronized void m2(){
        System.out.println("M2 run method being call ->" + Thread.currentThread().getName());
    }
}

class Thread1 extends Thread {

    JavaObjectLockClassLock javaObject1;



    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            javaObject1.m1();
            javaObject1.m2();
        }
    }
}

class Thread2 extends Thread {

    JavaObjectLockClassLock javaObject2;


    @Override
    public void run() {

        for(int i=0;i<10;i++) {
            javaObject2.m1();
            javaObject2.m2();
        }

    }
}
