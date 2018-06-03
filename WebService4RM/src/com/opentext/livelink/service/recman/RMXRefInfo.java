
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.docman.Node;


/**
 * <p>Java class for RMXRefInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMXRefInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="DocXRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MyNode" type="{urn:DocMan.service.livelink.opentext.com}Node" minOccurs="0"/>
 *         &lt;element name="XComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMXRefInfo", propOrder = {
    "docXRef",
    "location",
    "myNode",
    "xComment"
})
public class RMXRefInfo
    extends ServiceDataObject
{

    @XmlElement(name = "DocXRef")
    protected String docXRef;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "MyNode")
    protected Node myNode;
    @XmlElement(name = "XComment")
    protected String xComment;

    /**
     * Gets the value of the docXRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocXRef() {
        return docXRef;
    }

    /**
     * Sets the value of the docXRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocXRef(String value) {
        this.docXRef = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

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
     * Gets the value of the xComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXComment() {
        return xComment;
    }

    /**
     * Sets the value of the xComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXComment(String value) {
        this.xComment = value;
    }

}
