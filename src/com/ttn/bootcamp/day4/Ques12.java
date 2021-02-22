package com.ttn.bootcamp.day4;

/**
 * Find the first even number in the integer list which is greater than 3.
 */

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ques12 {
    /*
     * This method will give the first  even number which is greater than 3
     * @param numbers main stream  of number under which filter is performed
     * @return firstNumberGreaterThanThree if successful,else null
     */
    private static void getFirstNumberGreaterThanThee(IntStream numbers) {
        OptionalInt firstNumberGreaterThanThree =
                // filter the number
                numbers.filter(number1 -> number1 > 3 && number1 % 2 == 0)
//               find the first number
                        .findFirst();

        if (firstNumberGreaterThanThree.isPresent())
            System.out.println(firstNumberGreaterThanThree.getAsInt());
        else
            System.out.println("no value");
    }


    public static void main(String[] args) {

        IntStream numbers = IntStream.rangeClosed(1, 10);
        getFirstNumberGreaterThanThee(numbers);


    }

}