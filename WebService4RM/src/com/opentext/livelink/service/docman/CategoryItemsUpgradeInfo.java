
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.core.ChunkedOperationContext;


/**
 * <p>Java class for CategoryItemsUpgradeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryItemsUpgradeInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Context" type="{urn:Core.service.livelink.opentext.com}ChunkedOperationContext" minOccurs="0"/>
 *         &lt;element name="SkippedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UpgradedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryItemsUpgradeInfo", propOrder = {
    "context",
    "skippedCount",
    "upgradedCount"
})
public class CategoryItemsUpgradeInfo
    extends ServiceDataObject
{

    @XmlElement(name = "Context")
    protected ChunkedOperationContext context;
    @XmlElement(name = "SkippedCount")
    protected int skippedCount;
    @XmlElement(name = "UpgradedCount")
    protected int upgradedCount;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ChunkedOperationContext }
     *     
     */
    public ChunkedOperationContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChunkedOperationContext }
     *     
     */
    public void setContext(ChunkedOperationContext value) {
        this.context = value;
    }

    /**
     * Gets the value of the skippedCount property.
     * 
     */
    public int getSkippedCount() {
        return skippedCount;
    }

    /**
     * Sets the value of the skippedCount property.
     * 
     */
    public void setSkippedCount(int value) {
        this.skippedCount = value;
    }

    /**
     * Gets the value of the upgradedCount property.
     * 
     */
    public int getUpgradedCount() {
        return upgradedCount;
    }

    /**
     * Sets the value of the upgradedCount property.
     * 
     */
    public void setUpgradedCount(int value) {
        this.upgradedCount = value;
    }

}
