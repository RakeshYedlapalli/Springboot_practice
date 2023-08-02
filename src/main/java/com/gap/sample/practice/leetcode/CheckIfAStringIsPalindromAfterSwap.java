package com.gap.sample.practice.leetcode;

public class CheckIfAStringIsPalindromAfterSwap {

//123456787654321
//123456787654321
    public static void main(String[] args) {
        String str = "123456787654321"; // Change this string to test different inputs

        if (isPalindromeSwapped(str)) {
            System.out.println("The string is a palindrome when values are swapped.");
        } else {
            System.out.println("The string is not a palindrome when values are swapped.");
        }
    }

    public static boolean isPalindromeSwapped(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();

        // Check if the string is already a palindrome
        if (isPalindrome(chars)) {
            return true;
        }

        // Loop through each pair of characters and check if swapping them makes the string a palindrome
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                // Swap the characters
                swap(chars, i, j);

                // Check if the swapped string is a palindrome
                if (isPalindrome(chars)) {
                    return true;
                }

                // Swap the characters back to their original positions
                swap(chars, i, j);
            }
        }

        return false;
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static boolean isPalindrome(char[] chars) {
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


}
