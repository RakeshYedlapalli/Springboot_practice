package com.gap.sample.practice.datastructures.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromArray {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 6, 7};
        new RemoveDuplicatesFromArray().removeDuplicatesFromArray(arr);
        new RemoveDuplicatesFromArray().removeDuplicatesArrayUsingSet(arr);
    }

    public void removeDuplicatesFromArray(int[] arrr) {


        int[] anotherarray = new int[arrr.length];
        int j = 0;
        for (int i = 0; i < arrr.length - 1; i++) {

            if (arrr[i] != arrr[i + 1]) {
                anotherarray[j] = arrr[i];
                j++;
            }
        }
        anotherarray[j] = arrr[arrr.length - 1];
        System.out.println(Arrays.toString(anotherarray));

    }

    public void removeDuplicatesArrayUsingSet(int[] arr) {

        System.out.println("Duplicate array ->"+ Arrays.toString(arr));
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.get(arr[i])!=null?map.get(arr[i])+1:1);
        }


        System.out.println(map);

    }
}
