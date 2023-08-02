package core.java.practice.generics;

public class Print<T extends String> {

    T anything;

    public void printAnything(T t){
        this.anything = t;
    }

    public void print(){

        System.out.println(anything);
    }
}

class IntegerPrint {




    public static void main(String[] args) {
        Print printPrint = new Print<>();
        printPrint.printAnything("Rakesh");

        printPrint.print();

        VarArgs args1 = new VarArgs();
        int [] i = {3,4,5};
        args1.getVarArgs(i);

    }


}

class VarArgs {

    public <T> void getVarArgs(int[]... a){

        System.out.println(a.getClass());
    }
}
