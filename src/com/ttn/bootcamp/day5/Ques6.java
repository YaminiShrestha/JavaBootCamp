package com.ttn.bootcamp.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Return a Future from ExecutorService by using callable and use get(), isDone(),
 * isCancelled() with the Future object to know the status of task submitted
 */

/*
 * This class implement callable interface
 * Integer datatype is used in callable
 * Overriding the call method
 * @return Random number under a specific bound
 */
class Task1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(100);
        return new Random().nextInt(100);
    }
}

public class Ques6 {
    public static void main(String[] args) {
//      Get ExecutorService from Executors utility class, thread pool size is 3
        ExecutorService service = Executors.newFixedThreadPool(3);

//        create a list to hold the Future object associated with Callable
        List<Future> allFuture = new ArrayList<Future>();

//    submit Callable tasks to be executed by thread pool
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = service.submit(new Task1());
//         add future to the list, we can get return value using Future
            allFuture.add(future);
        }

//        some other operations
        System.out.println("other operations");

        for (int i = 0; i < 10; i++) {

            Future<Integer> future = allFuture.get(i);
            try {
//              future.get() waits for task to get completed
                Integer result = future.get();
                System.out.println("Result of future is" + result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

//            check if task is completed or not
            System.out.println(future.isDone());

//            check if task is cancelled or not
            System.out.println(future.isCancelled());

//            shutdown the executor service now
            service.shutdown();
        }


    }
}
