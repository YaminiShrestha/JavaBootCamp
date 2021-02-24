package com.ttn.bootcamp.day5;

/**
 * Create a deadlock and Resolve it using tryLock().
 */

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Account {
    private int balance = 10000;

    /*
     * this method hold transfer of money
     * @param acc1 hold the first account
     * @param acc2 hold the second account
     * @param amount hold the amount
     */
    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }

    /*
     * this method hold deposit of money
     * @param amount where amount is entered and add that amount in balance
     */
    public void deposit(int amount) {
        balance += amount;
    }

    /*
     * this method hold withdraw of money
     * @param amount where amount is entered and  subtract that amount in balance
     */
    public void withdraw(int amount) {
        balance -= amount;
    }

    /*
     * this method hold getBalance money
     * @return the available balance
     */
    public int getBalance() {
        return balance;
    }
}

class Runner16 {
    //    object of two accounts
    private Account acc1 = new Account();
    private Account acc2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    /*
     * this method hold the locks
     * @param firstLock hold first lock
     * @param secondLock hold second lock
     * @throws InterruptedException
     */
    private void acquireLocks(Lock firstLock, Lock secondLock) throws InterruptedException {
        while (true) {

            boolean gotFirstLock = false;
            boolean gotSecondLock = false;

            try {
                gotFirstLock = firstLock.tryLock();
                gotSecondLock = secondLock.tryLock();
            } finally {
                if (gotFirstLock && gotSecondLock) {
                    return;
                }
                if (gotFirstLock) {
                    firstLock.unlock();
                }
                if (gotSecondLock) {
                    secondLock.unlock();
                }
            }

            Thread.sleep(1);
        }
    }

    /*
     * this method hold first thread where amount is transferred from account1 to account2
     * @throws InterruptedException
     */
    public void firstThread() throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
//          acquireLocks method is called
            acquireLocks(lock1, lock2);

            try {
//                account method is called
                Account.transfer(acc1, acc2, random.nextInt(100));
            } finally {
//                release both the lock
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    /*
     * this method hold first thread where amount is transferred from account2 to account1
     * @throws InterruptedException
     */
    public void secondThread() throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            acquireLocks(lock2, lock1);

            try {
                Account.transfer(acc2, acc1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    /*
     * This method hold the details of balance of both the account
     */
    public void finished() {
        System.out.println("Account1 balance is: " + acc1.getBalance());
        System.out.println("Account2 balance is: " + acc2.getBalance());
        System.out.println("Total balance is: " + (acc1.getBalance() + acc2.getBalance()));
    }
}

public class Ques16_2 {
    public static void main(String[] args) throws InterruptedException {
        Runner16 runner = new Runner16();
//       thread t1 is created
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    firstThread function is called
                    runner.firstThread();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//        thread t2 is created

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    secondThread function is called
                    runner.secondThread();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//      start both the thread
        t1.start();
        t2.start();
//      t1 finished first before t2
        t1.join();
        t2.join();
//        finished function is called
        runner.finished();
    }
}