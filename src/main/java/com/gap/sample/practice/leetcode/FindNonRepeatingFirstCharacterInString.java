package com.gap.sample.practice.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatingFirstCharacterInString {


    public static void main(String[] args) {

        //int index = new FindNonRepeatingFirstCharacterInString().findNonRepeatingCharacterIndex("leedlccoode");
//        int index = new FindNonRepeatingFirstCharacterInString().findUsingLinkedHashMap("leedlccoode");
        int index = new FindNonRepeatingFirstCharacterInString().findFirstNonRepeatingCharacter("lledcozrmyk");
        System.out.println(index);
    }

    public int findNonRepeatingCharacterIndex(String ch) {

        for (Character ss : ch.toCharArray()) {

            if (ch.indexOf(ss) == ch.lastIndexOf(ss)) {
                return ch.indexOf(ss);
            }

        }
        return -1;
    }

    public int findUsingLinkedHashMap(String ch) {


        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap();

        for (char chars : ch.toCharArray()) {
            linkedHashMap.put(chars, linkedHashMap.get(chars) != null ? linkedHashMap.get(chars) + 1 : -1);
        }


        System.out.println(linkedHashMap);

        for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() == 1)
                return ch.indexOf(entry.getKey());
        }

        System.out.println("Integer max value ->" + Integer.MAX_VALUE);
        System.out.println("Integer min value ->" + Integer.MIN_VALUE);
        return -1;

    }




    public int findFirstNonRepeatingCharacter(String value) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < value.length(); i++) {

            char current = value.charAt(i);
            if (!map.containsKey(current)) {
                map.put(current, i);
            } else {
                map.put(current, -1);
            }
        }

        int min = Integer.MAX_VALUE;
        for (char c : map.keySet()) {

            if (map.get(c) > -1 && map.get(c) < min) {

                min = map.get(c);
            }
        }

        System.out.println(map);
        return min == Integer.MAX_VALUE ? -1 : min;
    }


}
