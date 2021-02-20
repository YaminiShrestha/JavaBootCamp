package com.ttn.bootcamp.day4;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Collect all the even numbers from an integer list.
 */
public class Ques9 {
    /*
     *This method will give list of even number
     * @param listNumbers main input under which filter action is performed
     * @return evenNumberList if successful,else null
     */
    public static List<Integer> evenNumbers(List<Integer> listNumbers) {
        if (listNumbers == null) {
            return null;
        }
        return listNumbers.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> initialListNumbers = List.of(1, 2, 3, 4, 5, 6, 8, 67);
        List<Integer> evenNumber = evenNumbers(initialListNumbers);
        System.out.println(evenNumber);

    }
}
