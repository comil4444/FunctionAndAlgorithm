
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RMHoldInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMHoldInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="ActiveHold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlternateHoldID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApplyPatron" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateApplied" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateRemoved" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateToRemove" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EditPatron" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoldComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoldID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HoldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RemovalComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemovalPatron" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMHoldInfo", propOrder = {
    "activeHold",
    "alternateHoldID",
    "applyPatron",
    "dateApplied",
    "dateRemoved",
    "dateToRemove",
    "editDate",
    "editPatron",
    "holdComment",
    "holdID",
    "holdName",
    "holdType",
    "object",
    "parentID",
    "removalComment",
    "removalPatron"
})
public class RMHoldInfo
    extends ServiceDataObject
{

    @XmlElement(name = "ActiveHold", required = true, type = Integer.class, nillable = true)
    protected Integer activeHold;
    @XmlElement(name = "AlternateHoldID", required = true, nillable = true)
    protected String alternateHoldID;
    @XmlElement(name = "ApplyPatron", required = true, nillable = true)
    protected String applyPatron;
    @XmlElement(name = "DateApplied", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateApplied;
    @XmlElement(name = "DateRemoved", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRemoved;
    @XmlElement(name = "DateToRemove", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateToRemove;
    @XmlElement(name = "EditDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar editDate;
    @XmlElement(name = "EditPatron", required = true, nillable = true)
    protected String editPatron;
    @XmlElement(name = "HoldComment", required = true, nillable = true)
    protected String holdComment;
    @XmlElement(name = "HoldID", required = true, type = Long.class, nillable = true)
    protected Long holdID;
    @XmlElement(name = "HoldName")
    protected String holdName;
    @XmlElement(name = "HoldType")
    protected String holdType;
    @XmlElement(name = "OBJECT", required = true, nillable = true)
    protected String object;
    @XmlElement(name = "ParentID", required = true, type = Long.class, nillable = true)
    protected Long parentID;
    @XmlElement(name = "RemovalComment", required = true, nillable = true)
    protected String removalComment;
    @XmlElement(name = "RemovalPatron", required = true, nillable = true)
    protected String removalPatron;

    /**
     * Gets the value of the activeHold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActiveHold() {
        return activeHold;
    }

    /**
     * Sets the value of the activeHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActiveHold(Integer value) {
        this.activeHold = value;
    }

    /**
     * Gets the value of the alternateHoldID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateHoldID() {
        return alternateHoldID;
    }

    /**
     * Sets the value of the alternateHoldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateHoldID(String value) {
        this.alternateHoldID = value;
    }

    /**
     * Gets the value of the applyPatron property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyPatron() {
        return applyPatron;
    }

    /**
     * Sets the value of the applyPatron property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyPatron(String value) {
        this.applyPatron = value;
    }

    /**
     * Gets the value of the dateApplied property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateApplied() {
        return dateApplied;
    }

    /**
     * Sets the value of the dateApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateApplied(XMLGregorianCalendar value) {
        this.dateApplied = value;
    }

    /**
     * Gets the value of the dateRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRemoved() {
        return dateRemoved;
    }

    /**
     * Sets the value of the dateRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRemoved(XMLGregorianCalendar value) {
        this.dateRemoved = value;
    }

    /**
     * Gets the value of the dateToRemove property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateToRemove() {
        return dateToRemove;
    }

    /**
     * Sets the value of the dateToRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateToRemove(XMLGregorianCalendar value) {
        this.dateToRemove = value;
    }

    /**
     * Gets the value of the editDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEditDate() {
        return editDate;
    }

    /**
     * Sets the value of the editDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEditDate(XMLGregorianCalendar value) {
        this.editDate = value;
    }

    /**
     * Gets the value of the editPatron property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditPatron() {
        return editPatron;
    }

    /**
     * Sets the value of the editPatron property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditPatron(String value) {
        this.editPatron = value;
    }

    /**
     * Gets the value of the holdComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldComment() {
        return holdComment;
    }

    /**
     * Sets the value of the holdComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldComment(String value) {
        this.holdComment = value;
    }

    /**
     * Gets the value of the holdID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHoldID() {
        return holdID;
    }

    /**
     * Sets the value of the holdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHoldID(Long value) {
        this.holdID = value;
    }

    /**
     * Gets the value of the holdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldName() {
        return holdName;
    }

    /**
     * Sets the value of the holdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldName(String value) {
        this.holdName = value;
    }

    /**
     * Gets the value of the holdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldType() {
        return holdType;
    }

    /**
     * Sets the value of the holdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldType(String value) {
        this.holdType = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJECT() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJECT(String value) {
        this.object = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentID(Long value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the removalComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovalComment() {
        return removalComment;
    }

    /**
     * Sets the value of the removalComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovalComment(String value) {
        this.removalComment = value;
    }

    /**
     * Gets the value of the removalPatron property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovalPatron() {
        return removalPatron;
    }

    /**
     * Sets the value of the removalPatron property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovalPatron(String value) {
        this.removalPatron = value;
    }

}
