package com.ttn.bootcamp.day3;

/**
 * Write a method that takes a string and
 * print the number of occurrence of each character characters in the string.
 */

import java.util.*;

public class Ques3 {
    /*
     * This method count the occurrence of character in string
     * @param inputString main input under which action is performed
     * @return map if successful,else inputString
     */
    static void countCharacter(String inputString) {
        if (inputString != null) {
//        Creating a HashMap containing char as a key and occurrences as a value
            HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

//             Convert given string to char array
            char[] characterArray = inputString.toCharArray();

            // check each character of strArray
            for (char character : characterArray) {
                if (charCountMap.containsKey(character)) {

                    // If character is present in charCountMap,
                    // incrementing it's count by 1
                    charCountMap.put(character, charCountMap.get(character) + 1);
                } else {

//       If char not present in charCountMap, put char to charCountMap with count 1
                    charCountMap.put(character, 1);
                }
            }

            for (Map.Entry entry : charCountMap.entrySet()) {
                System.out.println("Character " + entry.getKey() + " " + entry.getValue());
            }
        } else {
            System.out.println(inputString);
        }

    }

    // Driver Code
    public static void main(String[] args) {
        String inputString = "Yamini";
        countCharacter(inputString);
    }

}
