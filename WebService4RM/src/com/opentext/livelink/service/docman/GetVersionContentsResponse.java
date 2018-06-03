
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
 *         &lt;element name="GetVersionContentsResult" type="{urn:Core.service.livelink.opentext.com}Attachment" minOccurs="0"/>
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
    "getVersionContentsResult"
})
@XmlRootElement(name = "GetVersionContentsResponse")
public class GetVersionContentsResponse {

    @XmlElement(name = "GetVersionContentsResult")
    protected Attachment getVersionContentsResult;

    /**
     * Gets the value of the getVersionContentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getGetVersionContentsResult() {
        return getVersionContentsResult;
    }

    /**
     * Sets the value of the getVersionContentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setGetVersionContentsResult(Attachment value) {
        this.getVersionContentsResult = value;
    }

}
