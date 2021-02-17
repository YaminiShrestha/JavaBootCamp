package com.ttn.bootcamp.day2;
/*
. WAP to show object cloning in java using cloneable
 */
//Class whose object is to be cloned implements Cloneable interface.
class Ques5_1 implements Cloneable{

        int rollNumber;
        String name;
// constructor
        Ques5_1(int rollNumber,String name){
            this.rollNumber=rollNumber;
            this.name=name;
        }
    //Default version of clone() method

    public Object clone()throws CloneNotSupportedException{
//            super.clone() is called to use the
//            default implementation of the clone() method in the Object class
            return super.clone();
        }

        public static void main(String args[]){
            try{
                Ques5_1 s1=new Ques5_1(101,"amit");
// copy of an object has the same state as the original objec
               Ques5_1 s2=(Ques5_1) s1.clone();

                System.out.println(s1.rollNumber+" "+s1.name);
                System.out.println(s2.rollNumber+" "+s2.name);

            }catch(CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

