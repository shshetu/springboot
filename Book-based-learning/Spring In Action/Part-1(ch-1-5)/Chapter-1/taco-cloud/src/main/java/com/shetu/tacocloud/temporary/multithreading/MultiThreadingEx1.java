package com.shetu.tacocloud.temporary.multithreading;

import java.util.concurrent.TimeUnit;

public class MultiThreadingEx1 {
    public static void main(String[] args) {
     //create runnable using lambda expression
    Runnable runnable = () -> {
        //Using try-catch, print 2 lines , between them use both : TimeUnit.SECONDS.sleep(1)-enum and Thread.sleep(1000) sequentially
   try {
    String name = Thread.currentThread().getName();
       System.out.println("Foo "+name);
//       TimeUnit.SECONDS.sleep(1);
       Thread.sleep(1000);
       System.out.println("Bar "+name);
   }catch (Exception e){
        e.printStackTrace();
   }
    };
        //call the start method
        Thread thread = new Thread(runnable);
        thread.start();

    }

}
