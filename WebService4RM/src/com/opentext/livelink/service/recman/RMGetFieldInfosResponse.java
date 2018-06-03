
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
 *         &lt;element name="RMGetFieldInfosResult" type="{urn:RecMan.service.livelink.opentext.com}RMAttributeGroupDefinition" minOccurs="0"/>
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
    "rmGetFieldInfosResult"
})
@XmlRootElement(name = "RMGetFieldInfosResponse")
public class RMGetFieldInfosResponse {

    @XmlElement(name = "RMGetFieldInfosResult")
    protected RMAttributeGroupDefinition rmGetFieldInfosResult;

    /**
     * Gets the value of the rmGetFieldInfosResult property.
     * 
     * @return
     *     possible object is
     *     {@link RMAttributeGroupDefinition }
     *     
     */
    public RMAttributeGroupDefinition getRMGetFieldInfosResult() {
        return rmGetFieldInfosResult;
    }

    /**
     * Sets the value of the rmGetFieldInfosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMAttributeGroupDefinition }
     *     
     */
    public void setRMGetFieldInfosResult(RMAttributeGroupDefinition value) {
        this.rmGetFieldInfosResult = value;
    }

}
