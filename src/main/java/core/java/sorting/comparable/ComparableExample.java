package core.java.sorting.comparable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {

        List<Items> items = new ArrayList<>();

        items.add(new Items("Rakesh",new BigDecimal("0.03"),9929229));
        items.add(new Items("Suresh",new BigDecimal("0.03"),34));
        items.add(new Items("Amresh",new BigDecimal("0.03"),45));
        items.add(new Items("Balu",new BigDecimal("0.03"),33333));

       // Collections.sort(items);

        System.out.println(items);
    }

}
