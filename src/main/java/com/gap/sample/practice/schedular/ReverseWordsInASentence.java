package com.gap.sample.practice.schedular;

public class ReverseWordsInASentence {

    public static void main(String[] args) {

        String wordIs = "HelloX";
        System.out.println(new ReverseWordsInASentence().getTheWord(wordIs));

    }

    public StringBuilder getTheWord(String word){
        String [] words = word.split(" ");
        StringBuilder s = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            s.append(words[i]+" ");
        }
        return s;
    }

}
