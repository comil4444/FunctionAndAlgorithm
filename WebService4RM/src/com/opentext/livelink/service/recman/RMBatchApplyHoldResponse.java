
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
 *         &lt;element name="RMBatchApplyHoldResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmBatchApplyHoldResult"
})
@XmlRootElement(name = "RMBatchApplyHoldResponse")
public class RMBatchApplyHoldResponse {

    @XmlElement(name = "RMBatchApplyHoldResult")
    protected boolean rmBatchApplyHoldResult;

    /**
     * Gets the value of the rmBatchApplyHoldResult property.
     * 
     */
    public boolean isRMBatchApplyHoldResult() {
        return rmBatchApplyHoldResult;
    }

    /**
     * Sets the value of the rmBatchApplyHoldResult property.
     * 
     */
    public void setRMBatchApplyHoldResult(boolean value) {
        this.rmBatchApplyHoldResult = value;
    }

}
