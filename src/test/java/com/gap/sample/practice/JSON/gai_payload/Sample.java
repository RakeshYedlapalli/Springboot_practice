package com.gap.sample.practice.JSON.gai_payload;

public class Sample {


    public static void main(String[] args) {
        String a = "Rakesh Yedlapalli";
        String b = "palliRakesh Yedla";

        if (isRotation(a, b)) {
            System.out.println("String B is a rotation of String A.");
        } else {
            System.out.println("String B is not a rotation of String A.");
        }
    }

    public static boolean isRotation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        String concatenated = a + a;
        return concatenated.contains(b);
    }


//
//    from Addepalli, Jeevan Ram to Everyone:    3:52  PM
//    Given two strings A & B, check if B is a rotation of A,
//    eg:
//            1)	Input: A = "Rakesh Yedlapalli"+"Rakesh Yedlapalli"
//    B = "palliRakesh Yedla"
//    Output: True
//
//2)	Input: A = "Rakesh Yedlapalsi"
//    B = "sh YedlapalliRake"
//    Output: True
//3)	Input: A = "Rakesh Yedlapalli"
//    B = "Rake Yedlapallish"
//    Output: False

}


//
