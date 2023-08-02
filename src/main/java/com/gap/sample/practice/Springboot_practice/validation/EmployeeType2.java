package com.gap.sample.practice.Springboot_practice.validation;

import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy ={EmployeeTypeValidator2.class})
public @interface EmployeeType2 {


    String message() default "Employeee type must be fulltime";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
