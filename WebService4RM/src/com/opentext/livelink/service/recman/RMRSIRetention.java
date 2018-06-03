
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMRSIRetention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMRSIRetention">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="RM_RetentionDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RM_RetentionMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMRSIRetention", propOrder = {
    "rmRetentionDays",
    "rmRetentionMode"
})
public class RMRSIRetention
    extends ServiceDataObject
{

    @XmlElement(name = "RM_RetentionDays", required = true, type = Integer.class, nillable = true)
    protected Integer rmRetentionDays;
    @XmlElement(name = "RM_RetentionMode", required = true, nillable = true)
    protected String rmRetentionMode;

    /**
     * Gets the value of the rmRetentionDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRMRetentionDays() {
        return rmRetentionDays;
    }

    /**
     * Sets the value of the rmRetentionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRMRetentionDays(Integer value) {
        this.rmRetentionDays = value;
    }

    /**
     * Gets the value of the rmRetentionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMRetentionMode() {
        return rmRetentionMode;
    }

    /**
     * Sets the value of the rmRetentionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMRetentionMode(String value) {
        this.rmRetentionMode = value;
    }

}
