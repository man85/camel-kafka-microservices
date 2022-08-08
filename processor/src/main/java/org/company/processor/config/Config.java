package org.company.processor.config;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;

import java.io.IOException;
import java.util.Properties;

public class Config {

    private final KafkaStreams streams;

    public Config() {
        final Properties props = new Properties();
        Properties extProps = new Properties();
        try {
            extProps.load(Config.class.getClassLoader().getResourceAsStream("application.yml"));
        } catch (final IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, extProps.getProperty("application.id"));
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, extProps.getProperty("boot.strap.server"));
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        final StreamsBuilder builder = new StreamsBuilder();
        builder.stream(extProps.getProperty("input.topic"))
                .mapValues(v->((String)v).toUpperCase())
                .to(extProps.getProperty("output.topic"));
        final Topology topology = builder.build();
        streams = new KafkaStreams(topology,props);
    }

    public KafkaStreams getStreams() {
        return streams;
    }
}
