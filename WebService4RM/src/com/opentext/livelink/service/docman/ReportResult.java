
package com.opentext.livelink.service.docman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.core.RowValue;


/**
 * <p>Java class for ReportResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Contents" type="{urn:Core.service.livelink.opentext.com}RowValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IsLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SubReportID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SubReportParameters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportResult", propOrder = {
    "contents",
    "isLimit",
    "subReportID",
    "subReportParameters",
    "title"
})
public class ReportResult
    extends ServiceDataObject
{

    @XmlElement(name = "Contents")
    protected List<RowValue> contents;
    @XmlElement(name = "IsLimit")
    protected boolean isLimit;
    @XmlElement(name = "SubReportID", required = true, type = Long.class, nillable = true)
    protected Long subReportID;
    @XmlElement(name = "SubReportParameters")
    protected List<String> subReportParameters;
    @XmlElement(name = "Title")
    protected String title;

    /**
     * Gets the value of the contents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowValue }
     * 
     * 
     */
    public List<RowValue> getContents() {
        if (contents == null) {
            contents = new ArrayList<RowValue>();
        }
        return this.contents;
    }

    /**
     * Gets the value of the isLimit property.
     * 
     */
    public boolean isIsLimit() {
        return isLimit;
    }

    /**
     * Sets the value of the isLimit property.
     * 
     */
    public void setIsLimit(boolean value) {
        this.isLimit = value;
    }

    /**
     * Gets the value of the subReportID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubReportID() {
        return subReportID;
    }

    /**
     * Sets the value of the subReportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubReportID(Long value) {
        this.subReportID = value;
    }

    /**
     * Gets the value of the subReportParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subReportParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubReportParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubReportParameters() {
        if (subReportParameters == null) {
            subReportParameters = new ArrayList<String>();
        }
        return this.subReportParameters;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
