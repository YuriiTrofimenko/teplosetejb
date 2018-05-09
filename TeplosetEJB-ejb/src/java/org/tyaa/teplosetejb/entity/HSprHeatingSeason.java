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
@Table(name = "H_SPR_HEATING_SEASON")
@NamedQueries({
    @NamedQuery(name = "HSprHeatingSeason.findAll", query = "SELECT h FROM HSprHeatingSeason h")})
public class HSprHeatingSeason implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HEATING_EASONCODE")
    private int heatingEasoncode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String shifr;
    @Size(max = 64)
    private String name;
    @Temporal(TemporalType.DATE)
    private Date datefrom;
    @Temporal(TemporalType.DATE)
    private Date datetill;
    @Size(max = 128)
    private String remark;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer systemuser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastuserchange;
    private Integer hidden;
    private BigInteger rversion;
    @Column(name = "H_NOT")
    private Integer hNot;
    @Column(name = "HEATING_BEGINDATE")
    @Temporal(TemporalType.DATE)
    private Date heatingBegindate;
    @Column(name = "HEATING_ENDDATE")
    @Temporal(TemporalType.DATE)
    private Date heatingEnddate;

    public HSprHeatingSeason() {
    }

    public HSprHeatingSeason(Integer code) {
        this.code = code;
    }

    public HSprHeatingSeason(Integer code, int heatingEasoncode, String shifr) {
        this.code = code;
        this.heatingEasoncode = heatingEasoncode;
        this.shifr = shifr;
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

    public int getHeatingEasoncode() {
        return heatingEasoncode;
    }

    public void setHeatingEasoncode(int heatingEasoncode) {
        this.heatingEasoncode = heatingEasoncode;
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

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDatetill() {
        return datetill;
    }

    public void setDatetill(Date datetill) {
        this.datetill = datetill;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getHNot() {
        return hNot;
    }

    public void setHNot(Integer hNot) {
        this.hNot = hNot;
    }

    public Date getHeatingBegindate() {
        return heatingBegindate;
    }

    public void setHeatingBegindate(Date heatingBegindate) {
        this.heatingBegindate = heatingBegindate;
    }

    public Date getHeatingEnddate() {
        return heatingEnddate;
    }

    public void setHeatingEnddate(Date heatingEnddate) {
        this.heatingEnddate = heatingEnddate;
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
        if (!(object instanceof HSprHeatingSeason)) {
            return false;
        }
        HSprHeatingSeason other = (HSprHeatingSeason) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HSprHeatingSeason[ code=" + code + " ]";
    }
    
}
