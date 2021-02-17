package com.ttn.bootcamp.day2;

import java.util.Arrays;

/**
 * WAP to sorting string without using string Methods.
 */
public class Ques2 {
    /*
     * This method will sort the string alphabetically by swapping elements
     * @param input1  main string under which sorting is performed
     * @return string in sorted array if successful,else initialString
     */
    static String sortString(String input1) {
        if (input1 != null) {
            char temp = 0;
            // convert input1 string to char array
            char[] chars = input1.toCharArray();

            if (chars.length == 0) {
                return null;
            }
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] > chars[i]) {
                        temp = chars[i];
                        chars[i] = chars[j];
                        chars[j] = temp;

                    }
                }

            }

            return new String(chars);
        } else {
            return null;
        }
    }

    // Driver program to test above function
    public static void main(String[] args) {
        String initialString = null;
        System.out.println("Input String  " + initialString);
        String outputString = sortString(initialString);
        System.out.println("Output String  " + outputString);
    }
}
