package com.gap.sample.practice.design.patterns.factory;

public class IPhone implements OS{

    @Override
    public void spec() {
        System.out.println("IPhone OS");
    }
}
