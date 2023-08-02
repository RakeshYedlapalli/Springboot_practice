package com.gap.sample.practice.datastructures.list.linkedlist;

public class SinglyLinkedListPractice {


    public ListNode head;

    public static class ListNode {

        public int data;
        public ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedListPractice singlyLinkedList = new SinglyLinkedListPractice();
        singlyLinkedList.head = new ListNode(10);
        ListNode firstNode = new ListNode(10);
       /* ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(30);
        ListNode fifth = new ListNode(40);
        ListNode sixth = new ListNode(50);*/

        singlyLinkedList.head.next = firstNode;
       /* firstNode.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;*/


        //ListNode listNode =
      /*  for (int i = 0; i < 100; i++) {
             addAtLast(singlyLinkedList,new ListNode(i));
        }*/
        print(singlyLinkedList);

    }

    public static  void print(SinglyLinkedListPractice singlyLinkedListPractice){

        ListNode currentNode = singlyLinkedListPractice.head;
        while (currentNode.next!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    public static void addAtLast(SinglyLinkedListPractice singlyLinkedListPractice, ListNode node) {

        ListNode currentNode = singlyLinkedListPractice.head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = node;
    }
}
