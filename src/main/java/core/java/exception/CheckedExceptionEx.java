package core.java.exception;

import java.util.HashMap;
import java.util.Map;

public class CheckedExceptionEx {

    public static void main(String[] args) throws InvalidDataException {

        String ss = "rakeshdsfadd";

        isValidString(ss);


        Map<String,String > map = new HashMap<>();
        map.put(null,null);
        map.put(null,null);

        System.out.println(map);
    }

    private static void isValidString(String ss) throws InvalidDataException {
        for(int i = 0; i< ss.length(); i++){
            char ch = ss.charAt(i);
            if(Character.isDigit(ch)){
                throw new InvalidDataException("The string contains digits");
            }
        }
    }

    private static void isValidStringUnChecked(String ss)  {
        for(int i = 0; i< ss.length(); i++){
            char ch = ss.charAt(i);
            if(Character.isDigit(ch)){
                throw new StringShouldAtleastContainOneDigit("The string contains digits");
            }
        }
    }






}
