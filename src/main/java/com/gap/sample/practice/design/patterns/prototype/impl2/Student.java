package com.gap.sample.practice.design.patterns.prototype.impl2;

public class Student {


    private static Student parent;

    private Student() {

    }

    public Student getParent() {

        if (parent == null) {
            synchronized (this) {
                if (parent == null) {
                    return new Student();
                }
            }
        }
        return parent;
    }


}
