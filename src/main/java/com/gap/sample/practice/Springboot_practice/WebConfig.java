package com.gap.sample.practice.Springboot_practice;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean
    public FilterRegistrationBean<MyWebFilter> myWebFilter() {
        FilterRegistrationBean<MyWebFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyWebFilter());
        // Add URL patterns to specify which requests should be intercepted by the filter
        registrationBean.addUrlPatterns("*"); // Example: Intercept requests to /api/*
        return registrationBean;
    }
}
