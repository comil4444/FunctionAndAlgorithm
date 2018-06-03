
package com.opentext.livelink.service.docman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}PrimitiveAttribute">
 *       &lt;sequence>
 *         &lt;element name="AllowGroups" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ValidValues" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Values" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAttribute", propOrder = {
    "allowGroups",
    "validValues",
    "values"
})
public class UserAttribute
    extends PrimitiveAttribute
{

    @XmlElement(name = "AllowGroups", required = true, type = Boolean.class, nillable = true)
    protected Boolean allowGroups;
    @XmlElement(name = "ValidValues", type = Long.class)
    protected List<Long> validValues;
    @XmlElement(name = "Values", nillable = true)
    protected List<Long> values;

    /**
     * Gets the value of the allowGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowGroups() {
        return allowGroups;
    }

    /**
     * Sets the value of the allowGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowGroups(Boolean value) {
        this.allowGroups = value;
    }

    /**
     * Gets the value of the validValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getValidValues() {
        if (validValues == null) {
            validValues = new ArrayList<Long>();
        }
        return this.validValues;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getValues() {
        if (values == null) {
            values = new ArrayList<Long>();
        }
        return this.values;
    }

}
