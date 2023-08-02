package com.gap.sample.practice.Springboot_practice.dependency.injection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Override
    public void addUsr(String userName) {
        System.out.println("user added");
    }

}
