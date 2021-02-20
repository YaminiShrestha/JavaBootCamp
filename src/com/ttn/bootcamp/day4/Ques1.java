package com.ttn.bootcamp.day4;

/**
 * Write the following a functional interface and implement it using lambda:
 * First number is greater than second number or not  Parameter (int ,int ) Return boolean
 */

import java.util.function.BiPredicate;

public class Ques1 {
    /*
     * This method check the condition if first number is greater than second number or not
     * @return true if successful,else false
     */
    private static BiPredicate<Integer, Integer> getIntegerBiPredicate() {
        BiPredicate<Integer, Integer> biPredicate = (number1, number2) -> {
            return number1 > number2;
        };
        return biPredicate;
    }
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = getIntegerBiPredicate();
        System.out.println(biPredicate.test(5, 8));
    }


}
