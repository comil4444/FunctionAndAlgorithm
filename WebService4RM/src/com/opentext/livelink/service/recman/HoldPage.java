
package com.opentext.livelink.service.recman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoldPage">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Completed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DataIDs" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TypeReturned" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldPage", propOrder = {
    "completed",
    "dataIDs",
    "typeReturned"
})
public class HoldPage
    extends ServiceDataObject
{

    @XmlElement(name = "Completed")
    protected boolean completed;
    @XmlElement(name = "DataIDs", type = Long.class)
    protected List<Long> dataIDs;
    @XmlElement(name = "TypeReturned")
    protected int typeReturned;

    /**
     * Gets the value of the completed property.
     * 
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     */
    public void setCompleted(boolean value) {
        this.completed = value;
    }

    /**
     * Gets the value of the dataIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDataIDs() {
        if (dataIDs == null) {
            dataIDs = new ArrayList<Long>();
        }
        return this.dataIDs;
    }

    /**
     * Gets the value of the typeReturned property.
     * 
     */
    public int getTypeReturned() {
        return typeReturned;
    }

    /**
     * Sets the value of the typeReturned property.
     * 
     */
    public void setTypeReturned(int value) {
        this.typeReturned = value;
    }

}
