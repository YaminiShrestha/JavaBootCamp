/*Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters,
digits And Other Special Characters In A String*/

package com.ttn.bootcamp.day1;

public class Ques4 {

    public static void main(String[] args) {

        String str = "#ReaDs01fOr@gEEks07";
        countAndPercentage(str);
    }
    /*
    This method to count and calculate percentage of uppercase, lowercase, special characters and numbers
    @param str is main string to perform
    @print print the number and percentage .
       */

    public static void countAndPercentage(String str) {
//            store string length
        int totalChar = str.length();
        int upper = 0, lower = 0, number = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;

        }
        System.out.println("Count of Lowercase letters : " + lower);
        System.out.println("Count of Uppercase letters : " + upper);
        System.out.println("Count of Number : " + number);
        System.out.println("Count of Special characters : " + special);


        double upperCaseLetterPercentage = (upper * 100) / totalChar;
        double lowerCaseLetterPercentage = (lower * 100) / totalChar;
        double numberPercentage = (number * 100) / totalChar;
        double specialCharPercentage = (special * 100) / totalChar;
        System.out.println("Percentage of Lowercase letters are " + upperCaseLetterPercentage + "%");
        System.out.println("Percentage of Upper Case letters are " + lowerCaseLetterPercentage + "% ");
        System.out.println("Percentage of Number are " + numberPercentage + "%");
        System.out.println("Percentage of special Characters Are " + specialCharPercentage + "%");
    }


}






