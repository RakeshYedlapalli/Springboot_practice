package com.gap.sample.practice.design.patterns.factorymethod.impl1;

import com.gap.sample.practice.design.patterns.factorymethod.impl1.message.Message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //Factory method
    protected abstract Message createMessage();
}
