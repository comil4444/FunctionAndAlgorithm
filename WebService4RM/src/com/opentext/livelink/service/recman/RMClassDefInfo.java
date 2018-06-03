
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RMClassDefInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMClassDefInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClosedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CyclePeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DispAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Disposition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Essential" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastAdditionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RMRSIRetention" type="{urn:RecMan.service.livelink.opentext.com}RMRSIRetention" minOccurs="0"/>
 *         &lt;element name="RSI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Selectable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Storage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMClassDefInfo", propOrder = {
    "closed",
    "closedDate",
    "cyclePeriod",
    "description",
    "dispAuthority",
    "disposition",
    "essential",
    "fileNumber",
    "hasChildren",
    "lastAdditionDate",
    "name",
    "nodeID",
    "rmrsiRetention",
    "rsi",
    "selectable",
    "status",
    "statusDate",
    "storage",
    "type"
})
public class RMClassDefInfo
    extends ServiceDataObject
{

    @XmlElement(name = "Closed", required = true, type = Integer.class, nillable = true)
    protected Integer closed;
    @XmlElement(name = "ClosedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closedDate;
    @XmlElement(name = "CyclePeriod", required = true, type = Integer.class, nillable = true)
    protected Integer cyclePeriod;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "DispAuthority", required = true, nillable = true)
    protected String dispAuthority;
    @XmlElement(name = "Disposition", required = true, nillable = true)
    protected String disposition;
    @XmlElement(name = "Essential", required = true, nillable = true)
    protected String essential;
    @XmlElement(name = "FileNumber")
    protected String fileNumber;
    @XmlElement(name = "HasChildren", required = true, type = Boolean.class, nillable = true)
    protected Boolean hasChildren;
    @XmlElement(name = "LastAdditionDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAdditionDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeID")
    protected long nodeID;
    @XmlElement(name = "RMRSIRetention")
    protected RMRSIRetention rmrsiRetention;
    @XmlElement(name = "RSI", required = true, nillable = true)
    protected String rsi;
    @XmlElement(name = "Selectable", required = true, type = Boolean.class, nillable = true)
    protected Boolean selectable;
    @XmlElement(name = "Status", required = true, nillable = true)
    protected String status;
    @XmlElement(name = "StatusDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(name = "Storage", required = true, nillable = true)
    protected String storage;
    @XmlElement(name = "Type", required = true, type = Integer.class, nillable = true)
    protected Integer type;

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClosed(Integer value) {
        this.closed = value;
    }

    /**
     * Gets the value of the closedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedDate() {
        return closedDate;
    }

    /**
     * Sets the value of the closedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedDate(XMLGregorianCalendar value) {
        this.closedDate = value;
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
     * Gets the value of the dispAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispAuthority() {
        return dispAuthority;
    }

    /**
     * Sets the value of the dispAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispAuthority(String value) {
        this.dispAuthority = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposition(String value) {
        this.disposition = value;
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
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the hasChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChildren(Boolean value) {
        this.hasChildren = value;
    }

    /**
     * Gets the value of the lastAdditionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAdditionDate() {
        return lastAdditionDate;
    }

    /**
     * Sets the value of the lastAdditionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAdditionDate(XMLGregorianCalendar value) {
        this.lastAdditionDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nodeID property.
     * 
     */
    public long getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     */
    public void setNodeID(long value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the rmrsiRetention property.
     * 
     * @return
     *     possible object is
     *     {@link RMRSIRetention }
     *     
     */
    public RMRSIRetention getRMRSIRetention() {
        return rmrsiRetention;
    }

    /**
     * Sets the value of the rmrsiRetention property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMRSIRetention }
     *     
     */
    public void setRMRSIRetention(RMRSIRetention value) {
        this.rmrsiRetention = value;
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
     * Gets the value of the selectable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectable() {
        return selectable;
    }

    /**
     * Sets the value of the selectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectable(Boolean value) {
        this.selectable = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setType(Integer value) {
        this.type = value;
    }

}
