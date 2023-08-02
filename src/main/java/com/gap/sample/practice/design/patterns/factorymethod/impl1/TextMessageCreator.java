package com.gap.sample.practice.design.patterns.factorymethod.impl1;

import com.gap.sample.practice.design.patterns.factorymethod.impl1.message.Message;
import com.gap.sample.practice.design.patterns.factorymethod.impl1.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }


}
