
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
 *         &lt;element name="RMDeleteHoldResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmDeleteHoldResult"
})
@XmlRootElement(name = "RMDeleteHoldResponse")
public class RMDeleteHoldResponse {

    @XmlElement(name = "RMDeleteHoldResult")
    protected boolean rmDeleteHoldResult;

    /**
     * Gets the value of the rmDeleteHoldResult property.
     * 
     */
    public boolean isRMDeleteHoldResult() {
        return rmDeleteHoldResult;
    }

    /**
     * Sets the value of the rmDeleteHoldResult property.
     * 
     */
    public void setRMDeleteHoldResult(boolean value) {
        this.rmDeleteHoldResult = value;
    }

}
