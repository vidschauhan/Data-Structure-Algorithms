package com.ds.algorithm.stack;

/**
 * @author vidit.singh
 * @created 29/11/2021 - 17:51
 */
public class ReverseStringUsingStack {

        private int stringSize;         /** Size of the stack */
        private int top;               /** represents the index of the array. */
        private char[] stackArray;     /** Elements in the stack array */

    public ReverseStringUsingStack(int size) {
        this.stringSize = size;
        this.stackArray = new char[size];
        this.top = -1; /** As the array starts from 0th position hence initialized to -1 for now so that when we push, we push at 0th position first. */
    }

    private void push(char c){
        top++;
        stackArray[top] = c;
    }

    private char pop(){
        int old_top = top;
        top--;
        return stackArray[old_top];
    }

        private boolean isEmpty(){
        return top == -1;
    }

        private boolean isFull(){
        return (stringSize - 1) == top;
    }

    public static void main(String[] args) {
        reverseString("HELLO WORLD!");
    }

    public static void reverseString(String str){

        ReverseStringUsingStack stack = new ReverseStringUsingStack(str.length());

        for (int i = 0; i<str.length();i++){
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
