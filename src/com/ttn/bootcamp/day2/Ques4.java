package com.ttn.bootcamp.day2;

/**
 * Java program implementing Singleton class
 */

/*
 *This class will create only one instance
 */

class Singleton {
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;

    public String singletonInput;

    // private constructor restricted to this class itself
    private Singleton() {
        singletonInput = " I am a Singleton class";
    }

    // static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

public class Ques4 {
// Driver Class

    public static void main(String args[]) {
      
        Singleton singleton1 = Singleton.getInstance();

        
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton1 instance is " + singleton1.singletonInput);
        System.out.println("Singleton2 instance is " + singleton2.singletonInput);

    }
}



