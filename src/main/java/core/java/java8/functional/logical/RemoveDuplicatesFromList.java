package core.java.java8.functional.logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {


    public static void main(String[] args) {


        List<Integer> listOfInts = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 8, 8);

//        listOfInts.stream().filter()

        Set<Integer> setData = new HashSet<>();

        listOfInts.forEach(i -> {
            if (!setData.add(i)) {
                setData.remove(i);
            }
        });


//        setData.forEach(System.out::println);


        listOfInts.stream().distinct().forEach(System.out::println);


        System.out.println("Non duplicate values");

        listOfInts.stream().filter(i -> listOfInts.stream()
                .filter(j -> j.equals(i)).count() == 1).forEach(System.out::println);


        System.out.println("how to filter non duplicated values from a list value");
        listOfInts.stream()
                .filter(firstValue -> listOfInts
                        .stream()
                        .filter(j -> j.equals(firstValue))
                        .count() == 1).forEach(System.out::println);


        System.out.println("How to get all the duplicated values from a list");


        listOfInts.stream()
                .filter(firstValue -> listOfInts
                        .stream()
                        .filter(j -> j.equals(firstValue))
                        .count() > 1).collect(Collectors.toSet()).forEach(System.out::println);


        System.out.println("Another way to get duplicated values from a list using Map");

        Map<Integer,Long> map = listOfInts.stream().collect(Collectors.groupingBy(num -> num , Collectors.counting()));

        System.out.println(map);

        System.out.println("Final data with Map");

        map.entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("Converted from list to Set");

        new HashSet<>(listOfInts).stream().forEach(System.out::println);
        //listOfInts.stream().collect(Collectors.toSet()).forEach(System.out::println);


        StringJoiner st = new StringJoiner("$","[","]");
        st.add("Hello");
        st.add("World");
        st.add("Rakesh");
        st.add("Ye");
        System.out.println(st);






    }
}
