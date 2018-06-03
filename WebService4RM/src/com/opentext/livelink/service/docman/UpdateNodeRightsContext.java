
package com.opentext.livelink.service.docman;

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
 *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="operation" type="{urn:DocMan.service.livelink.opentext.com}RightOperation"/>
 *         &lt;element name="rights" type="{urn:DocMan.service.livelink.opentext.com}NodeRight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propagation" type="{urn:DocMan.service.livelink.opentext.com}RightPropagation"/>
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
    "operation",
    "rights",
    "propagation"
})
@XmlRootElement(name = "UpdateNodeRightsContext")
public class UpdateNodeRightsContext {

    protected long nodeID;
    @XmlElement(required = true)
    protected RightOperation operation;
    @XmlElement(nillable = true)
    protected List<NodeRight> rights;
    @XmlElement(required = true)
    protected RightPropagation propagation;

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
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link RightOperation }
     *     
     */
    public RightOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightOperation }
     *     
     */
    public void setOperation(RightOperation value) {
        this.operation = value;
    }

    /**
     * Gets the value of the rights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeRight }
     * 
     * 
     */
    public List<NodeRight> getRights() {
        if (rights == null) {
            rights = new ArrayList<NodeRight>();
        }
        return this.rights;
    }

    /**
     * Gets the value of the propagation property.
     * 
     * @return
     *     possible object is
     *     {@link RightPropagation }
     *     
     */
    public RightPropagation getPropagation() {
        return propagation;
    }

    /**
     * Sets the value of the propagation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightPropagation }
     *     
     */
    public void setPropagation(RightPropagation value) {
        this.propagation = value;
    }

}
