
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
 *         &lt;element name="RMApplySecondaryClassificationResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmApplySecondaryClassificationResult"
})
@XmlRootElement(name = "RMApplySecondaryClassificationResponse")
public class RMApplySecondaryClassificationResponse {

    @XmlElement(name = "RMApplySecondaryClassificationResult")
    protected boolean rmApplySecondaryClassificationResult;

    /**
     * Gets the value of the rmApplySecondaryClassificationResult property.
     * 
     */
    public boolean isRMApplySecondaryClassificationResult() {
        return rmApplySecondaryClassificationResult;
    }

    /**
     * Sets the value of the rmApplySecondaryClassificationResult property.
     * 
     */
    public void setRMApplySecondaryClassificationResult(boolean value) {
        this.rmApplySecondaryClassificationResult = value;
    }

}
