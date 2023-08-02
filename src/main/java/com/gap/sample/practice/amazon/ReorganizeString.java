package com.gap.sample.practice.amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {


    public static void main(String[] args) {
        String reoraanizedString = new ReorganizeString().reorganizeString("aabbcd");
        //int[] arr = {3, 2, 4};
        //int[] arr1 = new ReorganizeString().twoSum(arr, 6);
        //  System.out.println(reoraanizedString);
        System.out.println(reoraanizedString);
    }

    public String reorganizeString(String s) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }


        PriorityQueue<Character> maxHeaps = new PriorityQueue<>((a,b)-> counts.get(b)-counts.get(a));

        maxHeaps.addAll(counts.keySet());

        StringBuilder result = new StringBuilder();
        while (maxHeaps.size() > 1) {
            char current = maxHeaps.remove();
            char next = maxHeaps.remove();

            result.append(current);
            result.append(next);

            counts.put(current, counts.get(current) - 1);
            counts.put(next, counts.get(next) - 1);

            if (counts.get(current) > 0) {
                maxHeaps.add(current);
            }

            if (counts.get(next) > 0) {
                maxHeaps.add(next);
            }

            if (!maxHeaps.isEmpty()) {
                char last = maxHeaps.remove();
                if (counts.get(last) > 1) {
                    return "";
                }
                result.append(last);
            }


        }

        return result.toString();

    }

    public int[] twoSum(int[] nums, int target) {

        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }

        }
        return a;
    }
}
