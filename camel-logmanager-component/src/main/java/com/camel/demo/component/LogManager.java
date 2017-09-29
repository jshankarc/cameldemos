package com.camel.demo.component;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;

import org.apache.camel.impl.UriEndpointComponent;

/**
 * Represents the component that manages {@link LogManagerEndPoint}.
 */
public class LogManager extends UriEndpointComponent {
    
    public LogManager() {
        super(LogManagerEndPoint.class);
    }

    public LogManager(CamelContext context) {
        super(context, LogManagerEndPoint.class);
    }

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new LogManagerEndPoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
