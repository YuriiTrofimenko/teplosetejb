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
@Table(name = "SPR_TARIFF")
@NamedQueries({
    @NamedQuery(name = "SprTariff.findAll", query = "SELECT s FROM SprTariff s")})
public class SprTariff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int service;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date begindate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal tariff1;
    private BigDecimal tariff2;
    private BigDecimal tariff3;
    private BigDecimal tariff4;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    @Size(max = 128)
    private String remark;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    private BigInteger rversion;
    private Integer hidden;
    private BigDecimal tkf;
    @JoinColumn(name = "GROUPTARIFFCODE", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private SprGrouptariff grouptariffcode;

    public SprTariff() {
    }

    public SprTariff(Integer code) {
        this.code = code;
    }

    public SprTariff(Integer code, int service, Date begindate) {
        this.code = code;
        this.service = service;
        this.begindate = begindate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public BigDecimal getTariff1() {
        return tariff1;
    }

    public void setTariff1(BigDecimal tariff1) {
        this.tariff1 = tariff1;
    }

    public BigDecimal getTariff2() {
        return tariff2;
    }

    public void setTariff2(BigDecimal tariff2) {
        this.tariff2 = tariff2;
    }

    public BigDecimal getTariff3() {
        return tariff3;
    }

    public void setTariff3(BigDecimal tariff3) {
        this.tariff3 = tariff3;
    }

    public BigDecimal getTariff4() {
        return tariff4;
    }

    public void setTariff4(BigDecimal tariff4) {
        this.tariff4 = tariff4;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public BigDecimal getTkf() {
        return tkf;
    }

    public void setTkf(BigDecimal tkf) {
        this.tkf = tkf;
    }

    public SprGrouptariff getGrouptariffcode() {
        return grouptariffcode;
    }

    public void setGrouptariffcode(SprGrouptariff grouptariffcode) {
        this.grouptariffcode = grouptariffcode;
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
        if (!(object instanceof SprTariff)) {
            return false;
        }
        SprTariff other = (SprTariff) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprTariff[ code=" + code + " ]";
    }
    
}
