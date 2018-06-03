
package com.opentext.livelink.service.docman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodePageSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodePageSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="ContainersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExcludeTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludeHiddenNodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NameFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TypeFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodePageSpecification", propOrder = {
    "containersOnly",
    "excludeTypes",
    "includeHiddenNodes",
    "includeTypes",
    "nameFilter",
    "pageContext",
    "pageNumber",
    "pageSize",
    "typeFilter"
})
public class NodePageSpecification
    extends ServiceDataObject
{

    @XmlElement(name = "ContainersOnly")
    protected boolean containersOnly;
    @XmlElement(name = "ExcludeTypes")
    protected List<String> excludeTypes;
    @XmlElement(name = "IncludeHiddenNodes")
    protected boolean includeHiddenNodes;
    @XmlElement(name = "IncludeTypes")
    protected List<String> includeTypes;
    @XmlElement(name = "NameFilter")
    protected String nameFilter;
    @XmlElement(name = "PageContext")
    protected String pageContext;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "PageSize")
    protected int pageSize;
    @XmlElement(name = "TypeFilter")
    protected String typeFilter;

    /**
     * Gets the value of the containersOnly property.
     * 
     */
    public boolean isContainersOnly() {
        return containersOnly;
    }

    /**
     * Sets the value of the containersOnly property.
     * 
     */
    public void setContainersOnly(boolean value) {
        this.containersOnly = value;
    }

    /**
     * Gets the value of the excludeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeTypes() {
        if (excludeTypes == null) {
            excludeTypes = new ArrayList<String>();
        }
        return this.excludeTypes;
    }

    /**
     * Gets the value of the includeHiddenNodes property.
     * 
     */
    public boolean isIncludeHiddenNodes() {
        return includeHiddenNodes;
    }

    /**
     * Sets the value of the includeHiddenNodes property.
     * 
     */
    public void setIncludeHiddenNodes(boolean value) {
        this.includeHiddenNodes = value;
    }

    /**
     * Gets the value of the includeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludeTypes() {
        if (includeTypes == null) {
            includeTypes = new ArrayList<String>();
        }
        return this.includeTypes;
    }

    /**
     * Gets the value of the nameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFilter() {
        return nameFilter;
    }

    /**
     * Sets the value of the nameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFilter(String value) {
        this.nameFilter = value;
    }

    /**
     * Gets the value of the pageContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageContext() {
        return pageContext;
    }

    /**
     * Sets the value of the pageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageContext(String value) {
        this.pageContext = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
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

    /**
     * Gets the value of the typeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeFilter() {
        return typeFilter;
    }

    /**
     * Sets the value of the typeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeFilter(String value) {
        this.typeFilter = value;
    }

}
