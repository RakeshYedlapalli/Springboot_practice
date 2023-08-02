package com.gap.sample.practice.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "olxconfig")
public class OLXConfiguration {

    private String createdBy;

}
