package com.camel.demo.component;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;

/**
 * Represents a logmanger  endpoint.
 */
public class LogManagerEndPoint extends DefaultEndpoint {
    
    private String serviceName;
    private String messageType;
    private String logTime;
	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}
	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	/**
	 * @return the messageType
	 */
	public String getMessageType() {
		return messageType;
	}
	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	/**
	 * @return the logTime
	 */
	public String getLogTime() {
		return logTime;
	}
	
	/**
	 * @param logTime the logTime to set
	 */
	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}
	
	
	public LogManagerEndPoint() {
    }

    public LogManagerEndPoint(String uri, LogManager component) {
        super(uri, component);
    }

    public LogManagerEndPoint(String endpointUri) {
        super(endpointUri);
    }

    public Producer createProducer() throws Exception {
        return new LogManagerProducer(this);
    }

    public boolean isSingleton() {
        return true;
    }

	public Consumer createConsumer(Processor arg0) throws Exception {
		 return null;
	}
 }
