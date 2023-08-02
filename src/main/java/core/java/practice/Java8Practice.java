package core.java.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Java8Practice {

    public static void main(String[] args) {

        List<String> prefixAndSuffix = Arrays.asList("Pri", "Mouse", "Keyboard", "Motherboard");

        System.out.println(prefixAndSuffix.stream().map(i -> "R" + i + "S").collect(Collectors.toList()));


        StringJoiner stringJoiner = new StringJoiner(",","R","S");

        stringJoiner.add("Printer");

        stringJoiner.add("Printer");


        stringJoiner.add("Printer");
        stringJoiner.add("Printer");
        stringJoiner.add("Printer");

        Optional<Integer> optional = Stream.of(3,4,5,6,7,8,8,0).max(Comparator.comparing(i->i));

        System.out.println(optional.get());

        long count= prefixAndSuffix.stream().filter(i -> i.length() > 3).count();
        System.out.println(count);

        Stream stream = Stream.concat(Stream.of("192","949"),Stream.of(29,3,4,5));


        List<String> duplicateElements = Arrays.asList("Rakesh","Rakesh","rajesh","Sursh");
        System.out.println(duplicateElements.stream().distinct().collect(Collectors.toList()));

        new HashSet<>(duplicateElements).forEach(System.out::println);



        System.out.println("Current Date: " + java.time.LocalDate.now());
        System.out.println("Current Time: " + java.time.LocalTime.now());
        System.out.println("Current Date and Time: " + java.time.LocalDateTime.now());


        System.out.println(prefixAndSuffix.stream().sorted().collect(Collectors.toList()));

        System.out.println(Stream.of(2, 4, 5, 6, 7).mapToInt(Integer::intValue).sum());



    }
}
