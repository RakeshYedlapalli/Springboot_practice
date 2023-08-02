package com.gap.sample.practice.design.patterns.singleton.early;

public class EarlyInitilisationAccess {

    public static void main(String[] args) {
        EarlyInitilizationSingleTonClass earlyInitilizationSingleTonClass =
                EarlyInitilizationSingleTonClass.getEarlyInitilizationSingleTonClass();
        EarlyInitilizationSingleTonClass earlyInitilizationSingleTonClass1 =
                EarlyInitilizationSingleTonClass.getEarlyInitilizationSingleTonClass();
        EarlyInitilizationSingleTonClass earlyInitilizationSingleTonClass2 =
                EarlyInitilizationSingleTonClass.getEarlyInitilizationSingleTonClass();
        EarlyInitilizationSingleTonClass earlyInitilizationSingleTonClass3 =
                EarlyInitilizationSingleTonClass.getEarlyInitilizationSingleTonClass();

        System.out.println(earlyInitilizationSingleTonClass.hashCode());
        System.out.println(earlyInitilizationSingleTonClass1.hashCode());
        System.out.println(earlyInitilizationSingleTonClass2.hashCode());
        System.out.println(earlyInitilizationSingleTonClass3.hashCode());
    }
}
