package com.ds.algorithm.linkedlist.doubly;

/**
 * @author vidit.singh
 * @created 14/12/2021 - 19:48
 */
public class Node {
     int data;
     Node next = null;
     Node prev = null;

     public void displayNode(){
          System.out.println("{ " + this.data + " }");
     }
}
