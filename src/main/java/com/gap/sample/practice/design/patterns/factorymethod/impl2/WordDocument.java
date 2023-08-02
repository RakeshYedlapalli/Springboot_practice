package com.gap.sample.practice.design.patterns.factorymethod.impl2;

public class WordDocument extends Document {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
