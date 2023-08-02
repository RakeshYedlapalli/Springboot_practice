package com.gap.sample.practice.java8.stream;

import com.gap.sample.practice.Springboot_practice.entity.Employee;
import org.json.simple.JSONArray;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.stream.Collectors;

public class StreamsApi {

    public static void main(String[] args) {

        List<Employee> list;
        Employee employee = new Employee("Rakesh","A","99393",false,0033,93,"kdjsljfd");
        Employee employee1 = new Employee("Rakesh","B","99393",false,0033,93,"kdjsljfd");
        Employee employee2 = new Employee("Rakesh","C","99393",false,0033,93,"kdjsljfd");
        Employee employee3 = new Employee("Rakesh","D","99393",false,0033,93,"kdjsljfd");
        Employee employee4 = new Employee("Rakesh","E","99393",false,0033,93,"kdjsljfd");
        Employee employee5 = new Employee("Rakesh","F","99393",false,0033,93,"kdjsljfd");
        Employee employee6 = new Employee("Rakesh","G","99393",false,0033,93,"kdjsljfd");

        list = Arrays.asList(employee,employee1,employee2,employee3,employee4,employee5,employee6);

        JSONArray jsonArray = new JSONArray();
        List<Employee> sss = list.stream().
                sorted(Comparator.comparing(Employee::getLastName)).collect(Collectors.toList());
        sss.forEach(System.out::println);



        String str = "I am writing this letter to address an issue I am experiencing with a recently purchased mobile phone from your store.\n" +
                "On 12/04/2023, I bought a new mobile phone from MAX Cell Shop in New York. At the time of purchase, I couldn't thoroughly test all the features since it would have been inconvenient to do so. However, upon arriving home, I encountered several problems. Firstly, inserting a new SIM card proved to be quite difficult as it required gentle pushing to fit properly. Additionally, the mobile phone has been experiencing issues with WiFi connectivity. It repeatedly displays an error message stating \"unable to connect with WiFi\" and fails to detect available connections. Furthermore, after using the device for more than 10 minutes, it becomes excessively hot.\n" +
                "These problems are significantly disrupting my daily work routine. I frequently need to change SIM cards and rely on connecting to external WiFi devices, both of which are causing inconvenience and affecting my productivity. The overheating issue is particularly troublesome since I rely on extended usage of my mobile phone for work-related tasks.\n" +
                "Given the nature of these problems, it appears to be a manufacturing defect. As I recently purchased this mobile phone, I request either a full refund or a replacement with certain conditions. If the same issues persist with the replacement device, I would expect a full refund.";
        String [] sss1 = str.split(" ");
        System.out.println(sss1.length);

    }



}
