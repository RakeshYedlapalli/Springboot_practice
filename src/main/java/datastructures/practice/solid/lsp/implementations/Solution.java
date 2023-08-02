package datastructures.practice.solid.lsp.implementations;

import datastructures.practice.solid.lsp.IEmployee;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<IEmployee> listOfEmp = new ArrayList<>();
        listOfEmp.add(new PerminentEmployee());
        listOfEmp.add(new TemporaryEmployee());
        listOfEmp.add(new ContractualEmployee());


        for (IEmployee iEmployee : listOfEmp) {

            System.out.println(iEmployee.getMinimumSalary());
            //System.out.println(iEmployee.calculateBonus(1000));
        }
    }
}
