package com.ttn.bootcamp.day2;

/*
WAP to convert seconds into days, hours, minutes and seconds
 */
public class Ques7 {
    /*This method will  convert second into day
     hours, minutes and seconds
 @param n is main input under which sce is convert into days.

     */
    static void ConvertSecToDay(int n) {
//        variable is of type int and it calculate day
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
//       variable is of type int and it  calculate hour
        int hour = n / 3600;

        n %= 3600;
        // variable is of type int and it  calculate minute
        int minutes = n / 60;

        n %= 60;
        // variable is of type int
        int seconds = n;

        System.out.println( "Coverted Seconds into : "+ day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }

    // Driver code
    public static void main(String[] args) {
        // Given n is in seconds
        int n = 129600;
        System.out.println("Intial Second  " + n);
        ConvertSecToDay(n);

    }
}
