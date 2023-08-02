package core.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

    ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        ExecutorService executorService =
                new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<>());

//        Stream<String> stream1 = Stream.of(s1, s2);
//        Stream<String> stream2 = Stream.of(s2, s3);
        //stream1.merge(stream2);
//        Stream.concat(stream1, stream2);

        Runnable runnableTask = () -> {
            try {
                System.out.println("Before going to sleep runnable task");
                TimeUnit.MILLISECONDS.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Callable<String> callableTask = () -> {
            System.out.println("Before going to callable task");
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);


        executorService.execute(runnableTask);

        Future<String> future =
                executorService.submit(callableTask);


        String result = executorService.invokeAny(callableTasks);


        executorService.shutdown();


    }

    public void doubleChecking() {

        if (executor == null) {

            synchronized (ExecutorServiceExample.class) {

                if (executor == null) {
                    executor = Executors.newFixedThreadPool(10);
                }
            }
        }

        return;
    }
}
