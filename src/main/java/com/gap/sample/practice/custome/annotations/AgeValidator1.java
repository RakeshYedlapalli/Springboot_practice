package com.gap.sample.practice.custome.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator1 implements ConstraintValidator<AgeConstraint, Integer> {

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value >= 18 && value <= 120;
    }
}
