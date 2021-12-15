package com.ds.algorithm.queue;

/**
 * @author vidit.singh
 * @created 29/11/2021 - 19:18
 */
public class Queue {
    int maxSize;
    long[] queueData;
    int front; /** Points to the front of the queue. set to 0 so that first element popped from 0th position.*/
    int rear; /** Points to the rear of the queue. set to -1 so that you may insert data after incrementing it at 0th position*/
    int currentSize /** Keeps track of size of the queue.*/;


    public Queue(int size){
        this.maxSize = size;
        this.queueData = new long[size];
        this.front=0;
        this.rear=-1;
        this.currentSize = 0;
    }

    public void insert(long item) {
        if (isFull()) {
            System.out.println("Queue is Full, can't insert more items!");
        } else {
            rear++;
            queueData[rear] = item;
            currentSize++;
        }

    }

    public long remove() {
        long temp =  -1 ;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            temp = queueData[front];
            front++; /** Array starts from Left to Right, Hence to access data from left to right to remove elements, just front id incremented. */
            currentSize--;
        }
        return temp;
    }

    public long peekCurrent(){
        return  queueData[rear];
    }

    public boolean isEmpty(){
    return  currentSize == 0;
    }

    public boolean isFull(){
        return currentSize == maxSize;
    }

    public int currentSize(){
        return this.currentSize;
    }

    public void displayData(){
        System.out.print("[ ");
        for (int i=0;i<maxSize;i++){
            System.out.print(queueData[i] + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(44);
        queue.insert(53);
        queue.insert(654);
        queue.insert(74);
        queue.insert(23);

        queue.displayData();
//        System.out.println("\n" + queue.peekCurrent());

        System.out.println("\n Removing element from queue");
        while (!queue.isEmpty()){
            System.out.print(queue.remove());
            System.out.print(" ");
        }
    }

}
