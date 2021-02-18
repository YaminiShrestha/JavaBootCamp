package com.ttn.bootcamp.day3;

/**
 * Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(),
 * isEmpty(), isFull() and an additional operation getMin() which should return minimum element
 * from the SpecialStack.(Expected complexity ­ O(1))
 */

import java.util.Stack;


/*
 * class  hold all the stack operations and one additional
 * operation getMin() that returns the minimum element from stack at any time.
 * Inherited stack class and uses one auxiliary stack that hold minimum element
 */

class IntegerStack extends Stack<Integer> {
    Stack<Integer> minimumStack = new Stack<>();


    /*
     * This method push the values in stack and also updated with appropriate minimum value.
     * @param value main input to pushed on stack
     */
    void push(int value) {
//        check if stack is empty or not
        if (isEmpty() == true) {
            super.push(value);
            minimumStack.push(value);
        } else {
            super.push(value);
            int topOfStack = minimumStack.pop();
            minimumStack.push(topOfStack);
            if (value < topOfStack)
                minimumStack.push(value);
            else
                minimumStack.push(topOfStack);
        }
    }

    /*
     * this method will delete the element from top of both stack
     * @return top of integer stack
     */
    public Integer pop() {
        int topOfStack = super.pop();
        minimumStack.pop();
        return topOfStack;
    }

    /*
     * this method help to get minimum element from it.
     * @return minimumValue from the top of minimum stack
     */
    int getMinimum() {
        int minimumValue = minimumStack.pop();
        minimumStack.push(minimumValue);
        return minimumValue;
    }
}

// Driver Code
class Ques7 {
    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        System.out.println(integerStack.getMinimum());
        integerStack.push(5);
        integerStack.pop();
        System.out.println(integerStack.getMinimum());
    }
}

