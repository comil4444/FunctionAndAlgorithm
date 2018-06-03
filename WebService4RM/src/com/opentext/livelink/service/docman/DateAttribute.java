
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
 * <p>Java class for DateAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}PrimitiveAttribute">
 *       &lt;sequence>
 *         &lt;element name="ShowTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ValidValues" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Values" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAttribute", propOrder = {
    "showTime",
    "validValues",
    "values"
})
public class DateAttribute
    extends PrimitiveAttribute
{

    @XmlElement(name = "ShowTime", required = true, type = Boolean.class, nillable = true)
    protected Boolean showTime;
    @XmlElement(name = "ValidValues")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> validValues;
    @XmlElement(name = "Values", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> values;

    /**
     * Gets the value of the showTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTime() {
        return showTime;
    }

    /**
     * Sets the value of the showTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTime(Boolean value) {
        this.showTime = value;
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
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getValidValues() {
        if (validValues == null) {
            validValues = new ArrayList<XMLGregorianCalendar>();
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
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getValues() {
        if (values == null) {
            values = new ArrayList<XMLGregorianCalendar>();
        }
        return this.values;
    }

}
