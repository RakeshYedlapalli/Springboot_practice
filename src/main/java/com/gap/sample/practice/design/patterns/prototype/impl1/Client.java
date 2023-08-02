package com.gap.sample.practice.design.patterns.prototype.impl1;


public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10, 0, 0), 20);
        s1.attack();

        System.out.println(s1 + " address" + s1.hashCode());
        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println(s2 + " address" + s1.hashCode());


        s2.move(new Point3D(-10, 0, 0), 20);
        s2.attack();

        System.out.println(s1 + " address" + s1.hashCode());
        System.out.println(s2 + " address" + s1.hashCode());

    }

}
