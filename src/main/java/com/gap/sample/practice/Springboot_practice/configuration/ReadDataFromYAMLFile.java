package com.gap.sample.practice.Springboot_practice.configuration;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "listdata")
//@PropertySource("classpath:/custom-folder/custom-config.yml")
@Component
@EnableConfigurationProperties(ReadDataFromYAMLFile.class)
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ReadDataFromYAMLFile {

    List<String> list;

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        List<String> lis = new ArrayList<>(map.keySet());
        System.out.println(lis);
    }


}
