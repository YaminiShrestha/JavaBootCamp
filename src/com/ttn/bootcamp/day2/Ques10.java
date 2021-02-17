package com.ttn.bootcamp.day2;

/**
 * Design classes having attributes and method(only skeleton) for a coffee shop.
 */

/**
 * Customer which interact with cashier to place order and payment
 */
class Customer {
    String name;
    int contact;

    /*
     * this method check whether the token is ready or not
     */
    void isOrderReady() {
        System.out.println("Waits for the intimation that order for his token is ready");
    }
    /*
     * this method check the notification and collect coffee
     */
    void collectCoffee() {
        System.out.println("he collects the coffee and enjoys his drink");
    }
}

class Cashier {
    String name;
    int staffId;
    /*
     * this method take an order from customer
     */
    void takeOrder() {
        System.out.println("Takes an order and payment from the customer");
    }
    /*
     * this method create an order and place it to queue
     */
    void orderToQueue() {
        System.out.println("creates an order and places it into the order queue");
    }

    class Order {
        int orderId;
        String coffeeType;
    }

}

/**
 * Barista inherit the class cashier to check which order should be prepared
 */
class Barista extends Cashier {

    int staffId;
    /*
     * this method prepare order
     */
    void prepareOrder() {
        System.out.println(" Gets the next order from the queue and Prepares the coffee");
    }
    /*
     * this method add the order in completed order queue and notify completed order
     */
    void orderNotification() {
    }


}

public class Ques10 {
    public static void main(String[] args) {

    }
}
