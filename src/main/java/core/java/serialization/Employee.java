package core.java.serialization;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
public class Employee implements CustomSerilizableInterface {


//    private static final long serialVersionUID = -2399804873840608869;


    public static String hello = "jfadjfas";
    private static final long serialVersionUID = -5885568094444284878L;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public static String getName() {
        return name;
    }

    private String firstName;
    private String lastName;
    private String age;
    private String dob;
    private String gender;


    private static  String name  = "Busy";


}
