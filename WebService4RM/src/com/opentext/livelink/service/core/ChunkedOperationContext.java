
package com.opentext.livelink.service.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChunkedOperationContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChunkedOperationContext">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Core.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="ChunkSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContextID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Finished" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChunkedOperationContext", propOrder = {
    "chunkSize",
    "contextID",
    "finished"
})
public class ChunkedOperationContext
    extends ServiceDataObject
{

    @XmlElement(name = "ChunkSize", required = true, type = Integer.class, nillable = true)
    protected Integer chunkSize;
    @XmlElement(name = "ContextID", required = true, type = Integer.class, nillable = true)
    protected Integer contextID;
    @XmlElement(name = "Finished")
    protected boolean finished;

    /**
     * Gets the value of the chunkSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChunkSize() {
        return chunkSize;
    }

    /**
     * Sets the value of the chunkSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChunkSize(Integer value) {
        this.chunkSize = value;
    }

    /**
     * Gets the value of the contextID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContextID() {
        return contextID;
    }

    /**
     * Sets the value of the contextID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContextID(Integer value) {
        this.contextID = value;
    }

    /**
     * Gets the value of the finished property.
     * 
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Sets the value of the finished property.
     * 
     */
    public void setFinished(boolean value) {
        this.finished = value;
    }

}
