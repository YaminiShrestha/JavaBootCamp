package com.ttn.bootcamp.day5;

/**
 * Use Re-entrant lock for coordinating 2 threads with signal(), signalAll() and wait().
 */

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Runner15 {

    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();

    /*
     * this method will increment the count
     * multiple threads trying to access this method on the same Object
     */
    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }


    public void firstThread() throws InterruptedException {
//        acquire the lock
        lock.lock();

        System.out.println("Waiting.....");
//       This will wait until the value changes
        cond.await();
        System.out.println("Woken Up.....");

        try {
//            function is called
            increment();
        } finally {
//            release the lock
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException {

        Thread.sleep(1000);
//        second thread acquire lock when firstThread waits
        lock.lock();

        System.out.println("Press the return Key !!");

        new Scanner(System.in).nextLine();
        System.out.println("Got return Key !!");
//      Let waiting threads know that the value has changed
        cond.signal();

        try {
//            function is called
            increment();
            System.out.println("SignalAll is invoked");
//            woke up all the threads that are waiting
            cond.signalAll();
        } finally {
//            release the lock
            lock.unlock();
        }
    }

    // this method will print the count of numbers
    public void finished() {
        System.out.println("Count is: " + count);
    }
}

public class Ques15 {
    public static void main(String[] args) throws Exception {


        final Runner15 runner15 = new Runner15();
//       thread1 is created by runnable interface
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    firstThread is called
                    runner15.firstThread();
//                    catch if exception occurs
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//      thread t2 is created using runnable
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner15.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//        start both the thread
        t1.start();
        t2.start();
//        t1 will finishes before t2
        t1.join();
        t2.join();
//        finished method is called
        runner15.finished();
    }
}