package com.gap.sample.practice.Springboot_practice.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class Cat implements Animal{
    @Override
    public String fetchCharacterstics() {
        return "Meow Hello world";
    }

//    @Scheduled(cron = "*/1 * * * * *")
//    public void jobPerfrom()  {
//        System.out.println("HEllo fdasfjdasdfjas");
//    }
}
