package core.java.java8.functional.stream.intstream;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamApiPractice {

    public static void main(String[] args) {

        IntStream.range(1,999999999)
                .skip(3)
                .limit(1)
                .forEach(System.out::println);


        System.out.println(IntStream.range(1, 999999999)
                .sum());


        String op = Stream.of("Rakesh","Rajesh")
                .sorted()
                .filter(i->i.startsWith("R"))
                .findFirst()
                .orElseThrow(() -> new NullPointerException());
//                .ifPresent(System.out::println);
        System.out.println("Found string is =>" + op);

        System.out.println(Arrays.stream(new int[]{3, 3, 2, 2, 4, 5, 6, 6}).filter(i -> i % 2 == 0).sum());
        System.out.println(Arrays.stream(new int[]{3, 3, 2, 2, 4, 5, 6, 6}).average());
        



    }
}
