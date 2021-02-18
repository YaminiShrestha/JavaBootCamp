package com.ttn.bootcamp.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 * Write a program to sort the Student objects based on Score ,
 * if the score are same then sort on First Name .
 * Class Student{ String Name; Double Score; Double Age
 */
 class Student  {
    String name;
    double score;
    double age;

    /*
     * constructor of Employee
     * @param name input of Employee name
     * @param salary input of salary
     * @param age input of age
     */
    public Student(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String toString() {
        return "\n name=" + name + ",score="
                + score + ",Age=" + age;
    }

    /*
     * this method will compare two double values of score lexicographically.
     * @param employee main input under which action performed
     * @return salary in descending order if not equal,else return by name .
     */
  static  class CompareStudent implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            if(o2.score > o1.score){
                return 1;
            }
            else if(o2.score == o1.score) {
                return o1.name.compareTo(o2.name);
            }else{
                return -1;
            }
        }
    }
}

class Ques5 {

    public static void main(String[] args) {

        Student student1 = new Student("John", 2000.7, 25.0);
        Student student2 = new Student("John", 5000.50, 30.0);
        Student student3 = new Student("Rick", 9000.0, 34.0);
        Student student4 = new Student("Sam", 9000.0, 23.0);
        Student student5 = new Student("Paul", 4990.0, 24.0);
        Student student6 = new Student(null, 0.0, 0.0);

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
//          sort the list
        Collections.sort(students, new Student.CompareStudent());

        System.out.println(students);
    }
}
