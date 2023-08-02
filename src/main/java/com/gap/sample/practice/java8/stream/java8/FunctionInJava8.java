package com.gap.sample.practice.java8.stream.java8;

import java.util.function.Function;

public class FunctionInJava8 {
    public static void main(String[] args) {


        System.out.println("AUG (7/25) TO APR (3/12) - FA '22 - G03".equals("AUG (7/25) TO APR (3/21) - FA '22 - G03"));

        String str = "";
        Function<String, Integer> function = String::length;
        Function<String, Integer> functions = String::length;

        //function.apply("Rakesh");

        Function<Integer, Integer> function1 = a -> a * 10;

        Function<Integer, Integer> function2 = a -> a * 100;


        int s = function.andThen(function1).andThen(function2).apply("Rakesh");

        function1.compose(functions).apply("Rakesh");

        System.out.println("Output is ->" + s);


        //Java 8 Function Compose example


        Function<Integer, Integer> doubleIt = a -> a * 2;
        Function<Integer, Integer> addBy1 = a -> a + 1;

        //function.apply("Rakesh");

        Function<Integer, Integer> substractIt = a -> a - 1;

        Function<Integer, Integer> divideBy10 = a -> a / 10;





        int  d = doubleIt.compose(addBy1).compose(substractIt).compose(divideBy10).apply(10);

        System.out.println("Supplied Value =>" + d);




        Function<Integer, Integer> increment = x -> x + 1;
        Function<Integer, Integer> doubleValue = x -> x * 2;

// Compose the two functions
        Function<Integer, Integer> incrementAndDouble = increment.compose(doubleValue);

// Apply the composed function
        int result = incrementAndDouble.apply(5); // Result: (5 * 2) + 1 = 11

        System.out.println("Result is -> " + result);
    }
}
