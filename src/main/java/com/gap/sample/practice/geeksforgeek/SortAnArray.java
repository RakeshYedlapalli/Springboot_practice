package com.gap.sample.practice.geeksforgeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAnArray {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 5, 0, 3, 3, 2, 3, 5, 5, 6, 6, 1, 10, 100, 99393, 4993};

        ArrayList<Integer> ass = new ArrayList<>();
        ass.add(3);
        ass.add(1);
        ass.add(2);
        ass.add(4);
        ass.add(5);


        Collections.sort(ass);
        /*int[] sortedArray = new SortAnArray().sortArray(array,"asc");
        System.out.println(Arrays.toString(sortedArray));*/

        array = new SortAnArray().sort(array);
        System.out.println(Arrays.toString(array));

//
//String ss = "currentDate";
//        "currentDate".contains(flowDate)
        //new SortAnArray().sortArray(array,"des");
    }


    public int[] sortArray(int[] array, String sortType) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {


                if (sortType.equals("asc")) {
                    if (array[i] > array[j]) {
                        swapValues(array, i, j);
                    }
                } else {
                    if (array[i] < array[j]) {
                        swapValues(array, i, j);
                    }
                }
            }
        }
        return array;
    }

    private void swapValues(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public int[] sort(int[] array) {


        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        // System.out.println(Arrays.toString(array));
        return array;

    }


}
