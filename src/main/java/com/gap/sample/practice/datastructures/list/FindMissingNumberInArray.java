package com.gap.sample.practice.datastructures.list;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] findMissing = {3, 0, 1};
        int miss = new FindMissingNumberInArray().findMissingNumber(findMissing);
        System.out.println(miss);
    }

    public int findMissingNumber(int[] nums) {
        int n = nums.length + 1;

        int sum = n * (n - 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }

        return sum;

    }

    public int findMissingNumbers(int[] nums) {

        int sum = 0;
        for (int i : nums) {
            sum += i;
        }


        int n = nums.length + 1;
        return (n * (n - 1)) / 2 - sum;

    }
}

