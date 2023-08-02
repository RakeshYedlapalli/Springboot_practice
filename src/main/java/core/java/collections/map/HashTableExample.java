package core.java.collections.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {


    public static void main(String[] args) {
        //Hashtable

        Hashtable<String , Integer> hashtable = new Hashtable<>();

        hashtable.put("hello",10);
        hashtable.put("hello1",10);
        hashtable.put("hello2",10);
        hashtable.put("hello3",10);
        hashtable.put("hello4",10);
        hashtable.put("hello6",10);


        System.out.println(hashtable);

      //  hashtable.put("null",null);
        System.out.println(hashtable);

        Enumeration<String> enumeration =  hashtable.keys();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }

}
