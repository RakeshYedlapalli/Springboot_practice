package com.gap.sample.practice.Springboot_practice.controller;

import com.gap.sample.practice.Springboot_practice.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class AnimalService {

    @Autowired
    @Qualifier("cat")
    private Animal cat;

    @GetMapping("/getAnimalCharacteristics")
    public String getAnimalCharacter(){

        System.out.println("");
        return cat.fetchCharacterstics();

    }
}
