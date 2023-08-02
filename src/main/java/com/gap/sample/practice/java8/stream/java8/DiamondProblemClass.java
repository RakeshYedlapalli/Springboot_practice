package com.gap.sample.practice.java8.stream.java8;

import com.gap.sample.practice.java8.stream.DefaultMethodsInInterface;
import com.gap.sample.practice.java8.stream.DefaultMethodsInInterface2;

public class DiamondProblemClass implements DefaultMethodsInInterface, DefaultMethodsInInterface2  {
    @Override
    public void defaultMethod() {
        DefaultMethodsInInterface.super.defaultMethod();
    }
//    @Override
//    public void defaultMethod() {
//        DefaultMethodsInInterface.super.defaultMethod();
//    }

    //@Override

    public static void main(String[] args) {

        DiamondProblemClass diamondProblemClass = new DiamondProblemClass();
        diamondProblemClass.defaultMethod();

//        DefaultMethodsInInterface.staticMethodInterface();;
    }

}
