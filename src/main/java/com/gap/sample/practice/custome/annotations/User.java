package com.gap.sample.practice.custome.annotations;

import lombok.Getter;
import lombok.Setter;

import javax.validation.groups.Default;

@Getter
@Setter
public class User {

    @AgeConstraint
    @AgeConstraint1
//    @AgeConstraint2(groups = Hello.class)
    //@AgeConstraint3(groups = Hello.class)
    private Integer age;

    // getter and setter methods
}