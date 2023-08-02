package com.gap.sample.practice.leetcode;

import java.util.Arrays;

public class PrintArrayElementsStartEnd {


    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 6, 5, 10};
        new PrintArrayElementsStartEnd().printArrayElements(arr);
    }

    public int[] printArrayElements(int[] arr) {

        int[] copy = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i += 2, j++) {

            copy[i] = arr[j];

            if (i < arr.length - 1) {
                copy[i + 1] = arr[arr.length - j - 1];
            }
        }

        System.out.println(Arrays.toString(copy));
        return copy;
    }
}
