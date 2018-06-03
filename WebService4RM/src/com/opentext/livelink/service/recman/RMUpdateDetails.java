
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
 *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="classID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AdditionalInfo" type="{urn:RecMan.service.livelink.opentext.com}RMAdditionalInfo" minOccurs="0"/>
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
    "classID",
    "additionalInfo"
})
@XmlRootElement(name = "RMUpdateDetails")
public class RMUpdateDetails {

    protected long nodeID;
    protected long classID;
    @XmlElement(name = "AdditionalInfo")
    protected RMAdditionalInfo additionalInfo;

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
     * Gets the value of the classID property.
     * 
     */
    public long getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     */
    public void setClassID(long value) {
        this.classID = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RMAdditionalInfo }
     *     
     */
    public RMAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMAdditionalInfo }
     *     
     */
    public void setAdditionalInfo(RMAdditionalInfo value) {
        this.additionalInfo = value;
    }

}
