package com.gap.sample.practice.annotations.controller;

import lombok.SneakyThrows;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.*;
import java.net.URI;
import java.util.Arrays;

public class HitTicketPriceEndpoint {

    public static void main(String[] args) {
   new HitTicketPriceEndpoint().hitTicketPriceEndpoint();
    }


    @SneakyThrows
    public void hitTicketPriceEndpoint() {
        RestTemplate restTemplate  = new RestTemplate();
        //restTemplate.headForHeaders()
        String [] listOfData = extractData();
        System.out.println("Data is => " + Arrays.toString(Arrays.stream(listOfData).toArray()));
        FileWriter fWriter = new FileWriter(
                "/Users/yadlapallirakesh/Desktop/TicketPriceExistsAccs.txt");

        FileWriter fWriter2 = new FileWriter(
                "/Users/yadlapallirakesh/Desktop/TicketPriceResponse.txt");
        for(String list : listOfData){



            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.add("apiKey", "M4Ouh8nZfS351g9rQxBdp1KhwAuiV0R2");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("brandCode", list.split(",")[1]);
            queryParams.add("assortedCustomerChoiceId", list.split(",")[0]);

            URI uri = UriComponentsBuilder.newInstance()
                    .scheme("https")
                    .host("stage.api.azeus.gaptech.com")
                    .port(443)
                    .path("pem-price-services/ppem-ticket-price/")
                    .path("ticket-prices")
                    .queryParams(queryParams)
                    .build()
                    .toUri();
            try {
                ResponseEntity<Object> response =
                        restTemplate.exchange(uri, HttpMethod.GET, entity, Object.class);
                System.out.println(response.getStatusCode());



                // Writing into file
                // Note: The content taken above inside the
                // string
                fWriter.write(list.split(",")[0]+", " + list.split(",")[1]+ ","+list.split(",")[2]+ "\n");
                fWriter2.write(response+"\n");
                // Printing the contents of a file

                // Closing the file writing connection





            }catch (Exception e) {

            }

        }
        fWriter.close();



    }

    @SneakyThrows
    public String[] extractData ()  {

        File file = new File(
                "/Users/yadlapallirakesh/Desktop/TicketPriceAccs.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        StringBuilder sb = new StringBuilder();
        while ((st = br.readLine()) != null)
            sb.append(st);

            return sb.toString().split("@");

    }

}
