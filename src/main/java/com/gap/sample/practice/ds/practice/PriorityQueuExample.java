package com.gap.sample.practice.ds.practice;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueuExample {


    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->{
            if(a==b){
                return 0;
            }else if(a>b){
                return -1;
            }else{
                return 1;
            }
        });
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(50);
        priorityQueue.add(40);

//        System.out.println(priorityQueue);
       /* int size = priorityQueue.size();
        for(int i=0;i<size;i++ ){
            System.out.println(priorityQueue.poll());
        }*/


        while (priorityQueue.peek() != null) {
            System.out.println(priorityQueue.poll());
        }



        /*Iterator<Integer> integers = priorityQueue.iterator();

        while (integers.hasNext()){
            System.out.println(integers.next());
        }*/
    }
}
