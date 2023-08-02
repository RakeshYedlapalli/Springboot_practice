package com.gap.sample.practice.java8.stream;

import com.gap.sample.practice.java8.stream.bean.StreamEmployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsInJava {


    public static void main(String[] args) {

        findTheAverageAgeOfMaleEmployees();

        findTheMostCommonWordInListString();

    }

    public static void findTheAverageAgeOfMaleEmployees() {
        List<StreamEmployee> list = new ArrayList<>();
        StreamEmployee streamEmployee = new StreamEmployee("Rakehs", "Yedlapalli", "Male", 20);
        StreamEmployee streamEmployee1 = new StreamEmployee("Rakehs", "Yedlapalli", "Male", 20);
        StreamEmployee streamEmployee2 = new StreamEmployee("Rakehs", "Yedlapalli", "Female", 20);
        StreamEmployee streamEmployee3 = new StreamEmployee("Rakehs", "Yedlapalli", "Female", 20);

        list = Arrays.asList(streamEmployee, streamEmployee1, streamEmployee2, streamEmployee3);

        double averageAge = list.stream().filter(i -> i.getGender().equals("Male"))
                .mapToInt(StreamEmployee::getAge)
                .average()
                .orElse(0);

        System.out.println(averageAge);
    }

    public static void findTheMostCommonWordInListString() {
        List<String> list;

        list = Arrays.asList("rajesh", "rakesh", "rajesh","rakesh","suresh","suresh","suresh");

        Map<String, Long> wordCounts =
                list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<String, Long>> mostCommonWord =
                wordCounts.entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue());


        String result = mostCommonWord.map(Map.Entry::getKey).orElse("No words found");

        System.out.println(result);

    }
}
