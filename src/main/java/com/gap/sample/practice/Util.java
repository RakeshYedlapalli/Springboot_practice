package com.gap.sample.practice;

import com.gap.sample.practice.Springboot_practice.entity.Employee;

import java.util.Arrays;
import java.util.List;

public class Util {

    public static List<Employee> getAllEmployees() {

        Employee employee = new Employee("Rakesh","A","99393",false,0033,93,"kdjsljfd");
        Employee employee1 = new Employee("Rakesh","B","99393",false,0033,93,"kdjsljfd");
        Employee employee2 = new Employee("Rakesh","C","99393",false,0033,93,"kdjsljfd");
        Employee employee3 = new Employee("Rakesh","D","99393",false,0033,93,"kdjsljfd");
        Employee employee4 = new Employee("Rakesh","E","99393",false,0033,93,"kdjsljfd");
        Employee employee5 = new Employee("Rakesh","F","99393",false,0033,93,"kdjsljfd");
        Employee employee6 = new Employee("Rakesh","G","99393",false,0033,93,"kdjsljfd");


        return  Arrays.asList(employee,employee1,employee2,employee3,employee4,employee5,employee6);
    }
}
