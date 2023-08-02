package com.gap.sample.practice.Springboot_practice.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class EmployeeTypeValidator3 implements ConstraintValidator<TypeChecking,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        List<String> list = Arrays.asList("Full time");

        return list.contains(s);
    }
}
