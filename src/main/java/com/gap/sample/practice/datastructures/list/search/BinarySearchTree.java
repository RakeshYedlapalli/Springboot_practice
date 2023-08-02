package com.gap.sample.practice.datastructures.list.search;

public class BinarySearchTree {


    public static void main(String[] args) {

        BST a = new BST();

        Node root;
        root = a.insertANode(null, 9);
        root = a.insertANode(root, 10);
        root = a.insertANode(root, 20);
        root = a.insertANode(root, 2);
        root = a.insertANode(root, 40);
        root = a.insertANode(root, 1);
        root = a.insertANode(root, 290);
        root = a.insertANode(root, 3);
        root = a.insertANode(root, 400);
        root = a.insertANode(root, 1);
        System.out.println(root);

    }
}

class BST {


    public Node insertANode(Node node, int value) {

        if (node == null) {
            return createNewNode(value);
        } else if (value < node.data) {
            node.left = insertANode(node.left, value);
        } else if (value > node.data) {
            node.right = insertANode(node.right, value);
        }
        return node;
    }

    private Node createNewNode(int value) {
        return new Node(value);
    }

    //public Node created
}

class Node {
    int data;
    Node left;
    Node right;


    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
