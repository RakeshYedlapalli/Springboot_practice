package core.java.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {


    public static void main(String[] args) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.offer(3);





        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.element());


        System.out.println("poll ->"+priorityQueue.poll());
        System.out.println("remove ->"+priorityQueue.remove());
        System.out.println("remove ->"+priorityQueue.remove());
        System.out.println("remove ->"+priorityQueue.remove());
        System.out.println("remove ->"+priorityQueue.poll());


    }
}
