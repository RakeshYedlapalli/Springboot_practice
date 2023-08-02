package datastructures.practice.solid.lsp.implementations;

import datastructures.practice.solid.lsp.abstracts.Employee;

public class PerminentEmployee extends Employee {

    @Override
    public float getMinimumSalary() {
        return 1999;
    }

    @Override
    public float calculateBonus(float salary) {
        return salary*100;
    }
}
