package com.ttn.bootcamp.day4;

/**
 * Find average of the number inside integer list after doubling it.
 */

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Ques11 {

    /*
     *This method will give average of doubled number
     * @param streamNumbers main input under which map and mapToDouble action is performed
     * @return averageOfNumber if successful,else null
     */
    private static void averageOfNumber(IntStream streamNumbers) {

        OptionalDouble averageOfNumber = streamNumbers.map(number -> number * 2)
                .mapToDouble(a -> a)
                .average();
        if (averageOfNumber.isPresent()) {
            System.out.println(averageOfNumber.getAsDouble());
        } else {
            System.out.println("no Values");
        }

    }

    public static void main(String[] args) {
        IntStream inputNumbers = IntStream.rangeClosed(1, 10);
        averageOfNumber(inputNumbers);
    }
}
