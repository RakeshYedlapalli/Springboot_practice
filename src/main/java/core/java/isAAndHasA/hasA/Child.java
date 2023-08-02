package core.java.isAAndHasA.hasA;


public class Child {


    Parent parent = new Parent();

    public void show() {
        System.out.println("Child class show method");


    }

    public static void main(String[] args) {

        Child child = new Child();

        child.parent.show();
        child.show();
    }
}

class sub {

    public static void main(String[] args) {

    }
}
