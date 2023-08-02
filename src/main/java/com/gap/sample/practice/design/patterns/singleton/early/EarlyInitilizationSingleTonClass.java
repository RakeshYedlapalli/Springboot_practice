package com.gap.sample.practice.design.patterns.singleton.early;

public class EarlyInitilizationSingleTonClass {

    private static final EarlyInitilizationSingleTonClass earlyInitilizationSingleTonClass  =
            new EarlyInitilizationSingleTonClass();

    private EarlyInitilizationSingleTonClass() {

    }

    public static EarlyInitilizationSingleTonClass getEarlyInitilizationSingleTonClass() {
        return earlyInitilizationSingleTonClass;
    }





}
