
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
 *         &lt;element name="RMUpdateDetailsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmUpdateDetailsResult"
})
@XmlRootElement(name = "RMUpdateDetailsResponse")
public class RMUpdateDetailsResponse {

    @XmlElement(name = "RMUpdateDetailsResult")
    protected boolean rmUpdateDetailsResult;

    /**
     * Gets the value of the rmUpdateDetailsResult property.
     * 
     */
    public boolean isRMUpdateDetailsResult() {
        return rmUpdateDetailsResult;
    }

    /**
     * Sets the value of the rmUpdateDetailsResult property.
     * 
     */
    public void setRMUpdateDetailsResult(boolean value) {
        this.rmUpdateDetailsResult = value;
    }

}
