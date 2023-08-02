package datastructures.practice;

import java.util.Scanner;

public class ZigZagArray {


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
//declaring an array to store the elements
        int[] array;
//size of the array
        int length = 0;
        System.out.print("Enter the number of elements in array: ");
        length = sc.nextInt();
//mapping the size of the array
        array = new int[length];
        System.out.print("Enter the " + length + " elements: ");
//reads the array elements from the user
        for (int i = 0; i < length; i++)
        {
            array[i] = sc.nextInt();
        }
//function that converts an array into zigzag form
        System.out.print("\nThe zigzag Array is: \n");
//function calling
        zigzagArray(array, length);
//iterate over the array
        for (int i = 0; i < length; i++)
//prints the zigzag array
            System.out.print(+array[i] + "  ");
        System.out.print("\n");
    }
    //function to generate the zigzag array
    public static void zigzagArray(int[] a, int n)
    {
//initially, set flag to true
        boolean flag = true;
//temp variable to be use in swapping
        int temp;
        for (int i = 0; i <= n - 2; i++)
        {
            if (flag)
            {
//execute if elements are in the order a > b > c
                if (a[i] > a[i + 1])
                {
//swapping elements
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            else
            {
//execute if elements are in the order a < b < c
                if (a[i] < a[i + 1])
                {
//swapping elements
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
//set falg to false
            flag = !flag;
        }
    }
}
