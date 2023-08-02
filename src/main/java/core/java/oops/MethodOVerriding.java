package core.java.oops;

public class MethodOVerriding extends  ParentStaticBlockAndStaticInitializer{


    @Override
    public String toString(){

        return "This is override method";
    }
    public static void main(String[] args) {

        MethodOVerriding m = new MethodOVerriding();

        System.out.println(m);
        m.callParent();

    }

    //@Override
    public void callParent() {
        super.callParent();
        System.out.println("I am  child class");
    }
}
