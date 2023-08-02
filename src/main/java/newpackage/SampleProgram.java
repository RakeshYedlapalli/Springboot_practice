package newpackage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SampleProgram {

    public static void main(String[] args) {


//        BiConsumer

        //class Employee, => id, name and city , HashMapExample
        Employee employee = new Employee(2, "XYZ", "Hyderabad");
        Employee employee2 = new Employee(3, "XYZ", "Hyderabad");
        Employee employee3 = new Employee(4, "XYZ", "Hyderabad");
        Employee employee4 = new Employee(5, "XYZ", "Hyderabad");
        Employee employee5 = new Employee(6, "XYZ", "Hyderabad");
        Employee employee6 = new Employee(2, "XYZ", "Hyderabad");


        Map<Employee, String> map = new HashMap<>();

        map.put(employee, "employee");
        map.put(employee2, "employee2");
        map.put(employee3, "employee3");
        map.put(employee4, "employee4");
        map.put(employee5, "employee5");
//        map.put(employee6, "employee6");


        System.out.println(map.get(new Employee(3, "XYZ", "Hyderabad")));


//        map().stream().collect(Collectors.toList());


    }
}

@AllArgsConstructor
@Getter
@ToString
class Employee {

    private int id;
    private String name;
    private String city;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city);
    }
}
