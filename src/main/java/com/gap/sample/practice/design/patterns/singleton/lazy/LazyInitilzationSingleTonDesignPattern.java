package com.gap.sample.practice.design.patterns.singleton.lazy;

import java.util.Calendar;

public class LazyInitilzationSingleTonDesignPattern {


    private static LazyInitilzationSingleTonDesignPattern lazyInitilzationSingleTonDesignPattern = null;

    private LazyInitilzationSingleTonDesignPattern() {


    }

    public LazyInitilzationSingleTonDesignPattern getLazy() {

        Calendar calendar = Calendar.getInstance();

        if (lazyInitilzationSingleTonDesignPattern == null) {

            synchronized (LazyInitilzationSingleTonDesignPattern.class) {

                if (lazyInitilzationSingleTonDesignPattern == null) {
                    lazyInitilzationSingleTonDesignPattern = new LazyInitilzationSingleTonDesignPattern();
                }
            }
        }

        return lazyInitilzationSingleTonDesignPattern;

    }

}
