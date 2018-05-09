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
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "H_ACCOUNT_SERVICE")
@NamedQueries({
    @NamedQuery(name = "HAccountService.findAll", query = "SELECT h FROM HAccountService h")})
public class HAccountService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Column(name = "SET_RVERSION")
    private Integer setRversion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCOUNT_SERVICECODE")
    private int accountServicecode;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int service;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCOUNT_PIPECODE")
    private int accountPipecode;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer formnach;
    private Integer calctype;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;
    private Integer normcode;
    private Integer firmcode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double koeff;
    private Integer gt;
    private Double koeff2;
    @Column(name = "IS_STOPPER")
    private Integer isStopper;
    @Column(name = "DOC_KOEFF")
    private Integer docKoeff;
    @Column(name = "DOC_KOEFF2")
    private Integer docKoeff2;
    @Column(name = "DISCOUNT_S2")
    private BigDecimal discountS2;
    @Column(name = "NACH_KOEFF")
    private Double nachKoeff;

    public HAccountService() {
    }

    public HAccountService(Integer code) {
        this.code = code;
    }

    public HAccountService(Integer code, int accountServicecode, long accountcode, int service, int accountPipecode, Date begindate) {
        this.code = code;
        this.accountServicecode = accountServicecode;
        this.accountcode = accountcode;
        this.service = service;
        this.accountPipecode = accountPipecode;
        this.begindate = begindate;
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

    public int getAccountServicecode() {
        return accountServicecode;
    }

    public void setAccountServicecode(int accountServicecode) {
        this.accountServicecode = accountServicecode;
    }

    public long getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(long accountcode) {
        this.accountcode = accountcode;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public int getAccountPipecode() {
        return accountPipecode;
    }

    public void setAccountPipecode(int accountPipecode) {
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

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getCalctype() {
        return calctype;
    }

    public void setCalctype(Integer calctype) {
        this.calctype = calctype;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
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

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getNormcode() {
        return normcode;
    }

    public void setNormcode(Integer normcode) {
        this.normcode = normcode;
    }

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public Double getKoeff() {
        return koeff;
    }

    public void setKoeff(Double koeff) {
        this.koeff = koeff;
    }

    public Integer getGt() {
        return gt;
    }

    public void setGt(Integer gt) {
        this.gt = gt;
    }

    public Double getKoeff2() {
        return koeff2;
    }

    public void setKoeff2(Double koeff2) {
        this.koeff2 = koeff2;
    }

    public Integer getIsStopper() {
        return isStopper;
    }

    public void setIsStopper(Integer isStopper) {
        this.isStopper = isStopper;
    }

    public Integer getDocKoeff() {
        return docKoeff;
    }

    public void setDocKoeff(Integer docKoeff) {
        this.docKoeff = docKoeff;
    }

    public Integer getDocKoeff2() {
        return docKoeff2;
    }

    public void setDocKoeff2(Integer docKoeff2) {
        this.docKoeff2 = docKoeff2;
    }

    public BigDecimal getDiscountS2() {
        return discountS2;
    }

    public void setDiscountS2(BigDecimal discountS2) {
        this.discountS2 = discountS2;
    }

    public Double getNachKoeff() {
        return nachKoeff;
    }

    public void setNachKoeff(Double nachKoeff) {
        this.nachKoeff = nachKoeff;
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
        if (!(object instanceof HAccountService)) {
            return false;
        }
        HAccountService other = (HAccountService) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HAccountService[ code=" + code + " ]";
    }
    
}
