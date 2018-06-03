
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
 *         &lt;element name="RMBatchMarkOfficialResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmBatchMarkOfficialResult"
})
@XmlRootElement(name = "RMBatchMarkOfficialResponse")
public class RMBatchMarkOfficialResponse {

    @XmlElement(name = "RMBatchMarkOfficialResult")
    protected boolean rmBatchMarkOfficialResult;

    /**
     * Gets the value of the rmBatchMarkOfficialResult property.
     * 
     */
    public boolean isRMBatchMarkOfficialResult() {
        return rmBatchMarkOfficialResult;
    }

    /**
     * Sets the value of the rmBatchMarkOfficialResult property.
     * 
     */
    public void setRMBatchMarkOfficialResult(boolean value) {
        this.rmBatchMarkOfficialResult = value;
    }

}
