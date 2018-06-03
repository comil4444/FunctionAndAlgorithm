
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
 *         &lt;element name="GetAttributeGroupDefinitionResult" type="{urn:DocMan.service.livelink.opentext.com}AttributeGroupDefinition" minOccurs="0"/>
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
    "getAttributeGroupDefinitionResult"
})
@XmlRootElement(name = "GetAttributeGroupDefinitionResponse")
public class GetAttributeGroupDefinitionResponse {

    @XmlElement(name = "GetAttributeGroupDefinitionResult")
    protected AttributeGroupDefinition getAttributeGroupDefinitionResult;

    /**
     * Gets the value of the getAttributeGroupDefinitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeGroupDefinition }
     *     
     */
    public AttributeGroupDefinition getGetAttributeGroupDefinitionResult() {
        return getAttributeGroupDefinitionResult;
    }

    /**
     * Sets the value of the getAttributeGroupDefinitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeGroupDefinition }
     *     
     */
    public void setGetAttributeGroupDefinitionResult(AttributeGroupDefinition value) {
        this.getAttributeGroupDefinitionResult = value;
    }

}
