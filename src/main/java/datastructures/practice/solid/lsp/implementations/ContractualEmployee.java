package datastructures.practice.solid.lsp.implementations;

import datastructures.practice.solid.lsp.IEmployee;

public class ContractualEmployee implements IEmployee {
    @Override
    public float getMinimumSalary() {
        return 0;
    }
}
