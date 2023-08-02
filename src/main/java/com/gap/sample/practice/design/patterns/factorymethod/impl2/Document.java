package com.gap.sample.practice.design.patterns.factorymethod.impl2;

public abstract class Document {

    public abstract Document createDocument();


    public void open() {
        System.out.println("Opening the document");
    }

    public void edit() {
        System.out.println("Editing the document");
    }

    public void save() {
        System.out.println("Saving the document");
    }


}
