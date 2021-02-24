package com.ttn.bootcamp.day5;

/**
 * Create and Run a Thread using Thread class.
 */

/*
 * Class will  create a thread creation by extending the Thread class
 */
class Runner1 extends Thread {
    @Override
    public void run() {
//         Displaying the thread that is running
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner1 Thread " + i + " is running");
        }
        try {
//          thread to sleep for 1000 milliseconds
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Ques1 {
    public static void main(String[] args) {

        Runner1 runner1 = new Runner1();
//         call run() function
        runner1.start();
    }


}

