
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
 *         &lt;element name="GetNodeTemplateResult" type="{urn:DocMan.service.livelink.opentext.com}Node" minOccurs="0"/>
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
    "getNodeTemplateResult"
})
@XmlRootElement(name = "GetNodeTemplateResponse")
public class GetNodeTemplateResponse {

    @XmlElement(name = "GetNodeTemplateResult")
    protected Node getNodeTemplateResult;

    /**
     * Gets the value of the getNodeTemplateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Node }
     *     
     */
    public Node getGetNodeTemplateResult() {
        return getNodeTemplateResult;
    }

    /**
     * Sets the value of the getNodeTemplateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node }
     *     
     */
    public void setGetNodeTemplateResult(Node value) {
        this.getNodeTemplateResult = value;
    }

}
