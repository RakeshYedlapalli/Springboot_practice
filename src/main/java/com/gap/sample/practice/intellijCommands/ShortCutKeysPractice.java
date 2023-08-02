package com.gap.sample.practice.intellijCommands;

import com.gap.sample.practice.Springboot_practice.entity.Employee;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ShortCutKeysPractice {






    public static void main(String[] args) {
        Set<Employee> listOfdata = new HashSet<>();
//        Employee employee = new Employee("Rakeshss","yedlapalli","993",true);
//        Employee employee1 = new Employee("Rajesh","yedlapalli","1000",true);
//        Employee employee2 = new Employee("suresh","yedlapalli","333",true);
//        Employee employee3 = new Employee("mahesh","yedlapalli","323",true);
//        Employee employee5 = new Employee("Rakesh","yedlapalli","199933",true);
//        listOfdata.add(employee);
//        listOfdata.add(employee1);
//        listOfdata.add(employee2);
//        listOfdata.add(employee3);
//        listOfdata.add(employee5);


        //Optional<Employee> firstValue =  listOfdata.
        //firstValue.get().setFirstName("Rakeshdfasfasdfadffdafdf");
        ArrayList<String> ss = new ArrayList<>();
        // ss.add("Raks");
        System.out.println(CollectionUtils.isNotEmpty(ss));







    /*   listOfdata.stream().filter(employee4 ->
                employee4.getFirstName().equals("Rakesh")&&
                        employee4.getLastName().equals("yedlapalli")).findFirst()
                .ifPresent(employee9 -> {
                    employee9.setEmpId("dfaddfadfadsf");
                    employee9.setFirstName("Siddardth");
                });
*/
        System.out.println(listOfdata);






      /*  int  duration = (1000/1000)%60;
        System.out.println("Time is =>"+duration);
        //searchColorsWithUserInput("","White 84884 82 dsklsd dslksd");

        IntStream.rangeClosed(0,5).forEach(i-> System.out.println("This is Range closed ->"+i));

        IntStream.range(0,3).forEach(i-> System.out.println("This is Range ->"+i));*/
    }

    public static void searchColorsWithUserInput(String brandId, String userInput) {
        String colorCode = null;
        StringBuilder desc = new StringBuilder();
        String[] split = userInput.split("\\s+");
        for (String str : split) {
            if(str.matches("[0-9]+")) {
                colorCode = str;
            } else {
                desc = desc.length() == 0 ? desc.append(str) : desc.append(" ").append(str);
            }
        }

        if (colorCode == null || desc.length() == 0) {
            if (colorCode == null) {
                //return searchColorsWithDescription(brandId, userInput);
            } else {
                //	return searchColorsWithColorCode(brandId, colorCode);
            }
        } else {
            //return searchWithColorCodeAndDescription(brandId, colorCode, desc.toString());
        }
    }



}
