package com.ttn.bootcamp.day2;
/*
 WAP to read words from the keyboard until the word done is entered.
  For each word except done, report whether its first character is equal
     to  its last character. For the required loop, use a
while statement
 */
import java.util.Scanner;

public class Ques8_1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
//        take input of string from user by keyboard
        String word = keyboard.next();
//     it will loop it until the word 'done' is not matched

        while (!word.equals("done")) {
//            check whether first and last word are equal or not
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = keyboard.next();
        }

    }
}
