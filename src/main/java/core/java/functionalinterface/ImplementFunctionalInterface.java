package core.java.functionalinterface;

public class ImplementFunctionalInterface implements FunctionalInterfaceExample1{

    @Override
    public String sayHello() {
        System.out.println("I a in sayhello");
        return null;
    }

    public static void main(String[] args) {



        FunctionalInterfaceExample1 functionalInterfaceExample1 = () -> "Print";

        System.out.println(functionalInterfaceExample1.sayHello());
    }
}
