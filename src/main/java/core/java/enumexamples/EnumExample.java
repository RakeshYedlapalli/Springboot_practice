package core.java.enumexamples;


 enum Weeks {SUNDAY, MONDAY, TUESDAY, THURSDAY}
enum Days {SUNDAY, MONDAY, TUESDAY, THURSDAY}
public class EnumExample {




    public static void main(String[] args) {

        EnumExample enumExample = new EnumExample();
        Weeks sunday = Weeks.MONDAY;

        switch (sunday) {
            case SUNDAY:
                System.out.println("Today is sunday");
                break;

            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
        }

        for (Weeks weeks : Weeks.values()) {
            System.out.println(weeks);
        }


        System.out.println("Value of THURSDAY is: " + Weeks.valueOf("THURSDAY"));
        System.out.println("Index of SUNDAY is: " + Weeks.valueOf("SUNDAY").ordinal());
        System.out.println("Index of TUESDAY is: " + Weeks.valueOf("TUESDAY").ordinal());


        EnumClass enumClass = EnumClass.SUNDAY;



    }
}
