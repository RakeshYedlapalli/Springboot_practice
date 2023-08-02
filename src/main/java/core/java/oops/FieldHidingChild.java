package core.java.oops;

public class FieldHidingChild extends FieledHidingParent {

    public String gapInc = "child";


    public void FieldHidingChild() {
        System.out.println("Print");
    }

    public static void main(String[] args) {

        FieldHidingChild p = new FieldHidingChild();
        p.callnonStaticMethod();
        String ss = p.anotherName;
        p.FieldHidingChild();

        System.out.println("another ss ->" + ss);

    }

    public void callnonStaticMethod() {

        System.out.println(gapInc);
        //System.out.println(this.gapInc);
        //System.out.println(gapInc);


    }
}

