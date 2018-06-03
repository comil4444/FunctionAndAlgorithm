
package com.opentext.livelink.service.recman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMCodesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMCodesInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:RecMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="RMAccession" type="{urn:RecMan.service.livelink.opentext.com}RMAccession" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RMCyclePeriod" type="{urn:RecMan.service.livelink.opentext.com}RMCyclePeriod" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RMDocXRefTyp" type="{urn:RecMan.service.livelink.opentext.com}RMDocXRefTyp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RMEssCode" type="{urn:RecMan.service.livelink.opentext.com}RMEssCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RMHoldType" type="{urn:RecMan.service.livelink.opentext.com}RMHoldType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RMRSI" type="{urn:RecMan.service.livelink.opentext.com}RMRSI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RMStatusCode" type="{urn:RecMan.service.livelink.opentext.com}RMStatusCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RMStorage" type="{urn:RecMan.service.livelink.opentext.com}RMStorage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMCodesInfo", propOrder = {
    "rmAccession",
    "rmCyclePeriod",
    "rmDocXRefTyp",
    "rmEssCode",
    "rmHoldType",
    "rmrsi",
    "rmStatusCode",
    "rmStorage"
})
public class RMCodesInfo
    extends ServiceDataObject
{

    @XmlElement(name = "RMAccession")
    protected List<RMAccession> rmAccession;
    @XmlElement(name = "RMCyclePeriod")
    protected List<RMCyclePeriod> rmCyclePeriod;
    @XmlElement(name = "RMDocXRefTyp")
    protected List<RMDocXRefTyp> rmDocXRefTyp;
    @XmlElement(name = "RMEssCode")
    protected List<RMEssCode> rmEssCode;
    @XmlElement(name = "RMHoldType")
    protected List<RMHoldType> rmHoldType;
    @XmlElement(name = "RMRSI")
    protected List<RMRSI> rmrsi;
    @XmlElement(name = "RMStatusCode")
    protected List<RMStatusCode> rmStatusCode;
    @XmlElement(name = "RMStorage")
    protected List<RMStorage> rmStorage;

    /**
     * Gets the value of the rmAccession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmAccession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMAccession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMAccession }
     * 
     * 
     */
    public List<RMAccession> getRMAccession() {
        if (rmAccession == null) {
            rmAccession = new ArrayList<RMAccession>();
        }
        return this.rmAccession;
    }

    /**
     * Gets the value of the rmCyclePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmCyclePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMCyclePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMCyclePeriod }
     * 
     * 
     */
    public List<RMCyclePeriod> getRMCyclePeriod() {
        if (rmCyclePeriod == null) {
            rmCyclePeriod = new ArrayList<RMCyclePeriod>();
        }
        return this.rmCyclePeriod;
    }

    /**
     * Gets the value of the rmDocXRefTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmDocXRefTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMDocXRefTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMDocXRefTyp }
     * 
     * 
     */
    public List<RMDocXRefTyp> getRMDocXRefTyp() {
        if (rmDocXRefTyp == null) {
            rmDocXRefTyp = new ArrayList<RMDocXRefTyp>();
        }
        return this.rmDocXRefTyp;
    }

    /**
     * Gets the value of the rmEssCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmEssCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMEssCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMEssCode }
     * 
     * 
     */
    public List<RMEssCode> getRMEssCode() {
        if (rmEssCode == null) {
            rmEssCode = new ArrayList<RMEssCode>();
        }
        return this.rmEssCode;
    }

    /**
     * Gets the value of the rmHoldType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmHoldType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMHoldType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMHoldType }
     * 
     * 
     */
    public List<RMHoldType> getRMHoldType() {
        if (rmHoldType == null) {
            rmHoldType = new ArrayList<RMHoldType>();
        }
        return this.rmHoldType;
    }

    /**
     * Gets the value of the rmrsi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmrsi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMRSI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMRSI }
     * 
     * 
     */
    public List<RMRSI> getRMRSI() {
        if (rmrsi == null) {
            rmrsi = new ArrayList<RMRSI>();
        }
        return this.rmrsi;
    }

    /**
     * Gets the value of the rmStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMStatusCode }
     * 
     * 
     */
    public List<RMStatusCode> getRMStatusCode() {
        if (rmStatusCode == null) {
            rmStatusCode = new ArrayList<RMStatusCode>();
        }
        return this.rmStatusCode;
    }

    /**
     * Gets the value of the rmStorage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmStorage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMStorage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMStorage }
     * 
     * 
     */
    public List<RMStorage> getRMStorage() {
        if (rmStorage == null) {
            rmStorage = new ArrayList<RMStorage>();
        }
        return this.rmStorage;
    }

}
