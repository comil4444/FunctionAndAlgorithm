
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMFuncAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMFuncAccess">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="FuncID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMFuncAccess", propOrder = {
    "funcID",
    "value"
})
public class RMFuncAccess
    extends ServiceDataObject
{

    @XmlElement(name = "FuncID")
    protected int funcID;
    @XmlElement(name = "Value")
    protected boolean value;

    /**
     * Gets the value of the funcID property.
     * 
     */
    public int getFuncID() {
        return funcID;
    }

    /**
     * Sets the value of the funcID property.
     * 
     */
    public void setFuncID(int value) {
        this.funcID = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

}
