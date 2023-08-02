package com.gap.sample.practice.schedular;

import java.util.Arrays;

public class Sorting {


    public static void main(String[] args) {
        new Sorting().getSortedArray(new int[]{3, 1, 4, 2, 5});
    }

    public int[] getSortedArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }

            System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
        }

        return null;
    }
}
