
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.docman.Node;


/**
 * <p>Java class for ProvenanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProvenanceInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="MyNode" type="{urn:DocMan.service.livelink.opentext.com}Node" minOccurs="0"/>
 *         &lt;element name="Selectable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvenanceInfo", propOrder = {
    "myNode",
    "selectable",
    "status"
})
public class ProvenanceInfo
    extends ServiceDataObject
{

    @XmlElement(name = "MyNode")
    protected Node myNode;
    @XmlElement(name = "Selectable", required = true, type = Boolean.class, nillable = true)
    protected Boolean selectable;
    @XmlElement(name = "Status", required = true, nillable = true)
    protected String status;

    /**
     * Gets the value of the myNode property.
     * 
     * @return
     *     possible object is
     *     {@link Node }
     *     
     */
    public Node getMyNode() {
        return myNode;
    }

    /**
     * Sets the value of the myNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node }
     *     
     */
    public void setMyNode(Node value) {
        this.myNode = value;
    }

    /**
     * Gets the value of the selectable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectable() {
        return selectable;
    }

    /**
     * Sets the value of the selectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectable(Boolean value) {
        this.selectable = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
