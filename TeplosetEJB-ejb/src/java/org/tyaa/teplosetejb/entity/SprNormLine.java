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
@Table(name = "SPR_NORM_LINE")
@NamedQueries({
    @NamedQuery(name = "SprNormLine.findAll", query = "SELECT s FROM SprNormLine s")})
public class SprNormLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Basic(optional = false)
    @NotNull
    private int service;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double norm;
    private Integer typenorm;
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
    @Column(name = "FLAG_CHANGE_TKF")
    private Integer flagChangeTkf;
    @JoinColumn(name = "NORMCODE", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private SprNorm normcode;

    public SprNormLine() {
    }

    public SprNormLine(Integer code) {
        this.code = code;
    }

    public SprNormLine(Integer code, Date begindate, int service) {
        this.code = code;
        this.begindate = begindate;
        this.service = service;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public Double getNorm() {
        return norm;
    }

    public void setNorm(Double norm) {
        this.norm = norm;
    }

    public Integer getTypenorm() {
        return typenorm;
    }

    public void setTypenorm(Integer typenorm) {
        this.typenorm = typenorm;
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

    public Integer getFlagChangeTkf() {
        return flagChangeTkf;
    }

    public void setFlagChangeTkf(Integer flagChangeTkf) {
        this.flagChangeTkf = flagChangeTkf;
    }

    public SprNorm getNormcode() {
        return normcode;
    }

    public void setNormcode(SprNorm normcode) {
        this.normcode = normcode;
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
        if (!(object instanceof SprNormLine)) {
            return false;
        }
        SprNormLine other = (SprNormLine) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprNormLine[ code=" + code + " ]";
    }
    
}
