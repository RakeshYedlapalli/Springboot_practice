package core.java.interfaces;

public class ClassImplements implements Interface2, Interface1 {


    @Override
    public String m1() {
        return "M1 method executed";
    }

    public static void main(String[] args) {


        ClassImplements classImplements = new ClassImplements();
        System.out.println(classImplements.m1());
    }
}
