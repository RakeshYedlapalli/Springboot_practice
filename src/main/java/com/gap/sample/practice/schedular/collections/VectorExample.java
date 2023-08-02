//package com.gap.sample.practice.schedular.collections;
//
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.Enumeration;
//import java.util.List;
//import java.util.Vector;
//
//public class VectorExample {
//
//    public static void main(String[] args) throws Exception {
//
////        Vector<String> vector = new Vector();
////        System.out.println(vector.capacity());
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////
////        System.out.println(vector.capacity());
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        vector.add("rakesh");
////        System.out.println(vector.capacity());
////        vector.add("rakesh");
////        vector.add("rakesh");
////        System.out.println(vector.capacity());
////        Enumeration v  = vector.elements();
////
////
////        while (v.hasMoreElements()){
////            System.out.println(v.nextElement());
////        }
////
//
//
//
//
//
//
//    }
//
//    static int getCapacity(List al) throws Exception {
//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        return ((Object[]) field.get(al)).length;
//    }
//}
