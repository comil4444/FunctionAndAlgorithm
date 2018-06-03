
package com.opentext.livelink.service.recman;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="RMUserFunctionalAccessResult" type="{urn:RecMan.service.livelink.opentext.com}RMFuncAccess" maxOccurs="unbounded" minOccurs="0"/>
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
    "rmUserFunctionalAccessResult"
})
@XmlRootElement(name = "RMUserFunctionalAccessResponse")
public class RMUserFunctionalAccessResponse {

    @XmlElement(name = "RMUserFunctionalAccessResult", nillable = true)
    protected List<RMFuncAccess> rmUserFunctionalAccessResult;

    /**
     * Gets the value of the rmUserFunctionalAccessResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmUserFunctionalAccessResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMUserFunctionalAccessResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMFuncAccess }
     * 
     * 
     */
    public List<RMFuncAccess> getRMUserFunctionalAccessResult() {
        if (rmUserFunctionalAccessResult == null) {
            rmUserFunctionalAccessResult = new ArrayList<RMFuncAccess>();
        }
        return this.rmUserFunctionalAccessResult;
    }

}
