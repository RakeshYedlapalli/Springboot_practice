package com.gap.sample.practice.leetcode;

public class FindMissingNumber {


    public static void main(String[] args) {


        //new FindMissingNumberInArray()
        int[] arr = {0,1};
        //new FindMissingNumber().sortTheArray(arr);

        int missingNumbe = new FindMissingNumber().findMissingNumber(arr);
        System.out.println(missingNumbe);


    }

    public int findMissingNumber(int[] nums) {
        nums = sortTheArray(nums);
        int isMissingNumber = -1;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i + 1] - nums[i] != 1) {
                isMissingNumber = nums[i] + 1;
                break;
            }
        }
        return isMissingNumber;
    }

    public int[] sortTheArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
