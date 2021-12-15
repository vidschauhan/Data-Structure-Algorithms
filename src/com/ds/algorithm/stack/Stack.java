package com.ds.algorithm.stack;

/**
 * @author vidit.singh
 * @created 29/11/2021 - 17:15
 */
public class Stack {
    private int maxSize;           /** Size of the stack */
    private int top;               /** represents the index of the array. */
    private long[] stackArray;     /** Elements in the stack array */

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[size];
        this.top = -1; /** As the array starts from 0th position hence initialized to -1 for now so that when we push, we push at 0th position first. */
    }

    private void push(long data){
        /**  Check the array before pushing the element  */
        if(!isFull()) {
            top++; /** First increment the index then write data at that index  */
            stackArray[top] = data;
        }
    }

    private long pop(){
        /**  Check the array before popping the element  */
        if(!isEmpty()) {
            int old_top = top; /** Take the reference of current index before decrementing the index  */
            top--;
            return stackArray[old_top]; /** Returning the popped data using old index reference  */
        }
        return top;

    }

    private long peek(){
        return stackArray[top];
    }

    private boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return (maxSize - 1) == top;
    }

    public static void main(String[] args) {

        Stack myStack = new Stack(2);
        myStack.push(10);
        myStack.push(30);
        myStack.push(70);
        myStack.push(90);
        myStack.push(40);

        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }


    }
}
