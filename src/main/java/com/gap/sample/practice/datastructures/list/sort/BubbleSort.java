package com.gap.sample.practice.datastructures.list.sort;

import com.gap.sample.practice.datastructures.list.sort.bean.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort<T extends Comparable<T>> {


    private final T[] arr;

    public BubbleSort(T[] arrayOfElements) {
        this.arr = arrayOfElements;
    }


    public T[] sort() {


        for (int i = 0; i < arr.length - 1; i++) {
            boolean didSwap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                System.out.println("All elements are in sorted array so braking the loop");
                break;
            }

        }
          System.out.println(Arrays.toString(arr));
        return arr;
    }






    public static void main(String[] args) {

        /*//Integer[] ss = {30, 3, 2, 10, 40, 40};
        Integer[] ss = {1,2,3,4,5,6,7,8,9};
        String[] strings = {"Rakesh", "Rajesh", "Amber", "Babu", "Ramesh"};

        Student student = new Student();
        student.setFirstName("Rakesh");
        student.setId(1);
        student.setLastName("yedlapalli");

        Student student2 = new Student();
        student2.setFirstName("Rajesh");
        student2.setId(2);
        student2.setLastName("yedlapalli");

        Student[] students = {student2, student};

        new BubbleSort<>(ss).sort();
        new BubbleSort<>(strings).sort();
         new BubbleSort<>(students).sort();*/

     /*   for (int i = 0; i < t.length; i++) {
            System.out.println(t[i].toString());
        }*/

        //System.out.println(sort.sort(););





    }


    public int generateRandomNumber(){
        int min = 1;
        int max = 100000;
        //Generate random int value from 50 to 100
        //System.out.println("Random value in int from "+min+" to "+max+ ":");
        return (int)Math.floor(Math.random()*(max-min+1)+min);

    }


}
class Sample{

    public static void main(String[] args) {
        int[] arr = new int[2];
        for(int i=0;i<2;i++) {
            arr[i] = new Sample().generateRandomNumber();
        }

       // System.out.println(new Sample().sort(arr));
        int aaa[] = new Sample().sort(arr);
        System.out.println(Arrays.toString(aaa));
    }
    public int[] sort(int[] arr) {


        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            boolean didSwap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j]>(arr[j + 1])) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                System.out.println("All elements are in sorted array so braking the loop");
                break;
            }

        }
      //  System.out.println(Arrays.toString(arr));
        // finding the time after the operation is executed
        long end = System.currentTimeMillis();
        // finding the time difference
        float msec = end - start;
        // converting it into seconds
        float sec= msec/1000F;
        // converting it into minutes
        float minutes=sec/60F;
        System.out.println(sec + " seconds");
        System.out.println("COunt is ->"+ arr.length);
        return arr;

    }


    public int generateRandomNumber(){
        int min = 1;
        int max = 10;
        //Generate random int value from 50 to 100
        //System.out.println("Random value in int from "+min+" to "+max+ ":");
        return (int)Math.floor(Math.random()*(max-min+1)+min);

    }

}
