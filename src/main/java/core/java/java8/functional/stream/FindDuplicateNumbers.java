package core.java.java8.functional.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(100);
        listOfIntegers.add(100);
        listOfIntegers.add(110);
        listOfIntegers.add(5);
        listOfIntegers.add(5);
        listOfIntegers.add(10);
        listOfIntegers.add(10);

        System.out.println(listOfIntegers.stream().filter(i ->
                        Collections.frequency(listOfIntegers, i) > 1)
                .collect(Collectors.toSet()).stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
        // .collect(Collectors.toSet()).forEach(System.out::println);

        getEmpWhoseSalaryIsMoreThan4k();
    }

    public static void getEmpWhoseSalaryIsMoreThan4k() {


        List<ACC> listOfEmp = new ArrayList<>();
        listOfEmp.add(new ACC("Rakesh", 1000));
        listOfEmp.add(new ACC("Rajesh1", 4000));
        listOfEmp.add(new ACC("Rakesh2", 4100));
        listOfEmp.add(new ACC("Rakesh3", 5000));
        listOfEmp.add(new ACC("Rakesh4", 10));
        listOfEmp.add(new ACC("Rakesh5", 50));
        listOfEmp.add(new ACC("Rakesh6", 10));

        listOfEmp.stream().filter(i -> i.getSalary() > 4000)
                .collect(Collectors.toList())
                .forEach(i -> System.out.println("EmpName:" + i.getName() + " and salary : " + i.getSalary()));
    }
}

@AllArgsConstructor
@Getter
class ACC {
    private String name;
    private double salary;
}
