package datastructures.practice.solid.ocp.solution;

public class CalculateBonus {

    public static void main(String[] args) {

        EmployeeBonus employeeBonusPerm = new CalculateBonusForPer();
        System.out.println(employeeBonusPerm.calculateBonus(1000));

        EmployeeBonus employeeBonusTemp = new CalculateBonusForTemp();
        employeeBonusTemp.calculateBonus(02002);

    }
}
