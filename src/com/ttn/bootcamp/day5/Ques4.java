package com.ttn.bootcamp.day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Try shutdown() and shutdownNow() and observe the difference.
 */

/*
 * This class will implement Runnable to create the thread
 * variable is id of type int
 * The run method run the specific task
 */
class Processor4 implements Runnable {
    @Override
    public void run() {
        try {
//          print the current thread name
            System.out.println("Running Thread Name: " + Thread.currentThread().getName());
//      sleep for 100 milliseconds
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed Thread Name: " + Thread.currentThread().getName());


    }
}


public class Ques4 {
    public static void main(String[] args) throws InterruptedException {
//      Instantiating a ThreadPoolExecutor with 2 threads using an Executors factory method:
        ExecutorService executor = Executors.newFixedThreadPool(2);

//            execute task using submit() method
        for (int i = 0; i < 5; i++) {
            executor.submit(new Processor4());
        }

//       shutdown() will initiates an orderly shutdown in which previously submitted
//       tasks are executed, but no new tasks will be accepted. T
        executor.shutdown();

        System.out.println(" Is Executor is shutdown :" + executor.isShutdown());

        try {
            // Wait a while for existing tasks to terminate
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
//              shutdownNow() attempts to stop all actively executing tasks, halts the processing of waiting tasks,
//               and returns a list of the tasks that were awaiting execution.
                System.out.println("Stopping the thread");
                executor.shutdownNow();
            }
        } catch (InterruptedException ie) {
            // (Re-)Cancel if current thread also interrupted
            executor.shutdownNow();

        }

    }
}
