package com.camel.demo.component;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.camel.demo.json.model.MessageType;
import com.camel.demo.syslog.SyslogMessageTransmitter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * The logmanager producer.
 */
public class LogManagerProducer extends DefaultProducer {

	private static final Logger log = LoggerFactory.getLogger(LogManagerProducer.class);

	private LogManagerEndPoint endpoint;

	public LogManagerProducer(LogManagerEndPoint endpoint) {
		super(endpoint);
		this.endpoint = endpoint;
	}

	public void process(Exchange exchange) throws Exception {
		
		log.debug("TransactionId : {}" , exchange.getProperty("transactionId",String.class));
		log.debug("ProcCode : {} " , exchange.getProperty("ProcCode", String.class));
		log.debug("Service Name : {} " , endpoint.getServiceName());
		log.debug("Message Type : {}" , endpoint.getMessageType());
		log.debug("Log Time : {}" , endpoint.getLogTime());
		
		MessageType messageType = new MessageType();
		messageType.setRequestId(exchange.getProperty("transactionId",String.class));
		messageType.setMessageType(endpoint.getMessageType());
		messageType.setServiceName(endpoint.getServiceName());
		messageType.setLoggingTime(endpoint.getLogTime());
		
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		log.debug("LogManager::JsonData {}" , gson.toJson(messageType));
		
		SyslogMessageTransmitter transmitter = new SyslogMessageTransmitter();
		transmitter.send(gson.toJson(messageType));
	}
}