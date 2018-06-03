
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMRSI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMRSI">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMRSI", propOrder = {
    "description",
    "rsi"
})
public class RMRSI
    extends ServiceDataObject
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "RSI")
    protected String rsi;

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
     * Gets the value of the rsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSI() {
        return rsi;
    }

    /**
     * Sets the value of the rsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSI(String value) {
        this.rsi = value;
    }

}
