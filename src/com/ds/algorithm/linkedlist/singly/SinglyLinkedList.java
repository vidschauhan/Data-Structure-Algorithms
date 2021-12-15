package com.ds.algorithm.linkedlist.singly;

/**
 * @author vidit.singh
 * @created 30/11/2021 - 14:50
 */
public class SinglyLinkedList {

    Node head = null;

    public boolean isEmpty(){
        return  head == null;
    }

    public void insertAtHead(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head; /** head  = null hence place null at newNode next*/
        head = newNode; /**  Provide the reference of the new node to head*/

    }

    public void insertAtTail(int data){
        Node currentNode = head;
        while (currentNode.next !=null){
            currentNode = currentNode.next; /** Reached at the end of the Linked list by traversing till null. */
        }
        Node newNode = new Node();
        newNode.data = data;
        currentNode.next = newNode;


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


}
