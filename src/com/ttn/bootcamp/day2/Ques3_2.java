package com.ttn.bootcamp.day2;
/*
Wap to produce NoClassDefFoundError
 */

class A {
    void demo(){
        System.out.println("hello");
    }

}

/*
When you compile the above program,
two .class files will be generated.
One is A.class and another one is Ques3_2.class.
If  remove the A.class file and run the Ques3_2.class file,
Java Runtime System will throw NoClassDefFoundError
 */
public class Ques3_2 {
    public static void main(String[] args) {
        A a = new A();
        a.demo();
    }
}


