package com.camel.demo.syslog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloudbees.syslog.Facility;
import com.cloudbees.syslog.MessageFormat;
import com.cloudbees.syslog.Severity;
import com.cloudbees.syslog.sender.TcpSyslogMessageSender;

public class SyslogMessageTransmitter {

	private static final Logger log = LoggerFactory.getLogger(SyslogMessageTransmitter.class);
	
	private static String ipAddress;
	private static int port;
	
	public void send(final String message) {
		
		TcpSyslogMessageSender messageSender = new TcpSyslogMessageSender();
		messageSender.setDefaultFacility(Facility.LOCAL0);
		messageSender.setDefaultSeverity(Severity.INFORMATIONAL);
		//to run the Junit, change the Ip address and port of the syslog server
		messageSender.setSyslogServerHostname("localhost");
		messageSender.setSyslogServerPort(2053);
		messageSender.setMessageFormat(MessageFormat.RFC_3164);
		messageSender.setSsl(false);
		messageSender.setMaxRetryCount(3);
		try {
			messageSender.sendMessage(message);
		} catch (Exception exception) {
			log.error("LogManager::Exception while connecting to Rsyslog : {}" , exception.getMessage());
		}
		log.debug("SyslogMessageTransmitter::MessagePushed {}" , messageSender.toString());
	}
	
	
	public void initializeConfigValues(){
		log.info("logmanager::bean-initalizer IP : {} :: Port : {}" , ipAddress , port);
	}
	
	public static String getIpAddress() {
		return ipAddress;
	}
	
	public static void setIpAddress(String ipAddress) {
		SyslogMessageTransmitter.ipAddress = ipAddress;
	}
	
	public static int getPort() {
		return port;
	}
	
	public static void setPort(int port) {
		SyslogMessageTransmitter.port = port;
	}
}