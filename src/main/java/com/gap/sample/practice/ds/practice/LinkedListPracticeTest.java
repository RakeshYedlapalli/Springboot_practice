package com.gap.sample.practice.ds.practice;

public class LinkedListPracticeTest {

    Node head;
    public static void main(String[] args) {



        LinkedListPracticeTest l = new LinkedListPracticeTest();
       // Node node = null;
        l.head = l.addData(l.head, 10);
        l.head = l.addData(l.head, 30);
        l.head = l.addData(l.head, 40);
        l.head = l.addData(l.head, 50);
        l.head = l.addData(l.head, 70);

        System.out.println(l.head);

        l.printElements(l.head);

        l.addLast(l,100);
        l.adddLast(l,100);
        //System.out.println(l.head);
        l.printElements(l.head);


    }

    public Node addData(Node node, int data) {

        if (node == null) {
            node = new Node(data);
        } else {
            Node temp = addData(node.next, data);
            // node = new Node(data);
            node.next = temp;
        }
        return node;

    }

    public void printElements(Node node) {

        Node temp = node;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public Node addLast(LinkedListPracticeTest l, int data) {

        Node newNode = new Node(data);

        Node currentNode = l.head;
      //  Node temp = node;
        while (currentNode.next != null) {
            //System.out.println(temp.data);
            currentNode = currentNode.next;
        }

       /* SinglyLinkedList.ListNode currentNode = singlyLinkedList.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;*/

        System.out.println("Something");
        currentNode.next = newNode;


        System.out.println();
       // node.next = new Node(data);

      //  temp.next = new Node(data);

    return null;
    }

    public void adddLast(LinkedListPracticeTest l, int data) {

        Node node = new Node(data);
        node.next = l.head;
        head = node;
    }


}



class Node {
    int data;
    Node next;

    public Node(int data) {

        this.data = data;
    }

}
