package core.java.operators;

public class Operators {

    public static void main(String[] args) {

        int i = 1;
        System.out.println(++i);
        System.out.println(--i);
        System.out.println(i++);
        System.out.println(i--);
        System.out.println((i++));
        System.out.println((i++));
        System.out.println((i--));
        System.out.println((i++));
        System.out.println(--i);
        System.out.println(++i);
        System.out.println(i);


        System.out.println("evaluation is ");
        int a = 1, b= 2,c = 3;
        System.out.println(a++ + ++c - b++ + --a);

        //System.out.println(1+4-2+1);
        System.out.println(4+5-2+1);

    }
}
