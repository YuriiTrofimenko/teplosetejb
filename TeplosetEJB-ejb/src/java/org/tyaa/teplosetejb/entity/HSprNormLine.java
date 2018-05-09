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
@Table(name = "H_SPR_NORM_LINE")
@NamedQueries({
    @NamedQuery(name = "HSprNormLine.findAll", query = "SELECT h FROM HSprNormLine h")})
public class HSprNormLine implements Serializable {

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
    @Column(name = "NORM_LINECODE")
    private int normLinecode;
    @Basic(optional = false)
    @NotNull
    private int normcode;
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

    public HSprNormLine() {
    }

    public HSprNormLine(Integer code) {
        this.code = code;
    }

    public HSprNormLine(Integer code, int normLinecode, int normcode, Date begindate, int service) {
        this.code = code;
        this.normLinecode = normLinecode;
        this.normcode = normcode;
        this.begindate = begindate;
        this.service = service;
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

    public int getNormLinecode() {
        return normLinecode;
    }

    public void setNormLinecode(int normLinecode) {
        this.normLinecode = normLinecode;
    }

    public int getNormcode() {
        return normcode;
    }

    public void setNormcode(int normcode) {
        this.normcode = normcode;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HSprNormLine)) {
            return false;
        }
        HSprNormLine other = (HSprNormLine) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HSprNormLine[ code=" + code + " ]";
    }
    
}
