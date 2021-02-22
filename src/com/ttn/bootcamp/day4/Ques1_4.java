package com.ttn.bootcamp.day4;

/**
 * Convert a string to uppercase and return .Parameter (String) Return (String)
 */

import java.util.Locale;

@FunctionalInterface
interface FP04 {
    String converttoUpperCase(String inputString);
}

public class Ques1_4 {
    // lambda expression to define string in uppercase
    FP04 fp04 = (string1) -> {
        return string1.toUpperCase(Locale.ROOT);
    };

    public static void main(String[] args) {
        Ques1_4 ques1_4 = new Ques1_4();

        String upperCaseString = ques1_4.fp04.converttoUpperCase("hello");
        System.out.println(upperCaseString);
    }


}
