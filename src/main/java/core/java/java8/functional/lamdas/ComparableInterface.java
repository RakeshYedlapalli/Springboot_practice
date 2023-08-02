package core.java.java8.functional.lamdas;

import core.java.sorting.comparable.Items;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

public class ComparableInterface {


    public static void main(String[] args) {

        Items items = new Items("itemId", new BigDecimal(30), 93933);
        Items items1 = new Items("itemIdds", new BigDecimal(1), 9433933);
        Items items2 = new Items("itemIdsa", new BigDecimal(100), 939333);
        Items items3 = new Items("itemIdda", new BigDecimal(70), 9334933);

        //String s = Items::update();

        Set<Items> set =  new TreeSet<>();
        set.add(items);
        set.add(items1);
        set.add(items2);
        set.add(items3);

        System.out.println(set);

        set.forEach(System.out::println);

    }
}
