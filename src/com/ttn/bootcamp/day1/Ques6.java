/*
There is an array with every element repeated twice except one. Find that element
 Input:{2, 3, 5, 4, 5, 3, 4}
 Output: 2
 */
package com.ttn.bootcamp.day1;

public class Ques6 {
    /*
    this method  will find non repeated element
    @param arr[] main array under which xor operation is performed
    @param size the length of array is stored in it
    @return the non repeated element
     */
    static int findSingle(int arr[], int size) {

        int res = arr[0];
        for (int i = 1; i < size; i++)
            res = res ^ arr[i];

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 5, 3, 4};
        int size = arr.length;
        System.out.println("Non repeated element is  " + findSingle(arr, size));
    }
}
