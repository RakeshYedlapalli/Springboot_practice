package core.java.practice.generics;

import java.io.Serializable;

public class GenericsExample {


    public static void main(String[] args) {
        Container<Hold> container = new Container<>();
        container.type = new Hold();
        container.size();

        Container<Integer> container1 = new Container<>();
        container1.type = 10;
        container1.size();

        genericMethod(10);

    }

    public static <T extends Serializable> void genericMethod(T passAnything) {

        System.out.println(passAnything);


    }
}

class Hold implements Comparable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Container<T extends Comparable> {
    T type;

    public void size() {
        System.out.println(type);
    }


}

class AnyThingThatExtens<T extends Comparable> {
    T type;

    public void size() {
        System.out.println(type);
    }


}

