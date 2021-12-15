package com.ds.algorithm.linkedlist.singly;

/**
 * @author vidit.singh
 * @created 30/11/2021 - 16:14
 */
public class LengthOfList {
    public static void main(String[] args) {

        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        Node nodeD = new Node();

        nodeA.data = 15;
        nodeA.next = nodeB;

        nodeB.data = 25;
        nodeB.next = nodeC;

        nodeC.data = 35;
        nodeC.next =nodeD;

        nodeD.data = 55;

        System.out.println(lengthOfList(nodeC));

    }

    private static int lengthOfList(Node node) {
        int length = 0;

        Node currentNode = node;
        while(currentNode != null){
            length++;
            currentNode = currentNode.next; // Update currentNode with latest node value.
        }
        return length;
    }
}
