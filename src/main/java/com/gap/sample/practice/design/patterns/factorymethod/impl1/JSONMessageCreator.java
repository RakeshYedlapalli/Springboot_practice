package com.gap.sample.practice.design.patterns.factorymethod.impl1;

import com.gap.sample.practice.design.patterns.factorymethod.impl1.message.JSONMessage;
import com.gap.sample.practice.design.patterns.factorymethod.impl1.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }


}
