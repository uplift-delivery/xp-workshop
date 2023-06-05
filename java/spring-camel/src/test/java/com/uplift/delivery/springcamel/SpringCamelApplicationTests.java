package com.uplift.delivery.springcamel;

import com.uplift.delivery.springcamel.products.ProductsRouter;
import org.apache.camel.EndpointInject;
import org.apache.camel.ExchangeProperties;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.apache.camel.test.spring.junit5.MockEndpoints;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CamelSpringBootTest
@MockEndpoints("direct:end")
class SpringCamelApplicationTests {
    @Autowired
    private ProducerTemplate template;

    @EndpointInject("mock:direct:end")
    private MockEndpoint mock;

    @Test
    public void testReceive() throws Exception {
        mock.expectedBodiesReceived("Hello");

        template.sendBody(ProductsRouter.From, "Hello");

        mock.assertIsSatisfied();
    }
}
