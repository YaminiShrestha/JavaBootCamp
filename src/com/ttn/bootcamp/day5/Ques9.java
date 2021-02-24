package com.ttn.bootcamp.day5;

/**
 * Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task9 implements Runnable {
    //    String name variable
    private String name;

    //    constructor
    public Task9(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //    method which would be called upon the start of execution of a thread
    public void run() {
        try {
            Long duration = (long) (Math.random() * 10);
            System.out.println("Executing : " + name);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class Ques9 {
    public static void main(String[] args) {
//      Instantiating a ThreadPoolExecutor with 2 threads using an Executors factory method:
        ExecutorService fixedService = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            Task9 task = new Task9("Task of fixedThread " + i);
            System.out.println("Created of fixedThread: " + task.getName());
//          executing the task
            fixedService.execute(task);
        }
//        shutdown the executor
        fixedService.shutdown();


//      Instantiate a threadPoolExecutor that  creates new threads as needed
//      but will reuse previously constructed threads when they are available.
        ExecutorService cachedService = Executors.newCachedThreadPool();
        for (int i = 1; i <= 5; i++) {
            Task9 task = new Task9("Task of cachedThread" + i);
            System.out.println("Created of cachedThread : " + task.getName());
//         executing the task
            cachedService.execute(task);
        }
//        shutdown the executor
        cachedService.shutdown();


    }
}
