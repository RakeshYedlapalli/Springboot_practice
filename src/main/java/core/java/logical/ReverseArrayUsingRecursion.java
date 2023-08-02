package core.java.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayUsingRecursion {


    public static int[] array = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {

       // reverse(0, array.length-1);
        doStreaming();

        //System.out.println(Arrays.toString(array));

    }
    public static void doStreaming(){

        Integer[] array = {700,100,200,300,400,500,600};

        List<Integer> data = Arrays.asList(array);

        System.out.println(data.stream().map(i -> i * 2).filter(i -> i > 100).sorted().collect(Collectors.toList()));

    }

    public static void reverse(int start, int end) {


        if (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            reverse(++start, --end);

        }


    }

}
