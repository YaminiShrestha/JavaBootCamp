package com.ttn.bootcamp.day2;

/**
 * . WAP to show object cloning in java using cloneable
 */

//Class whose object is to be cloned implements Cloneable interface.
class Ques5_1 implements Cloneable {

    int rollNumber;
    String name;

    /*
     * constructor for class Ques5_1
     * @param rollNumber which add roll of student
     * @param name add name of student
     */
    Ques5_1(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    //Default version of clone() method
    public Object clone() throws CloneNotSupportedException {
//     super.clone() is called to use the
//    default implementation of the clone() method in the Object class
        return super.clone();
    }

    public static void main(String args[]) {
        try {
            Ques5_1 ques5_1_1 = new Ques5_1(101, "Yamini");
// copy of an object has the same state as the original object
            Ques5_1 ques5_1_2 = (Ques5_1) ques5_1_1.clone();

            System.out.println(ques5_1_1.rollNumber + " " + ques5_1_1.name);
            System.out.println(ques5_1_2.rollNumber + " " + ques5_1_2.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

