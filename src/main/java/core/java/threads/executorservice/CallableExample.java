package core.java.threads.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<String> {

    @Override
    public String call() throws Exception {
        // Task logic goes here
        return "Task completed successfully!";
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> myCallable = new CallableExample();
        Future<String> future = executorService.submit(myCallable);

        try {
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
