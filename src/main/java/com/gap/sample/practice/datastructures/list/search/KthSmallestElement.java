package com.gap.sample.practice.datastructures.list.search;

public class KthSmallestElement {


    public static void main(String[] args) {


        BinarySearchTreeFindElement binarySearchTreeFindElement =
                new BinarySearchTreeFindElement();

        TreeNode treeNode = null;
        treeNode = binarySearchTreeFindElement.createANode(treeNode, 10);
        treeNode = binarySearchTreeFindElement.createANode(treeNode, 20);
        treeNode = binarySearchTreeFindElement.createANode(treeNode, 5);
        treeNode = binarySearchTreeFindElement.createANode(treeNode, 7);
        treeNode = binarySearchTreeFindElement.createANode(treeNode, 26);
        treeNode = binarySearchTreeFindElement.createANode(treeNode, 50);
        treeNode = binarySearchTreeFindElement.createANode(treeNode, 60);
        treeNode = binarySearchTreeFindElement.createANode(treeNode, 3);
        treeNode = binarySearchTreeFindElement.createANode(treeNode, 4);

        System.out.println(treeNode);

        //System.out.println(treeNode.data);
        binarySearchTreeFindElement.traverseAmongAllNodes(treeNode);
    }


}


class BinarySearchTreeFindElement {


    int k=10;

    public TreeNode createANode(TreeNode node, int data) {

        if (node == null) {
            return new TreeNode(data);
        } else if (data < node.data) {
            node.left = createANode(node.left, data);
        } else if (data > node.data) {
            node.right = createANode(node.right, data);
        }
        return node;


    }

    public void traverseAmongAllNodes(TreeNode treeNode) {

       /* if(treeNode ==null){
            System.out.println("No elements to print");
            return;
        }

        if(treeNode.left!=null){
            System.out.println(treeNode.left.data);
            traverseAmongAllNodes(treeNode.left);
        }

        if(treeNode.right!=null){
            System.out.println(treeNode.right.data);
            traverseAmongAllNodes(treeNode.right);
        }*/


        if (treeNode.left != null) {
            traverseAmongAllNodes(treeNode.left);
        }


        --k;
        if(k==0){
            System.out.println("Smallest element is ->"+ treeNode.data);
            return;
        }



        //System.out.println(treeNode.data);
        if (treeNode.right != null) {
            traverseAmongAllNodes(treeNode.right);

        }




    }


}

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {


    }
}
