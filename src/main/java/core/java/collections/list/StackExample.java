package core.java.collections.list;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack();

        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        stack.add(60);
        stack.add(70);
        stack.add(80);


        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
