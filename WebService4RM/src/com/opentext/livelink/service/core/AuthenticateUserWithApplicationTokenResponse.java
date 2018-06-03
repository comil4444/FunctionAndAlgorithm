
package com.opentext.livelink.service.core;

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
 *         &lt;element name="AuthenticateUserWithApplicationTokenResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "authenticateUserWithApplicationTokenResult"
})
@XmlRootElement(name = "AuthenticateUserWithApplicationTokenResponse")
public class AuthenticateUserWithApplicationTokenResponse {

    @XmlElement(name = "AuthenticateUserWithApplicationTokenResult")
    protected String authenticateUserWithApplicationTokenResult;

    /**
     * Gets the value of the authenticateUserWithApplicationTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticateUserWithApplicationTokenResult() {
        return authenticateUserWithApplicationTokenResult;
    }

    /**
     * Sets the value of the authenticateUserWithApplicationTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticateUserWithApplicationTokenResult(String value) {
        this.authenticateUserWithApplicationTokenResult = value;
    }

}
