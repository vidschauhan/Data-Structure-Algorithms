package com.ds.algorithm.linkedlist.singly;

/**
 * @author vidit.singh
 * @created 14/12/2021 - 17:40
 */
public class StackUsingLinkedList {
    Node head = null;
    Node tail = null;

    private void push(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()) { /** If list is Empty Insert @Head position */
            tail = newNode; /** Update tail so that we have a track of last element inserted. */
            newNode.next = head;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    private int pop() {
        int temp = -1;
        Node currentNode = head;

        if (currentNode.next == null) {
            head = null; /** reset both head & tail so that stack can be used again */
            tail = null;
        }

        if (isEmpty()) {
            System.out.println("No Elements to pop!");
        } else {
            while (currentNode != null) {
                if (currentNode.next.next == null) {
                    temp = currentNode.next.data;
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;

            }
        }
        return temp;
    }

    private boolean isEmpty(){
        return head == null;
    }
    public void displayList(){
        System.out.println("First --------------> Last");
        Node current = head;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(40);

        stackUsingLinkedList.displayList();

       while (stackUsingLinkedList.head != null)
        stackUsingLinkedList.pop();

        stackUsingLinkedList.push(80);
        stackUsingLinkedList.push(70);
        stackUsingLinkedList.displayList();

    }
}

