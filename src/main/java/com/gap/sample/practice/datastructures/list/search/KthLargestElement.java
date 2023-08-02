package com.gap.sample.practice.datastructures.list.search;


import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {

        int[] array = {3,4,5,6,4,3,3,4,6,7,7,5,5,79,9,44};
        //int largestEleen = new KthLargestElement().findKthLargestElement(array,1);
       // System.out.println(largestEleen);

        PriorityQueue<Integer> i  = new PriorityQueue<>();
        i.add(10);
        i.remove();
        System.out.println("First time ->"+i);
        i.add(30);
        i.add(40);
        i.add(50);
        i.add(60);
        i.add(70);
        i.add(20);
        i.add(100);
        i.add(200);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        i.add(6);
        i.add(7);

      /*  for(int ii=0;ii<i.size();ii++){

            //i.remove();
         //   System.out.println(i);
        }*/


        new KthLargestElement().findKthLargestElement(array,3);
        System.out.println("Final data is ->"+ i);


    }


    public int findKthLargestElement(int[] nums , int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i:nums){
            minHeap.add(i);

            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}
