
package com.opentext.livelink.service.docman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodePageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodePageResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Nodes" type="{urn:DocMan.service.livelink.opentext.com}Node" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NumberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodePageResult", propOrder = {
    "nodes",
    "numberOfPages",
    "pageContext",
    "pageNumber"
})
public class NodePageResult
    extends ServiceDataObject
{

    @XmlElement(name = "Nodes")
    protected List<Node> nodes;
    @XmlElement(name = "NumberOfPages")
    protected int numberOfPages;
    @XmlElement(name = "PageContext")
    protected String pageContext;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;

    /**
     * Gets the value of the nodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Node }
     * 
     * 
     */
    public List<Node> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<Node>();
        }
        return this.nodes;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     */
    public void setNumberOfPages(int value) {
        this.numberOfPages = value;
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

}
