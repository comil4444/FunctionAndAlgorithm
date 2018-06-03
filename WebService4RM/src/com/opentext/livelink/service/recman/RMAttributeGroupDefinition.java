
package com.opentext.livelink.service.recman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMAttributeGroupDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMAttributeGroupDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="RMField" type="{urn:RecMan.service.livelink.opentext.com}RMField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RMVitalCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UseRecordVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VersionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Xreference" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMAttributeGroupDefinition", propOrder = {
    "rmField",
    "rmVitalCode",
    "useRecordVersion",
    "versionCode",
    "xreference"
})
public class RMAttributeGroupDefinition
    extends ServiceDataObject
{

    @XmlElement(name = "RMField")
    protected List<RMField> rmField;
    @XmlElement(name = "RMVitalCode")
    protected List<String> rmVitalCode;
    @XmlElement(name = "UseRecordVersion")
    protected boolean useRecordVersion;
    @XmlElement(name = "VersionCode")
    protected String versionCode;
    @XmlElement(name = "Xreference")
    protected boolean xreference;

    /**
     * Gets the value of the rmField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMField }
     * 
     * 
     */
    public List<RMField> getRMField() {
        if (rmField == null) {
            rmField = new ArrayList<RMField>();
        }
        return this.rmField;
    }

    /**
     * Gets the value of the rmVitalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmVitalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMVitalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRMVitalCode() {
        if (rmVitalCode == null) {
            rmVitalCode = new ArrayList<String>();
        }
        return this.rmVitalCode;
    }

    /**
     * Gets the value of the useRecordVersion property.
     * 
     */
    public boolean isUseRecordVersion() {
        return useRecordVersion;
    }

    /**
     * Sets the value of the useRecordVersion property.
     * 
     */
    public void setUseRecordVersion(boolean value) {
        this.useRecordVersion = value;
    }

    /**
     * Gets the value of the versionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionCode() {
        return versionCode;
    }

    /**
     * Sets the value of the versionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionCode(String value) {
        this.versionCode = value;
    }

    /**
     * Gets the value of the xreference property.
     * 
     */
    public boolean isXreference() {
        return xreference;
    }

    /**
     * Sets the value of the xreference property.
     * 
     */
    public void setXreference(boolean value) {
        this.xreference = value;
    }

}
