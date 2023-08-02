package com.gap.sample.practice.design.patterns.factory;

public class OperatingSystemFactory {

    public OS getOSInstance(String osType) {

        switch (osType) {
            case "android":
                return new Android();
            case "Mac":
                return new Mac();
            case "iphone":
                return new IPhone();
            default:
                return null;
        }
    }

}
