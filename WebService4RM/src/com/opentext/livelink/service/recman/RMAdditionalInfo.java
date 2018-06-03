
package com.opentext.livelink.service.recman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RMAdditionalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMAdditionalInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Accession" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Addressee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CyclePeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Essential" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Establishment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NextReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Official" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OfficialRemove" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Originator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReceivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RMClassDefInfo" type="{urn:RecMan.service.livelink.opentext.com}RMClassDefInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RM_RetentionDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RM_RetentionMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RSI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SentTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Storage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMAdditionalInfo", propOrder = {
    "accession",
    "addressee",
    "classID",
    "cyclePeriod",
    "docDate",
    "essential",
    "establishment",
    "lastReviewDate",
    "nextReviewDate",
    "official",
    "officialRemove",
    "originator",
    "receivedDate",
    "rmClassDefInfo",
    "rmRetentionDays",
    "rmRetentionMode",
    "rsi",
    "sentTo",
    "status",
    "statusDate",
    "storage",
    "subject"
})
public class RMAdditionalInfo
    extends ServiceDataObject
{

    @XmlElement(name = "Accession", required = true, nillable = true)
    protected String accession;
    @XmlElement(name = "Addressee", required = true, nillable = true)
    protected String addressee;
    @XmlElement(name = "ClassID", required = true, type = Long.class, nillable = true)
    protected Long classID;
    @XmlElement(name = "CyclePeriod", required = true, type = Integer.class, nillable = true)
    protected Integer cyclePeriod;
    @XmlElement(name = "DocDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "Essential", required = true, nillable = true)
    protected String essential;
    @XmlElement(name = "Establishment", required = true, nillable = true)
    protected String establishment;
    @XmlElement(name = "LastReviewDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReviewDate;
    @XmlElement(name = "NextReviewDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextReviewDate;
    @XmlElement(name = "Official", required = true, type = Boolean.class, nillable = true)
    protected Boolean official;
    @XmlElement(name = "OfficialRemove", required = true, type = Boolean.class, nillable = true)
    protected Boolean officialRemove;
    @XmlElement(name = "Originator", required = true, nillable = true)
    protected String originator;
    @XmlElement(name = "ReceivedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDate;
    @XmlElement(name = "RMClassDefInfo")
    protected List<RMClassDefInfo> rmClassDefInfo;
    @XmlElement(name = "RM_RetentionDays", required = true, type = Integer.class, nillable = true)
    protected Integer rmRetentionDays;
    @XmlElement(name = "RM_RetentionMode", required = true, nillable = true)
    protected String rmRetentionMode;
    @XmlElement(name = "RSI", required = true, nillable = true)
    protected String rsi;
    @XmlElement(name = "SentTo", required = true, nillable = true)
    protected String sentTo;
    @XmlElement(name = "Status", required = true, nillable = true)
    protected String status;
    @XmlElement(name = "StatusDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(name = "Storage", required = true, nillable = true)
    protected String storage;
    @XmlElement(name = "Subject", required = true, nillable = true)
    protected String subject;

    /**
     * Gets the value of the accession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccession() {
        return accession;
    }

    /**
     * Sets the value of the accession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccession(String value) {
        this.accession = value;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressee(String value) {
        this.addressee = value;
    }

    /**
     * Gets the value of the classID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClassID(Long value) {
        this.classID = value;
    }

    /**
     * Gets the value of the cyclePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCyclePeriod() {
        return cyclePeriod;
    }

    /**
     * Sets the value of the cyclePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCyclePeriod(Integer value) {
        this.cyclePeriod = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the essential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssential() {
        return essential;
    }

    /**
     * Sets the value of the essential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssential(String value) {
        this.essential = value;
    }

    /**
     * Gets the value of the establishment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishment() {
        return establishment;
    }

    /**
     * Sets the value of the establishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishment(String value) {
        this.establishment = value;
    }

    /**
     * Gets the value of the lastReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReviewDate() {
        return lastReviewDate;
    }

    /**
     * Sets the value of the lastReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReviewDate(XMLGregorianCalendar value) {
        this.lastReviewDate = value;
    }

    /**
     * Gets the value of the nextReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextReviewDate() {
        return nextReviewDate;
    }

    /**
     * Sets the value of the nextReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextReviewDate(XMLGregorianCalendar value) {
        this.nextReviewDate = value;
    }

    /**
     * Gets the value of the official property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficial() {
        return official;
    }

    /**
     * Sets the value of the official property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficial(Boolean value) {
        this.official = value;
    }

    /**
     * Gets the value of the officialRemove property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficialRemove() {
        return officialRemove;
    }

    /**
     * Sets the value of the officialRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficialRemove(Boolean value) {
        this.officialRemove = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDate(XMLGregorianCalendar value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the rmClassDefInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmClassDefInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMClassDefInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMClassDefInfo }
     * 
     * 
     */
    public List<RMClassDefInfo> getRMClassDefInfo() {
        if (rmClassDefInfo == null) {
            rmClassDefInfo = new ArrayList<RMClassDefInfo>();
        }
        return this.rmClassDefInfo;
    }

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

    /**
     * Gets the value of the sentTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTo() {
        return sentTo;
    }

    /**
     * Sets the value of the sentTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTo(String value) {
        this.sentTo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
