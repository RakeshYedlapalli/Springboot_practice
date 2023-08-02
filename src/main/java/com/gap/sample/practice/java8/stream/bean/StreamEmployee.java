package com.gap.sample.practice.java8.stream.bean;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StreamEmployee {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
}
