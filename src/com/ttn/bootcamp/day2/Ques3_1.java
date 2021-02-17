package com.ttn.bootcamp.day2;

/*
Wap to provide ClassNotFoundException
 */
public class Ques3_1 {

    public static void main(String[] args) {
        try {
              /* this block of statement can throw
                 exception so we handled it by placing these statements
                inside try and handled the exception in catch block
               it try to load a class at runtime using Class.forName()

               */
            Class.forName("Random Class");
        }
            /*
             This block will only execute if any classNotFound exception
             occurs in try block
             */ catch (ClassNotFoundException var2) {
            var2.printStackTrace();
        }

    }
}

