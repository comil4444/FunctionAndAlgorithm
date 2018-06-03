
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.core.ChunkedOperationContext;


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
 *         &lt;element name="UpdateNodeRightsContextResult" type="{urn:Core.service.livelink.opentext.com}ChunkedOperationContext" minOccurs="0"/>
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
    "updateNodeRightsContextResult"
})
@XmlRootElement(name = "UpdateNodeRightsContextResponse")
public class UpdateNodeRightsContextResponse {

    @XmlElement(name = "UpdateNodeRightsContextResult")
    protected ChunkedOperationContext updateNodeRightsContextResult;

    /**
     * Gets the value of the updateNodeRightsContextResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChunkedOperationContext }
     *     
     */
    public ChunkedOperationContext getUpdateNodeRightsContextResult() {
        return updateNodeRightsContextResult;
    }

    /**
     * Sets the value of the updateNodeRightsContextResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChunkedOperationContext }
     *     
     */
    public void setUpdateNodeRightsContextResult(ChunkedOperationContext value) {
        this.updateNodeRightsContextResult = value;
    }

}
