package core.java.threads;

public class WaitNotifyAndNotifyAll extends Thread  {


    WaitNotifyAndNotifyAll(String name){
        super(name);
    }
    int t = 0;

    @Override
    public void run() {
        synchronized (this) {

            for (int i = 0; i < 10; i++) {

                t = t + i;
                System.out.println("This is "+ Thread.currentThread().getName());
                //break;
            }
            this.notifyAll();
        }
    }
}

class A {


    public static void main(String[] args) throws InterruptedException {

        WaitNotifyAndNotifyAll waitNotifyAndNotifyAll = new WaitNotifyAndNotifyAll("Thread 1");
        waitNotifyAndNotifyAll.start();

        WaitNotifyAndNotifyAll waitNotifyAndNotifyAll2 = new WaitNotifyAndNotifyAll("Thread 2");
        waitNotifyAndNotifyAll2.start();
        WaitNotifyAndNotifyAll waitNotifyAndNotifyAll3 = new WaitNotifyAndNotifyAll("Thread 3");
        waitNotifyAndNotifyAll3.start();
        WaitNotifyAndNotifyAll waitNotifyAndNotifyAll4 = new WaitNotifyAndNotifyAll("Thread 4");
        waitNotifyAndNotifyAll4.start();
        WaitNotifyAndNotifyAll waitNotifyAndNotifyAll5 = new WaitNotifyAndNotifyAll("Thread 5");
        waitNotifyAndNotifyAll5.start();
        synchronized (waitNotifyAndNotifyAll) {

            System.out.println("Main Thread");

            waitNotifyAndNotifyAll.wait();
            waitNotifyAndNotifyAll2.wait();
            waitNotifyAndNotifyAll3.wait();
            waitNotifyAndNotifyAll4.wait();
            waitNotifyAndNotifyAll5.wait();

            System.out.println("Main Thread got notified");
            System.out.println(waitNotifyAndNotifyAll.t);
        }
    }
}
