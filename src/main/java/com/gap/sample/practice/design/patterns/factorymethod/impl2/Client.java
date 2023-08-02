package com.gap.sample.practice.design.patterns.factorymethod.impl2;

public class Client {

    public static void main(String[] args) {

        String documentFormat = "PDF";


        Document document ;

        if (documentFormat.equals("PDF")) {
            document = new PDFDocument().createDocument();
        } else if (documentFormat.equals("Word")) {
            document = new WordDocument().createDocument();
        } else if (documentFormat.equals("Text")) {
            document = new TextDocument().createDocument();
        } else {
            throw new IllegalArgumentException("Invalid document format");
        }

        document.open();
        document.edit();
        document.save();
    }
}
