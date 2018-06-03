
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMGetRSIRetentionResult" type="{urn:RecMan.service.livelink.opentext.com}RMRSIRetention" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rmGetRSIRetentionResult"
})
@XmlRootElement(name = "RMGetRSIRetentionResponse")
public class RMGetRSIRetentionResponse {

    @XmlElement(name = "RMGetRSIRetentionResult")
    protected RMRSIRetention rmGetRSIRetentionResult;

    /**
     * Gets the value of the rmGetRSIRetentionResult property.
     * 
     * @return
     *     possible object is
     *     {@link RMRSIRetention }
     *     
     */
    public RMRSIRetention getRMGetRSIRetentionResult() {
        return rmGetRSIRetentionResult;
    }

    /**
     * Sets the value of the rmGetRSIRetentionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMRSIRetention }
     *     
     */
    public void setRMGetRSIRetentionResult(RMRSIRetention value) {
        this.rmGetRSIRetentionResult = value;
    }

}
