
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
 *         &lt;element name="RMGetClassifyInfoResult" type="{urn:RecMan.service.livelink.opentext.com}RMAdditionalInfo" minOccurs="0"/>
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
    "rmGetClassifyInfoResult"
})
@XmlRootElement(name = "RMGetClassifyInfoResponse")
public class RMGetClassifyInfoResponse {

    @XmlElement(name = "RMGetClassifyInfoResult")
    protected RMAdditionalInfo rmGetClassifyInfoResult;

    /**
     * Gets the value of the rmGetClassifyInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link RMAdditionalInfo }
     *     
     */
    public RMAdditionalInfo getRMGetClassifyInfoResult() {
        return rmGetClassifyInfoResult;
    }

    /**
     * Sets the value of the rmGetClassifyInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMAdditionalInfo }
     *     
     */
    public void setRMGetClassifyInfoResult(RMAdditionalInfo value) {
        this.rmGetClassifyInfoResult = value;
    }

}
