package com.gap.sample.practice.datastructures.list.sort;

import java.util.Arrays;

public class QuickSort<T extends Comparable<T>> {


    private final T[] quickSort;

    public QuickSort(T[] quickSort) {
        this.quickSort = quickSort;

    }

    public static void main(String[] args) {
        Integer[] integer = {3, 2, 4, 1, 9, 10, 4};
        new QuickSort<>(integer).sort();
    }

    private void sort() {
        quickSort(0, quickSort.length - 1);

        System.out.println(Arrays.toString(quickSort));
    }


    private void quickSort(int low, int high) {

        if (low >= high) {
            return;
        }
        int pivot = partition(low, high);

        quickSort(low, pivot-1);
        quickSort(pivot + 1, high);
    }

    public int partition(int low, int high) {
        //calculate the Pivot index

        int pivotIndex = (low + high) / 2;
        swap(pivotIndex, high);
        int pivotalIndexCounter = low;
        for (int i = low; i < high; i++) {

            if (quickSort[i].compareTo(quickSort[high]) <= 0) {
                swap(pivotalIndexCounter, i);
                pivotalIndexCounter++;

            }
        }

        swap(pivotalIndexCounter, high);
        return pivotalIndexCounter;


    }

    private void swap(int firstIndex, int lastIndex) {

        if (firstIndex != lastIndex) {
            T temp = quickSort[firstIndex];
            quickSort[firstIndex] = quickSort[lastIndex];
            quickSort[lastIndex] = temp;

        }

    }
}
