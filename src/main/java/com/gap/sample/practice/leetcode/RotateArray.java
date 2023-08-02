package com.gap.sample.practice.leetcode;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int k = 3;

        new RotateArray().rotate(array,k);
    }

    public void rotateArray(int[] arr , int k){


        if(arr==null || arr.length==0){
            System.out.println("Array value shouldn't be empty or null");
            return;
        }

        int[] result = new int[arr.length];
        for(int i=k+1,j=0;i<arr.length;i++,j++){
            result[j] = arr[i];
        }

        for(int i=0,j=k;i<=k;i++,j++){
            result[j] = arr[i];
        }



        System.out.println(Arrays.toString(result));

    }

    public void rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;
        int[] result = new int[nums.length];
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy( result, 0, nums, 0, nums.length );
    }
}
