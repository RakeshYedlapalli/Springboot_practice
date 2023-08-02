package core.java.java8.functional;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class StringAreAnagramOrNot {

    public static void main(String[] args) {

        System.out.println(checkWhetherStringsAreAnagramOrNot("silent", "listen"));

        System.out.println(areAnagrams("silent", "listen"));

    }

    public static boolean isAnagaram(String st1, String st2) {

//[101, 105, 108, 110, 115, 116]
        return st1.chars().sorted().toArray() == st2.chars().sorted().toArray();
    }


    public static boolean areAnagrams(String str1, String str2) {
        // Remove any spaces and convert both strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Use Java 8 Streams to sort the characters and compare them
        return str1.chars().sorted().toArray() == str2.chars().sorted().toArray();
    }
    public static boolean checkWhetherStringsAreAnagramOrNot(String st1, String st2) {




        BiPredicate<String , String > biPredicate = (a,b) -> {

            if (a.length() != b.length()) {
                return false;
            }

            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1, ch2);
        };


return         biPredicate.test(st1,st2);



    }
}

