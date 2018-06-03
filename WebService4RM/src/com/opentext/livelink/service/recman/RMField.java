
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Add" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddReq" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CreateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InputType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TabReq" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMField", propOrder = {
    "add",
    "addReq",
    "createName",
    "inputType",
    "label",
    "name",
    "order",
    "size",
    "tabReq"
})
public class RMField
    extends ServiceDataObject
{

    @XmlElement(name = "Add")
    protected boolean add;
    @XmlElement(name = "AddReq")
    protected boolean addReq;
    @XmlElement(name = "CreateName", required = true, nillable = true)
    protected String createName;
    @XmlElement(name = "InputType")
    protected String inputType;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Order")
    protected int order;
    @XmlElement(name = "Size", required = true, nillable = true)
    protected String size;
    @XmlElement(name = "TabReq")
    protected boolean tabReq;

    /**
     * Gets the value of the add property.
     * 
     */
    public boolean isAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     */
    public void setAdd(boolean value) {
        this.add = value;
    }

    /**
     * Gets the value of the addReq property.
     * 
     */
    public boolean isAddReq() {
        return addReq;
    }

    /**
     * Sets the value of the addReq property.
     * 
     */
    public void setAddReq(boolean value) {
        this.addReq = value;
    }

    /**
     * Gets the value of the createName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * Sets the value of the createName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateName(String value) {
        this.createName = value;
    }

    /**
     * Gets the value of the inputType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * Sets the value of the inputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputType(String value) {
        this.inputType = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the tabReq property.
     * 
     */
    public boolean isTabReq() {
        return tabReq;
    }

    /**
     * Sets the value of the tabReq property.
     * 
     */
    public void setTabReq(boolean value) {
        this.tabReq = value;
    }

}
