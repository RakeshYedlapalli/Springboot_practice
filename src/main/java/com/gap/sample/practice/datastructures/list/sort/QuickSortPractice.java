package com.gap.sample.practice.datastructures.list.sort;

import java.util.Arrays;

public class QuickSortPractice {


    public static void main(String[] args) {
        int [] arr= {13,5,6,7,5,4,9};


        int high = arr.length-1;
        int low = 0;
        int pivot = (low+high)/2;

        System.out.println(pivot);

        int temp = arr[pivot];
        arr[pivot] = arr[high];
        arr[high] = temp;


        for(int i=0;i<arr.length;i++){

            if(arr[i]<=arr[high]){




            }
        }


        System.out.println(Arrays.toString(arr));


    }

}
