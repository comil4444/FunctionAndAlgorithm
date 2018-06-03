
package com.opentext.livelink.service.docman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.core.DataValue;


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
 *         &lt;element name="reportID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="inputs" type="{urn:Core.service.livelink.opentext.com}DataValue" maxOccurs="unbounded" minOccurs="0"/>
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
    "reportID",
    "inputs"
})
@XmlRootElement(name = "RunReport")
public class RunReport {

    protected long reportID;
    @XmlElement(nillable = true)
    protected List<DataValue> inputs;

    /**
     * Gets the value of the reportID property.
     * 
     */
    public long getReportID() {
        return reportID;
    }

    /**
     * Sets the value of the reportID property.
     * 
     */
    public void setReportID(long value) {
        this.reportID = value;
    }

    /**
     * Gets the value of the inputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataValue }
     * 
     * 
     */
    public List<DataValue> getInputs() {
        if (inputs == null) {
            inputs = new ArrayList<DataValue>();
        }
        return this.inputs;
    }

}
