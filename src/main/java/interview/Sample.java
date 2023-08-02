package interview;

import java.util.Arrays;
import java.util.List;

public class Sample {


    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 1, 2);


        System.out.println(list1.retainAll(list2));
        System.out.println(list1);


        Arrays.asList("Rka", "fsdafa4", "djfa4")
                .stream()
                .filter(i -> i.matches(".*\\d.*"))
                .forEach(System.out::println);


    }
}
