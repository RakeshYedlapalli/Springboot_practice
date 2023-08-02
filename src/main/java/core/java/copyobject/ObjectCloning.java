package core.java.copyobject;

public class ObjectCloning  implements Cloneable {


    Student student = new Student("rakesh", 10);


    public static void main(String[] args) {

        Student student = new Student("rakesh", 10);

        Student student1 = new Student(student);


        ObjectCloning objectCloning = new ObjectCloning();


        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());


        System.out.println("Using clone method");



        //ObjectCloningUsingCloneable cloningUsingCloneable = new ObjectCloningUsingCloneable("rakesh",10);


//        System.out.println(cloningUsingCloneable);



        //ObjectCloningUsingCloneable cloningUsingCloneableCloned = cloningUsingCloneable.clone();

    }

}
