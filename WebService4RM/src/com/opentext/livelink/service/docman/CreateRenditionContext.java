
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="versionNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="renditionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "versionNum",
    "renditionType"
})
@XmlRootElement(name = "CreateRenditionContext")
public class CreateRenditionContext {

    protected long nodeID;
    protected long versionNum;
    protected String renditionType;

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
     * Gets the value of the renditionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenditionType() {
        return renditionType;
    }

    /**
     * Sets the value of the renditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenditionType(String value) {
        this.renditionType = value;
    }

}
