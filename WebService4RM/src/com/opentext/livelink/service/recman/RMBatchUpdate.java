
package com.opentext.livelink.service.recman;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="NodeIDList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
    "nodeIDList",
    "classID",
    "additionalInfo"
})
@XmlRootElement(name = "RMBatchUpdate")
public class RMBatchUpdate {

    @XmlElement(name = "NodeIDList", type = Long.class)
    protected List<Long> nodeIDList;
    protected long classID;
    @XmlElement(name = "AdditionalInfo")
    protected RMAdditionalInfo additionalInfo;

    /**
     * Gets the value of the nodeIDList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeIDList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeIDList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getNodeIDList() {
        if (nodeIDList == null) {
            nodeIDList = new ArrayList<Long>();
        }
        return this.nodeIDList;
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
