
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
 *         &lt;element name="RMDeclareRecordResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmDeclareRecordResult"
})
@XmlRootElement(name = "RMDeclareRecordResponse")
public class RMDeclareRecordResponse {

    @XmlElement(name = "RMDeclareRecordResult")
    protected boolean rmDeclareRecordResult;

    /**
     * Gets the value of the rmDeclareRecordResult property.
     * 
     */
    public boolean isRMDeclareRecordResult() {
        return rmDeclareRecordResult;
    }

    /**
     * Sets the value of the rmDeclareRecordResult property.
     * 
     */
    public void setRMDeclareRecordResult(boolean value) {
        this.rmDeclareRecordResult = value;
    }

}
