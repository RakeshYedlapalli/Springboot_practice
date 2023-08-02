package core.java.enumexamples;

public class EnumExample3 {

    enum Season {
        WINTER(1), SUMMER(3) , SPRING(4) , FALL(10), HOLIDAY(12);

        private int value;

        private Season(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Season season = Season.FALL;
        System.out.println(season.value+" name ->"+ season.name());
    }

}
