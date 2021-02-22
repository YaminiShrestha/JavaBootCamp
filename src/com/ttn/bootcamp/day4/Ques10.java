package com.ttn.bootcamp.day4;

/**
 * Sum all the numbers greater than 5 in the integer list.
 */

import java.util.stream.IntStream;

public class Ques10 {
    /*
     *This method will give sum of all number greater than 5
     * @param listNumbers main input under which filter and reduce action is performed
     * @return sumOfNumber if successful,else null
     */

    public static Integer SumOfNumberGreaterThanFive(IntStream intStreamNumbers) {

        if (intStreamNumbers == null) {
            return null;
        }
        Integer sumOfNumber = intStreamNumbers
//              lambda expression to filter number greater than by 5 or not
                .filter(number -> number > 5)
                .reduce(0, Integer::sum);

        return sumOfNumber;

    }

    public static void main(String[] args) {
        IntStream intStreamNumber = IntStream.rangeClosed(1, 10);
        System.out.println(SumOfNumberGreaterThanFive(intStreamNumber));

    }
}

