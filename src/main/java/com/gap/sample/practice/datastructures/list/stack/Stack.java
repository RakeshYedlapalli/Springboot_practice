package com.gap.sample.practice.datastructures.list.stack;

public class Stack {

    public ListNode top;
    public int length;

    public static class ListNode {

        public int data;
        public ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
        //public ListNode
    }


    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int value = stack.pop();
        System.out.println(value);
        System.out.println("Length of the stack is ->" + stack.length);
        int value1 = stack.pop();
        int value2 = stack.pop();
        int value3 = stack.pop();
        int valu4 = stack.pop();

        System.out.println("Length of the stack is ->" + stack.length);




    }

    public void printData(ListNode ListNode) {


    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {

        ListNode tempNode = new ListNode(data);
        tempNode.next = top;
        top = tempNode;
        length++;

    }

    public int pop() {

        int data = top.data;
        top = top.next;
        length--;
        return data;
    }
}
