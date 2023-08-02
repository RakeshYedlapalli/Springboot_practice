package packages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

public class FilterStudentData {


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    class StudentObject {
        int age;
        List<String> couses;


    }

    public static void main(String[] args) {


        StudentObject studentObject = new FilterStudentData(). new StudentObject(20, Arrays.asList("Science"));
        StudentObject studentObject1 = new FilterStudentData(). new StudentObject(2, Arrays.asList("Maths"));
        List<StudentObject> studentObjectss = Arrays.asList(studentObject,studentObject1);

        studentObjectss.stream()
                .filter(i -> i.getAge() > 19 && i.getCouses().contains("Science"))
                .collect(Collectors.toList()).forEach(i-> System.out.println(i.getAge()));


//        new WeakHashMap<>()



    }
}
