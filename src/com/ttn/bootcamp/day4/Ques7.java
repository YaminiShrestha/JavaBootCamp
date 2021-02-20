package com.ttn.bootcamp.day4;

/**
 *  Override the default method of the interface.
 */

/*
 * first interface containing defaultMethod
 */
interface interfaceA{

    default void defaultMethod(){
        System.out.println("This is interface A default method");
    }
}

/*
 * This class implemented interfaceA
 * override the default method
 */
class DemoImpl implements interfaceA{

    @Override
    public void defaultMethod(){
        System.out.println("This is DemoImpl method");
    }
}

public class Ques7 {

        public static void main(String[] args) {
            DemoImpl demoimpl = new DemoImpl();
            //calling the default method of class
            demoimpl.defaultMethod();

    }
}
