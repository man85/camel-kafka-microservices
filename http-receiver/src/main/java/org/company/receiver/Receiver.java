package org.company.receiver;

import org.company.receiver.config.ContextConfig;

public class Receiver {

    public static void main(String... args) {
        ContextConfig.build().start();
    }

}

