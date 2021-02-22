package com.ttn.bootcamp.day4;

/**
 * Increment the number by 1 and return incremented value Parameter (int) Return int
 */

@FunctionalInterface
interface FP02 {
    int incrementByOne(int number);
}

public class Ques1_2 {
    // lambda expression to define the increment method
    FP02 fp02 = (number) -> {
        return number + 1;
    };

    public static void main(String[] args) {
        Ques1_2 ques1_2 = new Ques1_2();
        System.out.println(ques1_2.fp02.incrementByOne(12));
    }


}
