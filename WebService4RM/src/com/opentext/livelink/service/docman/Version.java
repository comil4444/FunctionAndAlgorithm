
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Version complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Version">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FileCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FileCreator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileDataSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FileModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilePlatform" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FileResSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Locked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LockedBy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LockedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Metadata" type="{urn:DocMan.service.livelink.opentext.com}Metadata" minOccurs="0"/>
 *         &lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProviderID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerMajor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VerMinor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Version", propOrder = {
    "comment",
    "createDate",
    "fileCreateDate",
    "fileCreator",
    "fileDataSize",
    "fileModifyDate",
    "filename",
    "filePlatform",
    "fileResSize",
    "fileType",
    "id",
    "locked",
    "lockedBy",
    "lockedDate",
    "metadata",
    "mimeType",
    "modifyDate",
    "name",
    "nodeID",
    "number",
    "owner",
    "providerID",
    "providerName",
    "type",
    "verMajor",
    "verMinor"
})
public class Version
    extends ServiceDataObject
{

    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "CreateDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "FileCreateDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fileCreateDate;
    @XmlElement(name = "FileCreator")
    protected String fileCreator;
    @XmlElement(name = "FileDataSize")
    protected long fileDataSize;
    @XmlElement(name = "FileModifyDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fileModifyDate;
    @XmlElement(name = "Filename")
    protected String filename;
    @XmlElement(name = "FilePlatform")
    protected int filePlatform;
    @XmlElement(name = "FileResSize")
    protected long fileResSize;
    @XmlElement(name = "FileType")
    protected String fileType;
    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "Locked")
    protected int locked;
    @XmlElement(name = "LockedBy", required = true, type = Long.class, nillable = true)
    protected Long lockedBy;
    @XmlElement(name = "LockedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lockedDate;
    @XmlElement(name = "Metadata")
    protected Metadata metadata;
    @XmlElement(name = "MimeType")
    protected String mimeType;
    @XmlElement(name = "ModifyDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeID")
    protected long nodeID;
    @XmlElement(name = "Number")
    protected long number;
    @XmlElement(name = "Owner")
    protected long owner;
    @XmlElement(name = "ProviderID")
    protected long providerID;
    @XmlElement(name = "ProviderName")
    protected String providerName;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "VerMajor")
    protected long verMajor;
    @XmlElement(name = "VerMinor")
    protected long verMinor;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the fileCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileCreateDate() {
        return fileCreateDate;
    }

    /**
     * Sets the value of the fileCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileCreateDate(XMLGregorianCalendar value) {
        this.fileCreateDate = value;
    }

    /**
     * Gets the value of the fileCreator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCreator() {
        return fileCreator;
    }

    /**
     * Sets the value of the fileCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCreator(String value) {
        this.fileCreator = value;
    }

    /**
     * Gets the value of the fileDataSize property.
     * 
     */
    public long getFileDataSize() {
        return fileDataSize;
    }

    /**
     * Sets the value of the fileDataSize property.
     * 
     */
    public void setFileDataSize(long value) {
        this.fileDataSize = value;
    }

    /**
     * Gets the value of the fileModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileModifyDate() {
        return fileModifyDate;
    }

    /**
     * Sets the value of the fileModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileModifyDate(XMLGregorianCalendar value) {
        this.fileModifyDate = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the filePlatform property.
     * 
     */
    public int getFilePlatform() {
        return filePlatform;
    }

    /**
     * Sets the value of the filePlatform property.
     * 
     */
    public void setFilePlatform(int value) {
        this.filePlatform = value;
    }

    /**
     * Gets the value of the fileResSize property.
     * 
     */
    public long getFileResSize() {
        return fileResSize;
    }

    /**
     * Sets the value of the fileResSize property.
     * 
     */
    public void setFileResSize(long value) {
        this.fileResSize = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     */
    public int getLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     */
    public void setLocked(int value) {
        this.locked = value;
    }

    /**
     * Gets the value of the lockedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLockedBy() {
        return lockedBy;
    }

    /**
     * Sets the value of the lockedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLockedBy(Long value) {
        this.lockedBy = value;
    }

    /**
     * Gets the value of the lockedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLockedDate() {
        return lockedDate;
    }

    /**
     * Sets the value of the lockedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLockedDate(XMLGregorianCalendar value) {
        this.lockedDate = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link Metadata }
     *     
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata }
     *     
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyDate(XMLGregorianCalendar value) {
        this.modifyDate = value;
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
     * Gets the value of the number property.
     * 
     */
    public long getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(long value) {
        this.number = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     */
    public long getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     */
    public void setOwner(long value) {
        this.owner = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     */
    public long getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     */
    public void setProviderID(long value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the verMajor property.
     * 
     */
    public long getVerMajor() {
        return verMajor;
    }

    /**
     * Sets the value of the verMajor property.
     * 
     */
    public void setVerMajor(long value) {
        this.verMajor = value;
    }

    /**
     * Gets the value of the verMinor property.
     * 
     */
    public long getVerMinor() {
        return verMinor;
    }

    /**
     * Sets the value of the verMinor property.
     * 
     */
    public void setVerMinor(long value) {
        this.verMinor = value;
    }

}
