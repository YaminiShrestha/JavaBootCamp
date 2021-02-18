package com.ttn.bootcamp.day3;
/**
 * Write a program to format date as example "21-March-2016
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * class hold the method date that format the pattern for new date
 */
public class Ques8 {
    public static void main(String[] args) throws Exception {
//      Instantiate a Date object
        Date date = new Date();
        // Using SimpleDateFormat() method for  pattern conversion
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");

        String changedPatternDate = formatter.format(date);
        System.out.println(changedPatternDate);
    }
}


