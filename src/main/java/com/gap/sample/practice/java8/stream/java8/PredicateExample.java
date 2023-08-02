package com.gap.sample.practice.java8.stream.java8;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.startsWith("R");
        Predicate<String> predicateEndsWith = s -> s.endsWith("H");


        Supplier<String > supplier = () -> "";
        supplier.get();





        boolean isTrue = predicate.negate().and(predicateEndsWith).test("RakesH");
        System.out.println("Is Starts with R and ends with H? =>" + isTrue);







    }
}
