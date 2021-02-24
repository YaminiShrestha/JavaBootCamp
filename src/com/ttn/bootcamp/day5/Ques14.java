package com.ttn.bootcamp.day5;

/**
 * Coordinate multiple threads using wait() and notifyAll()
 */

import java.util.Scanner;

class Processor14 {
    /*
     * this method will called by producer thread
     * @throws InterruptedException
     */
    public void produce1() throws InterruptedException {
//        Only one thread is permitted to  at a time.
        synchronized (this) {
            System.out.println("Producer produce1 thread is running...");
//           producer thread waits
            wait();
            System.out.println("Resumed....");
        }
    }


    /*
     * this function called by producer2 thread
     * @throws InterruptedException
     */
    public void produce2() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer produce2 thread is running...");
//            producer2 thread will wait
            wait();
            System.out.println("Resumed....");
        }
    }


    /*
     * this function called by consumer thread
     * @throws InterruptedException
     */
    public void consume() throws InterruptedException {
        Scanner s = new Scanner(System.in);
//        sleep for specified number of milliseconds
        Thread.sleep(2000);

        synchronized (this) {
            System.out.println("Waiting for some key...");
            s.nextLine();
            System.out.println("Key is pressed");
//            notify all the waiting threads to wakeup
            notifyAll();
        }
    }
}

public class Ques14 {
    public static void main(String[] args) throws InterruptedException {
        final Processor14 processor14 = new Processor14();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor14.produce1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor14.produce2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor14.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//     start all the threads
        t1.start();
        t3.start();
        t2.start();

        // main thread will wait for both
        // threads to complete execution
        t1.join();
        t3.join();
        t2.join();
    }
}


