package com.ttn.bootcamp.day5;

/**
 * Use Synchronize block to enable synchronization between multiple threads
 * trying to access method at same time.
 */

class Table1 {
    /*
     * This method will printTable
     * @param number main input under which action is performed
     */
    void printTable(int number) {
//         Only one thread is permitted to printTable  at a time.
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(number * i);
                try {
//               Thread sleep for specific number of milliseconds
                    Thread.sleep(100);
//                catch if any interrupted exception occur
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/*
 *  This class extend the thread class and create one thread
 */

class MyThread1 extends Thread {
    Table1 table3;

    MyThread1(Table1 table3) {
        this.table3 = table3;
    }

    @Override
    public void run() {
        table3.printTable(1);
    }
}

/*
 *  This class extend the thread class and create second thread
 */
class MyThread2 extends Thread {
    Table1 table4;

    MyThread2(Table1 table4) {
        this.table4 = table4;
    }

    @Override
    public void run() {
        table4.printTable(20);
    }
}


public class Ques11 {

    public static void main(String[] args) throws InterruptedException {
        Table1 table11 = new Table1();
        MyThread1 myThread1 = new MyThread1(table11);
        MyThread2 myThread2 = new MyThread2(table11);
        System.out.println("Thread1 is starting");
//        run the thread1
        myThread1.start();
        Thread.sleep(500);
        System.out.println("Thread2 is starting");
//        run the thread2
        myThread2.start();
    }
}
