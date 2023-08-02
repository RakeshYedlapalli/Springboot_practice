package com.gap.sample.practice.Springboot_practice.runtimebeancreation;

import org.springframework.stereotype.Component;

@Component
public class MyImplementation1 implements MyInterface {
    @Override
    public void doSomething() {
        System.out.println("This is implementation one");

    }
}
