
package com.opentext.livelink.service.recman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDataObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDataObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDataObject")
@XmlSeeAlso({
    RMHoldDocInfo.class,
    RMAdditionalInfo.class,
    ProvenanceInfo.class,
    RMClassDefInfo.class,
    RMCodesInfo.class,
    RMFuncAccess.class,
    RMHoldInfo.class,
    RMRSIRetention.class,
    HoldDistribution.class,
    RMManagedTypeInfo.class,
    HoldPage.class,
    RMAttributeGroupDefinition.class,
    RMClassProvider.class,
    RMXRefInfo.class,
    RMStorage.class,
    RMRSI.class,
    RMHoldType.class,
    RMDocXRefTyp.class,
    RMCyclePeriod.class,
    RMEssCode.class,
    RMAccession.class,
    RMStatusCode.class,
    RMField.class
})
public abstract class ServiceDataObject {


}
