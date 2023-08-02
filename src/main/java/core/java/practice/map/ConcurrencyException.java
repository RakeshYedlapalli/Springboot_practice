package core.java.practice.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyException {

    public static void main(String[] args) {


        Map<String,String> map = new ConcurrentHashMap<>();
        map.put("Print","Rakesh");
        map.put("Hello1","Rakesh");
        map.put("Hello3","Rakesh");
        map.put("Hello4","Rakesh");
        map.put(null,"Rakeshhshs");

        for(Map.Entry<String,String> mapSet : map.entrySet()){

            map.remove("Print");
            System.out.println(map);
        }

    }
}
