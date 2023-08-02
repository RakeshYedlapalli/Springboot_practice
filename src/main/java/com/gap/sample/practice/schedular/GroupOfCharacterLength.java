package com.gap.sample.practice.schedular;

public class GroupOfCharacterLength {

    public String groupOfCharacterLength(String inputCharacter) {

        if (inputCharacter == null || inputCharacter.length() == 0) {
            return "";
        }
        char[] charArray = inputCharacter.toCharArray();
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char cc = 0;
        for (int i = 0; i < charArray.length; i++) {
            //  int prevIndex = getPreviousChart(charArray, index);
            //index ++;
            if(i!=charArray.length-1) {
                if (charArray[i] == charArray[i + 1]) {
                    counter++;
                    continue;
                }
            }
            sb.append(charArray[i] + "->" + counter);
            counter = 1;

        }

        return sb.toString();
    }

    public int getPreviousChart(char[] c, int index) {

        return index - 1;
    }

    public String demo(String inputString){
StringBuilder sb = new StringBuilder();

        char [] charDD = inputString.toCharArray();
        char previousChar = 0;
        int count=0;

        for(char c : charDD){

            if(c==previousChar){
                count++;
            }
            else{
                if(previousChar!=0) {
                    sb.append(count + "->" + previousChar);
                }

                    previousChar = c;
                    count=1;

            }
        }
        sb.append(count + "->" + previousChar);
        return sb.toString();
    }

    public static void main(String[] args) {
        String data = new GroupOfCharacterLength().groupOfCharacterLength("aabbc");
        String data1 = new GroupOfCharacterLength().demo("000000434534");
        System.out.println(data1);
    }
}
