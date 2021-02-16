/*
Q10.Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
 */
package com.ttn.bootcamp.day1;

public class Ques10 {
    //    this method will perform integer addition and return the output
    public static int addFun(int a, int b) {
        return a + b;
    }

    //    this method will perform decimal addition and return the output
    public static double addFun(double a, double b) {
        return a + b;
    }
    //    this method will perform integer multiplication and return the output

    public static int multiplyFun(int a, int b) {
        return a * b;
    }

    //    this method will perform float multiplication and return the output
    public static float multiplyFun(float a, float b) {
        return a * b;
    }

    //    this method will perform concatenation between two string and return the output
    public static String concateString(String s1, String s2) {
        return s1 + s2;
    }

    //    this method will perform concatenation between three string  and return the output
    public static String concateString(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    public static void main(String[] args) {
        System.out.println(addFun(10, 20));
        System.out.println(addFun(10.5, 20.5));
        System.out.println(multiplyFun(12, 13));
        System.out.println(multiplyFun(12.0f, 13.5f));
        System.out.println(concateString("Yamini ", "Shrestha"));
        System.out.println(concateString("Yamini ", "Shrestha ", "TTN"));
    }

}
