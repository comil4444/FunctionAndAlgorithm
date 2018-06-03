
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="AddVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AttrSourceType" type="{urn:DocMan.service.livelink.opentext.com}AttributeSourceType"/>
 *         &lt;element name="ForceInheritPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveOptions", propOrder = {
    "addVersion",
    "attrSourceType",
    "forceInheritPermissions"
})
public class MoveOptions
    extends ServiceDataObject
{

    @XmlElement(name = "AddVersion")
    protected boolean addVersion;
    @XmlElement(name = "AttrSourceType", required = true)
    protected AttributeSourceType attrSourceType;
    @XmlElement(name = "ForceInheritPermissions")
    protected boolean forceInheritPermissions;

    /**
     * Gets the value of the addVersion property.
     * 
     */
    public boolean isAddVersion() {
        return addVersion;
    }

    /**
     * Sets the value of the addVersion property.
     * 
     */
    public void setAddVersion(boolean value) {
        this.addVersion = value;
    }

    /**
     * Gets the value of the attrSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSourceType }
     *     
     */
    public AttributeSourceType getAttrSourceType() {
        return attrSourceType;
    }

    /**
     * Sets the value of the attrSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSourceType }
     *     
     */
    public void setAttrSourceType(AttributeSourceType value) {
        this.attrSourceType = value;
    }

    /**
     * Gets the value of the forceInheritPermissions property.
     * 
     */
    public boolean isForceInheritPermissions() {
        return forceInheritPermissions;
    }

    /**
     * Sets the value of the forceInheritPermissions property.
     * 
     */
    public void setForceInheritPermissions(boolean value) {
        this.forceInheritPermissions = value;
    }

}
