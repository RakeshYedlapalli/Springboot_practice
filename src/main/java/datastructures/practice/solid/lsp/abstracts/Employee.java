package datastructures.practice.solid.lsp.abstracts;

import datastructures.practice.solid.lsp.IEmployeeBonus;
import datastructures.practice.solid.lsp.IEmployee;

public abstract class Employee implements IEmployee, IEmployeeBonus {


    public abstract float calculateBonus(float salary) ;

    public abstract float getMinimumSalary();
}
