
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
 *         &lt;element name="RMRemoveHoldResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmRemoveHoldResult"
})
@XmlRootElement(name = "RMRemoveHoldResponse")
public class RMRemoveHoldResponse {

    @XmlElement(name = "RMRemoveHoldResult")
    protected boolean rmRemoveHoldResult;

    /**
     * Gets the value of the rmRemoveHoldResult property.
     * 
     */
    public boolean isRMRemoveHoldResult() {
        return rmRemoveHoldResult;
    }

    /**
     * Sets the value of the rmRemoveHoldResult property.
     * 
     */
    public void setRMRemoveHoldResult(boolean value) {
        this.rmRemoveHoldResult = value;
    }

}
