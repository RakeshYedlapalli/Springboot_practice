package core.java.threads.executorservice;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample implements Callable {
    public static void main(String[] args) throws InterruptedException {

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores are =>" + cores);
        // Create a CompletableFuture that will eventually hold an Integer result
        LocalTime startTime = LocalTime.now();

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Simulate some time-consuming computation
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42; // The result of the computation
        });

        Thread.sleep(10000);

        LocalTime endTime = LocalTime.now();
        long secondsDifference = calculateTimeDifferenceInSeconds(startTime, endTime);
        System.out.println("number of seconds is ->"+ secondsDifference);

        try {

            int result = future.get();
            LocalTime endTime1 = LocalTime.now();
            long secondsDifference2 = calculateTimeDifferenceInSeconds(endTime, endTime1);
            System.out.println("number of seconds is 2 ->"+ secondsDifference2);

            System.out.println("Before result is derived");
            System.out.println("Result: " + result);



        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object call() throws Exception {
        return null;
    }

    private static long calculateTimeDifferenceInSeconds(LocalTime startTime, LocalTime endTime) {
        // Calculate the time difference in seconds using ChronoUnit
        return ChronoUnit.SECONDS.between(startTime, endTime);
    }
}