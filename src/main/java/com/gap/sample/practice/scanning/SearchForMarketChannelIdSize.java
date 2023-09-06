package com.gap.sample.practice.scanning;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SearchForMarketChannelIdSize {
    public static void main(String[] args) {
        String directoryPath = "/Users/yadlapallirakesh/githubworkspace/assortment-service";
        List<String> fileList = new ArrayList<>();

        List<File> javaFiles = getJavaFiles(directoryPath);
        for (File file : javaFiles) {
            if (containsString(file)) {
                fileList.add(file.getAbsolutePath());
            }
        }

        System.out.println("Files containing the specified string:");
        for (String filePath : fileList) {
            System.out.println(filePath);
        }
    }

    private static List<File> getJavaFiles(String directoryPath) {
        List<File> javaFiles = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".java")) {
                        javaFiles.add(file);
                    } else if (file.isDirectory()) {
                        javaFiles.addAll(getJavaFiles(file.getAbsolutePath()));
                    }
                }
            }
        }

        return javaFiles;
    }

    private static boolean containsString(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (checkWhetherDoWehaveAnyNumbersFallingBetween(line)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static boolean checkWhetherDoWehaveAnyNumbersFallingBetween(String strLine) {
        return strLine.contains(" 9 ") || strLine.contains(" 12 ")
                || strLine.contains(" 6 ") || strLine.contains(" 9;") || strLine.contains(" 12;")
                || strLine.contains(" 6;") || strLine.contains(" 9,") || strLine.contains(" 12,")
                || strLine.contains(" 6,") ||
                strLine.toUpperCase().contains("SIX")
                || strLine.toUpperCase().contains("NINE")
                || strLine.toUpperCase().contains("TWELVE")
                || strLine.contains("hasNineDigit")
                || strLine.contains("hasTwelveDigit")
                || strLine.contains("hasSixDigit") || strLine.contains(" 99 ")
                || strLine.contains("99")
                /*|| strLine.contains("000") || strLine.contains(" 000 ")*/
              /*  strLine.contains(" 000 ") || strLine.contains(" 00 ") ||
                strLine.contains(" 9") || strLine.contains(" 12")
                || strLine.contains(" 6")*/;

    }
}

