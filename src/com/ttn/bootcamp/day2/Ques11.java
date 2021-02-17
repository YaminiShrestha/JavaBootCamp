package com.ttn.bootcamp.day2;
/*
Convert the following code so that it uses nested while statements
instead of for statements:
    int s = 0;
    int t = 1;
    for (int i = 0; i < 10; i++)
    {
    s = s + i;
    for (int j = i; j > 0; j−−)
    {
    t = t * (j - i);
    }
    s = s * t;
    System.out.println("T is " + t);
    }
    System.out.println("S is " + s);
 */
public class Ques11 {
    public static void main(String[] args) {
        int s = 0;
        int t = 1;
        int i = 0;
//      check the condition of i
        while(i < 10)
        {
//            increment s by i
            s = s + i;
//            variable of j is of type int
            int j = i;
//            check the condition of j
            while(j > 0)
            {
                t = t * (j - i);
//                decrement j by 1
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
//            increment i by 1
            i++;
        }
        System.out.println("S is " + s);
    }
}
