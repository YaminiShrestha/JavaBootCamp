package com.ttn.bootcamp.day3;
/**
 * Write Java code to define List .
 * Insert 5 floating point numbers in List, and using an iterator,
 * find the sum of the numbers in List.
 */

import java.util.ArrayList;
import java.util.List;


public class Ques1 {
    /*
     * this method calculate the sum of given list
     * @param numbers main list of input under which addition performed
     * @return sum of the float numbers.
     */
    public static void listNumberSum(List<Float> numbers) {
        double sum = 0.0;
        if (numbers.size() == 0) {
            System.out.println("List is empty");
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                sum = sum + numbers.get(i);

            }
            System.out.println("Sum of the list is " + sum);
        }
    }

    // Driver code
    public static void main(String[] args) {
        List<Float> numbers = new ArrayList<Float>();
        numbers.add(34.5F);
        numbers.add(45.50F);
        numbers.add(18.5F);
        numbers.add(30.50F);
        numbers.add(89.5F);
        listNumberSum(numbers);

    }

}
