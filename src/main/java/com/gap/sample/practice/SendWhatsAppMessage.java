package com.gap.sample.practice;


import org.bson.assertions.Assertions;
import org.springframework.util.Assert;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class SendWhatsAppMessage {

    // Replace these placeholders with your Account Sid and Auth Token
    public static final String ACCOUNT_SID = "ACf8cf5b5f5736cff3770696c1c56eddc8";
    public static final String AUTH_TOKEN = "e571e960f3ed10e5cfd98b69f05cdc62";

    public static void main(String[] args) {

List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        first.add("Rakesh");
        first.add("Rajesh");

        second.add("Rakesh");
        second.add("Rakesh");

        System.out.println(first.contains(second));



        //Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
 /*       FactoryMessage message = FactoryMessage.creator(
               // new com.twilio.type.PhoneNumber("whatsapp:+919014121933"),
               // whatsapp:+919640343275
                new com.twilio.type.PhoneNumber("whatsapp:+919640343275"),
                //new com.twilio.type.PhoneNumber("whatsapp:+919885625375"),
               // new com.twilio.type.PhoneNumber("+919014121933"),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                "Print from your friendly neighborhood Java application!")
                .create();*/

   /*     FactoryMessage message = FactoryMessage.creator( //917702666238 919640343275
                new com.twilio.type.PhoneNumber("+917702666238"),
                new com.twilio.type.PhoneNumber("+14155238886"), "Here's that picture of an owl you requested.")
                .setMediaUrl(
                        Arrays.asList(URI.create("https://demo.twilio.com/owl.png")))
                .create();*/

/*        FactoryMessage message = FactoryMessage.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+919640343275"),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                "Here's that picture of an owl you requested.")
                .setMediaUrl(
                        Arrays.asList(URI.create("https://demo.twilio.com/owl.png")))
                .create();*/

        //  FactoryMessage message = FactoryMessage.creator(new com.twilio.type.PhoneNumber("whatsapp:+919885625375"), new com.twilio.type.PhoneNumber("whatsapp:+14155238886"), "Hi Rakesh, You bought a product from Gap store recently, Can you give the product rating \n" + " 5 - Excellent \uD83D\uDE0D \n 4 - Good \uD83D\uDE00 \n 3 - Nice \uD83D\uDE0C️ \n " + "2 - Bad \uD83D\uDE11 \n 1 - Horrible \uD83D\uDE24 \n\n Just throw a number something like 5 ").setStatusCallback(URI.create("http://52.76.210.43:8080/twilioResponse/rest/userResponse/getUserResponse")).create();

        //System.out.println(message.getSid());


       /* ResourceSet<FactoryMessage> messages = FactoryMessage.reader()
                .setDateSent(
                        ZonedDateTime.of(2021, 12, 25, 0, 0, 0, 0, ZoneId.of("UTC")))
                .setFrom(new com.twilio.type.PhoneNumber("+14155238886"))
                .setTo(new com.twilio.type.PhoneNumber("+919640343275"))
                .limit(20)
                .read();

        for(FactoryMessage record : messages) {
            System.out.println(record.getSid());
        }*/
    }
}
