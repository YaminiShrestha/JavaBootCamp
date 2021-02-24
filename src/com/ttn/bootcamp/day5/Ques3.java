package com.ttn.bootcamp.day5;


/**
 * Use a singleThreadExecutor to submit multiple threads.
 */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor3 implements Runnable {
    private int id;

    public Processor3(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting.." + id);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed " + id);
    }
}


public class Ques3 {
    public static void main(String[] args) {
//      Instantiating a ThreadPoolExecutor with 2 threads using an Executors factory method:
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
//            execute task using submit() method
            executorService.submit(new Processor3(i));
        }
//        Shut down the executor service
        executorService.shutdown();
        System.out.println("All task submitted");

        try {
//         blocks until tasks in the thread pool completes the execution or time for execution elapses.
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All task completed");
    }
}

