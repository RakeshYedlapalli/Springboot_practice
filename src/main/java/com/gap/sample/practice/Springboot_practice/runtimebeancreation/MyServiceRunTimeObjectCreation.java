package com.gap.sample.practice.Springboot_practice.runtimebeancreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceRunTimeObjectCreation {

    private final MyFactory myFactory;

    @Autowired
    public MyServiceRunTimeObjectCreation(MyFactory myFactory) {
        this.myFactory = myFactory;
    }

    public void doSomethingBasedOnRequirement(String useImplementation1) {
        MyInterface myImplementation = myFactory.getImplementation(useImplementation1);
        myImplementation.doSomething();
    }
}
