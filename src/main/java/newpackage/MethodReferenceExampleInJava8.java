package newpackage;

import com.google.common.collect.Maps;
import core.java.java8.functional.methodreferences.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExampleInJava8 {

    public static void main(String[] args) {

        MethodReferenceExampleInJava8 methodReferenceExampleInJava8 = new MethodReferenceExampleInJava8();

        List<MethodReferenceExampleInJava8> list = new ArrayList<>();
        list.forEach(i-> i.methodReference(i));

    }

    public String  methodReference(MethodReferenceExampleInJava8 methodReferenceExampleInJava8  ) {
        System.out.println(methodReferenceExampleInJava8);
        return "";
    }

    public void metho () {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "David", "Cindy");

        // Using method reference to reference a static method
        names.forEach(System.out::println);

        // Using method reference to reference an instance method of an object
        Printer printer = new Printer();
        names.forEach(printer::print);
    }

}
class Printer {
    public void print(String text) {
        System.out.println("Printing: " + text);
    }

}