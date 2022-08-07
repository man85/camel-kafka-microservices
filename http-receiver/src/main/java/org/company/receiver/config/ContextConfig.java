package org.company.receiver.config;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class ContextConfig {

    public static CamelContext build() {
        CamelContext camelContext = new DefaultCamelContext();
        camelContext.getPropertiesComponent().setLocation("classpath:application.yml");
        try {
            camelContext.addRoutes(new RouteBuilderConfig());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return camelContext;
    }


}
