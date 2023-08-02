package com.gap.sample.practice.Springboot_practice;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

@WebFilter("/*")
public class MyWebFilter2 implements Filter {

    private final Pattern directoryTraversalPattern = Pattern.compile("\\.\\./|\\.\\.\\\\");

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code (if needed)
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {
        // Your filtering logic here
        // For example, you can log request information or modify request/response headers

        // Continue the filter chain
        //R( /employee/getAllEmployees/getEmployees/../rakesh/../)


//        Response response = Response.class





        String requestedPath = servletRequest.getParameter("path");
        System.out.println(requestedPath);
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        String requestPath = request.getContextPath() + request.getServletPath();
        String queryString = request.getQueryString();


        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestPath = httpRequest.getRequestURI();
        // Example: if the URL is "http://localhost:8080/employee/getAllEmployees/getEmployees/..\rakesh/..\",
        // requestedPath will be "/employee/getAllEmployees/getEmployees/..\rakesh/..\".

        // Extract the path parameter from the requestedPath
      //  String pathParameter = extractPathParameter(requestedPath);


        if (containsDirectoryTraversalPattern(requestPath) || containsDirectoryTraversalPattern(queryString)) {
            response.getWriter().write("403 Forbidden - Directory Traversal Attempt Detected");
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            return;
        }




        chain.doFilter(request, response);
    }


    private String extractPathParameter(String requestedPath) {
        // Get the last part of the URL path as the path parameter
        String[] pathParts = requestedPath.split("/");
        return pathParts[pathParts.length - 1];
    }



    private boolean containsDirectoryTraversalPattern(String input) {
        return input != null && directoryTraversalPattern.matcher(input).find();
    }


    @Override
    public void destroy() {
        // Cleanup code (if needed)
    }
}
