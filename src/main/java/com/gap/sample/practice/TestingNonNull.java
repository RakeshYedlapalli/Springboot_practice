//package com.gap.sample.practice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.annotation.Validated;
//
//import javax.validation.ConstraintViolationException;
//import javax.validation.constraints.NotNull;
//
//@Component
//@Validated
//public class TestingNonNull {
//
//
//    public int validateNotNull(@NotNull String data) {
//
//        System.out.println("hello ");
//        return data.length();
//    }
//
//    public static void main(String[] args) {
//        int i = new TestingNonNull().validateNotNull(null);
//        System.out.println("Print"+ i);
//    }
//}
//
////@SpringBootTest
//class ValidatingComponentTest {
//    @Autowired
//    TestingNonNull component;
//
//
//    void givenNull_whenValidate_thenConstraintViolationException() {
//        (ConstraintViolationException.class, () -> component.validateNotNull(null));
//    }
//}
