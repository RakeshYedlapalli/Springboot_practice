package com.gap.sample.practice.datastructures.list;

import java.util.Arrays;

public class MoveNegativeNumbersOneSide {


    public static void main(String[] args) {

        int[] data = {3, 3, 2, -2, -3, -4, -5, 0, 4, -2,0,0,30,30,-4444};
        new MoveNegativeNumbersOneSide().move(data);
    }

    public void move(int[] arr) {

        int[] negative = new int[arr.length];
        int[] positive = new int[arr.length];
        int positiveIndex = 0;
        int negativeeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative[negativeeIndex] = arr[i];
                negativeeIndex++;

            } else {
                positive[positiveIndex] = arr[i];
                positiveIndex++;
            }
        }
        System.out.println(Arrays.toString(negative));
        System.out.println(Arrays.toString(positive));
        System.out.println(negativeeIndex+positiveIndex);

        int[] finalArray = new int[negativeeIndex+positiveIndex];
        int indexFinal = 0;
        for(int i=0;i<positiveIndex;i++){
            finalArray[indexFinal] = positive[i];
            indexFinal++;
        }

        for(int i=0;i<negativeeIndex;i++){
            finalArray[indexFinal] = negative[i];
            indexFinal++;
        }
        System.out.println(Arrays.toString(finalArray));


    }
}
