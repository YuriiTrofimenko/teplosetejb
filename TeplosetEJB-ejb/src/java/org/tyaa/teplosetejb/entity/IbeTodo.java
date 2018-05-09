/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "IBE$TODO")
@NamedQueries({
    @NamedQuery(name = "IbeTodo.findAll", query = "SELECT i FROM IbeTodo i")})
public class IbeTodo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITEM_ID")
    private Integer itemId;
    @Size(max = 64)
    @Column(name = "OBJECT_NAME")
    private String objectName;
    @Column(name = "OBJECT_TYPE")
    private Integer objectType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITEM_PRIORITY")
    private short itemPriority;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITEM_STATE")
    private short itemState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ITEM_CAPTION")
    private String itemCaption;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;
    @Size(max = 64)
    @Column(name = "RESPONSIBLE_PERSON")
    private String responsiblePerson;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITEM_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemTimestamp;
    @Column(name = "ITEM_DEADLINE")
    @Temporal(TemporalType.DATE)
    private Date itemDeadline;
    @Size(max = 64)
    @Column(name = "ITEM_CATEGORY")
    private String itemCategory;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "ITEM_OWNER")
    private String itemOwner;

    public IbeTodo() {
    }

    public IbeTodo(Integer itemId) {
        this.itemId = itemId;
    }

    public IbeTodo(Integer itemId, short itemPriority, short itemState, String itemCaption, Date itemTimestamp, String itemOwner) {
        this.itemId = itemId;
        this.itemPriority = itemPriority;
        this.itemState = itemState;
        this.itemCaption = itemCaption;
        this.itemTimestamp = itemTimestamp;
        this.itemOwner = itemOwner;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public short getItemPriority() {
        return itemPriority;
    }

    public void setItemPriority(short itemPriority) {
        this.itemPriority = itemPriority;
    }

    public short getItemState() {
        return itemState;
    }

    public void setItemState(short itemState) {
        this.itemState = itemState;
    }

    public String getItemCaption() {
        return itemCaption;
    }

    public void setItemCaption(String itemCaption) {
        this.itemCaption = itemCaption;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public Date getItemTimestamp() {
        return itemTimestamp;
    }

    public void setItemTimestamp(Date itemTimestamp) {
        this.itemTimestamp = itemTimestamp;
    }

    public Date getItemDeadline() {
        return itemDeadline;
    }

    public void setItemDeadline(Date itemDeadline) {
        this.itemDeadline = itemDeadline;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemOwner() {
        return itemOwner;
    }

    public void setItemOwner(String itemOwner) {
        this.itemOwner = itemOwner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IbeTodo)) {
            return false;
        }
        IbeTodo other = (IbeTodo) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.IbeTodo[ itemId=" + itemId + " ]";
    }
    
}
