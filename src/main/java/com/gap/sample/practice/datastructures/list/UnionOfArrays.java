package com.gap.sample.practice.datastructures.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnionOfArrays {

    public static void main(String[] args) {
new UnionOfArrays().unionOfArrays();
    }

    public void unionOfArrays(){

        int[] arr1 = {5,3};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3};

        int totalLength = (arr1.length)+(arr2.length)+(arr3.length);

        int[] removeDuplicate = new int[totalLength];
        int index =0;
        for(int i=0;i<arr1.length;i++){
            removeDuplicate[index] = arr1[i];
            index++;
        }


        for(int i=0;i<arr2.length;i++){
            removeDuplicate[index] = arr2[i];
            index++;
        }

        for(int i=0;i<arr3.length;i++){
            removeDuplicate[index] = arr3[i];
            index++;
        }

        int[] finalArray = removeDuplicatesArrayUsingSet(removeDuplicate);
      //  anotherarray[j] = removeDuplicate[removeDuplicate.length - 1];
        System.out.println(Arrays.toString(finalArray));
    }


    public int[] removeDuplicatesArrayUsingSet(int[] arr) {

        System.out.println("Duplicate array ->"+ Arrays.toString(arr));
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.get(arr[i])!=null?map.get(arr[i])+1:1);
        }

        int[] uniqueArray = new int[map.size()];
        int index = 0;
        for(Map.Entry<Integer,Integer> mapV : map.entrySet()){
            uniqueArray[index] = mapV.getKey();
            index++;

        }
       return uniqueArray;

    }
}
