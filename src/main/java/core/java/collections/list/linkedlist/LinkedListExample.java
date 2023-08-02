package core.java.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String > linkedList = new LinkedList();
        ///////////////////////////Add , AddFirst AdddLast , Add at index //////////////////////////////////////////////////////
        linkedList.add("Print");
        linkedList.addFirst("I am first");
        linkedList.addLast("I am at last");
        linkedList.add(1,"I am added at position first");

///////////////////////////Offer , poll , peek//////////////////////////////////////////////////////
       linkedList = new LinkedList();

//        linkedList.add("Rakesh");
//        linkedList.add("Rajesh");
//        linkedList.add("Mahesh");
//        linkedList.add("Suresh");
//        linkedList.add("Swaraj");
//        linkedList.add("Veerababu");

        linkedList.offer("Rakesh");
        linkedList.offer("Rajesh");
        linkedList.offerFirst("Suresh");
        linkedList.offerLast("Swaraj");

        System.out.println(linkedList);


        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());



        System.out.println(linkedList.poll());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollLast());
    }
}
