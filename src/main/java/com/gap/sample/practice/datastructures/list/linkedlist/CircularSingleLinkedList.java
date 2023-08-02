package com.gap.sample.practice.datastructures.list.linkedlist;

public class CircularSingleLinkedList {

    public ListNode last;


    public static class  ListNode{

        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
      new CircularSingleLinkedList().createCircularSingleLinkedList();

        //last

    }

    private void createCircularSingleLinkedList() {
        ListNode firstNode = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        firstNode.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next  = fifth;
        fifth.next = firstNode;

        last = fifth;

            ListNode firstNode1 = last.next;



        while (firstNode1!=last){
            //if(count == 6) break;
            System.out.println("Data is ->"+firstNode1.data);
            firstNode1 = firstNode1.next;
        }
        System.out.println("Data is ->"+firstNode1.data);
    }
}
