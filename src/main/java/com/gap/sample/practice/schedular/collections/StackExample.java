package com.gap.sample.practice.schedular.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {


       // LinkedListNode list =
        Stack<String> stack = new Stack();
        stack.push("rakesh");
        stack.add("rakesh");
        System.out.println(stack.get(0));
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
