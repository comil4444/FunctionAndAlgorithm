
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
 *         &lt;element name="RMApplyProvenancesResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmApplyProvenancesResult"
})
@XmlRootElement(name = "RMApplyProvenancesResponse")
public class RMApplyProvenancesResponse {

    @XmlElement(name = "RMApplyProvenancesResult")
    protected boolean rmApplyProvenancesResult;

    /**
     * Gets the value of the rmApplyProvenancesResult property.
     * 
     */
    public boolean isRMApplyProvenancesResult() {
        return rmApplyProvenancesResult;
    }

    /**
     * Sets the value of the rmApplyProvenancesResult property.
     * 
     */
    public void setRMApplyProvenancesResult(boolean value) {
        this.rmApplyProvenancesResult = value;
    }

}
