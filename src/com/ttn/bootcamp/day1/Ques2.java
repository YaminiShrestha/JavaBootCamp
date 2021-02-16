package com.ttn.bootcamp.day1;

/*
Write a program to find the number of occurrences of the duplicate words in a string and print them
 */
public class Ques2 {

    public static void main(String[] args) {

/*
This code is used to find duplicate word and count the duplicated word
@param input main string under which loop is performed
split() - split the word from string
@print it will print the number of duplicate words
 */
        String input = "Welcome to Java Session  Java Session Session";
        String[] words = input.split(" ");

        int count = 1;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count = count + 1;
                    words[j] = "0";
                }
            }
            if (words[i] != "0" && count > 1)
                System.out.println(words[i] + " - " + count);
            count = 1;

        }
    }
}

