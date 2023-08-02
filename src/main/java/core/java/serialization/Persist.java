package core.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class Student {

    int id;
    String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


public class Persist {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        serialization();
        deserialize();
    }

    private static void deserialize() throws IOException, ClassNotFoundException {
        InputStream fin = new FileInputStream("ser.txt");
        ObjectInput oin = new ObjectInputStream(fin);
        System.out.println("DeSerialization process has started, displaying Student objects...");
        Student emp;
        emp = (Student) oin.readObject();
//
//        System.out.println(emp.getAge());
//        System.out.println(emp.getDob());
//        System.out.println(emp.getFirstName());
//        System.out.println(emp.getLastName());
    }

    private static void serialization() throws IOException {
        Student emp = new Student(1,"Rakesh");
        ObjectOutput oout;
        try (OutputStream fout = new FileOutputStream("/Users/yadlapallirakesh/Documents/SpringBootPracticeworkspace/Springboot_practice/src/main/java/core/java/interview/serialization/ser.txt")) {
            oout = new ObjectOutputStream(fout);

            oout.writeObject(emp);
        }
    }
}
