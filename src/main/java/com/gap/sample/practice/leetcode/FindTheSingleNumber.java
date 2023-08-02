package com.gap.sample.practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindTheSingleNumber {


    public static void main(String[] args) {

        int[] arr = {1,1, 2,2, 3,3, 4, 4,5,5};
        //int value = new FindTheSingleNumber().findTheSingleNumber(arr);
        int value = new FindTheSingleNumber().findTheSingleNumberUsingSet(arr);
        System.out.println(value);
    }

    public int findTheSingleNumber(int[] arr) {
        //int[] sortedArray = sort(arr);
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            map.put(arr[i],map.get(arr[i])!=null?map.get(arr[i])+1:1);
        }

        System.out.println(map);

        for(Map.Entry<Integer, Integer> inte : map.entrySet()){

            if(inte.getValue()==1){
                return inte.getKey();
            }
        }

        return -1;
    }

    public int findTheSingleNumberUsingSet(int[] arr) {
        //int[] sortedArray = sort(arr);
        Set<Integer> map = new HashSet<>();
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            //map.put(arr[i],map.get(arr[i])!=null?map.get(arr[i])+1:1);
            if(map.contains(arr[i])){
                map.remove(arr[i]);
            }else{
                map.add(arr[i]);
            }
        }

        //System.out.println(map);

      return !map.isEmpty()?map.stream().findFirst().get():-1;
    }


    public int[] sort(int[] arr) {

        int numberOfIterations = 0;
        for (int i = 0; i < arr.length; i++) {

            ++numberOfIterations;
            for (int j = 0; j < arr.length - i - 1; j++) {
                ++numberOfIterations;
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }


            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println("number of iterations ->" + numberOfIterations);

        return arr;

    }
}
