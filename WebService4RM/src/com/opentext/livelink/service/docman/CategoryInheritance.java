
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryInheritance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryInheritance">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Inheritance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryInheritance", propOrder = {
    "categoryID",
    "inheritance"
})
public class CategoryInheritance
    extends ServiceDataObject
{

    @XmlElement(name = "CategoryID")
    protected long categoryID;
    @XmlElement(name = "Inheritance")
    protected boolean inheritance;

    /**
     * Gets the value of the categoryID property.
     * 
     */
    public long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     */
    public void setCategoryID(long value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the inheritance property.
     * 
     */
    public boolean isInheritance() {
        return inheritance;
    }

    /**
     * Sets the value of the inheritance property.
     * 
     */
    public void setInheritance(boolean value) {
        this.inheritance = value;
    }

}
