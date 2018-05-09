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
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "PAY_SUMM_USZN")
@NamedQueries({
    @NamedQuery(name = "PaySummUszn.findAll", query = "SELECT p FROM PaySummUszn p")})
public class PaySummUszn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "R256_KIND")
    private Integer r256Kind;
    @Column(name = "DOC_OSNOVANIE")
    private Integer docOsnovanie;
    @Column(name = "PROCDATE_PAY")
    private Integer procdatePay;
    @Column(name = "DOC_FOR_PAY")
    private Integer docForPay;
    @Column(name = "GROUP_SERVICE")
    private Integer groupService;
    @Column(name = "ACCOUNT_CODE")
    private BigInteger accountCode;
    @Size(max = 16)
    private String inn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUMM_FROM_DOC")
    private BigDecimal summFromDoc;
    @Column(name = "SUMM_PAY_BEFORE")
    private BigDecimal summPayBefore;
    @Column(name = "SUMM_PAY")
    private BigDecimal summPay;

    public PaySummUszn() {
    }

    public PaySummUszn(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getR256Kind() {
        return r256Kind;
    }

    public void setR256Kind(Integer r256Kind) {
        this.r256Kind = r256Kind;
    }

    public Integer getDocOsnovanie() {
        return docOsnovanie;
    }

    public void setDocOsnovanie(Integer docOsnovanie) {
        this.docOsnovanie = docOsnovanie;
    }

    public Integer getProcdatePay() {
        return procdatePay;
    }

    public void setProcdatePay(Integer procdatePay) {
        this.procdatePay = procdatePay;
    }

    public Integer getDocForPay() {
        return docForPay;
    }

    public void setDocForPay(Integer docForPay) {
        this.docForPay = docForPay;
    }

    public Integer getGroupService() {
        return groupService;
    }

    public void setGroupService(Integer groupService) {
        this.groupService = groupService;
    }

    public BigInteger getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(BigInteger accountCode) {
        this.accountCode = accountCode;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public BigDecimal getSummFromDoc() {
        return summFromDoc;
    }

    public void setSummFromDoc(BigDecimal summFromDoc) {
        this.summFromDoc = summFromDoc;
    }

    public BigDecimal getSummPayBefore() {
        return summPayBefore;
    }

    public void setSummPayBefore(BigDecimal summPayBefore) {
        this.summPayBefore = summPayBefore;
    }

    public BigDecimal getSummPay() {
        return summPay;
    }

    public void setSummPay(BigDecimal summPay) {
        this.summPay = summPay;
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
        if (!(object instanceof PaySummUszn)) {
            return false;
        }
        PaySummUszn other = (PaySummUszn) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.PaySummUszn[ code=" + code + " ]";
    }
    
}
