
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
 *         &lt;element name="HoldRetrieveItemsResult" type="{urn:RecMan.service.livelink.opentext.com}HoldPage" minOccurs="0"/>
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
    "holdRetrieveItemsResult"
})
@XmlRootElement(name = "HoldRetrieveItemsResponse")
public class HoldRetrieveItemsResponse {

    @XmlElement(name = "HoldRetrieveItemsResult")
    protected HoldPage holdRetrieveItemsResult;

    /**
     * Gets the value of the holdRetrieveItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link HoldPage }
     *     
     */
    public HoldPage getHoldRetrieveItemsResult() {
        return holdRetrieveItemsResult;
    }

    /**
     * Sets the value of the holdRetrieveItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldPage }
     *     
     */
    public void setHoldRetrieveItemsResult(HoldPage value) {
        this.holdRetrieveItemsResult = value;
    }

}
