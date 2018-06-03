
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RMHoldDocInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMHoldDocInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="ActiveHold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ApplyPatron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateApplied" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocDataID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DocName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocParentID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DocSubType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoldComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HoldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMHoldDocInfo", propOrder = {
    "activeHold",
    "applyPatron",
    "dateApplied",
    "docDataID",
    "docName",
    "docParentID",
    "docSubType",
    "holdComment",
    "holdID",
    "holdName",
    "holdType"
})
public class RMHoldDocInfo
    extends ServiceDataObject
{

    @XmlElement(name = "ActiveHold", required = true, type = Integer.class, nillable = true)
    protected Integer activeHold;
    @XmlElement(name = "ApplyPatron")
    protected String applyPatron;
    @XmlElement(name = "DateApplied", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateApplied;
    @XmlElement(name = "DocDataID", required = true, type = Long.class, nillable = true)
    protected Long docDataID;
    @XmlElement(name = "DocName")
    protected String docName;
    @XmlElement(name = "DocParentID", required = true, type = Long.class, nillable = true)
    protected Long docParentID;
    @XmlElement(name = "DocSubType", required = true, type = Integer.class, nillable = true)
    protected Integer docSubType;
    @XmlElement(name = "HoldComment")
    protected String holdComment;
    @XmlElement(name = "HoldID", required = true, type = Long.class, nillable = true)
    protected Long holdID;
    @XmlElement(name = "HoldName")
    protected String holdName;
    @XmlElement(name = "HoldType")
    protected String holdType;

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
     * Gets the value of the docDataID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocDataID() {
        return docDataID;
    }

    /**
     * Sets the value of the docDataID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocDataID(Long value) {
        this.docDataID = value;
    }

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * Gets the value of the docParentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocParentID() {
        return docParentID;
    }

    /**
     * Sets the value of the docParentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocParentID(Long value) {
        this.docParentID = value;
    }

    /**
     * Gets the value of the docSubType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocSubType() {
        return docSubType;
    }

    /**
     * Sets the value of the docSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocSubType(Integer value) {
        this.docSubType = value;
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

}
