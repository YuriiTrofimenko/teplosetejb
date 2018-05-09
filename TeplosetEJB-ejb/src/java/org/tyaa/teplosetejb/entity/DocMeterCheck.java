/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DOC_METER_CHECK")
@NamedQueries({
    @NamedQuery(name = "DocMeterCheck.findAll", query = "SELECT d FROM DocMeterCheck d")})
public class DocMeterCheck implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "ACCOUNT_CODE")
    private BigInteger accountCode;
    @Column(name = "METER_LAST_CHECK_DATE")
    @Temporal(TemporalType.DATE)
    private Date meterLastCheckDate;
    @Size(max = 128)
    private String remark;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocMeterCheck() {
    }

    public DocMeterCheck(Integer code) {
        this.code = code;
    }

    public DocMeterCheck(Integer code, int state) {
        this.code = code;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public BigInteger getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(BigInteger accountCode) {
        this.accountCode = accountCode;
    }

    public Date getMeterLastCheckDate() {
        return meterLastCheckDate;
    }

    public void setMeterLastCheckDate(Date meterLastCheckDate) {
        this.meterLastCheckDate = meterLastCheckDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
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
        if (!(object instanceof DocMeterCheck)) {
            return false;
        }
        DocMeterCheck other = (DocMeterCheck) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocMeterCheck[ code=" + code + " ]";
    }
    
}
