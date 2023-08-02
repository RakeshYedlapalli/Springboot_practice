package core.java.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("rakesh");
        set.add("suresh");
        set.add("mahesh");
        // set.add("bale");
        boolean is = set.add("bale");
        System.out.println(is);

        System.out.println(set);


        for (String s : set) {

            System.out.println(s);
        }
    }
}
