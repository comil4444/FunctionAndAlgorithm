
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.core.BooleanObject;


/**
 * <p>Java class for Attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attribute">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxValues" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinValues" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReadOnly" type="{urn:Core.service.livelink.opentext.com}BooleanObject" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Searchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribute", propOrder = {
    "displayName",
    "id",
    "key",
    "maxValues",
    "minValues",
    "readOnly",
    "required",
    "searchable",
    "type"
})
@XmlSeeAlso({
    SetAttribute.class,
    PrimitiveAttribute.class
})
public class Attribute
    extends ServiceDataObject
{

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "MaxValues", required = true, type = Integer.class, nillable = true)
    protected Integer maxValues;
    @XmlElement(name = "MinValues", required = true, type = Integer.class, nillable = true)
    protected Integer minValues;
    @XmlElement(name = "ReadOnly")
    protected BooleanObject readOnly;
    @XmlElement(name = "Required", required = true, type = Boolean.class, nillable = true)
    protected Boolean required;
    @XmlElement(name = "Searchable", required = true, type = Boolean.class, nillable = true)
    protected Boolean searchable;
    @XmlElement(name = "Type")
    protected String type;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the maxValues property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxValues() {
        return maxValues;
    }

    /**
     * Sets the value of the maxValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxValues(Integer value) {
        this.maxValues = value;
    }

    /**
     * Gets the value of the minValues property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinValues() {
        return minValues;
    }

    /**
     * Sets the value of the minValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinValues(Integer value) {
        this.minValues = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanObject }
     *     
     */
    public BooleanObject getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanObject }
     *     
     */
    public void setReadOnly(BooleanObject value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchable(Boolean value) {
        this.searchable = value;
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

}
