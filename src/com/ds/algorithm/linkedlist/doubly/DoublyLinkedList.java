package com.ds.algorithm.linkedlist.doubly;

import javax.print.Doc;
import java.util.Objects;

/**
 * @author vidit.singh
 * @created 14/12/2021 - 19:49
 */
public class DoublyLinkedList {
    Node head;
    /**
     * By default value is Null. It must always point to first node
     */
    Node tail;

    public boolean isEmpty() {
        return Objects.isNull(head);
    }

    public void displayList() {
        System.out.println("First --------------> Last");
        Node current = this.head;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            tail = newNode;  /** Reference of the tail will always be last last node if node insert at first place */
        } else {
            head.prev = newNode; /** update the head node's prev to newly created node */
        }
        newNode.next = head; /** update the new node next to old head -> which refers to old node at first place. */
        head = newNode; /** Now update the head to point newly created node */
    }

    public void insertAtLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        /** When Inserting at last , there is no need to move/update head again and again. Just provide the reference when the list is empty */
        if (isEmpty()) {
            head = newNode; /** When the list is empty */
        } else {
            newNode.prev = tail; /** Once the tail is updated at first insert when list was empty now we have tail ref, update new node->prev to last old ref */
            tail.next = newNode; /** Update the old tail->next add ref to new node address. */
        }
        tail = newNode; /** In the first pass when List is empty both Head and tail will be updated, But tail will keep updated as we insert at last pos. */

    }

    public void removeAtFirst() {
        if(isEmpty()){
            System.out.println("Empty List!");
        }
        else {
            if(head.next == null){ /** If only one items is there, then reset head & tail -> else keep removing */
                head = null;
                tail = null;
            }else {
                head.next.prev = null;
                head = head.next;
            }
        }


    }

    public void removeAtTail() {
        if(isEmpty()){
            System.out.println("Empty List!");
        }
        else {
            if(tail.prev == null){ /** If only one items is there, then reset head & tail -> else keep removing */
                head = null;
                tail = null;
            }else {
                tail.prev.next = null;
                tail = tail.prev;
            }
        }

    }

    public void insertAfter(int key, int data){
        Node currentNode = head;
        if(isEmpty())
            return;

        while (currentNode!=null){
            if(currentNode.data == key){
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = currentNode.next;
                newNode.prev = currentNode;
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;

            if(Objects.isNull(currentNode))
                System.out.println("Element not found!");
        }
    }

    public void removeAtKeyPosition(int key) {

        if (isEmpty())
            return;
        Node currentNode = head;
        while (Objects.nonNull(currentNode)) {
            if (currentNode.data == key) {
                if (Objects.isNull(currentNode.prev) && Objects.isNull(currentNode.next)) { /** assumes there is only 1 node, then reset the head. */
                    head = null;
                } else if(currentNode.prev == null){ /** Means the data found at head, so shift head to next position. */
                    currentNode.next.prev = null;
                    head = currentNode.next;
                    break;
                } else if(currentNode.next == null){ /** If Data founds at last Node */
                    currentNode.prev.next = null;
                    break;
                }
                else { /** If data found at any position */
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                    break;
                }
            }
            currentNode = currentNode.next;

            if (Objects.isNull(currentNode))
                System.out.println("Element not found!");
        }

    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtFirst(99);
        doublyLinkedList.insertAtFirst(88);
        doublyLinkedList.insertAtLast(10);
        doublyLinkedList.insertAtLast(12);
        doublyLinkedList.insertAtLast(14);

        System.out.println("Before");
        doublyLinkedList.displayList();

        doublyLinkedList.insertAtFirst(555);
        doublyLinkedList.insertAtLast(222);
        doublyLinkedList.insertAtLast(786);

        System.out.println("After");

        doublyLinkedList.displayList();

//        System.out.println("After remove");
//        while (doublyLinkedList.head !=null) {
//            doublyLinkedList.removeAtFirst();
//        }

//        doublyLinkedList.removeAtTail();
//        doublyLinkedList.insertAfter(14,666);
        doublyLinkedList.removeAtKeyPosition(786);
        doublyLinkedList.displayList();
    }
}
