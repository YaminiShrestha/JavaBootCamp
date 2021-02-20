package com.ttn.bootcamp.day4;

/**
 * Find the first even number in the integer list which is greater than 3.
 */

import java.util.List;
import java.util.function.Predicate;

public class Ques12 {
    /*
     * This method will give the first  even number which is greater than 3
     * @param numbers main list of number under which filter is performed
     * @param integerPredicate check of condition is passed
     * @return firstNumberGreaterThanThree if successful,else null
     */
    private static void getFirstNumberGreaterThanThee(List<Integer> numbers, Predicate<Integer> integerPredicate) {
        if (numbers.size() == 0) {
            System.out.println("null");
        }
        System.out.println(
//               convert number to stream
                numbers.stream()
//               filter the number
                        .filter(integerPredicate)
//               find the first number
                        .findFirst().get());
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 6, 7, 0, 5);
        Predicate<Integer> integerPredicate = (number) -> {
            return number > 3 && number % 2 == 0;
        };
        getFirstNumberGreaterThanThee(numbers, integerPredicate);


    }

}