package com.gap.sample.practice.datastructures.list;

import java.util.Stack;

public class ParenthesisMatch {

    public static void main(String[] args) {

        boolean isMatched = new ParenthesisMatch().isMatch("[[{[{{}}]}]]");
        System.out.println("The given string has balanced braces ->" + isMatched);
    }

    public boolean isMatch(String parenthesis) {

        Stack<Character> stack = new Stack<>();

        char[] character = parenthesis.toCharArray();

        for (char ch : character) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{')
                        || (ch == ']') && top == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
