package core.java.java8.functional;


public interface DefaultMethod {

    default String defaultMethodIn() {

        return "Default method is executed";
    }

    String m1();
}

