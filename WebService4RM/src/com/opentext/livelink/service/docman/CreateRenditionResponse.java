
package com.opentext.livelink.service.docman;

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
 *         &lt;element name="CreateRenditionResult" type="{urn:DocMan.service.livelink.opentext.com}Version" minOccurs="0"/>
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
    "createRenditionResult"
})
@XmlRootElement(name = "CreateRenditionResponse")
public class CreateRenditionResponse {

    @XmlElement(name = "CreateRenditionResult")
    protected Version createRenditionResult;

    /**
     * Gets the value of the createRenditionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getCreateRenditionResult() {
        return createRenditionResult;
    }

    /**
     * Sets the value of the createRenditionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setCreateRenditionResult(Version value) {
        this.createRenditionResult = value;
    }

}
