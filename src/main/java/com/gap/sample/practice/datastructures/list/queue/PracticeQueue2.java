package com.gap.sample.practice.datastructures.list.queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class PracticeQueue2 {


    public Stack<Integer> stack1 = new Stack<>();
    public Stack<Integer> stack2 = new Stack<>();

    public void enQueue(int data) {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.add(data);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }


    }


    public int deQueue(){

        if(!stack1.isEmpty()){

            return stack1.pop();
        }
        throw new EmptyStackException();
    }

    public static void main(String[] args) {

        PracticeQueue2 practiceQueue2 = new PracticeQueue2();
        practiceQueue2.enQueue(10);
        practiceQueue2.enQueue(20);
        practiceQueue2.enQueue(30);
        practiceQueue2.enQueue(40);
        practiceQueue2.enQueue(50);


        System.out.println(practiceQueue2.deQueue());
        System.out.println(practiceQueue2.deQueue());
        System.out.println(practiceQueue2.deQueue());
        System.out.println(practiceQueue2.deQueue());
        System.out.println(practiceQueue2.deQueue());



    }


}
