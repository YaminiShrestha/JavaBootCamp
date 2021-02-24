package com.ttn.bootcamp.day5;

/**
 * Use Synchronize method to enable synchronization
 * between multiple threads trying to access method at same time.
 */

class Table {
    /*
     * This method hold to printTable of given number and
     * if multiple threads trying to access  this synchronized method on the same Object
     * but only one thread will be able  to execute it at a time.
     * @param number main input under which action is performed
     */
    synchronized void printTable(int number) {
        for (int i = 0; i < 5; i++) {
            System.out.println(number * i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 * This class extend the thread class and create one thread
 */
class Thread1 extends Thread {
    Table table1;

    Thread1(Table table1) {
        this.table1 = table1;
    }

    @Override
    public void run() {
        table1.printTable(1);
    }
}

/*
 * This class extend the thread class and create second thread
 */
class Thread2 extends Thread {
    Table table2;

    Thread2(Table table2) {
        this.table2 = table2;
    }

    @Override
    public void run() {
        table2.printTable(20);
    }
}


public class Ques10 {

    public static void main(String[] args) throws InterruptedException {

        Table table = new Table();
        Thread1 thread11 = new Thread1(table);
        Thread2 thread22 = new Thread2(table);
        System.out.println("Thread1 is starting");
//        run the thread1
        thread11.start();
//        sleep the thread for specific seconds
        Thread.sleep(500);
        System.out.println("Thread2 is starting");
//        run the thread2
        thread22.start();
    }
}
