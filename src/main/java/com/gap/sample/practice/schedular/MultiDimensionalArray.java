package com.gap.sample.practice.schedular;

import java.util.HashSet;
import java.util.Set;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        new MultiDimensionalArray().twoDimensionalArray();
        new MultiDimensionalArray().findmissingLetter();


        int[] v = new int[]{5, 7, 1, 2, 8, 4, 3, 0};
        int[] test = new int[]{3};

        for (int i = 0; i < test.length; i++) {
            boolean output = findSumOfTwo(v, test[i]);
            System.out.println("Output is ->"+ output);
        }
    }



    static boolean findSumOfTwo(int[] A, int val) {
        Set<Integer> foundValues = new HashSet<>();
        for (int a : A) {
            int fina = val-a;
            if (foundValues.contains(val - a)) {
                return true;
            }
            foundValues.add(a);
        }
        return false;
    }

    public void findmissingLetter(){
        int [] arr = {1,3,4,2,5,6,7,8,9,10,11,12,13,14,15,16,18};
        int sum =0;
        int leght = 17;
        int expectedValue = leght*(leght+1)/2;


        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        if(expectedValue!=sum){
            System.out.println("Missing number is ->"+(expectedValue-sum));
            return;
        }

        System.out.println("There are no missing numbers in given array");
        //System.out.println("Sum is -> "+ sum);

    }

    public void twoDimensionalArray(){

       // int [][] twoDimensional = new int[2][3];

      /*  int [][]  twoDimensional = {
            {2,3,4,6},
            {3,4,3,5},
                {3,4,3,5},
                {3,4,3,5},
                {3,4,3,5},{3,4,3,5},
                {3,4,3,5}

        };*/



        int [][]  twoDimensional =  new int[100][3];




        for(int i=0;i<100;i++){
            for(int j=0;j<3;j++){
                twoDimensional[i][j] = i;
            }
        }



        for(int i=0;i<100;i++){
            for(int j=0;j<3;j++){
         //       System.out.printInForwardDirection(twoDimensional[i][j]+" ");
            }
           // System.out.println(" ");
        }



     /*   int [][][] threeDimensional = new int[3][3][3];
        threeDimensional[0][0][0] = 949;
        System.out.println(threeDimensional[0][0][0]);*/
    }

}




