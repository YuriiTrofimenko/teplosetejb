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
@Table(name = "IBE$VERSION_HISTORY")
@NamedQueries({
    @NamedQuery(name = "IbeVersionHistory.findAll", query = "SELECT i FROM IbeVersionHistory i")})
public class IbeVersionHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IBE$VH_ID")
    private Integer ibeVhId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IBE$VH_MODIFY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ibeVhModifyDate;
    @Size(max = 67)
    @Column(name = "IBE$VH_USER_NAME")
    private String ibeVhUserName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IBE$VH_OBJECT_TYPE")
    private short ibeVhObjectType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 67)
    @Column(name = "IBE$VH_OBJECT_NAME")
    private String ibeVhObjectName;
    @Lob
    @Column(name = "IBE$VH_HEADER")
    private byte[] ibeVhHeader;
    @Lob
    @Column(name = "IBE$VH_BODY")
    private byte[] ibeVhBody;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "IBE$VH_DESCRIPTION")
    private String ibeVhDescription;

    public IbeVersionHistory() {
    }

    public IbeVersionHistory(Integer ibeVhId) {
        this.ibeVhId = ibeVhId;
    }

    public IbeVersionHistory(Integer ibeVhId, Date ibeVhModifyDate, short ibeVhObjectType, String ibeVhObjectName) {
        this.ibeVhId = ibeVhId;
        this.ibeVhModifyDate = ibeVhModifyDate;
        this.ibeVhObjectType = ibeVhObjectType;
        this.ibeVhObjectName = ibeVhObjectName;
    }

    public Integer getIbeVhId() {
        return ibeVhId;
    }

    public void setIbeVhId(Integer ibeVhId) {
        this.ibeVhId = ibeVhId;
    }

    public Date getIbeVhModifyDate() {
        return ibeVhModifyDate;
    }

    public void setIbeVhModifyDate(Date ibeVhModifyDate) {
        this.ibeVhModifyDate = ibeVhModifyDate;
    }

    public String getIbeVhUserName() {
        return ibeVhUserName;
    }

    public void setIbeVhUserName(String ibeVhUserName) {
        this.ibeVhUserName = ibeVhUserName;
    }

    public short getIbeVhObjectType() {
        return ibeVhObjectType;
    }

    public void setIbeVhObjectType(short ibeVhObjectType) {
        this.ibeVhObjectType = ibeVhObjectType;
    }

    public String getIbeVhObjectName() {
        return ibeVhObjectName;
    }

    public void setIbeVhObjectName(String ibeVhObjectName) {
        this.ibeVhObjectName = ibeVhObjectName;
    }

    public byte[] getIbeVhHeader() {
        return ibeVhHeader;
    }

    public void setIbeVhHeader(byte[] ibeVhHeader) {
        this.ibeVhHeader = ibeVhHeader;
    }

    public byte[] getIbeVhBody() {
        return ibeVhBody;
    }

    public void setIbeVhBody(byte[] ibeVhBody) {
        this.ibeVhBody = ibeVhBody;
    }

    public String getIbeVhDescription() {
        return ibeVhDescription;
    }

    public void setIbeVhDescription(String ibeVhDescription) {
        this.ibeVhDescription = ibeVhDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ibeVhId != null ? ibeVhId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IbeVersionHistory)) {
            return false;
        }
        IbeVersionHistory other = (IbeVersionHistory) object;
        if ((this.ibeVhId == null && other.ibeVhId != null) || (this.ibeVhId != null && !this.ibeVhId.equals(other.ibeVhId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.IbeVersionHistory[ ibeVhId=" + ibeVhId + " ]";
    }
    
}
