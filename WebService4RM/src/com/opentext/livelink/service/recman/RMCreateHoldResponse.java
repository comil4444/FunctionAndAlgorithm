
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
 *         &lt;element name="RMCreateHoldResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmCreateHoldResult"
})
@XmlRootElement(name = "RMCreateHoldResponse")
public class RMCreateHoldResponse {

    @XmlElement(name = "RMCreateHoldResult")
    protected boolean rmCreateHoldResult;

    /**
     * Gets the value of the rmCreateHoldResult property.
     * 
     */
    public boolean isRMCreateHoldResult() {
        return rmCreateHoldResult;
    }

    /**
     * Sets the value of the rmCreateHoldResult property.
     * 
     */
    public void setRMCreateHoldResult(boolean value) {
        this.rmCreateHoldResult = value;
    }

}
