
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
 *         &lt;element name="RMRemoveOfficialResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmRemoveOfficialResult"
})
@XmlRootElement(name = "RMRemoveOfficialResponse")
public class RMRemoveOfficialResponse {

    @XmlElement(name = "RMRemoveOfficialResult")
    protected boolean rmRemoveOfficialResult;

    /**
     * Gets the value of the rmRemoveOfficialResult property.
     * 
     */
    public boolean isRMRemoveOfficialResult() {
        return rmRemoveOfficialResult;
    }

    /**
     * Sets the value of the rmRemoveOfficialResult property.
     * 
     */
    public void setRMRemoveOfficialResult(boolean value) {
        this.rmRemoveOfficialResult = value;
    }

}
