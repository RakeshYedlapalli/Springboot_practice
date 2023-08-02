package com.gap.sample.practice.Springboot_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTheTime {

    public static void main(String[] args) {
        List<Integer> result = getValue(1, Arrays.asList("aa1", "bbb"), "aa1");
        System.out.println(result);
    }


    public static List<Integer> getValue(int k, List<String> data, String match) {

        int count = 0;
        List<Integer> list = new ArrayList<>();
        int j=1;
        for (int i = 0; i < data.size(); i++,j++) {
            //j = i;
            if (j <= k) {
                if (match.length() == data.get(i).length() && match.equals(data.get(i))) {
                    list.add(count++);
                } else {
                    count++;
                }
            } else {
                count += 5;
                j=1;
                i--;

            }

        }
        list.add(count);
        return list;
    }
}
