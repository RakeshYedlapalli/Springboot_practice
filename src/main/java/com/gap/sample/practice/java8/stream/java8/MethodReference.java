package com.gap.sample.practice.java8.stream.java8;

import com.gap.sample.practice.Springboot_practice.entity.Employee;
import com.gap.sample.practice.Util;

import java.util.function.Consumer;

public class MethodReference {


    public static void main(String[] args) {


        Util.getAllEmployees().forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });

        System.out.println("Using Lambda");

        Util.getAllEmployees().forEach(MethodReference::productFoundation);


    }

    public static void productFoundation(Employee employee) {
        System.out.println("Product foundation called");
}





}
