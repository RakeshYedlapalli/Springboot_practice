package com.gap.sample.practice.logical.programming;

public class NewVersion {

    public static void main(String[] args) {

     /*   newVersion("xxhxix");
        newVersion("abxxxcd");
        newVersion("xabxxxcdx");
*/


//        System.out.println(stringX("xxhxix"));
//        System.out.println(stringX("abxxxcd"));
//        System.out.println(stringX("xabxxxcdx"));

        String ss = "Few peoples think schools should be saperate for boys and girls, where as others think the co-edcation ssytem is much benficial for them,\n" +
                "In my opinion it is better to send boys and girls in the same school.\n" +
                "There are numerous reasons to send child to co-education schools, firstly no gender descrimination takes place in such schools, Both boys and girls receive an equal\n" +
                "level of opportunities. The child is taught the importance of equality, Moreover this skill opens doors in future work endeavours.\n" +
                "For example in the corporate world both men and women work together and if a child is already habituated to work with unisexual evironment he/she will easily get adjusted there.\n" +
                "Neverthless, There are several reasons to send the children in separate schools, parents feel that these schools can help childrens to focus on there studies sometimes fridenship among\n" +
                "boys and girls gives the distraction from Academics.Therefore in order to get good results , parents send there childrens in saperate school.\n" +
                "That being said, I personally do not feel that studying in same school will effect on acedemic rather childrens learn to respect other person irrespective of gender.\n" +
                "It's a crucial learning for every child to adopt this behaviour at early age.In conclusion , I would recommend parents to choose a co-educational school rather the saparate.";
        // System.out.println(ss.split(" ").length);


        //    LocalDateTime date = LocalDateTime.now();
        //      System.out.println(date);
//        System.out.println(date.truncatedTo(ChronoUnit.MINUTES));

        buildAString("Chocolate", 4);

    }

    public static String newVersion(String s) {


        if (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x') {

            s = s.replace("x", "");
            s = "x" + s + "x";
        }

        System.out.println(s);

        return s;

        /*for(int i=0;i<s.length();i++){

            if((i==0 && s.charAt(i) == 'x') || ((i==s.length()-1 && s.charAt(i) == 'x'))){
                continue;
            }
            else if(s.charAt(i) == 'x')) {
                s.replace('x')
            }

        }*/
    }

    public static String stringX(String str) {

        String result = "";

        int len = str.length();

        for (int i = 0; i < len; i++) {

            char temp = str.charAt(i);

            if (!(i > 0 && i < len - 1 && temp == 'x'))

                result = result + temp;
        }

        return result;
    }

    public static String buildAString(String data, int n) {

        StringBuilder ss = new StringBuilder();

        for (int i = n; i >= 0; i--) {
            String out = data.substring(0, i);
            ss.append(out);
        }


        System.out.println(ss);
        return "";
    }

}
