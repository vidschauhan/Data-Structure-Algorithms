package com.ds.algorithm.trees;

/**
 * @author vidit.singh
 * @created 28/12/2021 - 14:37
 */
public class Node {
    Node leftChild;
    Node rightChild;
    int key;
    String value;

    public Node(int key, String value) {
        super();
        this.key = key;
        this.value = value;
    }
}
