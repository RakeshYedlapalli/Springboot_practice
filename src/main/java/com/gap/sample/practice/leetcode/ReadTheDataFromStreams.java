package com.gap.sample.practice.leetcode;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Set;

public class ReadTheDataFromStreams {


    public static void main(String[] args) {
        mm();
    }

    public static void mm() {

        // public static void main(String args[])
        //{
        //  BufferedReader rd;
        OutputStreamWriter wr;
        System.setProperty("http.agent","Chrome");

        try
        {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            wr = new OutputStreamWriter(conn.getOutputStream());
            //  wr.flush();




            // Get the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuffer sb = new StringBuffer();
            while ((line = rd.readLine()) != null) {
               System.out.println(line);
                sb.append(line);
            }



            String valueStr  = sb.toString();
            int count = 0;

              JSONParser parser = new JSONParser();
              JSONObject json = (JSONObject) parser.parse(valueStr);


           // System.out.println(json);
            Object keyvalue = "";

            for (Object keyStr : json.keySet()) {
                 keyvalue = json.get(keyStr);

                //Print key and value
               // System.out.println("key: "+ keyStr + " value: " + keyvalue);

                //JSONObject json1 = (JSONObject) parser.parse(keyvalue.toString());


                //System.out.println(keyvalue.toString());

                //printJsonObject(json1);

                //for nested objects iteration if required
                //if (keyvalue instanceof JSONObject)
                //    printJsonObject((JSONObject)keyvalue);
            }




          // keys.stream().forEach(System.out::println);


            for (String part : keyvalue.toString().split(",")) {
                String[] subparts = part.split("=", 2);
                if ("age".equals(subparts[0].trim()) &&
                        Integer.valueOf(subparts[1]) > 50) {
                    count++;
                }
            }
           // System.out.print(count);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void printJsonObject(JSONObject jsonObj) {
        for (Object keyStr : jsonObj.keySet()) {
            Object keyvalue = jsonObj.get(keyStr);

            //Print key and value
            System.out.println("key: "+ keyStr + " value: " + keyvalue);

            //for nested objects iteration if required
            //if (keyvalue instanceof JSONObject)
            //    printJsonObject((JSONObject)keyvalue);
        }
    }
}



