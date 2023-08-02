package com.gap.sample.practice.Springboot_practice;

public class ExceptionHandling {


    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {

            try {
                if (i == 5) {
                    throw new NullPointerException("Exception occured");
                }
                System.out.println(i);
            } catch (NullPointerException nullPointerException) {
                //System.out.println(i);
                nullPointerException.printStackTrace();
            }
        }


    }
}
