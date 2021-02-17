package com.ttn.bootcamp.day2;
/**
 * Create Java classes having suitable attributes for Library management system.
 * Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
 */

import java.util.List;

/**
 * interface of library
 * this hold method of studentLogin,studentRegister,
 * accountantRegister,accountantLogin
 */
 interface LoginAndRegister{
    public void studentLogin();
    public void studentRegister();
    public void accountantRegister();
    public void accountantLogin();
}

/**
 *
 */
 class Book {
     String bookId;
     String title;
//     this method hold collection of book according to its type
     List<String> bookType(List<String> listOfBook){
         return listOfBook;
     };
}

/**
 * abstract class of accountant
 * implement method accountantRegister,acoountantLogin
 * inherit class Book
 */
abstract class Accountant extends Book implements LoginAndRegister{
    String accountantName;

    @Override
    public void accountantLogin() {
        System.out.println("Login account");
    }

    @Override
    public void accountantRegister() {
        System.out.println("Register Account");
    }
//   this method will add the book
    void addBook(){};
//    this method will delete the book
    void deleteBook(){};
}
/**
 * Another abstract class of Student
 * implement method studentRegister,studentLogin
 * inherit class Book
 */
abstract class Student implements LoginAndRegister{
    String studentName;
    int studentId;
    @Override
    public void studentRegister() {
    }

    @Override
    public void studentLogin() {
    }
}
public class Ques1 {
    public static void main(String[] args) {

    }
    }


