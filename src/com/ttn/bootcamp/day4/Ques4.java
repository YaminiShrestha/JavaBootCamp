package com.ttn.bootcamp.day4;

/**
 * Create an Employee Class with instance variables (String) name,
 * (Integer)age, (String)city and get the instance of the Class using constructor reference
 */
class Employee {

    String name;
    String city;
    Integer age;

    /*
     * This a constructor of class Employee
     * @param name take input of name of the employee
     * @param age take input of age of employee
     * @param city take input of city of employee
     */
    public Employee(String name, Integer age, String city) {

        this.name = name;
        this.age = age;
        this.city = city;
    }


    @Override
    public String toString() {
        return "Employee{" + "age= " + age + ", name='" + name + '\''
               + ", city=" + city +  '}';
    }
}
// create a factory interface for employees called EmployeeInterface.
// createEmployee() method  will return an employee instance as per the given design.
interface EmployeeInterface {
    Employee createEmployee(String name, Integer age, String city);
}

public class Ques4 {
    public static void main(String[] args) {
//        constructor reference
        EmployeeInterface employeeInterface = Employee::new;
        Employee employee = employeeInterface.createEmployee("john", 21, "noida");
        System.out.println(employee);
    }
}

