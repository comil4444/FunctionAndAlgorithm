
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.core.Attachment;


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
 *         &lt;element name="GetRenditionContentsResult" type="{urn:Core.service.livelink.opentext.com}Attachment" minOccurs="0"/>
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
    "getRenditionContentsResult"
})
@XmlRootElement(name = "GetRenditionContentsResponse")
public class GetRenditionContentsResponse {

    @XmlElement(name = "GetRenditionContentsResult")
    protected Attachment getRenditionContentsResult;

    /**
     * Gets the value of the getRenditionContentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getGetRenditionContentsResult() {
        return getRenditionContentsResult;
    }

    /**
     * Sets the value of the getRenditionContentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setGetRenditionContentsResult(Attachment value) {
        this.getRenditionContentsResult = value;
    }

}
