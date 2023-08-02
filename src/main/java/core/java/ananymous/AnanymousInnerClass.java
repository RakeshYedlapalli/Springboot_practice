package core.java.ananymous;

public class AnanymousInnerClass {

    public String method(){
        System.out.println("THis is Ananoyms");
        return "";
    }

    public static void main(String[] args) {

        AnanymousInnerClass ananymousInnerClass = new AnanymousInnerClass(){

            @Override
            public String method(){
                System.out.println("THis is actual anonymous class");
                return "";
            }


            AnanymousInnerClass an = new AnanymousInnerClass();

        };
        ananymousInnerClass.method();

    }
}
