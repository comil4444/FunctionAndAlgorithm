
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
 *         &lt;element name="RMRemoveClassificationResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmRemoveClassificationResult"
})
@XmlRootElement(name = "RMRemoveClassificationResponse")
public class RMRemoveClassificationResponse {

    @XmlElement(name = "RMRemoveClassificationResult")
    protected boolean rmRemoveClassificationResult;

    /**
     * Gets the value of the rmRemoveClassificationResult property.
     * 
     */
    public boolean isRMRemoveClassificationResult() {
        return rmRemoveClassificationResult;
    }

    /**
     * Sets the value of the rmRemoveClassificationResult property.
     * 
     */
    public void setRMRemoveClassificationResult(boolean value) {
        this.rmRemoveClassificationResult = value;
    }

}
