package com.ttn.bootcamp.day2;
/*
.  Design classes having attributes for furniture where
there are wooden chairs and tables, metal chairs and tables.
There are stress and fire tests for each product.
 */
/*
class for wooden furniture
@variable chair is of string type
@variable table of string type
 */
class Wooden{
    String chair;
    String table;

    public void fireTest(String input1){
        System.out.println("This is the fire test for wooden " + input1);
    }
    public void stressTest(String input2){
        System.out.println("This is the stress test for wooden " + input2);
    }
}
/*
class for metal furniture
@variable chair is of string type
@variable table of string type
@method fireTest method
@method stressTest method
 */
class Metal{
    String Chair;
    String Table;
    public void fireTest(String inputString1){
        System.out.println("This is the fire test for metal " + inputString1);
    }
    public void stressTest(String inputString2){
        System.out.println("This is the stress test for metal " + inputString2);
    }
}
//Driver class
 class Ques9 {

    public static void main(String[] args) {

        Wooden wood = new Wooden();
        wood.fireTest("chair");
        wood.stressTest("Table");
        Metal metal = new Metal();
        metal.fireTest("chair");
    }
}