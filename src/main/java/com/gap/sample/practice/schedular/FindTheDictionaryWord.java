package com.gap.sample.practice.schedular;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDictionaryWord {


    public static void main(String[] args) {
       /*Boolean isAvaible = new FindTheDictionaryWord()
               .isAvailable(Arrays.asList("hello", "hell", "on", "now"),"hellonow");*/

        //canSegmentString(Arrays.asList("hello", "hell", "on", "now"),"hellonow");

        Set < String > dictionary = new HashSet< String >();
        String s = new String();
        s = "hellonow";

        dictionary.add("hello");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");


        canSegmentString(s,dictionary);
     /*
       if(Boolean.TRUE.equals(isAvaible)){
           System.out.println("It's available");
       }*/
    }


    public static boolean canSegmentString(String s, Set<String> dictionary) {
        for (int i = 1; i <= s.length(); ++i) {
            String first = s.substring(0, i);
            if (dictionary.contains(first)) {
                String second = s.substring(i);

                if (second == null || second.length() == 0 ||
                        dictionary.contains(second) || canSegmentString(second, dictionary)) {
                    return true;
                }

            }
        }
        return false;
    }


    public boolean isAvailable(List<String > dictionary, String actualString){

        for(int i=0;i<actualString.toCharArray().length;i++){
            String substring = actualString.substring(0,i+1);

            if(dictionary.contains(substring)){


                String second = actualString.substring(i);
                if(second.length()>0 && isAvailable(dictionary,second)){
                    return true;
                }


            }
            System.out.println(substring);
        }

        return false;

    }

}


