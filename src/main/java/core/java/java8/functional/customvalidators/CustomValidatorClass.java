package core.java.java8.functional.customvalidators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

public class CustomValidatorClass implements ConstraintValidator
        <CustomValidator, String> {
    @Override
    public void initialize(CustomValidator constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("hello world");
        //return false;




        String dateString = "2022-01-01";
        String pattern = "yyyy-MM-dd";

        LocalDate date = LocalDate.parse(dateString, DateTimeFormat.forPattern(pattern));

        System.out.println(date);
        return false;
    }
}
