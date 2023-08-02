package core.java.collections.list.araylist;

import core.java.sorting.comparable.Items;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayLIstExamples {

    public static void main(String[] args) {


        ////////////////////////////////Trim Size//////////////////////////////////////////////
        ArrayList<Items> list = new ArrayList<>();
        list.add(new Items("Rakesh", BigDecimal.valueOf(10.03), 939933939));
        list.add(new Items("Mahesh", BigDecimal.valueOf(30), 939933939));

        list.trimToSize();

        Items item = new Items("Rakesh", BigDecimal.valueOf(10.03), 939933939);

        ////////////////////////////////Remove by using index//////////////////////////////////////////////

        System.out.println(item.hashCode());
        System.out.println(list.get(0).hashCode());
        boolean isREmoved = list.remove(item);

        System.out.println(list);
        System.out.println(isREmoved);


        ////////////////////////////////Remove by using object//////////////////////////////////////////////

        list = new ArrayList<>();
        list.add(new Items("Rakesh", BigDecimal.valueOf(10.03), 939933939));
        list.add(new Items("Mahesh", BigDecimal.valueOf(30), 939933939));

        list.remove(0);
        System.out.println(list);


        ///////////////////////////////Remove if condition satisfy////////////////////////////////////////////

        list = new ArrayList<>();
        list.add(new Items("Rakesh", BigDecimal.valueOf(10.03), 12293));
        list.add(new Items("Mahesh", BigDecimal.valueOf(30), 939933939));

        list.removeIf(i -> (i.getBarcode() == 939933939 || i.getItemId() == "Rakesh"));

        System.out.println("RemoveIf " + list);


        ////////////////////////////////addAll///////////////////////////////////////////

        list = new ArrayList<>();
        list.add(new Items("Rakesh", BigDecimal.valueOf(10.03), 12293));
        list.add(new Items("Mahesh", BigDecimal.valueOf(30), 939933939));

        ArrayList<Items> list2 = new ArrayList<>();
        list2.add(new Items("Rakesh", BigDecimal.valueOf(10.03), 939933939));
        list2.add(new Items("Mahesh", BigDecimal.valueOf(30), 939933939));


        list.addAll(list2);
        System.out.println("After added the information ->" + list.size());


        ////////////////////////////////addAll at specific index///////////////////////////////////////////

        list = new ArrayList<>();
        list.add(new Items("Rakesh", BigDecimal.valueOf(10.03), 12293));
        list.add(new Items("Mahesh", BigDecimal.valueOf(30), 939933939));

        list2 = new ArrayList<>();
        list2.add(new Items("JSON", BigDecimal.valueOf(10.03), 939933939));
        list2.add(new Items("jafer", BigDecimal.valueOf(30), 939933939));


        list.addAll(1, list2);
        System.out.println("After added the information ->" + list.size());


        /////////////////////////////Remove all which matches with given list of values//////////////////////////////////////////////

        ArrayList<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(29);
        integerList.add(40);

        ArrayList<Integer> integerList2 = new ArrayList<>();

        integerList2.add(29);
        integerList2.add(10);
        integerList2.add(40);


        integerList.removeAll(integerList2);
        System.out.println("After removing the other list contains data ->" + integerList);


        ///////////////////////////////////ReplaceAll or Update all the elements from the list with given logic////////////////////////////////////////

        integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(29);
        integerList.add(40);
        integerList.add(40);
        integerList.add(40);
        integerList.add(40);


        integerList.replaceAll(integer -> integer + 10);
        System.out.println("Updated list ->" + integerList);



///////////////////////////////////Retain All or keep all the elements from each list with given logic////////////////////////////////////////


        integerList = new ArrayList<>();
        integerList.add(46);
        integerList.add(8);
        integerList.add(100);
        integerList.add(25);


        integerList2 =  new ArrayList<>();

        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);


        integerList.retainAll(integerList2);
        System.out.println("Retained list list ->" + integerList);



        ///////////////////////////////////Index of particular element in an array ////////////////////////////////////////


        integerList2 =  new ArrayList<>();

        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);


        int index = integerList2.indexOf(300);
        System.out.println("Index of 300 is ->" + index);


        ///////////////////////////////////Last Index of particular element in an array ////////////////////////////////////////

        System.out.println("Last Index of particular element");

        integerList2 =  new ArrayList<>();

        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);


        int lastIndex = integerList2.lastIndexOf(100);
        System.out.println("Last Index of 100 is ->" + lastIndex);


        ///////////////////////////////////Last Index of particular element in an array ////////////////////////////////////////
        System.out.println("Last Index of particular element");

        integerList2 =  new ArrayList<>();

        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);


         lastIndex = integerList2.lastIndexOf(100);
        System.out.println("Last Index of 100 is ->" + lastIndex);

        ///////////////////////////////////Contains an elment and Contains All element in an array ////////////////////////////////////////

        System.out.println("ContainsAll");
        integerList2 =  new ArrayList<>();

        integerList2.add(100);
        integerList2.add(100);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);

        integerList =  new ArrayList<>();

        integerList.add(100);
        integerList.add(46);
        integerList.add(12);
        integerList.add(8);
        integerList.add(100);

        boolean doesValueAvailableInList = integerList2.contains(100);
        boolean doesListContainsLikeOtherList = integerList2.containsAll(integerList);

        System.out.println("does list contains value 100? ->"+ (doesValueAvailableInList?"yes":"No"));
        System.out.println("does list contains other list ? ->"+ (doesListContainsLikeOtherList?"yes":"No"));



        ///////////////////////////////////toArray ////////////////////////////////////////

        System.out.println("ToArray");
        integerList2 =  new ArrayList<>();

        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);


        Object[] convertedArray = integerList2.toArray();

        System.out.println("Converted to Array" + convertedArray);


        ///////////////////////////////////Iterator ////////////////////////////////////////

        System.out.println("Iterator");
        integerList2 =  new ArrayList<>();

        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);


         Iterator iterator  = integerList2.iterator();

        while (iterator.hasNext()){
            System.out.println("Iterator values -> " + iterator.next());
        }

        System.out.println("-----------");
        ///////////////////////////////////list Iterator  ////////////////////////////////////////

        System.out.println("List iterator");

        integerList2 =  new ArrayList<>();

        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);


        ListIterator listIterator  = integerList2.listIterator();

        while (listIterator.hasNext()){
            System.out.println("Forward List Iterator values -> " + listIterator.next());
        }

        System.out.println("-----------");


        while (listIterator.hasPrevious()){
            System.out.println("backward List Iterator values -> " + listIterator.previous());
        }


        ///////////////////////////////////list Iterator at index  ////////////////////////////////////////

        System.out.println("List iterator at Index");

        integerList2 =  new ArrayList<>();

        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);


         listIterator  = integerList2.listIterator(3);

        while (listIterator.hasNext()){
            System.out.println("Forward List Iterator values -> " + listIterator.next());
        }

        System.out.println("-----------");


        while (listIterator.hasPrevious()){
            System.out.println("backward List Iterator values -> " + listIterator.previous());
        }

        ///////////////////////////////////Sublist  ////////////////////////////////////////

        System.out.println("Sublist");

        integerList2 =  new ArrayList<>();

        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);


        List<Integer> subLIst  = integerList2.subList(2,5);



        System.out.println("Sublist data is =>"+ subLIst);

        ///////////////////////////////////Spliterator  ////////////////////////////////////////

        System.out.println("Sublist");

        integerList2 =  new ArrayList<>();


        integerList2.add(25);
        integerList2.add(46);
        integerList2.add(12);
        integerList2.add(8);
        integerList2.add(100);
        integerList2.add(100);
        integerList2.add(200);
        integerList2.add(300);

      Spliterator<Integer> spliterator =  integerList.spliterator();

        spliterator =  integerList.spliterator().trySplit();
        System.out.println("Characters stics ->" + spliterator);






        ListIterator<Integer> list10  = integerList2.listIterator();

        list10.forEachRemaining(i -> {
                    i = i + 10;
                    System.out.println(i);
                }
        );

        while(list10.hasPrevious()){
        //    System.out.println("Listiterator data ->" + list10.previous());
        }
    }
}
