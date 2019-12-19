package com.shetu.tacocloud.temporary.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MultiThreadingExecutor {
    public static void main(String[] args) {
       //create an object of Executors , take an instance of Executors having newSingleThreadExecutor()
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //call the submit() from executor and inside implement the lambda expres
        // sion, and print the thread name
        executorService.submit(() ->{

            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
        });
    }
}
