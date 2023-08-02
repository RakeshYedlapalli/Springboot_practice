package com.gap.sample.practice.datastructures.list;

public class ReverseAStringUsingStack {

    public ListNode top;
    public int length;

    public static class ListNode {
        char data;
        ListNode next;

        public ListNode(char data) {
            this.data = data;
        }
    }

    public void push(char data) {

        ListNode listNode = new ListNode(data);
        listNode.next = top;
        top = listNode;
        length++;

    }

    public char pop() {


        char data = top.data;

        top = top.next ;
        return  data;

    }

    public static void main(String[] args) {
        ReverseAStringUsingStack reverseAStringUsingStack  = new ReverseAStringUsingStack();
        char[] chars = "rakesh".toCharArray();


        for(char ch : chars){
            reverseAStringUsingStack.push(ch);
        }

        for(int i=0;i<chars.length;i++){
            chars[i] = reverseAStringUsingStack.pop();
        }

        System.out.println(new String(chars));


    }

}
