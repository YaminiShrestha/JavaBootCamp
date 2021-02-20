package com.ttn.bootcamp.day4;

/**
 * Create and access default and static method of an interface.
 */

interface myInterface{
    /* This is a default method so we need not
     * to implement this method in the implementation classes
     */
    default void newMethod(){

        System.out.println("Newly added default method");
    }

    /* This is a static method.
     * Similar to default methods, we need to implement these methods
     * in implementation classes so we can safely add them to the existing interfaces.
     */
    static void anotherNewMethod(){

        System.out.println("Newly added static method");
    }
}
public class Ques6 implements myInterface{

    public static void main(String[] args) {
        Ques6 obj = new Ques6();

        //calling the default method of interface
        obj.newMethod();
        //calling the static method of interface
        myInterface.anotherNewMethod();



    }
}
