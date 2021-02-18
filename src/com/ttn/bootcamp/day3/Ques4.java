package com.ttn.bootcamp.day3;

/**
 * Write a program to sort Employee objects based on highest salary using Comparator.
 * Employee class{ Double Age; Double Salary; String Name
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * implement Comparator to sort Employee on basis of Name, Salary and joining Date
 */
 class Employee  {
    String name;
    double salary;
    double age;

    /*
     * constructor of Employee
     * @param name input of Employee name
     * @param salary input of salary
     * @param age input of age
     */
    public Employee(String name, Double salary, Double age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "\n name=" + name + ",salary="
                + salary + ",Age=" + age;
    }

    /*
     * this method will compare two double values of salary lexicographically.
     * @param employee main input under which action performed
     * @return salary in descending order
     */
    static class compareEmployee implements Comparator<Employee>{

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return Double.compare(emp2.salary,emp1.salary);

        }
    }


   public static class Ques4 {

       public static void main(String[] args) {

            Employee employee1 = new Employee("John", 2000.7, 25.0);
            Employee employee2 = new Employee("Denis", 5000.50, 30.0);
            Employee employee3 = new Employee("Rick", 1000.0, 34.0);
            Employee employee4 = new Employee("sam", 9000.0, 23.0);
            Employee employee5 = new Employee("sam", 4990.0, 24.0);
            Employee employee6 = new Employee(null, 0.0, 0.0);

            List<Employee> employees = new ArrayList<Employee>();
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);
            employees.add(employee4);
            employees.add(employee5);
            employees.add(employee6);


            Collections.sort(employees,new compareEmployee());


            System.out.println(employees);

        }

    }
}


