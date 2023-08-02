package com.gap.sample.practice.leetcode;

import java.util.Stack;

public class ReversePolishNotation {


    public static void main(String[] args) {
        //String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        String[] tokens = new String[] {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        int returnValue = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();
        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int index = stack.indexOf(t);
                switch (index) {
                    case 0:
                        stack.push(String.valueOf(a + b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b - a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a * b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b / a));
                        break;
                }
            }
        }
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
}
