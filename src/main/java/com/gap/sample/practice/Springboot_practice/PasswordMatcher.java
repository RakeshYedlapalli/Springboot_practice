package com.gap.sample.practice.Springboot_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordMatcher {


    final static Pattern passwordPattern = Pattern.compile("([\"]?password[\"]?\\s*[=:]\\s*)([^\\s,]+)");


    public static void main(String[] args) {
//        System.out.println(maskMessage("password rakesh yedlapalli"));
        sdfsfds();
    }

    private static String maskMessage(String log) {
        if (log.contains("password")) {
            Matcher passwordMatcher = passwordPattern.matcher(log);
            StringBuffer logBuffer = new StringBuffer();
            while (passwordMatcher.find()) {
                String group = passwordMatcher.group(1);
                String passoword = passwordMatcher.group(2);
                if (passoword.startsWith("'")) {
                    passwordMatcher.appendReplacement(logBuffer, group + "'****'");
                } else if (passoword.startsWith("\"")) {
                    passwordMatcher.appendReplacement(logBuffer, group + "\"****\"");
                } else {
                    passwordMatcher.appendReplacement(logBuffer, group + "****");
                }
            }
            passwordMatcher.appendTail(logBuffer);
            return logBuffer.toString();
        }
        return log;
    }


    public static   void sdfsfds() {
        String className = "com.gap.sample.practice.Springboot_practice.PasswordMatcher"; // Replace this with your fully qualified class name

        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            Class<?> myClass = classLoader.loadClass(className);

            // If you need to instantiate the class
            Object instance = myClass.newInstance();
            PasswordMatcher ps = (PasswordMatcher) instance;

            ps.hellWorld();
            ps.hellWorld();

            System.out.println(instance);

            // If you need to access methods or fields of the class using reflection
            // For example:
            // Method method = myClass.getDeclaredMethod("methodName", parameterTypes);
            // Object result = method.invoke(instance, args);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void hellWorld() {
        System.out.println("Hello world");
    }

}
