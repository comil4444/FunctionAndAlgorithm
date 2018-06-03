
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="AddVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AttrSourceType" type="{urn:DocMan.service.livelink.opentext.com}AttributeSourceType"/>
 *         &lt;element name="CopyCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CurrentUserAsOwner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="KeepReservedState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="KeepVersionLocks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyOptions", propOrder = {
    "addVersion",
    "attrSourceType",
    "copyCurrent",
    "currentUserAsOwner",
    "keepReservedState",
    "keepVersionLocks"
})
public class CopyOptions
    extends ServiceDataObject
{

    @XmlElement(name = "AddVersion")
    protected boolean addVersion;
    @XmlElement(name = "AttrSourceType", required = true)
    protected AttributeSourceType attrSourceType;
    @XmlElement(name = "CopyCurrent")
    protected boolean copyCurrent;
    @XmlElement(name = "CurrentUserAsOwner")
    protected boolean currentUserAsOwner;
    @XmlElement(name = "KeepReservedState")
    protected boolean keepReservedState;
    @XmlElement(name = "KeepVersionLocks")
    protected boolean keepVersionLocks;

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
     * Gets the value of the copyCurrent property.
     * 
     */
    public boolean isCopyCurrent() {
        return copyCurrent;
    }

    /**
     * Sets the value of the copyCurrent property.
     * 
     */
    public void setCopyCurrent(boolean value) {
        this.copyCurrent = value;
    }

    /**
     * Gets the value of the currentUserAsOwner property.
     * 
     */
    public boolean isCurrentUserAsOwner() {
        return currentUserAsOwner;
    }

    /**
     * Sets the value of the currentUserAsOwner property.
     * 
     */
    public void setCurrentUserAsOwner(boolean value) {
        this.currentUserAsOwner = value;
    }

    /**
     * Gets the value of the keepReservedState property.
     * 
     */
    public boolean isKeepReservedState() {
        return keepReservedState;
    }

    /**
     * Sets the value of the keepReservedState property.
     * 
     */
    public void setKeepReservedState(boolean value) {
        this.keepReservedState = value;
    }

    /**
     * Gets the value of the keepVersionLocks property.
     * 
     */
    public boolean isKeepVersionLocks() {
        return keepVersionLocks;
    }

    /**
     * Sets the value of the keepVersionLocks property.
     * 
     */
    public void setKeepVersionLocks(boolean value) {
        this.keepVersionLocks = value;
    }

}
