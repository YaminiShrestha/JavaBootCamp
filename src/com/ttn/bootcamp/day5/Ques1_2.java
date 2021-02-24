package com.ttn.bootcamp.day5;

/**
 * Create and Run a Thread using Runnable Interface
 */

/*
 * Class will  create a thread creation by implementing Runnable interface
 * Overriding the run method
 */
class Runner2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            Displaying the thread that is running
            System.out.println(" Runner2 Thread " + i + " is running");
        }
        try {
//          thread to sleep for 1000 milliseconds
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Ques1_2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner2());
//        call run() function
        thread1.start();
    }
}
