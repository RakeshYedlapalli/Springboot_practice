package com.gap.sample.practice.Springboot_practice.runtimebeancreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class MyFactory {

    private final ApplicationContext applicationContext;

    @Autowired
    public MyFactory(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    public MyInterface getImplementation(String implementationType) {

        return (MyInterface) applicationContext.getBean(implementationType);
    }
}
