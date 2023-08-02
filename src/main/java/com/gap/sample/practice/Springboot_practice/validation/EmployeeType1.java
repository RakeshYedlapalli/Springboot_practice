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
@Constraint(validatedBy ={EmployeeTypeValidator.class})
public @interface EmployeeType1 {


    String message() default "Employee type must be Permanent or Contractual";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
