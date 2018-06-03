
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
 *         &lt;element name="RMBatchUpdateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmBatchUpdateResult"
})
@XmlRootElement(name = "RMBatchUpdateResponse")
public class RMBatchUpdateResponse {

    @XmlElement(name = "RMBatchUpdateResult")
    protected boolean rmBatchUpdateResult;

    /**
     * Gets the value of the rmBatchUpdateResult property.
     * 
     */
    public boolean isRMBatchUpdateResult() {
        return rmBatchUpdateResult;
    }

    /**
     * Sets the value of the rmBatchUpdateResult property.
     * 
     */
    public void setRMBatchUpdateResult(boolean value) {
        this.rmBatchUpdateResult = value;
    }

}
