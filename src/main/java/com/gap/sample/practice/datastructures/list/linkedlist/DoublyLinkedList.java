package com.gap.sample.practice.datastructures.list.linkedlist;

public class DoublyLinkedList {

    public ListNode head;
    public ListNode tail;
    public int length = 0;

    public static class ListNode{


        public int data;
        public  ListNode previous;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }

    }

    public DoublyLinkedList(){

        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0 ?true:false;
    }

    public int length(){
        return  length;
    }
    public static void main(String[] args) {



        //doublyLinkedListForwardDirection();
        //doublyLinkedListBackwardDirection();
        new DoublyLinkedList().insertNodeAtBeginning(new ListNode(20000),doublyLinkedListBackwardDirection());
        new DoublyLinkedList().insertNodeAtEnd(new ListNode(1292),doublyLinkedListBackwardDirection());
        new DoublyLinkedList().deleteNodeAtFirst(doublyLinkedListBackwardDirection());
        new DoublyLinkedList().deleteNodeAtLast(doublyLinkedListBackwardDirection());



    }

    private static DoublyLinkedList doublyLinkedListBackwardDirection() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.head = new ListNode(10);
        ListNode second  = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);
        doublyLinkedList.head.next = second;
        second.previous = doublyLinkedList.head;
        second.next = third;


        third.previous = second;
        third.next = fourth;


        fourth.previous = third;
        fourth.next = fifth;

        fifth.previous = fourth;
        fifth.next = sixth;

        sixth.previous = fifth;
        sixth.next = doublyLinkedList.tail;

        doublyLinkedList.tail = sixth;





//        System.out.println(doublyLinkedList);
        new DoublyLinkedList().printInBackwardDirection(doublyLinkedList);
        return doublyLinkedList;
    }

    private static void doublyLinkedListForwardDirection() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.head = new ListNode(10);
        ListNode second  = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);
        doublyLinkedList.head.next = second;
        second.previous = doublyLinkedList.head;
        second.next = third;


        third.previous = second;
        third.next = fourth;


        fourth.previous = third;
        fourth.next = fifth;

        fifth.previous = fourth;
        fifth.next = sixth;

        sixth.previous = fifth;


//        System.out.println(doublyLinkedList);
        new DoublyLinkedList().printInForwardDirection(doublyLinkedList);
    }

    public void printInForwardDirection(DoublyLinkedList doublyLinkedList){

        ListNode currentNode  = doublyLinkedList.head;
        while (currentNode !=null){
            System.out.println("Data is ->"+ currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void insertNodeAtBeginning(ListNode listNode,DoublyLinkedList doublyLinkedList){

        //doublyLinkedList.head.previous = listNode;
        if(isEmpty()){

        }
        listNode.next = doublyLinkedList.head;
         doublyLinkedList.head = listNode;
        printInForwardDirection(doublyLinkedList);

    }

    public void insertNodeAtEnd(ListNode listNode,DoublyLinkedList doublyLinkedList){

        //doublyLinkedList.head.previous = listNode;
        if(isEmpty()){

        }
        listNode.previous = doublyLinkedList.tail;
        doublyLinkedList.tail.next = listNode;
        System.out.println("After adding at the last");
        printInForwardDirection(doublyLinkedList);

    }

    public void deleteNodeAtFirst(DoublyLinkedList doublyLinkedList){

        //doublyLinkedList.head.previous = listNode;

        ListNode secondNode = doublyLinkedList.head.next;
        doublyLinkedList.head = secondNode;
        System.out.println("Deleting first node");
        printInForwardDirection(doublyLinkedList);

    }

    public void deleteNodeAtLast(DoublyLinkedList doublyLinkedList){

        //doublyLinkedList.head.previous = listNode;
        doublyLinkedList.tail = doublyLinkedList.tail.previous;;
        doublyLinkedList.tail.next = null;
        System.out.println("Deleting last node");
        printInForwardDirection(doublyLinkedList);

    }

    public void printInBackwardDirection(DoublyLinkedList doublyLinkedList){

        ListNode currentNode  = doublyLinkedList.tail;
        while (currentNode !=null){
            System.out.println("Data is ->"+ currentNode.data);
            currentNode = currentNode.previous;
        }
    }

}
