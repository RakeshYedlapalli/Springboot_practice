package com.gap.sample.practice.Springboot_practice.rest.bean;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {
    public static void main(String[] args) {
        Callable<Integer> callableTask = () -> {
            // Simulating a long-running task
            Thread.sleep(10000);
            return 42;
        };

        FutureTask<Integer> futureTask = new FutureTask<>(callableTask);

        // Start executing the task in a separate thread
        Thread thread = new Thread(futureTask);
        thread.start();

        // Do some other work while the task is running...

        try {
            // Wait for the task to complete and get the result
            int result = futureTask.get();
            System.out.println("Result: " + result);

            doSomething();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
    public static void doSomething() throws InterruptedException {
        for (int i=0;i<10;i++) {
            Thread.sleep(1000);
            System.out.println("I am in doSomething");
        }
    }
}
