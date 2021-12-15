package com.ds.algorithm.linkedlist.singly;

/**
 * @author vidit.singh
 * @created 30/11/2021 - 16:57
 */
public class App {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtHead(5);
        singlyLinkedList.insertAtHead(15);
        singlyLinkedList.insertAtHead(52);
        singlyLinkedList.insertAtHead(55);
        singlyLinkedList.insertAtHead(58);

        singlyLinkedList.insertAtTail(9999);

//        singlyLinkedList.displayList();

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(4);
        circularLinkedList.insertFirst(31);
        circularLinkedList.insertFirst(423);
        circularLinkedList.insertFirst(52);

        circularLinkedList.insertAtLast(555);
        circularLinkedList.displayList();
    }
}
