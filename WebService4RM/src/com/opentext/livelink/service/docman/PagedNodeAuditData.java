
package com.opentext.livelink.service.docman;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.opentext.livelink.service.core.PageHandle;


/**
 * <p>Java class for PagedNodeAuditData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagedNodeAuditData">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="AuditRecords" type="{urn:DocMan.service.livelink.opentext.com}NodeAuditRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PageHandle" type="{urn:Core.service.livelink.opentext.com}PageHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagedNodeAuditData", propOrder = {
    "auditRecords",
    "pageHandle"
})
public class PagedNodeAuditData
    extends ServiceDataObject
{

    @XmlElement(name = "AuditRecords")
    protected List<NodeAuditRecord> auditRecords;
    @XmlElement(name = "PageHandle")
    protected PageHandle pageHandle;

    /**
     * Gets the value of the auditRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeAuditRecord }
     * 
     * 
     */
    public List<NodeAuditRecord> getAuditRecords() {
        if (auditRecords == null) {
            auditRecords = new ArrayList<NodeAuditRecord>();
        }
        return this.auditRecords;
    }

    /**
     * Gets the value of the pageHandle property.
     * 
     * @return
     *     possible object is
     *     {@link PageHandle }
     *     
     */
    public PageHandle getPageHandle() {
        return pageHandle;
    }

    /**
     * Sets the value of the pageHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageHandle }
     *     
     */
    public void setPageHandle(PageHandle value) {
        this.pageHandle = value;
    }

}
