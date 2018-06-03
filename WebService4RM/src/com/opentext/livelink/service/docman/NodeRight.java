
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeRight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeRight">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Permissions" type="{urn:DocMan.service.livelink.opentext.com}NodePermissions" minOccurs="0"/>
 *         &lt;element name="RightID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeRight", propOrder = {
    "permissions",
    "rightID",
    "type"
})
public class NodeRight
    extends ServiceDataObject
{

    @XmlElement(name = "Permissions")
    protected NodePermissions permissions;
    @XmlElement(name = "RightID")
    protected long rightID;
    @XmlElement(name = "Type")
    protected String type;

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link NodePermissions }
     *     
     */
    public NodePermissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodePermissions }
     *     
     */
    public void setPermissions(NodePermissions value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the rightID property.
     * 
     */
    public long getRightID() {
        return rightID;
    }

    /**
     * Sets the value of the rightID property.
     * 
     */
    public void setRightID(long value) {
        this.rightID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }
    
    public boolean equals(Object o){
    	if(o instanceof NodeRight){
    		return o==null?false:((NodeRight)o).getRightID()==this.getRightID();
    	}
    	return false;
    }

}
