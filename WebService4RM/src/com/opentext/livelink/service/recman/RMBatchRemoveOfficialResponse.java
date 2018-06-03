
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
 *         &lt;element name="RMBatchRemoveOfficialResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmBatchRemoveOfficialResult"
})
@XmlRootElement(name = "RMBatchRemoveOfficialResponse")
public class RMBatchRemoveOfficialResponse {

    @XmlElement(name = "RMBatchRemoveOfficialResult")
    protected boolean rmBatchRemoveOfficialResult;

    /**
     * Gets the value of the rmBatchRemoveOfficialResult property.
     * 
     */
    public boolean isRMBatchRemoveOfficialResult() {
        return rmBatchRemoveOfficialResult;
    }

    /**
     * Sets the value of the rmBatchRemoveOfficialResult property.
     * 
     */
    public void setRMBatchRemoveOfficialResult(boolean value) {
        this.rmBatchRemoveOfficialResult = value;
    }

}
