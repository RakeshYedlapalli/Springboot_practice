package core.java.practice;

public class AccessFromOutside {

    public static void main(String[] args) {


//        Engine e = new Engine(10);
//        ImmutableClass immutableClass = new ImmutableClass(10, "rakesh", e);
//
//        System.out.println(immutableClass.getId());
//        System.out.println(immutableClass.getName());
//        System.out.println(immutableClass.getEngine());
//
//        System.out.println(immutableClass.getEngine().speed);
//
//
//        LocalDate startDate
//                = LocalDate.parse("2018-11-03");
//        LocalDate endDate
//                = LocalDate.parse("2018-11-03");
//
//
//        // Prints the date
//        //System.out.println(endDate);
//
//        // Parses the date
//        LocalDate markDownDate
//                = LocalDate.parse("2018-11-03");
//        LocalDate flowDate
//                = LocalDate.parse("2018-11-03");
//
//        // Prints the date
//        System.out.println(markDownDate);
//
//        // Compares both dates
//        System.out.println(startDate.isAfter(flowDate.minusDays(1)));
//        System.out.println(endDate.isAfter(markDownDate.minusDays(1)));
//        //System.out.println(endDate.isBefore(markDownDate));
//
//
//        String startDateStr = "strategy.getStartDate()",
//                endDateStr = "strategy.getEndDate()";


        //BooleanUtils.isFalse()


        String str = "developer.amazonservice.ca";
        String str2 = "developer.amazonserver.com.mx";
        String str4 = "developer.amazonserver.co.uk";
        //String str5 = "developer.amazonserver.jp";


        int lastIndex = str.lastIndexOf(".") + 1;
        String countryCode = str.substring(lastIndex, lastIndex + 2);
        String countryCode1 = str2.substring(lastIndex, lastIndex + 2);
        String countryCode3 = str4.substring(lastIndex, lastIndex + 2);

        System.out.println(countryCode);
        System.out.println(countryCode1);
        System.out.println(countryCode3);


//        System.out.println(str.lastIndexOf("."));
//        int languageIndex = str.lastIndexOf(".com");
//
//        String lag = str.substring(languageIndex,
//                languageIndex + 2);
//        System.out.println(lag);
//
//        System.out.println(str.substring(str.lastIndexOf(lag)+2));
//
//        String[] urls = {"developer.amazonservice.ca"};
//        String regex = ".com\\b(?!\\.)";
//        Pattern pattern = Pattern.compile(regex);
//
//        for (String url : urls) {
//            Matcher matcher = pattern.matcher(url);
//            if (matcher.find()) {
//                System.out.println(url);
//            }
//        }
//        System.out.println(languageIndex);


    }

    public boolean isValid() {

        return !true;
    }
}
