package com.gap.sample.practice.Springboot_practice;

import java.util.Stack;

public class FindPattern {


    public int findPattern(String patternString) {
        return 0;
    }

    public static void main(String[] args)
            throws java.lang.Exception {
      /*  String s = "aaaaabbbbb";

        // Function call
        boolean value = isAnBn(s);
        if (value == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }*/

        // findPattern();
       // System.out.println(findPatter2("abab"));
        System.out.println(isAnBn("abab"));


       /* String s1 = "aaaaabbbbb";
        System.out.println("IsAnB=>"+isAnBn(s1));*/


    }

    private static void findPattern() {
        String s = "aaabbb";
        Stack<Character> front = new Stack<>();
        Stack<Character> end = new Stack<>();
        int length = s.length() / 2;
        if (s.length() % 2 == 1) {
            System.out.println("False");
            return;
        }
        for (int i = 0; i < length; i++) {

            front.push(s.charAt(i));
            end.push(s.charAt(s.length() - i - 1));

        }

        while (!front.isEmpty()) {
            if (front.pop() != 'a' || end.pop() != 'b') {
                System.out.println("False");
                return;

            }
        }
        System.out.println("True");
    }

    public static boolean isAnBn(String s) {
        int l = s.length();

        // Only even length strings will have same number of
        // a's and b's
        if (l % 2 == 1) {
            return false;
        }
        // Set two pointers, one from the left and another
        // from right
        int i = 0;
        int j = l - 1;

        // Compare the characters till the center
        while (i < j) {
            if (s.charAt(i) != 'a' || s.charAt(j) != 'b') {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static boolean findPatter2(String patter) {

        int length = patter.length() / 2;
        for (int i = 0; i < length; i++) {

            System.out.println("i->"+patter.charAt(i)+" j-> "+patter.charAt(patter.length() - i - 1));
            if (patter.charAt(i) != 'a' || patter.charAt(patter.length() - i - 1) != 'b') {
                return false;
            }
        }
        return true;

    }
}
