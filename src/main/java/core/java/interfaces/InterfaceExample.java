package core.java.interfaces;

public interface InterfaceExample {

String NAME ="myName is Rakesh";

default void myMethod (){

    System.out.println("I am default method");
}

static void hello(){
    System.out.println("Print I am static");
}

}
