package org.example;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
//        Main main = new Main();
//        main.configure().addRoutesBuilder(new MyRouteBuilder());
//        main.run(args);
//
        CamelContext camelContext = new DefaultCamelContext();
        camelContext.getPropertiesComponent().setLocation("classpath:application.yml");
        camelContext.addRoutes(new MyRouteBuilder());
        setUpKafkaComponent(camelContext);
        camelContext.start();
    }

    private static void setUpKafkaComponent(CamelContext camelContext) {
//        ComponentsBuilderFactory.kafka()
//                .brokers("{{kafka.brokers}}")
//                .register(camelContext, "kafka");
    }

}

