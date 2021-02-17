package com.ttn.bootcamp.day2;

/**
 * WAP showing try, multi-catch and finally blocks.
 */

/*
 * class show example try ,multi catch and final blocks of exception
 */
public class Ques6 {
    public static void main(String args[]) {
        int number1, number2;
        try {
            /*
             * We suspect that this block of statement can throw
             * exception so we handled it by placing these statements
             * inside try and handled the exception in catch block
             */
            number1 = 0;
            number2 = 62 / number1;
            System.out.println(number2);
            System.out.println(" End of try block");
        }
           /* This block will only execute if any Arithmetic exception
            * occurs in try block
            */
        catch (ArithmeticException e) {

            System.out.println("You should not divide a number by zero");
        }
        /* This is a generic Exception handler which means it can handle
         * all the exceptions. This will execute if the exception is not
         * handled by previous catch blocks.
         */
        catch (Exception e) {

            System.out.println("Exception occurred");
        }
        /*
         * Finally block will always execute even if there is no exception in try block
         */ finally {
            System.out.println("finally block");
        }
    }
}
