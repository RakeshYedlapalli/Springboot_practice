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
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

@WebFilter("/*")
public class MyWebFilter implements Filter {

//    private final Pattern directoryTraversalPattern = Pattern.compile("\\.\\./|\\.\\.\\\\");
    private final Pattern directoryTraversalPattern = Pattern.compile("(?i)%2e%2e[/\\\\]|\\.\\./|\\.\\.\\\\");

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


//        String requestedPath = servletRequest.getParameter("path");
//        System.out.println(requestedPath);
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        String requestPath = request.getContextPath() + request.getServletPath();
        String queryString = request.getQueryString();


        HttpServletRequest httpRequest =  request;
        String requestPath = httpRequest.getRequestURI();
        // Example: if the URL is "http://localhost:8080/employee/getAllEmployees/getEmployees/..\rakesh/..\",
        // requestedPath will be "/employee/getAllEmployees/getEmployees/..\rakesh/..\".

        // Extract the path parameter from the requestedPath
        //  String pathParameter = extractPathParameter(requestedPath);



        String encoded = URLEncoder.encode(requestPath,StandardCharsets.UTF_8.toString());
        String encoded2 = URLEncoder.encode(encoded,StandardCharsets.UTF_8.toString());


        System.out.println(encoded2);
        String decoedeString = URLDecoder.decode(encoded2, StandardCharsets.UTF_8.toString());
        System.out.println(decoedeString);
        String decoedeString1 = URLDecoder.decode(decoedeString, StandardCharsets.UTF_8.toString());
        String decoedeString2 = URLDecoder.decode(decoedeString1, StandardCharsets.UTF_8.toString());

        System.out.println(decoedeString2);
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


    public static void main(String[] args) {

        System.out.println(new MyWebFilter().containsDirectoryTraversalPattern("../"));
    }

    @Override
    public void destroy() {
        // Cleanup code (if needed)
    }


}
