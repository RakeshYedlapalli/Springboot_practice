package datastructures.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckIfTwoArraysAreEqual {


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 8,  5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1 , 8};
        //int result = checkIfTwoArraysAreequal(arr1, arr2);
//        System.out.println("are equal? " + (result == 1 ? "Yes" : "No"));
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);
        values.stream().limit(values.size()-2).forEach(System.out::println);
    }

    private static int checkIfTwoArraysAreequal(int[] arr1, int[] arr2) {

        int[] mergedArray = new int[arr1.length + arr2.length];

        if (arr1.length != arr2.length) {
            return 0;
        } else {

            Set<Integer> listOfIntegers = new HashSet<>();

            System.arraycopy(arr1,0,mergedArray,0,arr1.length);
            System.arraycopy(arr2,0,mergedArray,arr1.length,arr2.length);

            System.out.println(Arrays.toString(mergedArray));

            Set<Integer> set = new HashSet<>();

            for(int i : mergedArray){
                set.add(i);
            }

            return set.size() == arr1.length ? 1 : 0;

        }
    }
}
