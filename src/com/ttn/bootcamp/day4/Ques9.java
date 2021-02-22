package com.ttn.bootcamp.day4;

/**
 * Collect all the even numbers from an integer list.
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ques9 {
    /*
     *This method will give list of even number
     * @param listNumbers main input under which filter action is performed
     * @return evenNumberList if successful,else null
     */
    public static void evenNumbers(IntStream intStreamNumbers) {
        if (intStreamNumbers == null) {
         System.out.println("null");
        }
       System.out.println(intStreamNumbers.filter(number -> number % 2 == 0)
//      returns a Stream consisting of the elements of this stream, each boxed to an Integer.
                .boxed().collect(Collectors.toList()));

    }

    public static void main(String[] args) {

        IntStream numbers = IntStream.rangeClosed(1, 20);
        evenNumbers(numbers);


    }
}
