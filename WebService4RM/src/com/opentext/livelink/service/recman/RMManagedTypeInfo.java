
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMManagedTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMManagedTypeInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMManagedTypeInfo", propOrder = {
    "subType"
})
public class RMManagedTypeInfo
    extends ServiceDataObject
{

    @XmlElement(name = "SubType")
    protected int subType;

    /**
     * Gets the value of the subType property.
     * 
     */
    public int getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     */
    public void setSubType(int value) {
        this.subType = value;
    }

}
