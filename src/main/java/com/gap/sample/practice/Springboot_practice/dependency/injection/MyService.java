package com.gap.sample.practice.Springboot_practice.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private UserService userService;

    private UserService fileUserService;

    private UserService constructorUserService;

    @Autowired
    private void setUserService(UserService userService) {
        this.fileUserService = userService;
    }

    @Autowired
    public MyService(UserService userService) {
        this.constructorUserService = userService;
    }

    public void seeAllInjections() {

        System.out.println(userService);
        System.out.println(fileUserService);
        System.out.println(constructorUserService);
    }
}
