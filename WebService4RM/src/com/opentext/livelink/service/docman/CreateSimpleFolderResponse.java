
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
 *         &lt;element name="CreateSimpleFolderResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "createSimpleFolderResult"
})
@XmlRootElement(name = "CreateSimpleFolderResponse")
public class CreateSimpleFolderResponse {

    @XmlElement(name = "CreateSimpleFolderResult")
    protected long createSimpleFolderResult;

    /**
     * Gets the value of the createSimpleFolderResult property.
     * 
     */
    public long getCreateSimpleFolderResult() {
        return createSimpleFolderResult;
    }

    /**
     * Sets the value of the createSimpleFolderResult property.
     * 
     */
    public void setCreateSimpleFolderResult(long value) {
        this.createSimpleFolderResult = value;
    }

}
