package com.gap.sample.practice.Springboot_practice.controller;

import com.gap.sample.practice.Springboot_practice.entity.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController
public class HateosLibraryPracticeController {



    public static void main(String[] args) {
        List<Integer>  data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);
        data.add(8);
        data.add(9);
        data.add(10);
        data.add(11);
        data.add(12);
        data.add(13);
        data.add(14);
        data.add(15);
        data.add(16);


        data.stream().parallel().forEach(System.out::println);
    }
}
