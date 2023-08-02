package com.gap.sample.practice.datastructures.list;

public class FactorialOfNumber {

    double fact = 20;

    public static void main(String[] args) {
        double factorial = new FactorialOfNumber().findFactorialOfNumber(20);
        System.out.println("Factorial of a number is ->"+ factorial);
        double i,fact=1;
        int number=20;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    public double findFactorialOfNumber(int n){


        if(n>1){
            fact = fact * (n-1);
            n--;
            findFactorialOfNumber(n);
        }

        return fact;

    }
}
