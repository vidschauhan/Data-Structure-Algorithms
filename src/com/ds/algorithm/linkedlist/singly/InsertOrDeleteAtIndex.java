package com.ds.algorithm.linkedlist.singly;

/**
 * @author vidit.singh
 * @created 14/12/2021 - 16:06
 */
public class InsertOrDeleteAtIndex {
    Node head = null;
    Node tail = null;
    int sizeOfList = 0;

    /**
     * FIRST RULE -------- > DON'T Touch The HEAD. Just take its reference to another variable.
     */

    public void insertAtTail(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            head = newNode; /** If Empty then it is anyway going to be insert at head. */
            tail = head; /** Update the tail reference to 1st position as head. */
        } else {
            tail.next = newNode; /** Else at give reference of new node to last.next */
            tail = newNode;
        }
        sizeOfList++; /** Use this counter for Position check while insertion at posiyion method */

    }

    private void insertAtPosition(int position, int data) {
        if (isEmpty() || position < 1 || position > sizeOfList) {
            System.out.println("Empty List or Invalid Position!");
            return;
        } else {
            System.out.println("List After Insertion...");
            Node currentNode = head;
            int currPos = 1;                    /** Track the index of current position while traversal */
            while (currentNode != null) {       /** Traverse till end of the List */
                if (currPos == position) {      /** If Position found then insert at that position */
                    Node newNode = new Node();
                    newNode.data = data;
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next; /** Update the current node to next node address */
                currPos++;
            }
        }
    }

    private int removeAtPosition(int position) {
        int temp = -1;
        if (isEmpty() || position < 1 || position > sizeOfList) {
            System.out.println("Empty List or Invalid Position");
            return temp;
        } else {
            Node currentNode = head;
            Node prevNode = null;
            int currentPos = 1;
            while (currentNode!=null){
                if(position == currentPos) {
                    temp = currentNode.data;
                    prevNode.next = currentNode.next;
                    break;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
                currentPos++;
            }
        }
        System.out.println("List After remove at Position");
        return temp;
    }

    private boolean isEmpty() {
        return head == null;
    }


    public void displayList() {
        System.out.println("First --------------> Last");
        Node current = head;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertOrDeleteAtIndex insertOrDeleteAtIndex = new InsertOrDeleteAtIndex();
        insertOrDeleteAtIndex.insertAtTail(10);
        insertOrDeleteAtIndex.insertAtTail(11);
        insertOrDeleteAtIndex.insertAtTail(12);
        insertOrDeleteAtIndex.insertAtTail(19);
        System.out.println("List Before Insertion");
        insertOrDeleteAtIndex.displayList();

        insertOrDeleteAtIndex.insertAtPosition(4, 13);
        insertOrDeleteAtIndex.removeAtPosition(4);

        insertOrDeleteAtIndex.displayList();
    }


}
