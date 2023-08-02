package com.gap.sample.practice.datastructures.list;

public class IsStringPalindrome {

    public static void main(String[] args) {
       boolean isPalindrome =  new IsStringPalindrome().isPalindrome("MADAM");
        System.out.println(isPalindrome);

         isPalindrome = new IsStringPalindrome().isPalindromString("MADAMs");
        System.out.println(isPalindrome);
    }


    public boolean isPalindromString(String palin){
        char[] palindrom = palin.toCharArray();
        int start = 0;
        int end = palin.length()-1;

        while (start!=end){
            if(palindrom[start]!=palindrom[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public boolean isPalindrome(String palindrome){
        String s  ="";
        for(int i=palindrome.length()-1;i>=0;i--){
            s = s+palindrome.charAt(i);
        }

        return s.equals(palindrome);

    }
}
