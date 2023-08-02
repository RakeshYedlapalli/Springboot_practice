package com.gap.sample.practice.datastructures.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class FailFastFailSafe {


    public static void main(String[] args) {
        new FailFastFailSafe().failFast();
    }


    public void failFast(){

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Rakesh");
        arrayList.add("Rajesh");
        arrayList.add("Suresh");


        Iterator it = arrayList.iterator();
        ListIterator it2 = arrayList.listIterator(arrayList.size());

        while (it2.hasPrevious()){

            String value = (String) it2.previous();
           /* if("Rajesh".equals(value)){
                arrayList.remove("Rajesh");
            }*/

            System.out.println("List iterator Value ->"+ value);


        }


        while (it.hasNext()){

            String value = (String) it.next();
            if("Rajesh".equals(value)){
                arrayList.remove("Rajesh");
            }

            System.out.println("Value ->"+ value);


        }


    }
}
