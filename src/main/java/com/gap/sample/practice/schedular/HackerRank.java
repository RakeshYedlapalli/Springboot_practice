package com.gap.sample.practice.schedular;

public class HackerRank {

    public static void main(String[] args) {



       m1("true");
        m1("false");
        m1(null);
        m1("null");

    }


    public static void m1(String status){


        //String status = null;
        System.out.println(Boolean.parseBoolean(status));

    }
}
