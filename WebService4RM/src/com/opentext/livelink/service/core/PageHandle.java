
package com.opentext.livelink.service.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageHandle">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Core.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="FinalPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NumberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageHandleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageHandle", propOrder = {
    "finalPage",
    "numberOfPages",
    "pageHandleID",
    "pageNumber",
    "pageSize"
})
public class PageHandle
    extends ServiceDataObject
{

    @XmlElement(name = "FinalPage")
    protected boolean finalPage;
    @XmlElement(name = "NumberOfPages", required = true, type = Integer.class, nillable = true)
    protected Integer numberOfPages;
    @XmlElement(name = "PageHandleID", required = true, type = Integer.class, nillable = true)
    protected Integer pageHandleID;
    @XmlElement(name = "PageNumber", required = true, type = Integer.class, nillable = true)
    protected Integer pageNumber;
    @XmlElement(name = "PageSize")
    protected int pageSize;

    /**
     * Gets the value of the finalPage property.
     * 
     */
    public boolean isFinalPage() {
        return finalPage;
    }

    /**
     * Sets the value of the finalPage property.
     * 
     */
    public void setFinalPage(boolean value) {
        this.finalPage = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPages(Integer value) {
        this.numberOfPages = value;
    }

    /**
     * Gets the value of the pageHandleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageHandleID() {
        return pageHandleID;
    }

    /**
     * Sets the value of the pageHandleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageHandleID(Integer value) {
        this.pageHandleID = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

}
