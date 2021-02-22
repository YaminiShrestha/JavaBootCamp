package com.ttn.bootcamp.day4;

/**
 * Implement multiple inheritance with default method inside  interface.
 */

/*
 *  first interface containing defaultMethod
 */
interface InterfaceA {
    default void defaultMethod(){
        System.out.println("Interface A default method");
    }
}

/*
 * second interface containing defaultMethod
 */
 interface InterfaceB {
    default void defaultMethod(){
        System.out.println("Interface B default method");
    }
}

/*
 * a class implement first and second interface
 * override default method and explicitly call the interface using super
 * to overcome the diamond problem
 */
 class Impl implements InterfaceA, InterfaceB  {
    @Override
    public void defaultMethod() {

        InterfaceA.super.defaultMethod();
    }
}
public class Ques8 {
    public static void main(String[] args) {
     Impl impl= new Impl();
     impl.defaultMethod();

    }
}

