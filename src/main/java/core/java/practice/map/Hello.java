package core.java.practice.map;

import java.util.Objects;

public class Hello {

   private String name;
   private int id;
   private double marks;


    @Override
    public boolean equals(Object o) {
       Hello hello = (Hello) o;
        return this.name.equals(hello.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, marks);
    }

    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.name = "rakeshs";
        Hello hello1 = new Hello();
        hello1.name = "rakesh";

        System.out.println(hello.equals(hello1));
        System.out.println(hello.hashCode());
    }
}
