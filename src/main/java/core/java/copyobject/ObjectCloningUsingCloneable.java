package core.java.copyobject;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ObjectCloningUsingCloneable extends Object implements Cloneable {

    private String name;
    private int age;


    public static void main(String[] args) throws CloneNotSupportedException {

        ObjectCloningUsingCloneable std = new ObjectCloningUsingCloneable("name", 19);

        ObjectCloningUsingCloneable ob = (ObjectCloningUsingCloneable) std.clone();

        System.out.println("First object hash code ->" + std.hashCode());
        System.out.println("Second object hash code ->" + ob.hashCode());
    }

}
