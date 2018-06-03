
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
 *         &lt;element name="RMGetCodesResult" type="{urn:RecMan.service.livelink.opentext.com}RMCodesInfo" minOccurs="0"/>
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
    "rmGetCodesResult"
})
@XmlRootElement(name = "RMGetCodesResponse")
public class RMGetCodesResponse {

    @XmlElement(name = "RMGetCodesResult")
    protected RMCodesInfo rmGetCodesResult;

    /**
     * Gets the value of the rmGetCodesResult property.
     * 
     * @return
     *     possible object is
     *     {@link RMCodesInfo }
     *     
     */
    public RMCodesInfo getRMGetCodesResult() {
        return rmGetCodesResult;
    }

    /**
     * Sets the value of the rmGetCodesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMCodesInfo }
     *     
     */
    public void setRMGetCodesResult(RMCodesInfo value) {
        this.rmGetCodesResult = value;
    }

}
