package com.ttn.bootcamp.day5;

/**
 * Coordinate 2 threads using wait() and notify().
 */

import java.util.Scanner;

class Processor13 {
    /*
     * this method will called by producer thread
     * @throws InterruptedException
     */
    void Produce() throws InterruptedException {
//        Only one thread is permitted to  at a time.
        synchronized (this) {
            System.out.println("Produce Thread running ...");
//          producer thread waits
            wait();
            System.out.println("Resumed.");
        }
    }

    /*
     * this function called by consumer thread
     * @throws InterruptedException
     */
    void Consume() throws InterruptedException {
        Scanner scn = new Scanner(System.in);
//        sleep for specified time so that thread1 can start first
        Thread.sleep(100);
//       Only one thread is permitted to   at a time.
        synchronized (this) {
            System.out.println("Waiting for return key");
            scn.nextLine();
            System.out.println("Return key pressed");
//          notify the producer thread to wakeup
            notify();
            Thread.sleep(200);
        }
    }
}


public class Ques13 {
    public static void main(String[] args) throws InterruptedException {
        final Processor13 processor13 = new Processor13();
//        thread1 is created by runnable interface
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    produce method is called
                    processor13.Produce();
//                    catch if any exception occurr
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//        thread2 is created using Runnable interface
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    consumer method is called
                    processor13.Consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//       start both the thread
        thread1.start();
        thread2.start();

        // main thread will wait for both
        // threads to complete execution
        thread1.join();
        thread2.join();
    }


}
