package com.gap.sample.practice.datastructures.list.search.practice;

public class PracticeBinarySearchTree {


    public static void main(String[] args) {
        PracticeBinarySearchTree practiceBinarySearchTree = new
                PracticeBinarySearchTree();

        Node node = null;
        node = practiceBinarySearchTree.insertNode(node, 10);
        node = practiceBinarySearchTree.insertNode(node, 11);
        node = practiceBinarySearchTree.insertNode(node, 12);
        node = practiceBinarySearchTree.insertNode(node, 13);
        node = practiceBinarySearchTree.insertNode(node, 1);
        node = practiceBinarySearchTree.insertNode(node, 3);
        System.out.println(node);

    }

    public Node insertNode(Node node, int value) {

        if (node == null) {
            return new Node(value);
        } else if (value < node.data) {
            node.left = insertNode(node.left, value);
        } else if (value > node.data) {
            node.right = insertNode(node.right, value);
        }

        return node;
    }

}
