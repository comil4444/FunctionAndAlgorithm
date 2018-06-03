
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
 *         &lt;element name="GetCategoryTemplateResult" type="{urn:DocMan.service.livelink.opentext.com}AttributeGroup" minOccurs="0"/>
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
    "getCategoryTemplateResult"
})
@XmlRootElement(name = "GetCategoryTemplateResponse")
public class GetCategoryTemplateResponse {

    @XmlElement(name = "GetCategoryTemplateResult")
    protected AttributeGroup getCategoryTemplateResult;

    /**
     * Gets the value of the getCategoryTemplateResult property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeGroup }
     *     
     */
    public AttributeGroup getGetCategoryTemplateResult() {
        return getCategoryTemplateResult;
    }

    /**
     * Sets the value of the getCategoryTemplateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeGroup }
     *     
     */
    public void setGetCategoryTemplateResult(AttributeGroup value) {
        this.getCategoryTemplateResult = value;
    }

}
