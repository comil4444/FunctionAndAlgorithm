
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
 *         &lt;element name="AddMajorVersionContextResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "addMajorVersionContextResult"
})
@XmlRootElement(name = "AddMajorVersionContextResponse")
public class AddMajorVersionContextResponse {

    @XmlElement(name = "AddMajorVersionContextResult")
    protected String addMajorVersionContextResult;

    /**
     * Gets the value of the addMajorVersionContextResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddMajorVersionContextResult() {
        return addMajorVersionContextResult;
    }

    /**
     * Sets the value of the addMajorVersionContextResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddMajorVersionContextResult(String value) {
        this.addMajorVersionContextResult = value;
    }

}
