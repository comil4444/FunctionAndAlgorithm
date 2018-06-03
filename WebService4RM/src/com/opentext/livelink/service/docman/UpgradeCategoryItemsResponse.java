
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpgradeCategoryItemsResult" type="{urn:DocMan.service.livelink.opentext.com}CategoryItemsUpgradeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "upgradeCategoryItemsResult"
})
@XmlRootElement(name = "UpgradeCategoryItemsResponse")
public class UpgradeCategoryItemsResponse {

    @XmlElement(name = "UpgradeCategoryItemsResult")
    protected CategoryItemsUpgradeInfo upgradeCategoryItemsResult;

    /**
     * Gets the value of the upgradeCategoryItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryItemsUpgradeInfo }
     *     
     */
    public CategoryItemsUpgradeInfo getUpgradeCategoryItemsResult() {
        return upgradeCategoryItemsResult;
    }

    /**
     * Sets the value of the upgradeCategoryItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryItemsUpgradeInfo }
     *     
     */
    public void setUpgradeCategoryItemsResult(CategoryItemsUpgradeInfo value) {
        this.upgradeCategoryItemsResult = value;
    }

}
