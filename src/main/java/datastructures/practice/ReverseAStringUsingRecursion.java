package datastructures.practice;

public class ReverseAStringUsingRecursion {

    public static void main(String[] args) {
reverseStringUsingRecursion("Rakesh",5);

    }

    public static void reverseStringUsingRecursion(String str, int index) {

        if(index != -1) {
            System.out.print(str.charAt(index));
            reverseStringUsingRecursion(str, --index);
        }
    }
}
