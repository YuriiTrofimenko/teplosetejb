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
@Table(name = "OBJECT_BILL_REMARK")
@NamedQueries({
    @NamedQuery(name = "ObjectBillRemark.findAll", query = "SELECT o FROM ObjectBillRemark o")})
public class ObjectBillRemark implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OBJECT_LEVEL")
    private int objectLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OBJECT_CODE")
    private int objectCode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Size(max = 1024)
    private String remark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_FROM")
    @Temporal(TemporalType.DATE)
    private Date dateFrom;
    @Column(name = "DATE_TILL")
    @Temporal(TemporalType.DATE)
    private Date dateTill;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;

    public ObjectBillRemark() {
    }

    public ObjectBillRemark(Integer code) {
        this.code = code;
    }

    public ObjectBillRemark(Integer code, int objectLevel, int objectCode, int procdate, Date dateFrom) {
        this.code = code;
        this.objectLevel = objectLevel;
        this.objectCode = objectCode;
        this.procdate = procdate;
        this.dateFrom = dateFrom;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getObjectLevel() {
        return objectLevel;
    }

    public void setObjectLevel(int objectLevel) {
        this.objectLevel = objectLevel;
    }

    public int getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(int objectCode) {
        this.objectCode = objectCode;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTill() {
        return dateTill;
    }

    public void setDateTill(Date dateTill) {
        this.dateTill = dateTill;
    }

    public Integer getSystemuser() {
        return systemuser;
    }

    public void setSystemuser(Integer systemuser) {
        this.systemuser = systemuser;
    }

    public Date getLastuserchange() {
        return lastuserchange;
    }

    public void setLastuserchange(Date lastuserchange) {
        this.lastuserchange = lastuserchange;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObjectBillRemark)) {
            return false;
        }
        ObjectBillRemark other = (ObjectBillRemark) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.ObjectBillRemark[ code=" + code + " ]";
    }
    
}
