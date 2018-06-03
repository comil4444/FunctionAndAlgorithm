
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimitiveAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimitiveAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}Attribute">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimitiveAttribute")
@XmlSeeAlso({
    RealAttribute.class,
    UserAttribute.class,
    DateAttribute.class,
    IntegerAttribute.class,
    BooleanAttribute.class,
    ItemReferenceAttribute.class,
    MultiLineAttribute.class,
    StringAttribute.class
})
public class PrimitiveAttribute
    extends Attribute
{


}
