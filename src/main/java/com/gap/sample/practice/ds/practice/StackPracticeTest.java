package com.gap.sample.practice.ds.practice;

import java.util.Stack;

public class StackPracticeTest {

    StackNode top;
    int length;


    public static void main(String[] args) {

        StackPracticeTest stackPracticeTest = new StackPracticeTest();
        stackPracticeTest.push(10);
        stackPracticeTest.push(20);
        stackPracticeTest.push(30);
        stackPracticeTest.push(40);
        stackPracticeTest.push(50);
        stackPracticeTest.push(60);
        stackPracticeTest.push(70);

        System.out.println(stackPracticeTest.peek());
        System.out.println(stackPracticeTest.peek());
        System.out.println(stackPracticeTest.peek());
        System.out.println(stackPracticeTest.pop());
        System.out.println(stackPracticeTest.pop());
        System.out.println(stackPracticeTest.pop());
        System.out.println(stackPracticeTest.pop());
        System.out.println(stackPracticeTest.pop());
        System.out.println(stackPracticeTest.pop());
        System.out.println(stackPracticeTest.pop());
        System.out.println(stackPracticeTest.peek());

    }


    public void push(int data) {

        StackNode stackNode = new StackNode(data);
        stackNode.next = top;
        top = stackNode;
        length++;
    }
    public int peek() {

        if(isEmpty()){
            System.out.println("The stack is overflow");
            return  0;
        }
        return top.data;
    }


    public int pop() {
        int data = top.data;
          top = top.next;
          length--;
        return data;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int length(){
        return length;
    }

}

class StackNode {
    int data;
    StackNode next;


    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }



}
