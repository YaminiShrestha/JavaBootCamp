package com.ttn.bootcamp.day2;

/**
 * Design classes having attributes for furniture where
 * there are wooden chairs and tables, metal chairs and tables.
 * There are stress and fire tests for each product.
 */

/*
 * furniture interface
 */
interface Furniture {
    public void stressTest();
    public void fireTest();
}

/*
 * class for wooden furniture
 * @variable chair is of string type
 * @variable table of string type
 *
 */
  class Wooden implements Furniture {
    String chair;
    String table;
    @Override
    public void stressTest() {
        System.out.println("This is the stress test for wooden ");
    }

    @Override
    public void fireTest() {
        System.out.println("This is the fire test for metal ");

    }
}

/*
class for metal furniture
@variable chair is of string type
@variable table of string type
@method fireTest method
@method stressTest method
 */
class Metal implements Furniture {
    String Chair;
    String Table;


    @Override
    public void stressTest() {
        System.out.println("This is the stress test for wooden ");
    }

    @Override
    public void fireTest() {
        System.out.println("This is the fire test for wooden ");
    }
}

    //Driver class
    class Ques9 {

        public static void main(String[] args) {

            Wooden wooden = new Wooden();
            wooden.stressTest();
            Metal metal = new Metal();
            metal.fireTest();
        }
    }