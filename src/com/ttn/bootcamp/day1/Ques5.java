/*
     Find common elements between two arrays.

  */

package com.ttn.bootcamp.day1;

public class Ques5 {
    public static void main(String[] args) {

        int[] array1 = {4, 7, 3, 9, 8};
        int[] array2 = {3, 2, 1, 5, 40, 9, 4};
        findCommonElement(array1, array2);
    }

    /*
    this method will find the common element between arrays.
    @param array1 first array
    @param array2 second array
    @return common element
        */
    public static void findCommonElement(int[] array1, int[] array2) {


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
