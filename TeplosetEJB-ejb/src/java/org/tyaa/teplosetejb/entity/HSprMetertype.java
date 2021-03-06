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
@Table(name = "H_SPR_METERTYPE")
@NamedQueries({
    @NamedQuery(name = "HSprMetertype.findAll", query = "SELECT h FROM HSprMetertype h")})
public class HSprMetertype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Basic(optional = false)
    @NotNull
    private int metertypecode;
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
    private Integer diametr;
    private Integer range;
    private Integer checkperiod;
    private Integer tt1;
    private Integer tt2;
    private Integer tt3;
    private Integer tt4;
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
    private Integer edizm;

    public HSprMetertype() {
    }

    public HSprMetertype(Integer code) {
        this.code = code;
    }

    public HSprMetertype(Integer code, int metertypecode, String shifr, String name) {
        this.code = code;
        this.metertypecode = metertypecode;
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

    public int getMetertypecode() {
        return metertypecode;
    }

    public void setMetertypecode(int metertypecode) {
        this.metertypecode = metertypecode;
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

    public Integer getDiametr() {
        return diametr;
    }

    public void setDiametr(Integer diametr) {
        this.diametr = diametr;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public Integer getCheckperiod() {
        return checkperiod;
    }

    public void setCheckperiod(Integer checkperiod) {
        this.checkperiod = checkperiod;
    }

    public Integer getTt1() {
        return tt1;
    }

    public void setTt1(Integer tt1) {
        this.tt1 = tt1;
    }

    public Integer getTt2() {
        return tt2;
    }

    public void setTt2(Integer tt2) {
        this.tt2 = tt2;
    }

    public Integer getTt3() {
        return tt3;
    }

    public void setTt3(Integer tt3) {
        this.tt3 = tt3;
    }

    public Integer getTt4() {
        return tt4;
    }

    public void setTt4(Integer tt4) {
        this.tt4 = tt4;
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

    public Integer getEdizm() {
        return edizm;
    }

    public void setEdizm(Integer edizm) {
        this.edizm = edizm;
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
        if (!(object instanceof HSprMetertype)) {
            return false;
        }
        HSprMetertype other = (HSprMetertype) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HSprMetertype[ code=" + code + " ]";
    }
    
}
