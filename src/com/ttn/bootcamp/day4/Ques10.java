package com.ttn.bootcamp.day4;

import java.util.List;

/**
 * Sum all the numbers greater than 5 in the integer list.
 */
public class Ques10 {
    /*
     *This method will give sum of all number greater than 5
     * @param listNumbers main input under which filter and reduce action is performed
     * @return sumOfNumber if successful,else null
     */

    public static Integer SumOfNumberGreaterThanFive(List<Integer> listNumbers) {
        if (listNumbers == null) {
            return null;
        }
        Integer sumOfNumber = listNumbers.stream()
//                lambda expression to filter number greater than by 5 or not
                .filter(number -> number > 5)
                .reduce(0, Integer::sum);
        return sumOfNumber;

    }

    public static void main(String[] args) {
        List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(SumOfNumberGreaterThanFive(listNumbers));


    }
}

