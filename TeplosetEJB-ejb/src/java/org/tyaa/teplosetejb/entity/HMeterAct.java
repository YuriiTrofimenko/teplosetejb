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
@Table(name = "H_METER_ACT")
@NamedQueries({
    @NamedQuery(name = "HMeterAct.findAll", query = "SELECT h FROM HMeterAct h")})
public class HMeterAct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "H_PROCDATE")
    private int hProcdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACT_CODE")
    private int actCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "ACT_NUMBER")
    private String actNumber;
    @Column(name = "ACT_DATE")
    @Temporal(TemporalType.DATE)
    private Date actDate;
    @Column(name = "ACT_UNUSED")
    private Integer actUnused;
    @Column(name = "ACT_SERVICE")
    private Integer actService;
    @Column(name = "ACT_PIPE")
    private Integer actPipe;
    @Column(name = "ACT_TYPE")
    private Integer actType;
    @Size(max = 128)
    private String remark;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;

    public HMeterAct() {
    }

    public HMeterAct(Integer code) {
        this.code = code;
    }

    public HMeterAct(Integer code, int hProcdate, int actCode, String actNumber) {
        this.code = code;
        this.hProcdate = hProcdate;
        this.actCode = actCode;
        this.actNumber = actNumber;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getHProcdate() {
        return hProcdate;
    }

    public void setHProcdate(int hProcdate) {
        this.hProcdate = hProcdate;
    }

    public int getActCode() {
        return actCode;
    }

    public void setActCode(int actCode) {
        this.actCode = actCode;
    }

    public String getActNumber() {
        return actNumber;
    }

    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    public Date getActDate() {
        return actDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    public Integer getActUnused() {
        return actUnused;
    }

    public void setActUnused(Integer actUnused) {
        this.actUnused = actUnused;
    }

    public Integer getActService() {
        return actService;
    }

    public void setActService(Integer actService) {
        this.actService = actService;
    }

    public Integer getActPipe() {
        return actPipe;
    }

    public void setActPipe(Integer actPipe) {
        this.actPipe = actPipe;
    }

    public Integer getActType() {
        return actType;
    }

    public void setActType(Integer actType) {
        this.actType = actType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HMeterAct)) {
            return false;
        }
        HMeterAct other = (HMeterAct) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HMeterAct[ code=" + code + " ]";
    }
    
}
