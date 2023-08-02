package core.java.threads.executorservice;

import java.util.Scanner;



 class AlternatingCodeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();



        boolean result = checkAlternatingCode(input);
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }



    public static boolean checkAlternatingCode(String input) {
        // Ensure the input has at least two characters
        if (input.length() < 2) {
            return false;
        }



        char firstChar = input.charAt(0);
        char secondChar = input.charAt(1);



        for (int i = 0; i < input.length(); i += 2) {
            if (input.charAt(i) != firstChar || input.charAt(i + 1) != secondChar) {
                return false;
            }
        }



        return true;
    }
}