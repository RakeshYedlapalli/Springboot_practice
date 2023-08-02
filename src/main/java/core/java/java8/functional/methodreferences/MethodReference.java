package core.java.java8.functional.methodreferences;


import core.java.java8.functional.SalesPriceVariation;
import core.java.java8.functional.stream.SalesPriceVariationDTO;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReference {

    public static void saySomething() {
        System.out.println("Print, this is static method.");

    }

    public static void saySomething1() {
        System.out.println("Print, this is static method. method 3");

//        Function

    }

    public static void main(String[] args) {

        // Referring static method
//        StaticMethodReference sayable = MethodReference::saySomething1;
//        // Calling interface method
//
//        new ArrayList<MethodReference>().forEach(MethodReference::saySomething1);
//        sayable.say();

        List<SalesPriceVariationDTO> salesPriceVariationDTOS = getList().stream().
                map(SalesPriceVariationDTO::convert).collect(Collectors.toList());

        System.out.println(salesPriceVariationDTOS);





    }


    public static List<SalesPriceVariation> getList() {

        return IntStream.range(1, 10).mapToObj(i -> new SalesPriceVariation(i + "", 10, 20))
                .collect(Collectors.toList());
    }
}
