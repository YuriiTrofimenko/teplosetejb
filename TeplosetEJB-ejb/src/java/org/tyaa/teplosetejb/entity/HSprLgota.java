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
@Table(name = "H_SPR_LGOTA")
@NamedQueries({
    @NamedQuery(name = "HSprLgota.findAll", query = "SELECT h FROM HSprLgota h")})
public class HSprLgota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Basic(optional = false)
    @NotNull
    private int lgotacode;
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
    @Basic(optional = false)
    @NotNull
    private int finsource;
    private Integer uszncode;
    private Integer subscode;
    private Integer department;
    private Integer calcsortorder;
    private Integer allmain;
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
    @Column(name = "GL_PRINT_CODE")
    private Integer glPrintCode;
    @Column(name = "GL_DBF_CODE")
    private Integer glDbfCode;
    @Column(name = "FULL_LGOTA")
    private Integer fullLgota;
    @Size(max = 16)
    @Column(name = "CODE_1C")
    private String code1c;

    public HSprLgota() {
    }

    public HSprLgota(Integer code) {
        this.code = code;
    }

    public HSprLgota(Integer code, int lgotacode, String shifr, String name, int finsource) {
        this.code = code;
        this.lgotacode = lgotacode;
        this.shifr = shifr;
        this.name = name;
        this.finsource = finsource;
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

    public int getLgotacode() {
        return lgotacode;
    }

    public void setLgotacode(int lgotacode) {
        this.lgotacode = lgotacode;
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

    public int getFinsource() {
        return finsource;
    }

    public void setFinsource(int finsource) {
        this.finsource = finsource;
    }

    public Integer getUszncode() {
        return uszncode;
    }

    public void setUszncode(Integer uszncode) {
        this.uszncode = uszncode;
    }

    public Integer getSubscode() {
        return subscode;
    }

    public void setSubscode(Integer subscode) {
        this.subscode = subscode;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getCalcsortorder() {
        return calcsortorder;
    }

    public void setCalcsortorder(Integer calcsortorder) {
        this.calcsortorder = calcsortorder;
    }

    public Integer getAllmain() {
        return allmain;
    }

    public void setAllmain(Integer allmain) {
        this.allmain = allmain;
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

    public Integer getGlPrintCode() {
        return glPrintCode;
    }

    public void setGlPrintCode(Integer glPrintCode) {
        this.glPrintCode = glPrintCode;
    }

    public Integer getGlDbfCode() {
        return glDbfCode;
    }

    public void setGlDbfCode(Integer glDbfCode) {
        this.glDbfCode = glDbfCode;
    }

    public Integer getFullLgota() {
        return fullLgota;
    }

    public void setFullLgota(Integer fullLgota) {
        this.fullLgota = fullLgota;
    }

    public String getCode1c() {
        return code1c;
    }

    public void setCode1c(String code1c) {
        this.code1c = code1c;
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
        if (!(object instanceof HSprLgota)) {
            return false;
        }
        HSprLgota other = (HSprLgota) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HSprLgota[ code=" + code + " ]";
    }
    
}
