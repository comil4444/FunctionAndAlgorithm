
package com.opentext.livelink.service.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimitiveValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimitiveValue">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Core.service.livelink.opentext.com}DataValue">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimitiveValue")
@XmlSeeAlso({
    IntegerValue.class,
    RealValue.class,
    StringValue.class,
    BooleanValue.class,
    DateValue.class
})
public class PrimitiveValue
    extends DataValue
{


}
