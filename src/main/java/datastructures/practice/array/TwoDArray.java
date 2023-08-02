package datastructures.practice.array;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] twoDArray = new int[][] {
                    new int[]{3, 4, 5, 6, 7},
                    new int[]{4, 3, 3, 5, 6},
                    new int[]{3, 5, 3, 3, 2},
                    new int[]{3, 5, 3, 3, 2},
                    new int[]{3, 5, 3, 3, 2}
        } ;

        //System.out.println((twoDArray[0][1]));

        for (int i = 0; i < twoDArray.length; i++) {

            for (int j = 0; j < twoDArray.length; j++) {
                twoDArray[i][j] = 20;
            }
        }

        for (int i = 0; i < twoDArray.length; i++) {

            for (int j = 0; j < twoDArray.length; j++) {
                System.out.println(twoDArray[i][j]);
            }
        }

        System.out.println(Arrays.toString(twoDArray));
    }
}
