package core.java.collections.list;

import java.util.Vector;

public class VectorExample {


    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(5,3);

        vector.add("Rakesh");
        vector.add("Suresh");
        vector.add("Mahesh");
        vector.add("Swaraj");
        vector.add("Rajd");
        vector.add("Rajdsfad");

        System.out.println(vector);
    }
}
