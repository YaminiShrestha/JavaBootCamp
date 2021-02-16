/*
Write a program to print your Firstname,LastName & age
using static block,static method & static variable respectively.
 */
package com.ttn.bootcamp.day1;

public class Ques7 {
    // all the variables are static
    static String firstName = "";
    static String lastName = "";
    static int age;

    /*
    Static block is used
     */
    static {
        firstName = "Mohan";
        lastName = "Singh";
        age = 25;
        System.out.println("static block called ");

    }

    /*
    this method will print firstName lastname and age
    @param fname input of firstName
    @param lname input of lastname
    @param age input of age
    call the method and return the details
     */
    public static void details(String fName, String lName, int age) {
        firstName = fName;
        lastName = lName;
        age = age;
        System.out.println(firstName + " " + lastName + " " + age);
    }


    public static void main(String args[]) {
/* it does not  have an object of Ques7, static block is
            called because  firstName,lastname and age is being accessed in following statement.
            */
        System.out.println(Ques7.firstName + " " + Ques7.lastName + " " + Ques7.age);
        System.out.println("Static Method called");
        Ques7 obj = new Ques7();
        details("Shyam", "Raj", 50);
        ;


    }
}



