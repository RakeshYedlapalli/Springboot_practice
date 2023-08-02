package com.gap.sample.practice.datastructures.list.sort;

import java.util.Arrays;

public class InsertionSort<T extends Comparable<T>> {


    private final T[] insertionSort;

    public InsertionSort(T[] insertionSort) {
        this.insertionSort = insertionSort;
    }


    public static void main(String[] args) {

        Integer[] integer = {3, 2, 4, 1, 9, 10, 4};
        new InsertionSort<>(integer).sort();



    }

    public void sort() {

        for (int i = 1; i < insertionSort.length; i++) {

            for (int j = i; j > 0 && insertionSort[j].compareTo(insertionSort[j - 1]) < 0; j--) {
                //if (insertionSort[j].compareTo(insertionSort[j - 1]) < 0) {
                    T temp = insertionSort[j];
                    insertionSort[j] = insertionSort[j - 1];
                    insertionSort[j - 1] = temp;
                //} else x`
            }
        }
        System.out.println(Arrays.toString(insertionSort));
    }

}
