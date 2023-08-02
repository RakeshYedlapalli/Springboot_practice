package com.gap.sample.practice.JSON.gai_payload.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HellWorld {


    public static List<int[]> findCombinations(int[] array, int target) {
        List<int[]> combinations = new ArrayList<>();
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (complementMap.containsKey(complement)) {
                int[] combination = {array[i], complement};
                combinations.add(combination);
            }
            complementMap.put(array[i], i);
        }

        return combinations;
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 4, 10, 8};
        int target = 12;
        List<int[]> result = findCombinations(array, target);

        for (int[] combination : result) {
            System.out.print("{");
            System.out.print(combination[0] + ", " + combination[1]);
            System.out.println("}");
        }
    }


//    public static void main(String[] args) {
//
//
//
//
////        Given array of integer having unique and non-repeating values.
////                Find combination of two values in array that sum upto the target value.
////          [2,6,4,10,8]
////        target = 12
////        Result : {4,8}, {2,10}
//
//
//    }
}
