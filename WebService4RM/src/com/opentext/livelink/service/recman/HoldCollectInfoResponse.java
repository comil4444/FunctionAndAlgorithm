
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
 *         &lt;element name="HoldCollectInfoResult" type="{urn:RecMan.service.livelink.opentext.com}HoldDistribution" minOccurs="0"/>
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
    "holdCollectInfoResult"
})
@XmlRootElement(name = "HoldCollectInfoResponse")
public class HoldCollectInfoResponse {

    @XmlElement(name = "HoldCollectInfoResult")
    protected HoldDistribution holdCollectInfoResult;

    /**
     * Gets the value of the holdCollectInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link HoldDistribution }
     *     
     */
    public HoldDistribution getHoldCollectInfoResult() {
        return holdCollectInfoResult;
    }

    /**
     * Sets the value of the holdCollectInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldDistribution }
     *     
     */
    public void setHoldCollectInfoResult(HoldDistribution value) {
        this.holdCollectInfoResult = value;
    }

}
