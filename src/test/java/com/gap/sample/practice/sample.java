package com.gap.sample.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class sample {

    public static void main(String[] args) {
    /*    List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        first.add("Rakesh");
        first.add("Rajesh");
        first.add("Mahesh");


        second.add("Mahesh");
        second.add("Rajesh");
        second.add("Rakesh");


sout

        System.out.println(first.containsAll(second) && second.containsAll(first));
        assertTrue(first.containsAll(second) && second.containsAll(first));
*/
        System.out.println(70000*(18/100));
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> listI = list.iterator();

        list.add(50);

        while (listI.hasNext()) {
            System.out.println(listI.next());
        }



       // System.out.println(first.contains(second));

    }
}
