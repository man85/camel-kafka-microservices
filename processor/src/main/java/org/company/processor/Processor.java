package org.company.processor;

import org.company.processor.config.Config;
import org.apache.kafka.streams.KafkaStreams;

import java.util.concurrent.CountDownLatch;

public class Processor {

    public static void main(String[] args) {
        Config config = new Config();
        final KafkaStreams streams = config.getStreams();
        final CountDownLatch latch = new CountDownLatch(1);

        Runtime.getRuntime().addShutdownHook(new Thread("streams-shutdown-hook") {
            @Override
            public void run() {
                streams.close();
                latch.countDown();
            }
        });

        try {
            streams.start();
            latch.await();
        } catch (final Throwable e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.exit(0);
    }
}
