
package com.opentext.livelink.service.docman;

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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nodeRight" type="{urn:DocMan.service.livelink.opentext.com}NodeRight" minOccurs="0"/>
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
    "id",
    "nodeRight"
})
@XmlRootElement(name = "AddNodeRight")
public class AddNodeRight {

    @XmlElement(name = "ID")
    protected long id;
    protected NodeRight nodeRight;

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
     * Gets the value of the nodeRight property.
     * 
     * @return
     *     possible object is
     *     {@link NodeRight }
     *     
     */
    public NodeRight getNodeRight() {
        return nodeRight;
    }

    /**
     * Sets the value of the nodeRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeRight }
     *     
     */
    public void setNodeRight(NodeRight value) {
        this.nodeRight = value;
    }

}
