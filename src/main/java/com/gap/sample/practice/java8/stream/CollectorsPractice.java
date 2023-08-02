package com.gap.sample.practice.java8.stream;

import com.gap.sample.practice.Springboot_practice.entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class CollectorsPractice {

    static int count = 0;

    public static void main(String[] args) {
        String s1 ="FB";
        String s2 = "Ea";

        String rak = "rakesh";
        String rake = "rakesh";

        System.out.println(s1.hashCode()+" " + s2.hashCode());
        System.out.println(rake.hashCode()+" " + rak.hashCode());



        List<Integer> list = Arrays.asList(1,3,3,3,4,5,9);

        List<Employee> list1 = Arrays.asList(new Employee(),new Employee(),new Employee(),new Employee(),new Employee());

//        System.out.println(list1);
        list1.stream().distinct()
                .collect(Collectors.toList()).forEach(System.out::println);



//        findDupicates();

//        List<String> list = new ArrayList<>();
//        list.add("abc");
//        list.add("abc");
//        list.add("abc");
//
//        StringJoiner stringJoiner = new StringJoiner(",","#","#");
//
//
//        list.forEach(stringJoiner::add);
//
//        System.out.println(stringJoiner);
//        System.out.println(list.stream().map(i -> {
//
//            if (count == 0) {
//                count++;
//                return "#" + i;
//
//            } else if (count == list.size() - 1) {
//                count++;
//                return i + "@";
//            } else {
//                count++;
//                return i;
//            }
//
//        }).collect(Collectors.toList()));


    }

public static void findDupicates () {
    List<Integer> listOfInegers = Arrays.asList(10,15,8,49,25,98,98,32,15,98);


    List<Integer> duplicateNumbers = new ArrayList<>();

    Set<Integer> set = new HashSet<>();
    listOfInegers.stream().forEach(i -> {

        if(!set.add(i)) {
            // set.add(i);
            System.out.println(i);

        }
//        } else {
//            duplicateNumbers.add(i);
//        }
    });
//    System.out.println(set);



//    listOfInegers.stream().map()
}



//    List of data with some integers, need to find the duplicates
}

//order service
//dealeer service
//consumer service
//payment service

//notification service


