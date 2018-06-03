
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodePermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodePermissions">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="AddItemsPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeletePermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeleteVersionsPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditAttributesPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditPermissionsPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ModifyPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReservePermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SeeContentsPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SeePermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodePermissions", propOrder = {
    "addItemsPermission",
    "deletePermission",
    "deleteVersionsPermission",
    "editAttributesPermission",
    "editPermissionsPermission",
    "modifyPermission",
    "reservePermission",
    "seeContentsPermission",
    "seePermission"
})
public class NodePermissions
    extends ServiceDataObject
{

    @XmlElement(name = "AddItemsPermission")
    protected boolean addItemsPermission;
    @XmlElement(name = "DeletePermission")
    protected boolean deletePermission;
    @XmlElement(name = "DeleteVersionsPermission")
    protected boolean deleteVersionsPermission;
    @XmlElement(name = "EditAttributesPermission")
    protected boolean editAttributesPermission;
    @XmlElement(name = "EditPermissionsPermission")
    protected boolean editPermissionsPermission;
    @XmlElement(name = "ModifyPermission")
    protected boolean modifyPermission;
    @XmlElement(name = "ReservePermission")
    protected boolean reservePermission;
    @XmlElement(name = "SeeContentsPermission")
    protected boolean seeContentsPermission;
    @XmlElement(name = "SeePermission")
    protected boolean seePermission;

    /**
     * Gets the value of the addItemsPermission property.
     * 
     */
    public boolean isAddItemsPermission() {
        return addItemsPermission;
    }

    /**
     * Sets the value of the addItemsPermission property.
     * 
     */
    public void setAddItemsPermission(boolean value) {
        this.addItemsPermission = value;
    }

    /**
     * Gets the value of the deletePermission property.
     * 
     */
    public boolean isDeletePermission() {
        return deletePermission;
    }

    /**
     * Sets the value of the deletePermission property.
     * 
     */
    public void setDeletePermission(boolean value) {
        this.deletePermission = value;
    }

    /**
     * Gets the value of the deleteVersionsPermission property.
     * 
     */
    public boolean isDeleteVersionsPermission() {
        return deleteVersionsPermission;
    }

    /**
     * Sets the value of the deleteVersionsPermission property.
     * 
     */
    public void setDeleteVersionsPermission(boolean value) {
        this.deleteVersionsPermission = value;
    }

    /**
     * Gets the value of the editAttributesPermission property.
     * 
     */
    public boolean isEditAttributesPermission() {
        return editAttributesPermission;
    }

    /**
     * Sets the value of the editAttributesPermission property.
     * 
     */
    public void setEditAttributesPermission(boolean value) {
        this.editAttributesPermission = value;
    }

    /**
     * Gets the value of the editPermissionsPermission property.
     * 
     */
    public boolean isEditPermissionsPermission() {
        return editPermissionsPermission;
    }

    /**
     * Sets the value of the editPermissionsPermission property.
     * 
     */
    public void setEditPermissionsPermission(boolean value) {
        this.editPermissionsPermission = value;
    }

    /**
     * Gets the value of the modifyPermission property.
     * 
     */
    public boolean isModifyPermission() {
        return modifyPermission;
    }

    /**
     * Sets the value of the modifyPermission property.
     * 
     */
    public void setModifyPermission(boolean value) {
        this.modifyPermission = value;
    }

    /**
     * Gets the value of the reservePermission property.
     * 
     */
    public boolean isReservePermission() {
        return reservePermission;
    }

    /**
     * Sets the value of the reservePermission property.
     * 
     */
    public void setReservePermission(boolean value) {
        this.reservePermission = value;
    }

    /**
     * Gets the value of the seeContentsPermission property.
     * 
     */
    public boolean isSeeContentsPermission() {
        return seeContentsPermission;
    }

    /**
     * Sets the value of the seeContentsPermission property.
     * 
     */
    public void setSeeContentsPermission(boolean value) {
        this.seeContentsPermission = value;
    }

    /**
     * Gets the value of the seePermission property.
     * 
     */
    public boolean isSeePermission() {
        return seePermission;
    }

    /**
     * Sets the value of the seePermission property.
     * 
     */
    public void setSeePermission(boolean value) {
        this.seePermission = value;
    }

}
