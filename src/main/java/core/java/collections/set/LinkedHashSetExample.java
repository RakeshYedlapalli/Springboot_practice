package core.java.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<String> linkedHashset = new LinkedHashSet<>();




        //linkedHashSet.add()
        linkedHashset.add("rakesh");
        linkedHashset.add("suresh");
        linkedHashset.add("mahesh");
        linkedHashset.add(null);
        linkedHashset.add(null);
        linkedHashset.add(null);

        System.out.println(linkedHashset);



         linkedHashset = new HashSet<>();

        //linkedHashSet.add()
        linkedHashset.add("rakesh");
        linkedHashset.add("suresh");
        linkedHashset.add("mahesh");
        linkedHashset.add(null);
        //linkedHashset.add(null);

        System.out.println(linkedHashset);



    }
}
