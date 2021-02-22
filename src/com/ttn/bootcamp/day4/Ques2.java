package com.ttn.bootcamp.day4;

/**
 * create a functional interface whose method takes 2 integers and return one integer.
 */

@FunctionalInterface
interface FPO21 {
    int toConvertOneInteger(int number1, int number2);
}

public class Ques2 {
    FPO21 fp021 = (int number1, int number2) -> {
        return number1 + number2;

    };

    public static void main(String[] args) {
        Ques2 ques2 = new Ques2();
        int answer = ques2.fp021.toConvertOneInteger(10, 20);
        System.out.println(answer);
    }
}






