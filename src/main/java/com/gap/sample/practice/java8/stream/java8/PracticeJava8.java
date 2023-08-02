package com.gap.sample.practice.java8.stream.java8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PracticeJava8 {

    public static void main(String[] args) {

        BiConsumer<Integer, String> biConsumer = (a, b) -> System.out.println(a + b);

        biConsumer.accept(2, " Rakesh");

        Consumer<Integer> consumer = System.out::println;
        consumer.accept(33);


        SingleAbstractInterface s  = TestingSAP::singleAbstract;
//        SingleAbstractInterface s1  = () -> System.out.println("Hel");/
        s.singleAbstractMethod("Hello world");
//        s1.singleAbstractMethod();


    }
}

class TestingSAP {

//    public static void singleAbstract() {
//
//        System.out.println("Single abstract method");
//    }

    public static void singleAbstract(String  abc) {

        System.out.println("Single abstract method");
    }

}
