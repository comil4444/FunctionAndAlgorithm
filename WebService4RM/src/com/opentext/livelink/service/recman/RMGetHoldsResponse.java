
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
 *         &lt;element name="RMGetHoldsResult" type="{urn:RecMan.service.livelink.opentext.com}RMHoldInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "rmGetHoldsResult"
})
@XmlRootElement(name = "RMGetHoldsResponse")
public class RMGetHoldsResponse {

    @XmlElement(name = "RMGetHoldsResult", nillable = true)
    protected List<RMHoldInfo> rmGetHoldsResult;

    /**
     * Gets the value of the rmGetHoldsResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmGetHoldsResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMGetHoldsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMHoldInfo }
     * 
     * 
     */
    public List<RMHoldInfo> getRMGetHoldsResult() {
        if (rmGetHoldsResult == null) {
            rmGetHoldsResult = new ArrayList<RMHoldInfo>();
        }
        return this.rmGetHoldsResult;
    }

}
