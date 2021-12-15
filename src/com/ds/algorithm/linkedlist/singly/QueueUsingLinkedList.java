package com.ds.algorithm.linkedlist.singly;

/**
 * @author vidit.singh
 * @created 14/12/2021 - 18:30
 */
public class QueueUsingLinkedList {
    Node head = null;
    private boolean isEmpty(){
        return head == null;
    }
    private void displayList(){
        System.out.println("First --------------> Last");
        Node current = head;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }


    private void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head; /** Always Insert at head */
        head = newNode;
    }

    private int remove() {
        int temp = -1;
        Node currentNode = head;

        if (currentNode.next == null)
            head = null;

        if (isEmpty()) {
            System.out.println("Cant remove items. Empty Queue!");
        } else {
            while (currentNode != null) {
                if (currentNode.next.next == null) { /** check if current.next address is null, which means next to current node. */
                    temp = currentNode.next.data; /** Collect next node data */
                    currentNode.next = null; /** set currentNode to null as next node is the end of list */
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        queueUsingLinkedList.insert(5);
        queueUsingLinkedList.insert(15);
        queueUsingLinkedList.insert(53);
        queueUsingLinkedList.insert(55);

        System.out.println("List after insert.");
        queueUsingLinkedList.displayList();

        while (queueUsingLinkedList.head !=null)
        queueUsingLinkedList.remove();

        queueUsingLinkedList.displayList();
    }
}
