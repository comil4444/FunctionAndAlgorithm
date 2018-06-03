
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
 *         &lt;element name="RMGetClassificationRootResult" type="{urn:RecMan.service.livelink.opentext.com}RMClassDefInfo" minOccurs="0"/>
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
    "rmGetClassificationRootResult"
})
@XmlRootElement(name = "RMGetClassificationRootResponse")
public class RMGetClassificationRootResponse {

    @XmlElement(name = "RMGetClassificationRootResult")
    protected RMClassDefInfo rmGetClassificationRootResult;

    /**
     * Gets the value of the rmGetClassificationRootResult property.
     * 
     * @return
     *     possible object is
     *     {@link RMClassDefInfo }
     *     
     */
    public RMClassDefInfo getRMGetClassificationRootResult() {
        return rmGetClassificationRootResult;
    }

    /**
     * Sets the value of the rmGetClassificationRootResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMClassDefInfo }
     *     
     */
    public void setRMGetClassificationRootResult(RMClassDefInfo value) {
        this.rmGetClassificationRootResult = value;
    }

}
