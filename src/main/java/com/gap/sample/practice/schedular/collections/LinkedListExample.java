package com.gap.sample.practice.schedular.collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String > list = new LinkedList<>();
        list.add("Raes");

        System.out.println(list.getFirst());
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
        list.add("Raes");
        list.add("last");
        System.out.println(list.pollFirst());
        System.out.println(list);
        System.out.println(list.pollLast());
        list.add("Raes");
        list.addLast("rakesh");
        list.addFirst("rakeshdddd");
        System.out.println(list);

    }

}
