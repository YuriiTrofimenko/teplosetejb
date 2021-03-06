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
@Table(name = "H_SPR_REASON")
@NamedQueries({
    @NamedQuery(name = "HSprReason.findAll", query = "SELECT h FROM HSprReason h")})
public class HSprReason implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Basic(optional = false)
    @NotNull
    private int reasoncode;
    @Basic(optional = false)
    @NotNull
    private int owner;
    @Basic(optional = false)
    @NotNull
    private int iselement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String shifr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    private String name;
    @Size(max = 16)
    private String shortname;
    @Column(name = "NOT_CALC_VOLUME")
    private Integer notCalcVolume;
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
    @Column(name = "IS_TEMPERATURE")
    private Integer isTemperature;
    @Column(name = "INCLUDE_NKP3")
    private Integer includeNkp3;
    @Column(name = "IS_NOT_USE")
    private Integer isNotUse;

    public HSprReason() {
    }

    public HSprReason(Integer code) {
        this.code = code;
    }

    public HSprReason(Integer code, int reasoncode, int owner, int iselement, String shifr, String name) {
        this.code = code;
        this.reasoncode = reasoncode;
        this.owner = owner;
        this.iselement = iselement;
        this.shifr = shifr;
        this.name = name;
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

    public int getReasoncode() {
        return reasoncode;
    }

    public void setReasoncode(int reasoncode) {
        this.reasoncode = reasoncode;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getIselement() {
        return iselement;
    }

    public void setIselement(int iselement) {
        this.iselement = iselement;
    }

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public Integer getNotCalcVolume() {
        return notCalcVolume;
    }

    public void setNotCalcVolume(Integer notCalcVolume) {
        this.notCalcVolume = notCalcVolume;
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

    public Integer getIsTemperature() {
        return isTemperature;
    }

    public void setIsTemperature(Integer isTemperature) {
        this.isTemperature = isTemperature;
    }

    public Integer getIncludeNkp3() {
        return includeNkp3;
    }

    public void setIncludeNkp3(Integer includeNkp3) {
        this.includeNkp3 = includeNkp3;
    }

    public Integer getIsNotUse() {
        return isNotUse;
    }

    public void setIsNotUse(Integer isNotUse) {
        this.isNotUse = isNotUse;
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
        if (!(object instanceof HSprReason)) {
            return false;
        }
        HSprReason other = (HSprReason) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HSprReason[ code=" + code + " ]";
    }
    
}
