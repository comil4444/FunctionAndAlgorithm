
package com.opentext.livelink.service.docman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeVersionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeVersionInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="AdvancedVersionControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FileDataSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FileResSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportsAdvancedVersionControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VersionNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Versions" type="{urn:DocMan.service.livelink.opentext.com}Version" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VersionsToKeep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeVersionInfo", propOrder = {
    "advancedVersionControl",
    "fileDataSize",
    "fileResSize",
    "major",
    "mimeType",
    "supportsAdvancedVersionControl",
    "versionNum",
    "versions",
    "versionsToKeep"
})
public class NodeVersionInfo
    extends ServiceDataObject
{

    @XmlElement(name = "AdvancedVersionControl")
    protected boolean advancedVersionControl;
    @XmlElement(name = "FileDataSize", required = true, type = Long.class, nillable = true)
    protected Long fileDataSize;
    @XmlElement(name = "FileResSize", required = true, type = Long.class, nillable = true)
    protected Long fileResSize;
    @XmlElement(name = "Major", required = true, type = Long.class, nillable = true)
    protected Long major;
    @XmlElement(name = "MimeType")
    protected String mimeType;
    @XmlElement(name = "SupportsAdvancedVersionControl")
    protected boolean supportsAdvancedVersionControl;
    @XmlElement(name = "VersionNum")
    protected long versionNum;
    @XmlElement(name = "Versions")
    protected List<Version> versions;
    @XmlElement(name = "VersionsToKeep", required = true, type = Integer.class, nillable = true)
    protected Integer versionsToKeep;

    /**
     * Gets the value of the advancedVersionControl property.
     * 
     */
    public boolean isAdvancedVersionControl() {
        return advancedVersionControl;
    }

    /**
     * Sets the value of the advancedVersionControl property.
     * 
     */
    public void setAdvancedVersionControl(boolean value) {
        this.advancedVersionControl = value;
    }

    /**
     * Gets the value of the fileDataSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileDataSize() {
        return fileDataSize;
    }

    /**
     * Sets the value of the fileDataSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileDataSize(Long value) {
        this.fileDataSize = value;
    }

    /**
     * Gets the value of the fileResSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileResSize() {
        return fileResSize;
    }

    /**
     * Sets the value of the fileResSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileResSize(Long value) {
        this.fileResSize = value;
    }

    /**
     * Gets the value of the major property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMajor(Long value) {
        this.major = value;
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
     * Gets the value of the supportsAdvancedVersionControl property.
     * 
     */
    public boolean isSupportsAdvancedVersionControl() {
        return supportsAdvancedVersionControl;
    }

    /**
     * Sets the value of the supportsAdvancedVersionControl property.
     * 
     */
    public void setSupportsAdvancedVersionControl(boolean value) {
        this.supportsAdvancedVersionControl = value;
    }

    /**
     * Gets the value of the versionNum property.
     * 
     */
    public long getVersionNum() {
        return versionNum;
    }

    /**
     * Sets the value of the versionNum property.
     * 
     */
    public void setVersionNum(long value) {
        this.versionNum = value;
    }

    /**
     * Gets the value of the versions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Version }
     * 
     * 
     */
    public List<Version> getVersions() {
        if (versions == null) {
            versions = new ArrayList<Version>();
        }
        return this.versions;
    }

    /**
     * Gets the value of the versionsToKeep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionsToKeep() {
        return versionsToKeep;
    }

    /**
     * Sets the value of the versionsToKeep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionsToKeep(Integer value) {
        this.versionsToKeep = value;
    }

}
