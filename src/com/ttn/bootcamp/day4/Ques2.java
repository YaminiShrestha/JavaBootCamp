package com.ttn.bootcamp.day4;

/**
 * create a functional interface whose method takes 2 integers and return one integer.
 */

import java.util.function.BiFunction;

public class Ques2 {
    /*
     * This method takes in two arguments and produces a result.
     * @return output of specified type
     */
    private static BiFunction<Integer, Integer, Integer> getIntegerFunction() {
        return (number1, number2) -> number1 * number2;
    }
    public static void main(String[] args) {
//      BiFunction to add 2 numbers
        BiFunction<Integer, Integer, Integer> multiplyFunction = getIntegerFunction();
//        Implement multiplyFunction using apply()
        System.out.println(multiplyFunction.apply(5, 6));

    }


}
