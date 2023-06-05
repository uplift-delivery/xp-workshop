package com.uplift.delivery.springcamel.products;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProductsRouter extends RouteBuilder {
    public static final String From = "direct:start";
    public static final String To = "direct:end";

    @Override
    public void configure() throws Exception {
        from(From)
                .routeId("direct-start")
                .tracing()
                .log("Received Body: ${body}")
                .setBody(constant("Hello"))
                .to(To);
    }
}
