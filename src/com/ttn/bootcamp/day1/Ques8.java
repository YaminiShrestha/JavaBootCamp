/*
Write a program to reverse a string and remove character from
index 4 to index 9 from the reversed string using String Buffer

 */
package com.ttn.bootcamp.day1;

public class Ques8 {
    public static void main(String[] args) {
        String input1 = "wandavision";
/*
 @input input1 is the string under which reverse is performed
 .reverse is the stringBuffer inbuilt method which will reverse the string
 .delete is the StringBuffer inbuilt method which will delete the string by given range

 */
        StringBuffer sbr = new StringBuffer(input1);
        sbr.reverse();
        System.out.println(sbr);
        sbr.delete(4, 9);
        System.out.println(sbr);

    }
}
