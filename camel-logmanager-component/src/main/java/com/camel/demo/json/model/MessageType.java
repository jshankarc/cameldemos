//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.06 at 03:46:39 PM AST 
//


package com.camel.demo.json.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="procCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryChannel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loggingTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clientIp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="remotePort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="executionTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageType", propOrder = {
    "requestId",
    "procCode",
    "messageType",
    "deliveryChannel",
    "serviceName",
    "loggingTime",
    "clientIp",
    "remotePort",
    "executionTime",
    "data"
})
public class MessageType {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String procCode;
    @XmlElement(required = true)
    protected String messageType;
    @XmlElement(required = true)
    protected String deliveryChannel;
    @XmlElement(required = true)
    protected String serviceName;
    @XmlElement(required = true)
    protected String loggingTime;
    @XmlElement(required = true)
    protected String clientIp;
    @XmlElement(required = true)
    protected int remotePort;
    @XmlElement(required = true)
    protected int executionTime;
    @XmlElement(required = true)
    protected String data;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the procCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcCode() {
        return procCode;
    }

    /**
     * Sets the value of the procCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcCode(String value) {
        this.procCode = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the deliveryChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryChannel() {
        return deliveryChannel;
    }

    /**
     * Sets the value of the deliveryChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryChannel(String value) {
        this.deliveryChannel = value;
    }

    /**
     * Gets the value of the loggingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggingTime() {
        return loggingTime;
    }

    /**
     * Sets the value of the loggingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggingTime(String value) {
        this.loggingTime = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

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

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
 
	public int getRemotePort() {
		return remotePort;
	}

	public void setRemotePort(int remotePort) {
		this.remotePort = remotePort;
	}

	public int getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(int executionTime) {
		this.executionTime = executionTime;
	}

	@Override
	public String toString() {
		return "MessageType [requestId=" + requestId + ", procCode=" + procCode + ", messageType=" + messageType
				+ ", deliveryChannel=" + deliveryChannel + ", serviceName=" + serviceName + ", loggingTime="
				+ loggingTime + ", clientIp=" + clientIp + ", remotePort=" + remotePort + ", executionTime="
				+ executionTime + ", data=" + data + "]";
	}
}