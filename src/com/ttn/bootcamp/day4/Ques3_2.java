package com.ttn.bootcamp.day4;

/**
 * using (Static) Method reference create and apply multiplication method
 * for the functional interface created.
 */

import java.util.function.BiFunction;

class AdditionAndMultiplication {
    /*
     * this method will multiply two number
     * @param number1 take input of first number
     * @param number2 take input of second number
     * @return product of two number if successful,else null
     */
    public static Integer multiply2(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return null;
        }
        return number1 * number2;
    }

    /*
     * This method will add two numbers
     * @param number1 input of first number
     * @param number2 input of second number
     * @return sum of two number if successful,else null
     */

    public static Integer addition2(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return null;
        }
        int sum = number1 + number2;
        return sum;
    }
}

public class Ques3_2 {
    public static void main(String[] args) {
//      BiFunction to multiply 2 numbers
        BiFunction<Integer, Integer, Integer> product = AdditionAndMultiplication::multiply2;
        int products = product.apply(11, 5);
        System.out.println("Product of given number is: " + products);


//      BiFunction to add 2 numbers
        BiFunction<Integer, Integer, Integer> addition = AdditionAndMultiplication::addition2;
        int additions = addition.apply(null, 45);
        System.out.println("Sum of given number is: " + additions);

    }
}

