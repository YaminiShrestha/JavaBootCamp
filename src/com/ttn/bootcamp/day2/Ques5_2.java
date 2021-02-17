package com.ttn.bootcamp.day2;

/**
 * WAP to show object cloning in java using copy constructor
 */

class Ques5_2 {
    int rollNumber;
    String name;

   /*
    * A normal parametrized constructor of Ques5_2
    * @param rollNumber which add roll of student
    * @param name add name of student
    */

    Ques5_2(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    /*
     * Another constructor of Ques5_2
     * @param student
     */
    public Ques5_2(Ques5_2 student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
    }

    // Overriding the toString of Object class
    @Override
    public String toString() {
        return rollNumber + " , " + name;
    }

    public static void main(String args[]) {

        Ques5_2 ques5_2_1 = new Ques5_2(101, "amit");
//        it involves a copy constructor call
        Ques5_2 ques5_2_2 = new Ques5_2(ques5_2_1);

        System.out.println(ques5_2_1);
        System.out.println(ques5_2_2);


    }
}


