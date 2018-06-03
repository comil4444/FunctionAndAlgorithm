
package com.opentext.livelink.service.recman;

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
 *         &lt;element name="HoldID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ItemsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemsAndChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="classifiedItems" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="boxContents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="boxesOfParent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="boxesOfChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="classParents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="classChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "holdID",
    "itemsPerPage",
    "pageNumber",
    "itemsAndChildren",
    "parents",
    "classifiedItems",
    "boxContents",
    "boxesOfParent",
    "boxesOfChildren",
    "classParents",
    "classChildren"
})
@XmlRootElement(name = "HoldRetrieveItems")
public class HoldRetrieveItems {

    @XmlElement(name = "HoldID")
    protected long holdID;
    @XmlElement(name = "ItemsPerPage")
    protected int itemsPerPage;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    protected boolean itemsAndChildren;
    protected boolean parents;
    protected boolean classifiedItems;
    protected boolean boxContents;
    protected boolean boxesOfParent;
    protected boolean boxesOfChildren;
    protected boolean classParents;
    protected boolean classChildren;

    /**
     * Gets the value of the holdID property.
     * 
     */
    public long getHoldID() {
        return holdID;
    }

    /**
     * Sets the value of the holdID property.
     * 
     */
    public void setHoldID(long value) {
        this.holdID = value;
    }

    /**
     * Gets the value of the itemsPerPage property.
     * 
     */
    public int getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Sets the value of the itemsPerPage property.
     * 
     */
    public void setItemsPerPage(int value) {
        this.itemsPerPage = value;
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
     * Gets the value of the itemsAndChildren property.
     * 
     */
    public boolean isItemsAndChildren() {
        return itemsAndChildren;
    }

    /**
     * Sets the value of the itemsAndChildren property.
     * 
     */
    public void setItemsAndChildren(boolean value) {
        this.itemsAndChildren = value;
    }

    /**
     * Gets the value of the parents property.
     * 
     */
    public boolean isParents() {
        return parents;
    }

    /**
     * Sets the value of the parents property.
     * 
     */
    public void setParents(boolean value) {
        this.parents = value;
    }

    /**
     * Gets the value of the classifiedItems property.
     * 
     */
    public boolean isClassifiedItems() {
        return classifiedItems;
    }

    /**
     * Sets the value of the classifiedItems property.
     * 
     */
    public void setClassifiedItems(boolean value) {
        this.classifiedItems = value;
    }

    /**
     * Gets the value of the boxContents property.
     * 
     */
    public boolean isBoxContents() {
        return boxContents;
    }

    /**
     * Sets the value of the boxContents property.
     * 
     */
    public void setBoxContents(boolean value) {
        this.boxContents = value;
    }

    /**
     * Gets the value of the boxesOfParent property.
     * 
     */
    public boolean isBoxesOfParent() {
        return boxesOfParent;
    }

    /**
     * Sets the value of the boxesOfParent property.
     * 
     */
    public void setBoxesOfParent(boolean value) {
        this.boxesOfParent = value;
    }

    /**
     * Gets the value of the boxesOfChildren property.
     * 
     */
    public boolean isBoxesOfChildren() {
        return boxesOfChildren;
    }

    /**
     * Sets the value of the boxesOfChildren property.
     * 
     */
    public void setBoxesOfChildren(boolean value) {
        this.boxesOfChildren = value;
    }

    /**
     * Gets the value of the classParents property.
     * 
     */
    public boolean isClassParents() {
        return classParents;
    }

    /**
     * Sets the value of the classParents property.
     * 
     */
    public void setClassParents(boolean value) {
        this.classParents = value;
    }

    /**
     * Gets the value of the classChildren property.
     * 
     */
    public boolean isClassChildren() {
        return classChildren;
    }

    /**
     * Sets the value of the classChildren property.
     * 
     */
    public void setClassChildren(boolean value) {
        this.classChildren = value;
    }

}
