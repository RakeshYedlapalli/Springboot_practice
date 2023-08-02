package com.gap.sample.practice.geeksforgeek;

import java.util.Arrays;

public class MissingNumberInArray {


    public static void main(String[] args) {
        new MissingNumberInArray().missingNumbberInArray(null);



    }

    public int missingNumbberInArray(int[] arr) {
        int[] sortedArray =  sort(new int[]{9, 8, 7, 6, 5,4,3, 1});
       // System.out.println(Arrays.toString(sortedArray));
        Integer output  = Arrays.stream(sortedArray).reduce(0, Integer::sum);

       // System.out.println("Sum : "+ output);

        for(int i=0;i<sortedArray.length;i++){

            if(i<sortedArray.length-1){
                if(sortedArray[i+1]-sortedArray[i] != 1){
                    int miss = sortedArray[i]+1;
                    System.out.println("Missing number is ->"+miss);
                    break;
                }
            }

        }
        return 1;
    }

    public int[] sort(int[] unSortedArray) {

        for (int i = 0; i < unSortedArray.length; i++) {

            for (int j = i; j < unSortedArray.length; j++) {

                if (unSortedArray[i] > unSortedArray[j]) {
                    int temp = unSortedArray[i];
                    unSortedArray[i] = unSortedArray[j];
                    unSortedArray[j] = temp;
                }
            }
        }
        return unSortedArray;
    }
}
