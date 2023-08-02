package com.gap.sample.practice.Springboot_practice.validation;

import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;
import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy ={})
//@EmployeeType1
//@EmployeeType2
@Pattern(regexp = ".*\\d.*", message = "must contain at least one numeric character")
@Length(min = 6, max = 32, message = "must have between 6 and 32 characters")
@ConstraintComposition(CompositionType.OR)
@ReportAsSingleViolation
public @interface TypeChecking {


    String message() default "Employeee type must be Permanent or Contractual";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
