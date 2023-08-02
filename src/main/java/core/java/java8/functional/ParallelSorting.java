package core.java.java8.functional;

import java.util.Arrays;

public class ParallelSorting {

    public static void main(String[] args) {


        int [] listOfData = {10,0,3,2,100,30,39,1,2};

        Arrays.parallelSort(listOfData);


        System.out.println(Arrays.toString(listOfData));


    }
}
