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

public class MainClass {


    private static String staticMember = "";
    private String non = "";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        serialization();
        deserialize();



    }

    private static void deserialize() throws IOException, ClassNotFoundException {
        InputStream fin = new FileInputStream("/Users/yadlapallirakesh/Documents/rakesh-yedlapalli-git-workspace/Spring-boot/SpringBootPracticeworkspace/Springboot_practice/src/main/java/core/java/serialization/ser.txt");
        ObjectInput oin = new ObjectInputStream(fin);
        System.out.println("DeSerialization process has started, displaying employee objects...");
        Employee emp;
        emp = (Employee) oin.readObject();
//
        System.out.println(emp.getAge());
        System.out.println(emp.getDob());
        System.out.println(emp.getFirstName());
        System.out.println(emp.getLastName());
        System.out.println(emp);
    }

    private static void serialization() throws IOException {
        Employee emp = new Employee("rakesh", "Y", "fda", "dsa","M");
        ObjectOutput oout;
        try (OutputStream fout = new FileOutputStream("/Users/yadlapallirakesh/Documents/rakesh-yedlapalli-git-workspace/Spring-boot/SpringBootPracticeworkspace/Springboot_practice/src/main/java/core/java/serialization/ser.txt")) {
            oout = new ObjectOutputStream(fout);

            oout.writeObject(emp);
        }
        System.out.println("Serialization is done");
    }

    public void hello(){
        Employee emp = new Employee("rakesh", "Y", "fda", "dsa","M");

        System.out.println(staticMember);
        System.out.println(non);

    }
}
