package core.java.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("hello",12);
        linkedHashMap.put("hello2",124);
        linkedHashMap.put("hello3",12344);
        linkedHashMap.put("hello4",1243);
        linkedHashMap.put("hello5",12342);
        linkedHashMap.put("hello7",123);
        linkedHashMap.put("hello8",13452);

        System.out.println("LinkedHashMap ->" + linkedHashMap);



        linkedHashMap = new HashMap<>();

        linkedHashMap.put("hello",12);
        linkedHashMap.put("hello2",124);
        linkedHashMap.put("hello3",12344);
        linkedHashMap.put("hello4",1243);
        linkedHashMap.put("hello5",12342);
        linkedHashMap.put("hello7",123);
        linkedHashMap.put("hello8",13452);

        System.out.println("dHashMap ->" + linkedHashMap);

    }
}
