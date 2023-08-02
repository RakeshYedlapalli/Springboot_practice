package com.gap.sample.practice.JSON.gai_payload;

import com.gap.sample.practice.Springboot_practice.entity.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BuildTheCorrectLink {


    public static void main(String[] args) throws IOException {




        /*Map<String, Object> updateRollingDistro = new HashMapExample<>();
        Map<String, String> flowMap = new HashMapExample<>();
        List<Map<String, Map<String, String>>> timeBasedAssortmentStrategies = new ArrayList<>();
        Map<String, Object> time = new HashMapExample<>();
        Map<String, Map<String, String>> value = new HashMapExample<>();
        Map<String, String> values = new HashMapExample<>();
        values.put("id", "88030554-8f51-4243-a347-e3912bf71b36");
        values.put("name", "LEVEL 0");
        values.put("storeCount", "0");

        value.put("value", values);
        timeBasedAssortmentStrategies.add(value);
        //Map<String,String>
        flowMap.put("id", "b06f6534-5cfc-4384-95c9-6e8c4a19a3be");
        time.put("timeBasedAssortmentStrategies", timeBasedAssortmentStrategies);
        updateRollingDistro.put("flow", flowMap);
        updateRollingDistro.put("rollingDistro", time);
        ;

        System.out.println(new ObjectMapper().writeValueAsString(updateRollingDistro));*/


        Employee emp = new Employee();
        emp.setIsMarried(null);
        if ((emp.getIsMarried() == null || emp.getIsMarried())) {
            //childMarkets.add(MarketChannel.of(acc.getMarket(), acc.getChannel()));
            System.out.println("I am null in Normal");
        }
        if(Objects.isNull(emp.getIsMarried())){
            System.out.println("I am null ");
        }

        if(Objects.nonNull(emp.getIsMarried())){
            System.out.println("I am non null object");
        }





    }
    private void setOlxRetailStatusToRIErrored(Map<String,
            Employee> messageMap){
        for (Map.Entry<String,Employee> mapEntry : messageMap.entrySet()){

          //  if(nonNull(acc) && olxConfiguration.isOLXEnabled(acc.getBrandMarketChannelKey())){


        //    }
        }
    }

    private static void extractData(String ss) {
        // String ss = "curd";
        if (ss.contains("d")) {
            char[] data = ss.replace("d", "").toCharArray();
            Arrays.sort(data);
            ;
            String fs = String.valueOf(data) + "d";
            System.out.println(fs);
        } else {
            char[] data = ss.toCharArray();
            Arrays.sort(data);
            String fs = String.valueOf(data) + "d";
            System.out.println(fs);
        }
    }

    public void checkData(Employee emp) {
        emp.setLastName("Yedlapalli");


    }

    public static void buildURL() {
        String link = "https://rpm.newrelic.com/accounts/1542405/applications/150255465/transactions?&tw[start]=1646330905&tw[end]=1646330830";

        int stat = link.indexOf('=');
        int end = link.lastIndexOf('=');
        String startTime = link.substring(stat + 1, stat + 11);
        String endTime = link.substring(end + 1, end + 11);

        int startTimeIn = Integer.parseInt(startTime) - 80;
        int endTimeIn = Integer.parseInt(endTime) + 80;
        link = link.replace(startTime, startTimeIn + "");
        link = link.replace(endTime, endTimeIn + "");
        //System.out.println("StartTime is => " + startTime+ " and endTime is => "+ endTime);
        System.out.println(link);
    }

    private static void readDataFromCSVAndBuildThePayloadInfo() throws IOException {
        //Scanner sc = new Scanner(new File("/Users/yadlapallirakesh/Documents/SpringBootPracticeworkspace/Springboot_practice/src/main/java/com/gap/sample/practice/JSON/gai_payload/payload.csv"));
        File file = new File(
                "/Users/yadlapallirakesh/Documents/SpringBootPracticeworkspace/Springboot_practice/src/test/java/com/gap/sample/practice/JSON/gai_payload/data/manipulateTheData.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        StringBuilder sb = new StringBuilder();
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null) {

            // Print the string
            sb.append("\n");
            sb.append(st);
        }

        //System.out.println(sb);
        String arr[] = sb.toString().split("\n");
        StringBuilder sb1 = new StringBuilder();
        Set<String> set = new HashSet<>();
        for (int i = 1; i < arr.length; i++) {
            /*if(i%2!=0 || i==1){
                //System.out.println(arr[i]);
                set.add(arr[i]+"\n");
            }*/
            if (arr[i].contains("_id")) {

                //set.add(arr[i].split(":")[1]+"\n");
                sb1.append(arr[i].split(":")[1] + ",");
                //  sb1.append(arr[i].split(":")[1]+",\n");
                //set.add(arr[i]+"\n");
            }
            // sb1.append(arr[i]+",");

        }
        //System.out.println(set.toString());
        // System.out.println(set.size());
        System.out.println(sb1);


    }
}
