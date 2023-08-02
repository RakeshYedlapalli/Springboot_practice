package core.java.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("rakehs",11);
        map.put("rakedhs",11);
        map.put("rakdsaehs",11);
        map.put("rakdsfehs",11);
        map.put("rakfasdfehs",11);
        //map.putIfAbsent("hello",10);

        System.out.println(map);

        Integer i =  map.putIfAbsent("hello",10);
        System.out.println(i);

        System.out.println(map);

        map.remove("hello",101);

        System.out.println(map);

        System.out.println();

        Set<String> set = map.keySet();
        System.out.println(set);


        for(Map.Entry<String,Integer> ss :  map.entrySet()){

            System.out.println("Key is -> " + ss.getKey() + " and value is -> " + ss.getValue());
        }


        map.compute("hello", (p1,p2) -> p2 + 200);
        //map.computeIfAbsent("hello",)

        System.out.println(map);

        System.out.println("Get or default vlaue is ->" + map.getOrDefault("hellos",20));

        map.replace("hello",2322);
        map.replace("hello",23224,3003);
        System.out.println(map);

        System.out.println(map.values());



    }
}
