package packages;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AvailityInterview {

    public static void main(String[] args) {

//        palindrome();


//        getFirstUniqueValue(null);
        optimzedWayToCheckPalindrome();
    }


    public static  void optimzedWayToCheckPalindrome() {



        String str = "1222";
        boolean isTrue = true;
        int length = str.length();
        for(int i=0;i<str.length()/2;i++) {

            if(str.charAt(i) != str.charAt(length-1-i)) {
                isTrue = false;
            }
        }

        if(isTrue) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private static void palindrome() {
        String palindrome = "aba";
        StringBuilder sb = new StringBuilder();

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            sb.append(palindrome.charAt(i));
        }

        if (sb.toString().equals(palindrome)) {
            System.out.println("String is palindrome");
        }
    }


    public static void getFirstUniqueValue(int [] arrau) {
//        List<Integer> listOfIntegers =  Arrays.asList(1,2,3,4,5,5);
        List<Integer> listOfIntegers =  Arrays.asList(1,1,7,2,3,4,5,6);

//        listOfIntegers.stream().sorted();










        Set<Integer> set = new HashSet<>();

        listOfIntegers.forEach(i-> {
            if(!set.add(i)) {
                 set.remove(i);
            }
        });

        System.out.println(set.stream().findFirst());

    }









}





//121,abc,1221,

