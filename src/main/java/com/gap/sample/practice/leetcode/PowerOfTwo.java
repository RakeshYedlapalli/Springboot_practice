package com.gap.sample.practice.leetcode;

public class PowerOfTwo {

    public static void main(String[] args) {
       boolean isPower = new PowerOfTwo().isPowerOfTwo(2);
       long powerOfso = new PowerOfTwo().powerOfSomething(10);
        System.out.println(isPower);
        System.out.println("Power of something ->"+ powerOfso);
    }


    public boolean isPowerOfTwo(int n){
        int i=1;
        while(i<n){
            i*=2;
        }
        return i == n;
    }

    public long powerOfSomething(int value){
        int i=1;
        while (value>0){
            i*=2;
            value--;
        }

        return i;

    }
}
