package com.ttn.bootcamp.day4;

/**
 * Write the following a functional interface and implement it using lambda:
 * First number is greater than second number or not  Parameter (int ,int ) Return boolean
 */

@FunctionalInterface
interface FP01{
        boolean isGreater(int number1, int number2);
    }

public class Ques1 {
    // lambda expression to check the first number is greater or not
    FP01 fp01 = (number1, number2) -> {
       return number1 >number2;
};


    public static void main(String[] args) {
         Ques1 ques1 = new Ques1();
       System.out.println(ques1.fp01.isGreater(11,33));


    }
}
