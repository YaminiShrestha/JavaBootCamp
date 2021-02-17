package com.ttn.bootcamp.day2;
/*
. WAP to show object cloning in java using copy constructor
 */

class Ques5_2 {
/*
@ variable rollNumber is of type int
@variable name is of type String
 */
    int rollNumber;
    String name;

    //  A normal parametrized constructor
    Ques5_2(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    //    copy constructor
    public Ques5_2(Ques5_2 s) {
        this.rollNumber = s.rollNumber;
        this.name = s.name;
    }

    // Overriding the toString of Object class
    @Override
    public String toString() {
        return rollNumber + " , " + name;
    }

    public static void main(String args[]) {

        Ques5_2 student1 = new Ques5_2(101, "amit");
//        it involves a copy constructor call
        Ques5_2 student2 = new Ques5_2(student1);

        System.out.println(student1);
        System.out.println(student2);



    }
}


