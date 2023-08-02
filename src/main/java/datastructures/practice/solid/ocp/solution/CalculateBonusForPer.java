package datastructures.practice.solid.ocp.solution;

public class CalculateBonusForPer extends EmployeeBonus {

    @Override
    float calculateBonus(float salary) {
        return salary*100;
    }
}
