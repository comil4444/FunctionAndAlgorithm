
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
 *         &lt;element name="CreateReleaseResult" type="{urn:DocMan.service.livelink.opentext.com}CompoundDocRelease" minOccurs="0"/>
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
    "createReleaseResult"
})
@XmlRootElement(name = "CreateReleaseResponse")
public class CreateReleaseResponse {

    @XmlElement(name = "CreateReleaseResult")
    protected CompoundDocRelease createReleaseResult;

    /**
     * Gets the value of the createReleaseResult property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundDocRelease }
     *     
     */
    public CompoundDocRelease getCreateReleaseResult() {
        return createReleaseResult;
    }

    /**
     * Sets the value of the createReleaseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundDocRelease }
     *     
     */
    public void setCreateReleaseResult(CompoundDocRelease value) {
        this.createReleaseResult = value;
    }

}
