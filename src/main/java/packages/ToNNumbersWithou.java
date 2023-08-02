package packages;

import java.util.stream.Stream;

public class ToNNumbersWithou {


    public static int countOfOne = 0;
    public static int countOfTwo = 0;
    public static void main(String[] args) {


        int n = 10;

        int start = 0;

        printNNumbers(start, n);

        printNumbers(10);

        System.out.println("one->"+countOfTwo+" "+ countOfTwo);






    }

    public static void printNNumbers(int start, int n) {

        if (start < n) {
            start++;
            countOfOne++;
         //   System.out.print(start != n ? start + "," : start);
            printNNumbers(start, n);

        }

    }

    public static void printNumbers(int n) {
        if (n > 0) {
            countOfTwo++;
            printNumbers(n - 1);
            System.out.println(n);
        }
    }


}
