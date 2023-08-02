package core.java.oops;

public class CallOneConstructorFromOther extends ParentStaticBlockAndStaticInitializer {


    CallOneConstructorFromOther(String s, String y) {
        System.out.println("Two parameter constructor  String , String is ->" + s + ", " + y);
    }

    CallOneConstructorFromOther(Integer s, String y) {
        System.out.println("Two parameter constructor Integer , String is ->" + s + ", " + y);
    }

    CallOneConstructorFromOther(String s, Integer y) {
        System.out.println("Two parameter constructor is String , Integer ->" + s + ", " + y);
    }


    CallOneConstructorFromOther() {
        //this("hell",3);
        //this("3","4");
        //super();
        super.callParent();

    }

    public static void main(String[] args) {

        CallOneConstructorFromOther c = new CallOneConstructorFromOther();
    }
}
