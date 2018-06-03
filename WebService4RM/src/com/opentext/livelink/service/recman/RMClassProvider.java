
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMClassProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMClassProvider">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LogicalArchive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMClassProvider", propOrder = {
    "classID",
    "logicalArchive"
})
public class RMClassProvider
    extends ServiceDataObject
{

    @XmlElement(name = "ClassID")
    protected int classID;
    @XmlElement(name = "LogicalArchive")
    protected String logicalArchive;

    /**
     * Gets the value of the classID property.
     * 
     */
    public int getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     */
    public void setClassID(int value) {
        this.classID = value;
    }

    /**
     * Gets the value of the logicalArchive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalArchive() {
        return logicalArchive;
    }

    /**
     * Sets the value of the logicalArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalArchive(String value) {
        this.logicalArchive = value;
    }

}
