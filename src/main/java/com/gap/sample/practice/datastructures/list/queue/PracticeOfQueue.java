package com.gap.sample.practice.datastructures.list.queue;

import java.util.Stack;

public class PracticeOfQueue {


    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Stack<Integer> stack3 = new Stack<>();

    public void enQueue(int data) {

        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        stack.push(data);


        while (!stack2.isEmpty()){
            stack.push(stack2.pop());
        }
    }

    public int deQueue() {


        if (stack.isEmpty()) {
            System.out.println("Q is Empty");
           // System.exit(0);
        }

        // Return top of s1
        return stack.pop();


    }

    public static void main(String[] args) {

        PracticeOfQueue practice = new PracticeOfQueue();
        practice.enQueue(10);
        practice.enQueue(20);
        practice.enQueue(30);
        practice.enQueue(40);

        System.out.println(practice.stack);
        System.out.println(practice.stack2);


        System.out.println(practice.deQueue());
        System.out.println(practice.deQueue());
        System.out.println(practice.deQueue());
        System.out.println(practice.deQueue());
        System.out.println(practice.deQueue());
        System.out.println(practice.deQueue());
        System.out.println(practice.deQueue());

    }
}
