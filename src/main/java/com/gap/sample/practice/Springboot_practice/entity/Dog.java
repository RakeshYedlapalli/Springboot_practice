package com.gap.sample.practice.Springboot_practice.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class Dog implements Animal {
    @Override
    public String fetchCharacterstics() {
        return "Barking";
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Rakesh");
        list.add("Ramesh");
        list.add("Suresh");


        System.out.println(list.contains("Suresh"));

    }
}
