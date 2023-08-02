package com.gap.sample.practice.design.patterns.factory;

public class FactoryImpl {

    public static void main(String[] args) {
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS os = operatingSystemFactory.getOSInstance("sd");
        os.spec();
    }
}
