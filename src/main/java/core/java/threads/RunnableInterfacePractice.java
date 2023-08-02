package core.java.threads;

public class RunnableInterfacePractice {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("I am running clas");
        };

        runnable.run();
    }
}
