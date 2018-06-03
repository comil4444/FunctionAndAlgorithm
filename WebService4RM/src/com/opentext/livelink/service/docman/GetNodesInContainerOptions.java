
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNodesInContainerOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNodesInContainerOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="MaxDepth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNodesInContainerOptions", propOrder = {
    "maxDepth",
    "maxResults"
})
public class GetNodesInContainerOptions
    extends ServiceDataObject
{

    @XmlElement(name = "MaxDepth")
    protected int maxDepth;
    @XmlElement(name = "MaxResults")
    protected int maxResults;

    /**
     * Gets the value of the maxDepth property.
     * 
     */
    public int getMaxDepth() {
        return maxDepth;
    }

    /**
     * Sets the value of the maxDepth property.
     * 
     */
    public void setMaxDepth(int value) {
        this.maxDepth = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     */
    public int getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     */
    public void setMaxResults(int value) {
        this.maxResults = value;
    }

}
