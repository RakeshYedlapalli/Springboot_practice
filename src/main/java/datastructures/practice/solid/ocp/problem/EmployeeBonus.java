package datastructures.practice.solid.ocp.problem;

public class EmployeeBonus {

    public int id;
    public String name;
    public String empType;


    public EmployeeBonus() {

    }

    public EmployeeBonus(int id, String name, String empType) {
        this.id = id;
        this.name = name;
        this.empType = empType;
    }

    public float calculateBonus(float salary , String empType){

        if(empType.equals("Temp")){
            return salary + 10l;
        } else  {
            return salary + 100l;

        }
    }
}
