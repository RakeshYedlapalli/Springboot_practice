package core.java.copyobject;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student {


    private String name;
    private int age;


    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

}
