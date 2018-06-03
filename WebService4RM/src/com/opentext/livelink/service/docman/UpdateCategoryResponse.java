
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
 *         &lt;element name="UpdateCategoryResult" type="{urn:DocMan.service.livelink.opentext.com}AttributeGroupDefinition" minOccurs="0"/>
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
    "updateCategoryResult"
})
@XmlRootElement(name = "UpdateCategoryResponse")
public class UpdateCategoryResponse {

    @XmlElement(name = "UpdateCategoryResult")
    protected AttributeGroupDefinition updateCategoryResult;

    /**
     * Gets the value of the updateCategoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeGroupDefinition }
     *     
     */
    public AttributeGroupDefinition getUpdateCategoryResult() {
        return updateCategoryResult;
    }

    /**
     * Sets the value of the updateCategoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeGroupDefinition }
     *     
     */
    public void setUpdateCategoryResult(AttributeGroupDefinition value) {
        this.updateCategoryResult = value;
    }

}
