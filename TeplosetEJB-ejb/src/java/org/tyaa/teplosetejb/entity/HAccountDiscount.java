/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "H_ACCOUNT_DISCOUNT")
@NamedQueries({
    @NamedQuery(name = "HAccountDiscount.findAll", query = "SELECT h FROM HAccountDiscount h")})
public class HAccountDiscount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Column(name = "SET_RVERSION")
    private Integer setRversion;
    @Column(name = "ACCOUNT_DISCOUNT_CODE")
    private Integer accountDiscountCode;
    private BigInteger accountcode;
    private Integer service;
    @Column(name = "ACCOUNT_PIPECODE")
    private Integer accountPipecode;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double koeff;
    @Column(name = "DISCOUNT_KIND")
    private Integer discountKind;
    @Column(name = "DISCOUNT_S2")
    private BigDecimal discountS2;
    private Integer reason;
    private Integer asinteger;
    private BigDecimal asquantity;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer firmcode;
    private Integer hidden;

    public HAccountDiscount() {
    }

    public HAccountDiscount(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getHProcdate() {
        return hProcdate;
    }

    public void setHProcdate(Integer hProcdate) {
        this.hProcdate = hProcdate;
    }

    public Integer getSetRversion() {
        return setRversion;
    }

    public void setSetRversion(Integer setRversion) {
        this.setRversion = setRversion;
    }

    public Integer getAccountDiscountCode() {
        return accountDiscountCode;
    }

    public void setAccountDiscountCode(Integer accountDiscountCode) {
        this.accountDiscountCode = accountDiscountCode;
    }

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getAccountPipecode() {
        return accountPipecode;
    }

    public void setAccountPipecode(Integer accountPipecode) {
        this.accountPipecode = accountPipecode;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Double getKoeff() {
        return koeff;
    }

    public void setKoeff(Double koeff) {
        this.koeff = koeff;
    }

    public Integer getDiscountKind() {
        return discountKind;
    }

    public void setDiscountKind(Integer discountKind) {
        this.discountKind = discountKind;
    }

    public BigDecimal getDiscountS2() {
        return discountS2;
    }

    public void setDiscountS2(BigDecimal discountS2) {
        this.discountS2 = discountS2;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public Integer getAsinteger() {
        return asinteger;
    }

    public void setAsinteger(Integer asinteger) {
        this.asinteger = asinteger;
    }

    public BigDecimal getAsquantity() {
        return asquantity;
    }

    public void setAsquantity(BigDecimal asquantity) {
        this.asquantity = asquantity;
    }

    public Integer getDoccode() {
        return doccode;
    }

    public void setDoccode(Integer doccode) {
        this.doccode = doccode;
    }

    public Integer getDocpos() {
        return docpos;
    }

    public void setDocpos(Integer docpos) {
        this.docpos = docpos;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
    }

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
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
        if (!(object instanceof HAccountDiscount)) {
            return false;
        }
        HAccountDiscount other = (HAccountDiscount) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HAccountDiscount[ code=" + code + " ]";
    }
    
}
