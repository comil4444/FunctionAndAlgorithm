
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NodeAuditRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeAuditRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="AuditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AuditNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AuditString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PerformerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeAuditRecord", propOrder = {
    "auditDate",
    "auditNumber",
    "auditString",
    "nodeID",
    "performerID"
})
public class NodeAuditRecord
    extends ServiceDataObject
{

    @XmlElement(name = "AuditDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auditDate;
    @XmlElement(name = "AuditNumber")
    protected int auditNumber;
    @XmlElement(name = "AuditString")
    protected String auditString;
    @XmlElement(name = "NodeID")
    protected long nodeID;
    @XmlElement(name = "PerformerID")
    protected long performerID;

    /**
     * Gets the value of the auditDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuditDate() {
        return auditDate;
    }

    /**
     * Sets the value of the auditDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuditDate(XMLGregorianCalendar value) {
        this.auditDate = value;
    }

    /**
     * Gets the value of the auditNumber property.
     * 
     */
    public int getAuditNumber() {
        return auditNumber;
    }

    /**
     * Sets the value of the auditNumber property.
     * 
     */
    public void setAuditNumber(int value) {
        this.auditNumber = value;
    }

    /**
     * Gets the value of the auditString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditString() {
        return auditString;
    }

    /**
     * Sets the value of the auditString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditString(String value) {
        this.auditString = value;
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
     * Gets the value of the performerID property.
     * 
     */
    public long getPerformerID() {
        return performerID;
    }

    /**
     * Sets the value of the performerID property.
     * 
     */
    public void setPerformerID(long value) {
        this.performerID = value;
    }

}
