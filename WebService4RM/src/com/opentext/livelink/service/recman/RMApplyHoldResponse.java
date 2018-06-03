
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
 *         &lt;element name="RMApplyHoldResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmApplyHoldResult"
})
@XmlRootElement(name = "RMApplyHoldResponse")
public class RMApplyHoldResponse {

    @XmlElement(name = "RMApplyHoldResult")
    protected boolean rmApplyHoldResult;

    /**
     * Gets the value of the rmApplyHoldResult property.
     * 
     */
    public boolean isRMApplyHoldResult() {
        return rmApplyHoldResult;
    }

    /**
     * Sets the value of the rmApplyHoldResult property.
     * 
     */
    public void setRMApplyHoldResult(boolean value) {
        this.rmApplyHoldResult = value;
    }

}
