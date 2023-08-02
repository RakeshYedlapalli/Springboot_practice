package core.java.isAAndHasA.isA;

public class Child extends Parent {

    public void show() {
        System.out.println("Child class show method");
    }

    public static void main(String[] args) {

        Child child = new Child();

        child.show();
    }
}
