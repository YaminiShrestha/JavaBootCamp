package com.ttn.bootcamp.day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Use isShutDown() and isTerminated() with ExecutorService.
 */
class Task implements Runnable {

    @Override
    public void run() {
        try {
//            print the current thread name
            System.out.println("Running Thread Name: " + Thread.currentThread().getName());
//      sleep for 100 milliseconds
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed Thread Name: " + Thread.currentThread().getName());
    }
}

public class Ques5 {
    public static void main(String[] args) {
//         Instantiating a ThreadPoolExecutor with 2 threads using an Executors factory method:
        ExecutorService executorService = Executors.newFixedThreadPool(2);

//        execute task using submit() method
        executorService.submit(new Task());

//     isShutdown tells whether the invoking executor is shutdown or not. Returns true if shutdown, otherwise returns false.
        System.out.println(" Is Executor is shutdown :" + executorService.isShutdown());
        executorService.submit(new Task());
        executorService.submit(new Task());


//      shutdown  causes all the currently executing tasks to terminate
//      after completion in the order in which they were started and rejects any new incoming tasks.
        executorService.shutdown();
        System.out.println(" Is Executor is shutdown :" + executorService.isShutdown());


//     isTerminated checks if all the tasks have been completed post shutdown.
//     Return true if completed, otherwise returns false.
        System.out.println(" Is Executor is Terminated :" + executorService.isTerminated());
    }
}
