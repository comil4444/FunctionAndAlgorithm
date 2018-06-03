
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NodeReservationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeReservationInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Reserved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReservedBy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ReservedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeReservationInfo", propOrder = {
    "reserved",
    "reservedBy",
    "reservedDate"
})
public class NodeReservationInfo
    extends ServiceDataObject
{

    @XmlElement(name = "Reserved")
    protected boolean reserved;
    @XmlElement(name = "ReservedBy")
    protected long reservedBy;
    @XmlElement(name = "ReservedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservedDate;

    /**
     * Gets the value of the reserved property.
     * 
     */
    public boolean isReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     */
    public void setReserved(boolean value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the reservedBy property.
     * 
     */
    public long getReservedBy() {
        return reservedBy;
    }

    /**
     * Sets the value of the reservedBy property.
     * 
     */
    public void setReservedBy(long value) {
        this.reservedBy = value;
    }

    /**
     * Gets the value of the reservedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservedDate() {
        return reservedDate;
    }

    /**
     * Sets the value of the reservedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservedDate(XMLGregorianCalendar value) {
        this.reservedDate = value;
    }

}
