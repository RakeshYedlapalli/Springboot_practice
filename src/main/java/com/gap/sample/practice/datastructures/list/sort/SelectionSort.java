package com.gap.sample.practice.datastructures.list.sort;

import com.gap.sample.practice.Springboot_practice.entity.Employee;

import java.util.Arrays;

public class SelectionSort<T extends Comparable<T>> {

    private T[] selectionArray;

    public SelectionSort(T[] selectionArray) {
        this.selectionArray = selectionArray;
    }


    public SelectionSort() {

    }


    public static void main(String[] args) {

        Integer[] integer = {3, 2, 4, 1, 9, 10, 4};
        //Integer[] integer = {3,2,4,1,9,10,4,3,3,222,3,333,33,-29393,300333,3,333};
        new SelectionSort<>(integer).sort();


        //new SelectionSort<>().findMaxValue(integer);


    }


    public void findMaxValue(Integer[] arr) {


        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value is ->" + max);

    }

    public T[] sort() {

        for (int i = 0; i < selectionArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < selectionArray.length; j++) {

                if (selectionArray[j].compareTo(selectionArray[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {

                T temp = selectionArray[i];
                selectionArray[i] = selectionArray[minIndex];
                selectionArray[minIndex] = temp;

            }
        }
        System.out.println(Arrays.toString(selectionArray));
        return null;

    }


    public Employee getDat(T t) {

        return null;
    }


}
