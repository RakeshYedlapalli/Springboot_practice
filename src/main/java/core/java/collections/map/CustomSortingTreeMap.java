package core.java.collections.map;

import java.util.TreeSet;

public class CustomSortingTreeMap {


    public static void main(String[] args) {

        Purchase purchasePriceComparator = new Purchase(1,"cucumber",200);
        Purchase purchasePriceComparator1 = new Purchase(1,"cucumber",20);
        Purchase purchasePriceComparator2 = new Purchase(1,"cucumber",30);
        Purchase purchasePriceComparator3 = new Purchase(1,"cucumber",1);
        Purchase purchasePriceComparator4 = new Purchase(1,"cucumber",399);

        TreeSet<Purchase> treeSet = new TreeSet<>();
        treeSet.add(purchasePriceComparator);
        treeSet.add(purchasePriceComparator1);
        treeSet.add(purchasePriceComparator2);
        treeSet.add(purchasePriceComparator3);
        treeSet.add(purchasePriceComparator4);

        System.out.println(treeSet);


    }
}
