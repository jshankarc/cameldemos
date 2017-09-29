package com.camel.demo.test;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogManagerTest extends CamelTestSupport {
	
    @Test
    public void testMy() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMinimumMessageCount(1);       
        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                from("file:src/temp?noop=true")
                	.setProperty("transactionId", simple("${exchangeId}"))
                	.convertBodyTo(java.lang.String.class)
                	.loop(1)
            			.toD("logmanager://log?serviceName=camel-log-demo&messageType=Rq&logTime=$simple{date:now:yyMMddHHmmssSSS}")
            			.delay().constant("100")
            		.end()
            		.log("finished ${body}")
                  	.to("mock:result");
            }
        };
    }
}
