
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
 *         &lt;element name="HoldInfo" type="{urn:RecMan.service.livelink.opentext.com}RMHoldInfo" minOccurs="0"/>
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
    "holdInfo"
})
@XmlRootElement(name = "RMCreateHold")
public class RMCreateHold {

    @XmlElement(name = "HoldInfo")
    protected RMHoldInfo holdInfo;

    /**
     * Gets the value of the holdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RMHoldInfo }
     *     
     */
    public RMHoldInfo getHoldInfo() {
        return holdInfo;
    }

    /**
     * Sets the value of the holdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMHoldInfo }
     *     
     */
    public void setHoldInfo(RMHoldInfo value) {
        this.holdInfo = value;
    }

}
