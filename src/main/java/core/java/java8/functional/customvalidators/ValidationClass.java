package core.java.java8.functional.customvalidators;

import javax.validation.Valid;

public class ValidationClass {

    @CustomValidator
    private String someString;


    public static void main(String[] args) {

        ValidationClass validationClass = new ValidationClass();
        System.out.println(validationClass.someString);
        validationClass.check(validationClass);

    }

    public void check(@Valid ValidationClass validationClass) {
        System.out.println(validationClass.someString);
    }

}
