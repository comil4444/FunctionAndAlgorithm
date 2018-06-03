
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="xNodeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DocXRefTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeID",
    "xNodeID",
    "docXRefTyp"
})
@XmlRootElement(name = "RMRemoveXReference")
public class RMRemoveXReference {

    @XmlElement(name = "NodeID")
    protected long nodeID;
    protected long xNodeID;
    @XmlElement(name = "DocXRefTyp")
    protected String docXRefTyp;

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
     * Gets the value of the xNodeID property.
     * 
     */
    public long getXNodeID() {
        return xNodeID;
    }

    /**
     * Sets the value of the xNodeID property.
     * 
     */
    public void setXNodeID(long value) {
        this.xNodeID = value;
    }

    /**
     * Gets the value of the docXRefTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocXRefTyp() {
        return docXRefTyp;
    }

    /**
     * Sets the value of the docXRefTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocXRefTyp(String value) {
        this.docXRefTyp = value;
    }

}
