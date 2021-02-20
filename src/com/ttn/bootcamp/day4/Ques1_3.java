package com.ttn.bootcamp.day4;

/**
 * Concatenation of 2 string   Parameter (String , String ) Return (String)
 */

import java.util.function.BiFunction;

public class Ques1_3 {

    public static void main(String[] args) {
     /* this hold two input of strings and concat the string
      * return the output of concatenated string  if successful,else null
      */
        BiFunction<String, String, String> biFunction = (inputString1, inputString2) -> {
            if (inputString1 == null && inputString2 == null) {
                return null;
            } else {
                return inputString1 + inputString2;
            }
        };
        System.out.println(biFunction.apply("hello", "world"));
    }
}
