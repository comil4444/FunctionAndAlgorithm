
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMDocXRefTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMDocXRefTyp">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocXRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMDocXRefTyp", propOrder = {
    "description",
    "docXRef",
    "relatedCode"
})
public class RMDocXRefTyp
    extends ServiceDataObject
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DocXRef")
    protected String docXRef;
    @XmlElement(name = "RelatedCode")
    protected String relatedCode;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the docXRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocXRef() {
        return docXRef;
    }

    /**
     * Sets the value of the docXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocXRef(String value) {
        this.docXRef = value;
    }

    /**
     * Gets the value of the relatedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedCode() {
        return relatedCode;
    }

    /**
     * Sets the value of the relatedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedCode(String value) {
        this.relatedCode = value;
    }

}
