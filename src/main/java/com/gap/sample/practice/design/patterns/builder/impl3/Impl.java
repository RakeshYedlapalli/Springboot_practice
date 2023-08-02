package com.gap.sample.practice.design.patterns.builder.impl3;

public class Impl {

    public static void main(String[] args) {

        LombokBuilder lombokBuilder = LombokBuilder.builder().firstName("Hello").build();
        System.out.println(lombokBuilder);
    }



}
