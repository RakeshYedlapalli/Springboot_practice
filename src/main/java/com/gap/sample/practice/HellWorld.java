package com.gap.sample.practice;

import core.java.practice.map.Hello;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HellWorld {

    public static void main(String[] args) {

        hashMapTest();
//        findEvenOrOdd();

//        List<String> array = new ArrayList<>();
//
//        String inputValue = "";
//
//        if(array.isEmpty() && array.size()>1) {
//
//            inputValue = array.get(0) + "," + array.get(1);
//        } else if (array.isEmpty()) {
//            inputValue = array.get(0);
//        } else {
//            inputValue = "";
//        }

        String s1 = "A";
        String s2 = "A";
        String s3 = new String("A");
        String s4 = new String(s3);
        String s5 = s4;


        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);


//        if(s1==s2) answer ⇒ True
//        if(s2==s3) answer ⇒ False
//        if(s3==s4) answer ⇒ False
//        if(s4==s5) answer => True


//
//
//
//        Integer[] uniqueArray = new Integer[5];
//        int maxLength = 0;
//        for (Integer element : array) {
//            boolean isDuplicate = false;
//            for (int i = 0; i < maxLength; i++) {
//                if (element.equals(uniqueArray[i])) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                uniqueArray[maxLength] = element;
//                maxLength++;
//            }
//
//
//        }
//
//        ArrayList<Integer> uniqueArrayList = new ArrayList<>();
//        for (int i = 0; i < maxLength; i++) {
//            uniqueArrayList.add(uniqueArray[i]);
//        }
//        for (Integer element : uniqueArrayList) {
//            System.out.println(element);
//        }
    }


    public static void findEvenOrOdd() {

        int number = 19; // Change this number to test different values

        int quotient = number / 2;
        int product = quotient * 2;

        if (product == number) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        if ((number & 1) == 0) {
            System.out.println("This is even");
        }
    }


    public static void hashMapTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");
        map.put("Russia", "Moscow");

        Iterator<String> countryKeySetIterator = map.keySet().iterator();
        while (countryKeySetIterator.hasNext()) {
            String countryKey = countryKeySetIterator.next();
            if (countryKey.equals("India")) {
                map.put(countryKey, "New Delhi");
//                map.remove(countryKey);
            }
        }
        System.out.println("-----------------------------");
        System.out.println(map.size());
        System.out.println(map.get("India"));
    }




}
class HelloWorld {

    private int salary;

    public HelloWorld(int salary ) {
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        List<HelloWorld> list = new ArrayList<>();

        list = Arrays.asList(new HelloWorld(10), new HelloWorld(10), new HelloWorld(10));

       int sum =  list.stream().mapToInt(HelloWorld::getSalary).sum();

        System.out.println(sum);

    }
}