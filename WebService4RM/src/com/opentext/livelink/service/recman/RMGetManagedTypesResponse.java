
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
 *         &lt;element name="RMGetManagedTypesResult" type="{urn:RecMan.service.livelink.opentext.com}RMManagedTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "rmGetManagedTypesResult"
})
@XmlRootElement(name = "RMGetManagedTypesResponse")
public class RMGetManagedTypesResponse {

    @XmlElement(name = "RMGetManagedTypesResult", nillable = true)
    protected List<RMManagedTypeInfo> rmGetManagedTypesResult;

    /**
     * Gets the value of the rmGetManagedTypesResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmGetManagedTypesResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMGetManagedTypesResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMManagedTypeInfo }
     * 
     * 
     */
    public List<RMManagedTypeInfo> getRMGetManagedTypesResult() {
        if (rmGetManagedTypesResult == null) {
            rmGetManagedTypesResult = new ArrayList<RMManagedTypeInfo>();
        }
        return this.rmGetManagedTypesResult;
    }

}
