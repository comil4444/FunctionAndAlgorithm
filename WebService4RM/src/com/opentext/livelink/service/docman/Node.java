
package com.opentext.livelink.service.docman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Node complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Node">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Catalog" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContainerInfo" type="{urn:DocMan.service.livelink.opentext.com}NodeContainerInfo" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DisplayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Features" type="{urn:DocMan.service.livelink.opentext.com}NodeFeature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsContainer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsReference" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsReservable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsVersionable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Metadata" type="{urn:DocMan.service.livelink.opentext.com}Metadata" minOccurs="0"/>
 *         &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PartialData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Permissions" type="{urn:DocMan.service.livelink.opentext.com}NodePermissions" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ReferenceInfo" type="{urn:DocMan.service.livelink.opentext.com}NodeReferenceInfo" minOccurs="0"/>
 *         &lt;element name="Released" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReservationInfo" type="{urn:DocMan.service.livelink.opentext.com}NodeReservationInfo" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionInfo" type="{urn:DocMan.service.livelink.opentext.com}NodeVersionInfo" minOccurs="0"/>
 *         &lt;element name="VolumeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Node", propOrder = {
    "catalog",
    "comment",
    "containerInfo",
    "createDate",
    "createdBy",
    "displayType",
    "features",
    "id",
    "isContainer",
    "isReference",
    "isReservable",
    "isVersionable",
    "metadata",
    "modifyDate",
    "name",
    "nickname",
    "parentID",
    "partialData",
    "permissions",
    "position",
    "referenceInfo",
    "released",
    "reservationInfo",
    "type",
    "versionInfo",
    "volumeID"
})
public class Node
    extends ServiceDataObject
{

    @XmlElement(name = "Catalog", required = true, type = Integer.class, nillable = true)
    protected Integer catalog;
    @XmlElement(name = "Comment", required = true, nillable = true)
    protected String comment;
    @XmlElement(name = "ContainerInfo")
    protected NodeContainerInfo containerInfo;
    @XmlElement(name = "CreateDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "CreatedBy", required = true, type = Long.class, nillable = true)
    protected Long createdBy;
    @XmlElement(name = "DisplayType")
    protected String displayType;
    @XmlElement(name = "Features")
    protected List<NodeFeature> features;
    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "IsContainer")
    protected boolean isContainer;
    @XmlElement(name = "IsReference")
    protected boolean isReference;
    @XmlElement(name = "IsReservable")
    protected boolean isReservable;
    @XmlElement(name = "IsVersionable")
    protected boolean isVersionable;
    @XmlElement(name = "Metadata")
    protected Metadata metadata;
    @XmlElement(name = "ModifyDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Nickname", required = true, nillable = true)
    protected String nickname;
    @XmlElement(name = "ParentID")
    protected long parentID;
    @XmlElement(name = "PartialData")
    protected boolean partialData;
    @XmlElement(name = "Permissions")
    protected NodePermissions permissions;
    @XmlElement(name = "Position", required = true, type = Long.class, nillable = true)
    protected Long position;
    @XmlElement(name = "ReferenceInfo")
    protected NodeReferenceInfo referenceInfo;
    @XmlElement(name = "Released")
    protected boolean released;
    @XmlElement(name = "ReservationInfo")
    protected NodeReservationInfo reservationInfo;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "VersionInfo")
    protected NodeVersionInfo versionInfo;
    @XmlElement(name = "VolumeID")
    protected long volumeID;

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatalog(Integer value) {
        this.catalog = value;
    }

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
     * Gets the value of the containerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NodeContainerInfo }
     *     
     */
    public NodeContainerInfo getContainerInfo() {
        return containerInfo;
    }

    /**
     * Sets the value of the containerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeContainerInfo }
     *     
     */
    public void setContainerInfo(NodeContainerInfo value) {
        this.containerInfo = value;
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
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatedBy(Long value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeFeature }
     * 
     * 
     */
    public List<NodeFeature> getFeatures() {
        if (features == null) {
            features = new ArrayList<NodeFeature>();
        }
        return this.features;
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
     * Gets the value of the isContainer property.
     * 
     */
    public boolean isIsContainer() {
        return isContainer;
    }

    /**
     * Sets the value of the isContainer property.
     * 
     */
    public void setIsContainer(boolean value) {
        this.isContainer = value;
    }

    /**
     * Gets the value of the isReference property.
     * 
     */
    public boolean isIsReference() {
        return isReference;
    }

    /**
     * Sets the value of the isReference property.
     * 
     */
    public void setIsReference(boolean value) {
        this.isReference = value;
    }

    /**
     * Gets the value of the isReservable property.
     * 
     */
    public boolean isIsReservable() {
        return isReservable;
    }

    /**
     * Sets the value of the isReservable property.
     * 
     */
    public void setIsReservable(boolean value) {
        this.isReservable = value;
    }

    /**
     * Gets the value of the isVersionable property.
     * 
     */
    public boolean isIsVersionable() {
        return isVersionable;
    }

    /**
     * Sets the value of the isVersionable property.
     * 
     */
    public void setIsVersionable(boolean value) {
        this.isVersionable = value;
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
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     */
    public long getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     */
    public void setParentID(long value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the partialData property.
     * 
     */
    public boolean isPartialData() {
        return partialData;
    }

    /**
     * Sets the value of the partialData property.
     * 
     */
    public void setPartialData(boolean value) {
        this.partialData = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link NodePermissions }
     *     
     */
    public NodePermissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodePermissions }
     *     
     */
    public void setPermissions(NodePermissions value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPosition(Long value) {
        this.position = value;
    }

    /**
     * Gets the value of the referenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NodeReferenceInfo }
     *     
     */
    public NodeReferenceInfo getReferenceInfo() {
        return referenceInfo;
    }

    /**
     * Sets the value of the referenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeReferenceInfo }
     *     
     */
    public void setReferenceInfo(NodeReferenceInfo value) {
        this.referenceInfo = value;
    }

    /**
     * Gets the value of the released property.
     * 
     */
    public boolean isReleased() {
        return released;
    }

    /**
     * Sets the value of the released property.
     * 
     */
    public void setReleased(boolean value) {
        this.released = value;
    }

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NodeReservationInfo }
     *     
     */
    public NodeReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeReservationInfo }
     *     
     */
    public void setReservationInfo(NodeReservationInfo value) {
        this.reservationInfo = value;
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
     * Gets the value of the versionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NodeVersionInfo }
     *     
     */
    public NodeVersionInfo getVersionInfo() {
        return versionInfo;
    }

    /**
     * Sets the value of the versionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeVersionInfo }
     *     
     */
    public void setVersionInfo(NodeVersionInfo value) {
        this.versionInfo = value;
    }

    /**
     * Gets the value of the volumeID property.
     * 
     */
    public long getVolumeID() {
        return volumeID;
    }

    /**
     * Sets the value of the volumeID property.
     * 
     */
    public void setVolumeID(long value) {
        this.volumeID = value;
    }

}
