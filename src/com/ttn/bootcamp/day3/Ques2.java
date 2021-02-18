package com.ttn.bootcamp.day3;
/**
 * Write a method that takes a string and returns the number of unique characters in the string.
 */

import java.util.*;

/**
 * class hold set and list which perform to find unique character in string
 * @return unique Character is successful,else null
 */
public class Ques2 {
    public static void main(String[] args) {

        String inputString = "Yamini";
        int uniqueCharacter = 0;
        if (inputString.length() == 0 || inputString == null) {

            System.out.println("null");
        } else {
//            Instantiate an object of set
            Set<Character> set = new HashSet<>();
//            instantiate an object of list
            List<Character> list = new ArrayList<>();

            for (int i = 0; i < inputString.length(); i++) {
                char character = inputString.charAt(i);
//              check if set contain this character or not
                if (set.contains(character)) {

                    list.add(character);
                } else {
                    set.add(character);
                }
            }
            uniqueCharacter = set.size() - list.size();
            System.out.println("Unique characters in String are: " + uniqueCharacter);
        }
    }
}