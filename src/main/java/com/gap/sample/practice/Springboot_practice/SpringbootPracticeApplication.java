package com.gap.sample.practice.Springboot_practice;

import com.gap.sample.practice.Springboot_practice.runtimebeancreation.MyServiceRunTimeObjectCreation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.UUID;

//@SpringBootApplication(exclude = MongoClient.class)
//@EnableConfigServer
@EnableScheduling
//@EnableEncryptablePropertie
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringbootPracticeApplication {


    @Autowired
    private MyServiceRunTimeObjectCreation myServiceRunTimeObjectCreation;


    public static void main(String[] args) {

        //System.setProperty("server.port", "9356");
        SpringApplication.run(SpringbootPracticeApplication.class, args);
      //  new SpringbootPracticeApplication().getTheObject();


        //String propertyValue = System.getProperty("jasypt.practice");
        // new SpringbootPracticeApplication().m1();


    }

    public void getTheObject() {

        myServiceRunTimeObjectCreation.doSomethingBasedOnRequirement("myImplementation1");
    }

    public synchronized String getAccid() throws InterruptedException {
        Thread.sleep(100);
        return UUID.randomUUID().toString();
    }

    public void m1() {
        //System.out.println("Jasypth value =>" + jasypt);
    }

    public void searchColorsWithUserInput(String brandId, String userInput) {
        String colorCode = null;
        StringBuilder desc = new StringBuilder();

        String[] split = userInput.split("\\s+");
        for (String str : split) {
            if (str.matches("[0-9]+")) {
                colorCode = str;
            } else {
                desc = desc.length() == 0 ? desc.append(str) : desc.append(" ").append(str);
            }
        }

        if (colorCode == null || desc.length() == 0) {
            if (colorCode == null) {
                //return searchColorsWithDescription(brandId, userInput);
            } else {
                //	return searchColorsWithColorCode(brandId, colorCode);
            }
        } else {
            //return searchWithColorCodeAndDescription(brandId, colorCode, desc.toString());
        }
    }


/*	public static void main(String[] args) {
		String sJava="\\u0003\u0084";
		System.out.println("StringEscapeUtils.unescapeJava(sJava):\n" + StringEscapeUtils.unescapeJava(sJava));
	}*/

}
