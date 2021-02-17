package com.ttn.bootcamp.day2;

/**
 * WAP to convert seconds into days, hours, minutes and seconds
 */
public class Ques7 {
    /*
     * This method will convert second into day hours, minutes and seconds
     * @param second is main input under which second is convert into days.
     */
    static void convertSecToDay(int second) {
//       calculate day
        int day = second / (24 * 3600);
        second = second % (24 * 3600);
//       calculate hour
        int hour = second / 3600;
        second %= 3600;
//         calculate minute
        int minutes = second/ 60;
        second %= 60;
//     calculate second
        int seconds = second;
        System.out.println("Coverted Seconds into : " + day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }

    // Driver code
    public static void main(String[] args) {
        int seocnd = 129600;
        System.out.println("Intial Second  " + seocnd);
        convertSecToDay(seocnd);

    }
}
