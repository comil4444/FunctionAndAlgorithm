
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
 *         &lt;element name="RMMarkOfficialResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmMarkOfficialResult"
})
@XmlRootElement(name = "RMMarkOfficialResponse")
public class RMMarkOfficialResponse {

    @XmlElement(name = "RMMarkOfficialResult")
    protected boolean rmMarkOfficialResult;

    /**
     * Gets the value of the rmMarkOfficialResult property.
     * 
     */
    public boolean isRMMarkOfficialResult() {
        return rmMarkOfficialResult;
    }

    /**
     * Sets the value of the rmMarkOfficialResult property.
     * 
     */
    public void setRMMarkOfficialResult(boolean value) {
        this.rmMarkOfficialResult = value;
    }

}
