package com.gap.sample.practice.design.patterns.factorymethod.impl2;

public class TextDocument extends Document {

    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
