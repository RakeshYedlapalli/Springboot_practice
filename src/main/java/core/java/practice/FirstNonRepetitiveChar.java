package core.java.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepetitiveChar {

    public static void main(String[] args) {

        String srtr = "helloheo";

        new FirstNonRepetitiveChar().firstNonRepetiveUsingLegacyMethod(srtr);


        List<String> listOfStrings = new ArrayList<>();
        System.out.println(Stream.of(6, 1, 2, 3, 4, 5, 6).sorted().collect(Collectors.toList()));
        System.out.println(Stream.of(39, 4, 3, 2, 4).min(Comparator.comparing(i -> i)).get());
        System.out.println(Stream.of(39, 4, 3, 2, 4).max(Comparator.comparing(i -> i)).get());
    }

    public void firstNonRepetiveUsingLegacyMethod(String str) {

        for (char c : str.toCharArray()) {

            if (str.indexOf(c) == str.lastIndexOf(c)) {

                System.out.println("First non repetitive character is ->" + c);
                break;
            }
        }
    }

    public void findNonrepUsingJava8() {

        String str = "Print";

//        str.chars().mapToObj(Character::toLowerCase)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,))
    }
}
