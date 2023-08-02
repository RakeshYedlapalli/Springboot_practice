package com.gap.sample.practice.design.patterns.builder.impl3;


import lombok.Builder;

@Builder
public class LombokBuilder {


    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "LombokBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
