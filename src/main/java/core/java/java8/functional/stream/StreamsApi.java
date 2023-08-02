package core.java.java8.functional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApi {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> listOfPrices = new ArrayList<>();



        productsList.stream().filter(prod -> prod.getPrice() > 25000).collect(Collectors.toList())
                .forEach(System.out::println);

         listOfPrices =
                productsList.stream().filter(prod -> prod.getPrice()>25000).map(Product::getPrice).collect(Collectors.toList());


        System.out.println(listOfPrices);
    }
}
