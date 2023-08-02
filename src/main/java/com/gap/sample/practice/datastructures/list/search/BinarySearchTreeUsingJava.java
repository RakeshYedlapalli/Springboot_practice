package com.gap.sample.practice.datastructures.list.search;

import java.util.Arrays;

public class BinarySearchTreeUsingJava {

    public static void main(String[] args) {

        String[] arr = {"Rakesh", "Suresh", "Mahesh", "Ramu", "Su", "d", "fa"};
        Object[] oo = Arrays.stream(arr).sorted().toArray();
        Arrays.sort(arr);
        int isFound = Arrays.binarySearch(arr, "fa");
        //int isFound = binarySearch0(arr,0,arr.length,"Suresh");
        System.out.println(isFound);
    }


    private static int binarySearch0(Object[] a, int fromIndex, int toIndex,
                                     Object key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;

            Comparable midVal = (Comparable) a[mid];

            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }


    private static int binarySeasrch0(Object[] a, int fromIndex, int toIndex,
                                      Object key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;

            Comparable midVal = (Comparable) a[mid];

            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }
}
