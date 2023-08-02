package com.gap.sample.practice.leetcode;

import core.java.copyobject.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CheckingOptional {

    public static void main(String[] args) {
        Map<String,String> sizeLocalizationDescription = new HashMap<>();
        Student student = null;
        Optional.of(student).ifPresent(sizeRange ->
                sizeLocalizationDescription.put("SIZE_RANGE_DESCRIPTION", student.getName()));


        System.out.println(sizeLocalizationDescription.get("SIZE_RANGE_DESCRIPTION"));
    }
}
