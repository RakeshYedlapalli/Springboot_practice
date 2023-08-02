package com.gap.sample.practice.custome.annotations;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator3.class)
public @interface AgeConstraint3 {

    String message() default "Age must be between 18 and 120";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
