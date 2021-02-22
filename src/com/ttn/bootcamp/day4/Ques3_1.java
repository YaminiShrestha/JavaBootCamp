package com.ttn.bootcamp.day4;

/**
 * Using (instance) Method reference create and apply add and subtract method and
 * for the functional interface created.
 */


/*
 * this is functional interface calculator.
 * It has a single method called calculate that accepts two integer values
 */
@FunctionalInterface
interface calculator {

    int calculate(int num1, int num2);

}

public class Ques3_1 {
    /*
     * this method will take two number and multiply it
     * @param number1 input of first number
     * @param number2 input of second number
     * @return product of two number
     */
    public int multiply(int number1, int number2) {

        return number1 * number2;

    }

    /*
     * this method will take two number and add it
     * @param number1 input of first number
     * @param number2 input of second number
     * @return sum of two number
     */
    public int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {

        Ques3_1 ques31 = new Ques3_1();
//          method reference operator uses this ques31 to refer to the multiply method.
        calculator calculator1 = ques31::multiply;
        int multiplicationResult = calculator1.calculate(4, 6);
        System.out.println("Result of multiplication:" + multiplicationResult);

//           method reference operator uses this ques31 to refer to the addition method.

        calculator calculator2 = ques31::addition;
        int additionResult = calculator2.calculate(3, 4);
        System.out.println("Result of addition:" + additionResult);

    }

}

