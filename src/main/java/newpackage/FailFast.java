package newpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list = Collections.synchronizedList(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
            if (i == 2) {
                list.add(4);
                //}
            }

//        list.forEach(i-> {
//            System.out.println(i);
//            if(i==3) {
//                list.add(10);
//            }
//        });
//
//        System.out.println(list);
        }
    }
}
