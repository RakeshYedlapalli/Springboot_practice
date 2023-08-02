package com.gap.sample.practice.Springboot_practice.validation;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


public class MyApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Register the ServletContextListener here
        servletContext.addListener(new MyServletContextListener());
    }
}
