package com.ttn.bootcamp.day4;

/**
 * Concatenation of 2 string   Parameter (String , String ) Return (String)
 */

@FunctionalInterface
interface FP03 {
    String concatinateStrings(String inputString1, String inputString2);
}

public class Ques1_3 {
    // lambda expression to define the concatenation method
    FP03 fp03 = (string1, string2) -> {
        return string1 + string2;
    };

    public static void main(String[] args) {
        Ques1_3 ques1_3 = new Ques1_3();
        String concatenatedString = ques1_3.fp03.concatinateStrings("hello", "world0");
        System.out.println(concatenatedString);

    }
}
