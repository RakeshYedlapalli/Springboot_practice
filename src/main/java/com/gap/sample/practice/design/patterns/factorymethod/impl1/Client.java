package com.gap.sample.practice.design.patterns.factorymethod.impl1;

import com.gap.sample.practice.design.patterns.factorymethod.impl1.message.Message;

public class Client {

    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}
