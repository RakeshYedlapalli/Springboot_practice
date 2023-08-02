package com.gap.sample.practice.Springboot_practice;


public class MergeTwoString {

    static String sss = "h";
    static String ss233 = "Bye";


    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {


        //new MergeTwoString().mergeTwoStringsAlternatively("H", "bye");
        // new MergeTwoString().mergeTwoStringsThriceAlternatively("determination", "stance",4);
        new MergeTwoString().mergeTwoStringsThriceAlternativelyAppTwo("determination", "stance", 3);

        StringBuilder sb = new StringBuilder();
        //sb.append("dfjfjasdjfasjfasjdfasdf");
        //sb.append(3,4);
        StringBuilder sb1 = sb.append("944949", 0, 3);
        System.out.println(sb1);

    }

    //  System.out.println(sb);


    public String mergeTwoStringsAlternatively(String first, String second) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < first.length() || i < second.length(); i++) {


            if (i < first.length()) {
                sb.append(first.charAt(i));
            }

            if (i < second.length()) {
                sb.append(second.charAt(i));
            }

        }
        System.out.println(sb);
        return sb.toString();
    }

    public String mergeTwoStringsAlternativelyApproachThree(String first, String second, int k) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < first.length() || i < second.length(); i++) {


            for (int j = i; j < i + k; j++) {

                if (j < first.length()) {
                    sb.append(first.charAt(j));
                }
            }

            for (int j = i; j < i + k; j++) {

                if (j < second.length()) {
                    sb.append(second.charAt(j));
                }
            }
            i = i + k - 1;
        }
        return sb.toString();

    }

    public String mergeTwoStringsThriceAlternativelyAppTwo(String first, String second, int k) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < first.length() || i < second.length(); i++) {


            // for (int j = i; j ; j++) {
            int end = i < first.length() - k ? i + k : first.length();
            if (i < first.length()) {

                sb.append(first, i == first.length() - 1 ? first.length() - 1 : i, end);
            }

            if (i < second.length()) {
                //sb.append(second, i, end);
                sb.append(second, i == second.length() - 1 ? second.length() - 1 : i, end);
            }
            i = i + (k - 1);
        }


        // }

        System.out.println(sb);
        System.out.println("detstaermnceination".equals(sb.toString()));
        return sb.toString();

    }

}

//duressabienclitey
//duressabienclitey