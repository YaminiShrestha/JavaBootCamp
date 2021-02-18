package com.ttn.bootcamp.day3;
/**
 * Write a program to display times in different country format.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * class hold Locale class & DateFormat class to display date in different Country's format.
 */
public class Ques9 {


    public static void main(String[] args) throws Exception {
//      instantiate a current date object
        Date date = new Date();

        System.out.println("today is " + date.toString());
//       locale task and provides locale information for the user.
//          instantiate a object for locale class
        Locale locKorean = new Locale("korean", "Korea");

        Locale locItalian = new Locale("it", "ch");
//           Using DateFormat() method for format dates
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("Italian Language and the date is " + " : " + dateFormat.format(date));
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, locKorean);
        System.out.println("Korea  date is" + ": " + dateFormat1.format(date));
    }


}
