/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "SUBS_RASPR")
@NamedQueries({
    @NamedQuery(name = "SubsRaspr.findAll", query = "SELECT s FROM SubsRaspr s")})
public class SubsRaspr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "ACCOUNT_CODE")
    private BigInteger accountCode;
    private Integer procdate;
    private Integer todate;
    @Column(name = "SERVICE_CODE")
    private Integer serviceCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUBS_SUMM")
    private BigDecimal subsSumm;
    private Integer doc;
    private Integer docpos;

    public SubsRaspr() {
    }

    public SubsRaspr(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BigInteger getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(BigInteger accountCode) {
        this.accountCode = accountCode;
    }

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
        this.procdate = procdate;
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public Integer getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }

    public BigDecimal getSubsSumm() {
        return subsSumm;
    }

    public void setSubsSumm(BigDecimal subsSumm) {
        this.subsSumm = subsSumm;
    }

    public Integer getDoc() {
        return doc;
    }

    public void setDoc(Integer doc) {
        this.doc = doc;
    }

    public Integer getDocpos() {
        return docpos;
    }

    public void setDocpos(Integer docpos) {
        this.docpos = docpos;
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
        if (!(object instanceof SubsRaspr)) {
            return false;
        }
        SubsRaspr other = (SubsRaspr) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SubsRaspr[ code=" + code + " ]";
    }
    
}
