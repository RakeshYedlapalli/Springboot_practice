package com.gap.sample.practice.Springboot_practice.validation;

import com.gap.sample.practice.Springboot_practice.MyWebFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        // Get the ServletContext
        ServletContext servletContext = event.getServletContext();

//         Register the filter
        FilterRegistration.Dynamic filterRegistration = servletContext.addFilter("MyWebFilter", MyWebFilter.class);
        filterRegistration.addMappingForUrlPatterns(null, true, "/*");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        // Cleanup code, if needed
    }
}
