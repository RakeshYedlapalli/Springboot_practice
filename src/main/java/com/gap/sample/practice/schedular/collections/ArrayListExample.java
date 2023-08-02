package com.gap.sample.practice.schedular.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListExample {

    public static void main(String[] args) throws Exception {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        arrayList.add("rajesh");


        System.out.println(getCapacity(arrayList));
        arrayList.ensureCapacity(200);
        arrayList.clear();

        Predicate<String> predicate = i->i.length()==0;
        arrayList.removeIf(predicate);


        System.out.println(arrayList);

        System.out.println(getCapacity(arrayList));
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        System.out.println(getCapacity(arrayList));
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        System.out.println(getCapacity(arrayList));
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        System.out.println(getCapacity(arrayList));
        arrayList.add("rakesh");
        arrayList.add("rakesh");
        System.out.println(getCapacity(arrayList));


        System.out.println(arrayList.size());



    }
    static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
