package com.ttn.bootcamp.day5;

/**
 * Use sleep and join methods with thread.
 */
public class Ques2 {

    public static void main(String[] args) {
        System.out.println("Start of Thread");
        Ques2 ques2 = new Ques2();
        ques2.doWork();
    }

    /*
     * This method hold two thread by implementing Runnable
     * Thread1 will sleep for specified number of milliseconds
     * @return result of  thread2 and then thread1
     */
    public void doWork() {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    try {
//                   Sleep for the specified number of milliseconds
                        Thread.sleep(100);
                    } catch (Exception e) {
//                        catch an exception
                        System.out.println(e);
                    }
                    System.out.println("Thread1 is " + i + "running");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread2 is " + i + "running");

                }
            }
        });
//       run both the thread
        thread1.start();
        thread2.start();
        try {
//          waits for this thread to die.
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
