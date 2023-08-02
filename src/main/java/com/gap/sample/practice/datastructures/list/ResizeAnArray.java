package com.gap.sample.practice.datastructures.list;

import java.util.Arrays;

public class ResizeAnArray {


    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 6, 5, 4, 3,5,6,5,5,5,5};
        //  new ResizeAnArray().resizeAnArray(arr,30);
        String ss = new ResizeAnArray().show(arr);
        System.out.println(ss);
    }


    public String show(int[] arr) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int count = 1;
            for (int j = i; j < arr.length; j++) {

                if (temp != -1 && temp == arr[j] && i != j && arr[j] != -1) {
                    arr[j] = -1;
                    count++;
                }
            }
            if(temp!=-1) {
                sb.append("for " + temp + " ->" + count + "\n");
            }
        }

        return sb.toString();
    }

    public void resizeAnArray(int[] existingArray, int sizeToResized) {

        int[] finalArray = new int[existingArray.length + sizeToResized];

        //for(int i=0;i<existingArray.length;i++){
        int[] ss = Arrays.copyOf(existingArray, 100);
        //finalArray[i] = existingArray[i];
        //}

        System.out.println(Arrays.toString(ss));

    }
}
