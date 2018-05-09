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
@Table(name = "SPR_SALDOKIND")
@NamedQueries({
    @NamedQuery(name = "SprSaldokind.findAll", query = "SELECT s FROM SprSaldokind s")})
public class SprSaldokind implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String shifr;
    @Size(max = 64)
    private String name;
    @Size(max = 16)
    private String shortname;
    @Size(max = 128)
    private String remark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INCLUDE_TOTAL_RESULT")
    private int includeTotalResult;
    @Column(name = "USE_IN_CALC")
    private Integer useInCalc;
    private Integer sortorder;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    private Integer hidden;
    private BigInteger rversion;

    public SprSaldokind() {
    }

    public SprSaldokind(Integer code) {
        this.code = code;
    }

    public SprSaldokind(Integer code, String shifr, int includeTotalResult) {
        this.code = code;
        this.shifr = shifr;
        this.includeTotalResult = includeTotalResult;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getIncludeTotalResult() {
        return includeTotalResult;
    }

    public void setIncludeTotalResult(int includeTotalResult) {
        this.includeTotalResult = includeTotalResult;
    }

    public Integer getUseInCalc() {
        return useInCalc;
    }

    public void setUseInCalc(Integer useInCalc) {
        this.useInCalc = useInCalc;
    }

    public Integer getSortorder() {
        return sortorder;
    }

    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
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

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
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
        if (!(object instanceof SprSaldokind)) {
            return false;
        }
        SprSaldokind other = (SprSaldokind) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprSaldokind[ code=" + code + " ]";
    }
    
}
