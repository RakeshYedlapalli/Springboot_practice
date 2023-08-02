package core.java.threads;

public class DaemonThreads extends Thread {


    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            System.out.println("thread running");
        }

    }

    public static void main(String[] args) {


        DaemonThreads daemonThreads = new DaemonThreads();
        daemonThreads.start();
        daemonThreads.start();
//        daemonThreads.setDaemon(true);
    }
}
