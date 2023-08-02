package com.gap.sample.practice.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {


        LinkedHashMap<String,String> ss =
                new LinkedHashMap<>();

        ss.put("rakesh","rakesh");
        ss.put("rakesh1","rakesh");
        ss.put("rakesh2","rakesh");
        ss.put("rakesh3","rakesh");
        ss.put("rakesh4","rakesh");
        ss.put("rakesh5","rakesh");
        ss.put("rakesh6","rakesh");
        ss.put("rakesh7","rakesh");
        ss.put("rakesh8","rakesh");
        ss.put("rakesh9","rakesh");


        System.out.println(ss);


        HashMap<String,String> ss1 =
                new HashMap<>();

        ss1.put("rakesh","rakesh");
        ss1.put("rakesh1","rakesh");
        ss1.put("rakesh2","rakesh");
        ss1.put("rakesh3","rakesh");
        ss1.put("rakesh4","rakesh");
        ss1.put("rakesh5","rakesh");
        ss1.put("rakesh6","rakesh");
        ss1.put("rakesh7","rakesh");
        ss1.put("rakesh8","rakesh");
        ss1.put("rakesh9","rakesh");

        System.out.println(ss1);
    }
}
