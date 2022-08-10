package org.company.receiver;

import org.company.receiver.config.ContextConfig;

public class Receiver {

    public static void main(String... args) throws InterruptedException {
        ContextConfig.build().start();
    }

}

