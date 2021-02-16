/* Write a program to find the number of occurrences of a character in a string without using loop

 */
package com.ttn.bootcamp.day1;

public class Ques3 {
    public static void main(String[] args) {

        /*
        input : initialWord as an input
        @param targetChar which need to be counted
        @return total number of character

         */
        String intialWord = "Java is a programming language  ";
        String targetChar = "a";
        int countChar = intialWord.length() - intialWord.replace(targetChar, "").length();
        System.out.println("Number of occurrences of 'a' is  = " + countChar);
    }
}
