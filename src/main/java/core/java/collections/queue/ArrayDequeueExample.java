package core.java.collections.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ArrayDequeueExample {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(60);
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.add(50);




//        System.out.println(arrayDeque);
//
//
//        System.out.println(arrayDeque.getFirst());
//        System.out.println(arrayDeque.getLast());
//

        Iterator it = arrayDeque.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
        while(arrayDeque.peek() != null){
            System.out.println(arrayDeque.pop());
        }

        System.out.println(arrayDeque);
    }
}
