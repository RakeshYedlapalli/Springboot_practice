package newpackage;

import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample {


    //Find if the number is a prime number or not  - 13
    //5
    // >1 and

    public static void main(String[] args) {
        int primeNumbber = 13;

        // int [] i = {1,2,2,2,3,3,4,5,6,6};

        //if(primeNumbber %1= primeNumbber && )

        List<Integer> list = Arrays.asList(1, 2, 2, 2, 3, 3, 4, 5, 6, 6);
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        list.forEach(i -> {
            if (list2.contains(i)) {
                set.add(i);
            } else {
                list2.add(i);
            }
        });
//        System.out.println(set);

//        isPrimeNumber(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
//                73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151,
//                157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233,
//                239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317,
//                331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419,
//                421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503,
//                509, 521, 523, 541));

//        printDuplicateValuesFromList();
        duplicateFromChatGPT();


    }

    public static void isPrimeNumber(List<Integer> primeNumbers) {
        int number = 5;

        for (int prim = 0; prim < primeNumbers.size(); prim++) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            System.out.println(isPrime);
        }

        //return isPrime;
    }

    public static void printDuplicateValuesFromList() {
        List<Integer> list = Arrays.asList(1, 2, 2, 2, 3, 3, 4, 5, 6, 6);

        List<Integer> duplicateValues = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        list.stream().forEach(i-> {

            if(!set.add(i)) {
                duplicateValues.add(i);
            }
        });

        System.out.println(duplicateValues);
    }

    public static void duplicateFromChatGPT() {

            List<Integer> numbers = Arrays.asList(1, 2, 2, 2, 3, 3, 4, 5, 6, 6);


            List<Integer> duplicateNumbers = new ArrayList<>();
            HashSet<Integer> uniqueNumbers = new HashSet<>();

            for (Integer number : numbers) {
                if (!uniqueNumbers.add(number)) {
                    duplicateNumbers.add(number);
                }
            }

            System.out.println("Duplicate numbers: " + duplicateNumbers);
    }

}
