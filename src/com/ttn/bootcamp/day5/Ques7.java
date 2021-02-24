package com.ttn.bootcamp.day5;

/**
 * Submit List of tasks to ExecutorService and wait for the completion of all the tasks.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor7 implements Runnable {
    private int id;

    //    constructor
    public Processor7(int id) {
        this.id = id;
    }

    //      method which would be called upon the start of execution of a thread
    public void run() {
        System.out.println("Starting: " + id);

        try {
//            sleep for specified number of milliseconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Completed: " + id);
    }
}

public class Ques7 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 4; i++) {
            executor.submit(new Processor7(i));
        }
//      shutdown the executor
        executor.shutdown();
    }
}
