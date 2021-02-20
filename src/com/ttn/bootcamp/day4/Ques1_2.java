package com.ttn.bootcamp.day4;
/**
 * Increment the number by 1 and return incremented value Parameter (int) Return int
 */

import java.util.List;
import java.util.function.Function;

public class Ques1_2 {
    /*
     * This method hold mapping of number of given list
     * @return incremented number by 1
     */
    private static Function<Integer, Integer> getIntegerFunction() {

        return number -> number + 1;
    }

    /*
     * this method will take number from list and increment the value by 1
     * @param numbers input under which mapping will performed
     * @return  incremented values by 1 if successful,else null
     */
    private static void incrementedNumbers(List<Integer> numbers) {
        if(numbers == null){
            System.out.println("null");
        }
        numbers.stream()
                .map(getIntegerFunction())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 78, 98, 10);
        incrementedNumbers(numbers);

    }


}
