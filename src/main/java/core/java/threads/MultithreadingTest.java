package core.java.threads;

public class MultithreadingTest implements Runnable {

    @Override
    public void run() {
        try {
            // Displaying the running Thread

            for (int i = 0; i <= 10; i++) {
                System.out.println(
                        "Thread " + Thread.currentThread().getId()
                                + " is running");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // exception is caught if occurred
            System.out.println("Exception has occurred and is caught");
        }
    }
}

class MultithreadMain {

    public static void main(String[] args) {

     //   MultithreadingTest m = new MultithreadingTest();
        //m.run();


        int n = 6;    // Number of threads
        for (int i = 0; i < n; i++) {
            Thread obj
                    = new Thread(new MultithreadingTest());
            obj.start();
        }
    }
}
