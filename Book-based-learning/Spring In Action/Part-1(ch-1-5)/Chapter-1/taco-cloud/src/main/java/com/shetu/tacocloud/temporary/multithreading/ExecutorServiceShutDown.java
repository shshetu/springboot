package com.shetu.tacocloud.temporary.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceShutDown {
    public static void main(String[] args) {
        //create an object of ExecutorService and take the newSingleThreadInstance()
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //call the submit method and use lambda expression inside
        executorService.submit(() ->{
            System.out.println(Thread.currentThread().getName());
        });
        /*use try catch finally :
        * inside try: call shutdown() method and use awaitTermination for 5 seconds
        * inside catch: print the customized exception
        * inside finally: make a logic if exectuor is not terminated then print a line
        * and call the shutdownNow() method
        * */
        try {
            System.out.println("Attempt to shutdown executor");
            executorService.shutdown();
            executorService.awaitTermination(5,TimeUnit.SECONDS); //TimeUnit is an enum

        } catch (InterruptedException e) {
            System.out.println("tasks interrupted");
        } finally {
            if(!executorService.isTerminated()){
                System.out.println("cancel non-finished tasks");
            }
            executorService.shutdownNow();
            System.out.println("Shut down finished");

        }
    }
}
