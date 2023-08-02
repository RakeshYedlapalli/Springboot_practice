package core.java.threads.daemon;

public class DaemonThread extends  Thread {


    public DaemonThread(String threadName){
        super(threadName);
    }

    @Override
    public void run() {

        if (Thread.currentThread().isDaemon()) {
            System.out.println("This is daemon thread" + Thread.currentThread().getName());
        } else {
            System.out.println("This is User defined thread ->" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {


        DaemonThread daemonThread1  = new DaemonThread("t1");

        daemonThread1.setDaemon(true);
        daemonThread1.start();


        DaemonThread daemonThread2  = new DaemonThread("t2");
        daemonThread2.start();

        DaemonThread daemonThread3  = new DaemonThread("t3");

        daemonThread3.setDaemon(true);
        daemonThread3.start();
        DaemonThread daemonThread4  = new DaemonThread("t4");
        daemonThread4.setDaemon(true);
        daemonThread4.start();


    }
}
