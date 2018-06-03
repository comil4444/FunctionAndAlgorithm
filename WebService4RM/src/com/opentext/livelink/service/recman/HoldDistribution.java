
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldDistribution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoldDistribution">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="CountBoxContents" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountBoxOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountBoxOfParents" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountChildrenOfRMClass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountDirectAndChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountFromClasssification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountParentOfRMClass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountParents" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldDistribution", propOrder = {
    "countBoxContents",
    "countBoxOfChildren",
    "countBoxOfParents",
    "countChildrenOfRMClass",
    "countDirectAndChildren",
    "countFromClasssification",
    "countParentOfRMClass",
    "countParents"
})
public class HoldDistribution
    extends ServiceDataObject
{

    @XmlElement(name = "CountBoxContents")
    protected int countBoxContents;
    @XmlElement(name = "CountBoxOfChildren")
    protected int countBoxOfChildren;
    @XmlElement(name = "CountBoxOfParents")
    protected int countBoxOfParents;
    @XmlElement(name = "CountChildrenOfRMClass")
    protected int countChildrenOfRMClass;
    @XmlElement(name = "CountDirectAndChildren")
    protected int countDirectAndChildren;
    @XmlElement(name = "CountFromClasssification")
    protected int countFromClasssification;
    @XmlElement(name = "CountParentOfRMClass")
    protected int countParentOfRMClass;
    @XmlElement(name = "CountParents")
    protected int countParents;

    /**
     * Gets the value of the countBoxContents property.
     * 
     */
    public int getCountBoxContents() {
        return countBoxContents;
    }

    /**
     * Sets the value of the countBoxContents property.
     * 
     */
    public void setCountBoxContents(int value) {
        this.countBoxContents = value;
    }

    /**
     * Gets the value of the countBoxOfChildren property.
     * 
     */
    public int getCountBoxOfChildren() {
        return countBoxOfChildren;
    }

    /**
     * Sets the value of the countBoxOfChildren property.
     * 
     */
    public void setCountBoxOfChildren(int value) {
        this.countBoxOfChildren = value;
    }

    /**
     * Gets the value of the countBoxOfParents property.
     * 
     */
    public int getCountBoxOfParents() {
        return countBoxOfParents;
    }

    /**
     * Sets the value of the countBoxOfParents property.
     * 
     */
    public void setCountBoxOfParents(int value) {
        this.countBoxOfParents = value;
    }

    /**
     * Gets the value of the countChildrenOfRMClass property.
     * 
     */
    public int getCountChildrenOfRMClass() {
        return countChildrenOfRMClass;
    }

    /**
     * Sets the value of the countChildrenOfRMClass property.
     * 
     */
    public void setCountChildrenOfRMClass(int value) {
        this.countChildrenOfRMClass = value;
    }

    /**
     * Gets the value of the countDirectAndChildren property.
     * 
     */
    public int getCountDirectAndChildren() {
        return countDirectAndChildren;
    }

    /**
     * Sets the value of the countDirectAndChildren property.
     * 
     */
    public void setCountDirectAndChildren(int value) {
        this.countDirectAndChildren = value;
    }

    /**
     * Gets the value of the countFromClasssification property.
     * 
     */
    public int getCountFromClasssification() {
        return countFromClasssification;
    }

    /**
     * Sets the value of the countFromClasssification property.
     * 
     */
    public void setCountFromClasssification(int value) {
        this.countFromClasssification = value;
    }

    /**
     * Gets the value of the countParentOfRMClass property.
     * 
     */
    public int getCountParentOfRMClass() {
        return countParentOfRMClass;
    }

    /**
     * Sets the value of the countParentOfRMClass property.
     * 
     */
    public void setCountParentOfRMClass(int value) {
        this.countParentOfRMClass = value;
    }

    /**
     * Gets the value of the countParents property.
     * 
     */
    public int getCountParents() {
        return countParents;
    }

    /**
     * Sets the value of the countParents property.
     * 
     */
    public void setCountParents(int value) {
        this.countParents = value;
    }

}
