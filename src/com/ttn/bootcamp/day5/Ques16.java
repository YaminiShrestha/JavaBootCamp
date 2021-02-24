package com.ttn.bootcamp.day5;

/**
 * Create a deadlock
 * here it is shows how deadlock occur
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ques16 {

    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        Ques16 ques16 = new Ques16();
//        thread1 is created
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    ques16.operation1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//        thread2 is created
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    ques16.operation2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//        start both the threads
        t1.start();
        t2.start();
    }

    /*
     * This method hold first operation where it acquire the lock1 first
     * @throws InterruptedException
     */
    public void operation1() throws InterruptedException {

        lock1.lock();
        System.out.println("lock1 acquired, waiting to acquire lock2.");
        Thread.sleep(50);

        lock2.lock();
        System.out.println("lock2 acquired");

        System.out.println("executing first operation.");
//      release the lock
        lock2.unlock();
        lock1.unlock();
    }

    /*
     * This method hold the second operation where the lock2 is acquired first
     * @throws InterruptedException
     */
    public void operation2() throws InterruptedException {

        lock2.lock();
        System.out.println("lock2 acquired, waiting to acquire lock1.");
        Thread.sleep(50);

        lock1.lock();
        System.out.println("lock1 acquired");

        System.out.println("executing second operation.");
//      release both the lock
        lock1.unlock();
        lock2.unlock();
    }
}