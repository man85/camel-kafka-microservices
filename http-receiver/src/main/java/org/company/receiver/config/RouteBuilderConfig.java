package org.company.receiver.config;

import org.apache.camel.builder.RouteBuilder;

public class RouteBuilderConfig extends RouteBuilder {

    public void configure() {
        from("jetty:{{inbound.url}}")
                .log(">>>> ${body}")
                .to("kafka:{{consumer.topic}}?brokers={{broker}}");
    }

}
