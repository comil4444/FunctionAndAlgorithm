
package com.opentext.livelink.service.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowValue">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Core.service.livelink.opentext.com}DataValue">
 *       &lt;sequence>
 *         &lt;element name="Values" type="{urn:Core.service.livelink.opentext.com}DataValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowValue", propOrder = {
    "values"
})
public class RowValue
    extends DataValue
{

    @XmlElement(name = "Values")
    protected List<DataValue> values;

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataValue }
     * 
     * 
     */
    public List<DataValue> getValues() {
        if (values == null) {
            values = new ArrayList<DataValue>();
        }
        return this.values;
    }

}
