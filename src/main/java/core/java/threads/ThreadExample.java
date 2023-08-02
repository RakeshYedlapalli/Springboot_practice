package core.java.threads;

public class ThreadExample extends Thread{

    @Override
    public void run() {

        for(int i=0;i<10;i++) {
            System.out.println("Hello this is ->" + Thread.currentThread());
        }
    }

    public static void main(String[] args) {

        ThreadExample th = new ThreadExample();
        Thread th2 = new Thread(th);
        th2.start();


        ThreadExample th3 = new ThreadExample();
        Thread th4 = new Thread(th3);
        th4.start();



    }
}
