package core.java.java8.functional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountStringsWhoseLengthIs3 {

    public static void main(String[] args) {
//       getCount();
//       printStringsWhoseLengthGreatrThan3();
        // removeDuplicateElementsFromList();
        //sortInDescendingOrder();
        System.out.println(numberStreamUsingJava("2223333"));
    }

    public static String numberStreamUsingJava(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int cur_count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] != ch[j]) {
                    break;
                }
                cur_count += 1;
                //  if(i<s.length()-1 && ch[i+1] != ch[i]) {
                if (Integer.toString(cur_count).equals(ch[i] + "")) {
                    if (j == s.length() - 1) {
                        return "true";
                    } else {
                        if (ch[j] != ch[j + 1]) {
                            return "true";
                        }
                    }
                }
                //  }
            }
        }
        return "false";
    }

    private static void sortInDescendingOrder() {

        List<String> list = new ArrayList<>();
        list.add("Rakesh");
        list.add("Rakesh");
        list.add("Rajesh");
        list.add("Rajesh");
        list.add("Rajesh");

        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(10);
        list2.add(20);
        list2.add(39);
        list2.add(39);
//        System.out.println(list2);

        System.out.println(list2.stream().mapToInt(Integer::intValue).count());


        //list.stream().mapToInt(Integer::intValue).sum();
    }

    private static void removeDuplicateElementsFromList() {

        Function<String, Integer> function = String::length;
        List<String> list = new ArrayList<>();
        list.add("Rakesh");
        list.add("Rakesh");
        list.add("Rajesh");
        list.add("Rajesh");
        list.add("Rajeshs");

        Set<String> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);


    }

    private static void printStringsWhoseLengthGreatrThan3() {

        List<String> list = new ArrayList<>();
        list.add("Rakesh");
        list.add("Ra");
        list.add("Ras");
        list.add("R");
        list.stream().filter(i -> i.length() > 3).forEach(System.out::println);
    }


    public static void getCount() {

        List<String> list = new ArrayList<>();
        list.add("Rakesh");
        list.add("Ra");
        list.add("Ras");
        list.add("R");

        System.out.println(list.stream().filter(i -> i.length() > 3).count());

    }
}
