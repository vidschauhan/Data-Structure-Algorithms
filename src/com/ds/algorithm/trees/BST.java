package com.ds.algorithm.trees;

/**
 * @author vidit.singh
 * @created 28/12/2021 - 14:40
 */
public class BST {
    Node root;

    public void insert(int key, String value) {
        Node newNode = new Node(key, value);

        if (root == null) {
            root = newNode;
            System.out.println("Inserted at root " + newNode.value);
        } else {

            Node currentNode = root;
            Node parentNode;

            while (true) {
                parentNode = currentNode; /** Re-assign current node o parent at start of the loop so that we can traverse its child. */
                if (key < parentNode.key) {
                    currentNode = currentNode.leftChild;
                    if (currentNode == null) {
                        parentNode.leftChild = newNode;
                        System.out.println("Inserted at left child " + newNode.value);
                        return;
                    }

                } else {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        parentNode.rightChild = newNode;
                        System.out.println("Inserted at rightChild " + newNode.value);
                        return;
                    }

                }


            }


        }

    }

    public Node findMin(Node root) {
        Node currentNode;
        Node last = null;

        currentNode = root; /** Starting from root */

        while (!(currentNode == null)) {
            last = currentNode;
            currentNode = currentNode.leftChild;
        }
        return last;
    }

    public Node findMax(Node root) {
        Node currentNode;
        Node last = null;

        currentNode = root; /** Starting from root */

        while (!(currentNode == null)) {
            last = currentNode;
            currentNode = currentNode.rightChild;
        }
        return last;
    }

    public boolean remove(int key) {
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = false;

        /** Traverse tree and search the node to delete. */

        while (currentNode.key != key) { // Traverse until the key (Node) is found.
            parentNode = currentNode;
            if (key < currentNode.key) { /** If key is less than current.key then traverse to left else go right. */
                currentNode = currentNode.leftChild;
                isLeftChild = true;

            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }

            if (currentNode == null) /** If the current reaches to null, hence the key is not present, then exit */
                return false;
        }


        Node nodeToDelete = currentNode;  /** Node found which is going to be deleted! . Lets give a reference name nodeToDelete */

        /** There are 3 scenarios to handle while deleting the node.
         * 1. If the node is LEAF NODE -> No children.
         * 2. If the node has 1 child -> Left or right child.
         * 3. If the node has 2 children -> Left and right child.
         */

        /****** NOTE -> Always handle the case either NodeToDelete itself is root or isLeftChild or IsRightChild ******/

        /** Scenario --> 1  ( If the node is LEAF NODE -> No children.) */

        if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
            if (nodeToDelete == root) {
                root = null;
            } else {
                if (isLeftChild) /** If the NodeToDelete itself is a leftChild of its parent */
                    parentNode.leftChild = null;
                else
                    parentNode.rightChild = null;
            }
            return true;
        }

        /** Scenario --> 2  (If the node has 1 child -> Left or right child.)*/
        else if (nodeToDelete.rightChild == null) {
            /** Means nodeToDelete has only left child. */
            if (nodeToDelete == root) {
                root = root.leftChild;
            } else if (isLeftChild) { /** If the NodeToDelete itself is a leftChild of its parent */
                parentNode.leftChild = nodeToDelete.leftChild;
            } else {
                parentNode.rightChild = nodeToDelete.leftChild;
            }

        }
        else if (nodeToDelete.leftChild == null) {
            /** Means nodeToDelete has only right child. */
            if (nodeToDelete == root) {
                root = root.rightChild;
            } else if (isLeftChild) { /** If the NodeToDelete itself is a leftChild of its parent */
                parentNode.leftChild = nodeToDelete.rightChild;
            } else {
                parentNode.rightChild = nodeToDelete.rightChild;
            }

        }
        else {
            /** Scenario --> 3  (If the node has 2 children -> Left and right child.) (Tricky One) */
            Node successorNode = getSuccessor(nodeToDelete.rightChild);;
            if(nodeToDelete == root){
                root = successorNode;
            } else if(isLeftChild) {
                /** If the nodeToDelete is left Child, Then link the successor to its parent left side */
                parentNode.leftChild = successorNode;
            } else {
                parentNode.rightChild = successorNode;
            }
            /** Now link the NodeToDelete Reference to successor */
            successorNode.leftChild = nodeToDelete.leftChild;
            successorNode.rightChild = nodeToDelete.rightChild;

        }


        return true;
    }

    private Node getSuccessor(Node rightChild) {
       return findMin(rightChild);
    }

    public Node getRoot(){
        return root;
    }
}


class App {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50, "A");
        bst.insert(25, "B");
        bst.insert(15, "C");
        bst.insert(5, "D");
        bst.insert(20, "E");
        bst.insert(35, "F");
        bst.insert(30, "G");
        bst.insert(40, "F");

        System.out.println(bst.findMin(bst.root).key);
        System.out.println(bst.findMax(bst.root).key);

        System.out.println(bst.remove(50));
        System.out.println(bst.getRoot().key);
    }
}
