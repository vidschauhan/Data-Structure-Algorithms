package com.ds.algorithm.linkedlist.singly;

/**
 * @author vidit.singh
 * @created 30/11/2021 - 17:40
 */
public class CircularLinkedList {
    Node head = null;
    Node last = null;

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode; /** update last as First Place */
        }

        newNode.next = head; /** update the newNode next to Null i.e head in this case. */
        head = newNode; /** Update the head reference to newly created node */

    }

    public void insertAtLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            head = newNode; /** If Empty then it is anyway going to be insert at head. */
        } else {
            last.next = newNode; /** Else at give reference of new node to last.next */
            last = newNode; /** Update the last to next node i.e newNode */
        }

    }


    private boolean isEmpty() {
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
}
