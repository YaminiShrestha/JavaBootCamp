package com.ttn.bootcamp.day4;

import java.util.List;
import java.util.function.Function;

/**
 * Find average of the number inside integer list after doubling it.
 */
public class Ques11 {

    /*
     *This method will give average of doubled number
     * @param listNumbers main input under which map and mapToDouble action is performed
     * @return averageOfNumber if successful,else null
     */
    private static void averageOfNumber(List<Integer> listNumbers, Function<Integer, Integer> integerFunction) {
   if( listNumbers.size() ==0){
       System.out.println("null");
   }
        System.out.println(listNumbers.stream()
                .map(integerFunction)
                .mapToDouble(a -> a)
                .average()
                .orElse(0));
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 6, 7, 0, 5);

//       map the number  multiply by 2
        Function<Integer, Integer> integerFunction = number -> number * 2;
        averageOfNumber(numbers, integerFunction);
    }
}
