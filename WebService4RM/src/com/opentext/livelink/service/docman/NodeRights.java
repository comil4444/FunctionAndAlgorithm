
package com.opentext.livelink.service.docman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeRights">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="ACLRights" type="{urn:DocMan.service.livelink.opentext.com}NodeRight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OwnerGroupRight" type="{urn:DocMan.service.livelink.opentext.com}NodeRight" minOccurs="0"/>
 *         &lt;element name="OwnerRight" type="{urn:DocMan.service.livelink.opentext.com}NodeRight" minOccurs="0"/>
 *         &lt;element name="PublicRight" type="{urn:DocMan.service.livelink.opentext.com}NodeRight" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeRights", propOrder = {
    "aclRights",
    "ownerGroupRight",
    "ownerRight",
    "publicRight"
})
public class NodeRights
    extends ServiceDataObject
{

    @XmlElement(name = "ACLRights")
    protected List<NodeRight> aclRights;
    @XmlElement(name = "OwnerGroupRight")
    protected NodeRight ownerGroupRight;
    @XmlElement(name = "OwnerRight")
    protected NodeRight ownerRight;
    @XmlElement(name = "PublicRight")
    protected NodeRight publicRight;

    /**
     * Gets the value of the aclRights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aclRights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACLRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeRight }
     * 
     * 
     */
    public List<NodeRight> getACLRights() {
        if (aclRights == null) {
            aclRights = new ArrayList<NodeRight>();
        }
        return this.aclRights;
    }

    /**
     * Gets the value of the ownerGroupRight property.
     * 
     * @return
     *     possible object is
     *     {@link NodeRight }
     *     
     */
    public NodeRight getOwnerGroupRight() {
        return ownerGroupRight;
    }

    /**
     * Sets the value of the ownerGroupRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeRight }
     *     
     */
    public void setOwnerGroupRight(NodeRight value) {
        this.ownerGroupRight = value;
    }

    /**
     * Gets the value of the ownerRight property.
     * 
     * @return
     *     possible object is
     *     {@link NodeRight }
     *     
     */
    public NodeRight getOwnerRight() {
        return ownerRight;
    }

    /**
     * Sets the value of the ownerRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeRight }
     *     
     */
    public void setOwnerRight(NodeRight value) {
        this.ownerRight = value;
    }

    /**
     * Gets the value of the publicRight property.
     * 
     * @return
     *     possible object is
     *     {@link NodeRight }
     *     
     */
    public NodeRight getPublicRight() {
        return publicRight;
    }

    /**
     * Sets the value of the publicRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeRight }
     *     
     */
    public void setPublicRight(NodeRight value) {
        this.publicRight = value;
    }

}
