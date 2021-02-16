/*Write a program to display values of enums using a
 constructor & getPrice() method (Example display house & their prices)

 */

package com.ttn.bootcamp.day1;

public class Ques9 {
    //    enum class
    enum House {
        house1(90), house2(20), house3(5), house4(19), house5(12);
        private int price;

        //constructor
        House(int p) {
            price = p;
        }

        int getPrice() {

            return price;
        }
    }

    public static void main(String args[]) {
        System.out.println("All House prices:");
        for (House h : House.values())
            System.out.println(
                    h + " costs " + h.getPrice() + " thousand dollars.");
    }
}

