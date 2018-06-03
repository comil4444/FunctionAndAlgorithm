
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.core.ChunkedOperationContext;


/**
 * <p>Java class for NodeRightUpdateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeRightUpdateInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Context" type="{urn:Core.service.livelink.opentext.com}ChunkedOperationContext" minOccurs="0"/>
 *         &lt;element name="NodeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SkippedNodeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalNodeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeRightUpdateInfo", propOrder = {
    "context",
    "nodeCount",
    "skippedNodeCount",
    "totalNodeCount"
})
public class NodeRightUpdateInfo
    extends ServiceDataObject
{

    @XmlElement(name = "Context")
    protected ChunkedOperationContext context;
    @XmlElement(name = "NodeCount")
    protected int nodeCount;
    @XmlElement(name = "SkippedNodeCount")
    protected int skippedNodeCount;
    @XmlElement(name = "TotalNodeCount")
    protected int totalNodeCount;

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
     * Gets the value of the nodeCount property.
     * 
     */
    public int getNodeCount() {
        return nodeCount;
    }

    /**
     * Sets the value of the nodeCount property.
     * 
     */
    public void setNodeCount(int value) {
        this.nodeCount = value;
    }

    /**
     * Gets the value of the skippedNodeCount property.
     * 
     */
    public int getSkippedNodeCount() {
        return skippedNodeCount;
    }

    /**
     * Sets the value of the skippedNodeCount property.
     * 
     */
    public void setSkippedNodeCount(int value) {
        this.skippedNodeCount = value;
    }

    /**
     * Gets the value of the totalNodeCount property.
     * 
     */
    public int getTotalNodeCount() {
        return totalNodeCount;
    }

    /**
     * Sets the value of the totalNodeCount property.
     * 
     */
    public void setTotalNodeCount(int value) {
        this.totalNodeCount = value;
    }

}
