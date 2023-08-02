package com.gap.sample.practice.java8.stream;

public interface DefaultMethodsInInterface {


//    static void staticMethodInterface();

    default void defaultMethod() {
        System.out.println("This is Default interface 1");
    }


    static void staticMethodInterface() {
        System.out.println("Static method in interface");
    }

}
