package packages;

import com.gap.sample.practice.Springboot_practice.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Passage {

    public static void main(String[] args) {


        List<Employee> list = new ArrayList<>();


        int averageSalar = 0;
        //list.stream().filter(i -> averageSalar > list.stream().map() list.stream().map(i-> averageSalar  + i.getSalar()))



//        list.stream().filter(i -> i.getSalary > list.stream()
//                .map(i -> averageSalar + i.getSalar() )).collect(Collectors.toList());
//
//
//
//        SELECT * FROM emp where avg(salary) > salary;
//
//
//
//
//






        String str = "this is some passage and this is some other passage this is";
        StringBuilder sb = new StringBuilder();
        int maxLineCharacter = 15;
        int characterCount = 0;
        int numberOfCharactersLeft = 15;
        for (int i = 0; i < str.length(); i++) {

            if (characterCount > maxLineCharacter) {
                int stringToBeTrimmed = checkIfStringIsPartiallyWrapping(str, i);

                if (stringToBeTrimmed != -1) {

                    int indexToBeSplitted = returnIndexOfWord(str, i);

                    String output = str.substring(stringToBeTrimmed, indexToBeSplitted);
                    sb.append("\n");
                    sb.append(output);
                    i = indexToBeSplitted;

                } else {
                    sb.append("\n");
                    sb.append(str.charAt(i));

                }
                characterCount = 0;

            } else {
                sb.append(str.charAt(i));
                characterCount++;
            }
        }

        System.out.println(sb);

//
//        "this is some " +
//        "passage" +
//        "other one"


    }

    public static int checkIfStringIsPartiallyWrapping(String str, int index) {

        if (str.charAt(index) != ' ') {

            for (int i = index; i > 0; i--) {

                if (str.charAt(i) == ' ') {
                    return i + 1;
                }
            }
        }
        return -1;

    }

    public static int returnIndexOfWord(String str, int currentIndex) {

        for (int i = currentIndex; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                return i;
            }
        }

        return -1;
    }
}
