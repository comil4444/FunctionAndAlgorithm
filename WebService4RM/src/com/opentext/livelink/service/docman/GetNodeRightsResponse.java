
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
 *         &lt;element name="GetNodeRightsResult" type="{urn:DocMan.service.livelink.opentext.com}NodeRights" minOccurs="0"/>
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
    "getNodeRightsResult"
})
@XmlRootElement(name = "GetNodeRightsResponse")
public class GetNodeRightsResponse {

    @XmlElement(name = "GetNodeRightsResult")
    protected NodeRights getNodeRightsResult;

    /**
     * Gets the value of the getNodeRightsResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeRights }
     *     
     */
    public NodeRights getGetNodeRightsResult() {
        return getNodeRightsResult;
    }

    /**
     * Sets the value of the getNodeRightsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeRights }
     *     
     */
    public void setGetNodeRightsResult(NodeRights value) {
        this.getNodeRightsResult = value;
    }

}
