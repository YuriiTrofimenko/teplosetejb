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
@Table(name = "H_STOPPER")
@NamedQueries({
    @NamedQuery(name = "HStopper.findAll", query = "SELECT h FROM HStopper h")})
public class HStopper implements Serializable {

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
    private int stoppercode;
    private Integer pipecode;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    @Temporal(TemporalType.DATE)
    private Date nextcheckdate;
    @Size(max = 16)
    private String number;
    private Integer reason;
    private Integer instalation;
    @Size(max = 128)
    private String remark;
    private Integer hidden;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    @Column(name = "STOPPER_TYPE_CODE")
    private Integer stopperTypeCode;

    public HStopper() {
    }

    public HStopper(Integer code) {
        this.code = code;
    }

    public HStopper(Integer code, int stoppercode) {
        this.code = code;
        this.stoppercode = stoppercode;
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

    public int getStoppercode() {
        return stoppercode;
    }

    public void setStoppercode(int stoppercode) {
        this.stoppercode = stoppercode;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
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

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Date getNextcheckdate() {
        return nextcheckdate;
    }

    public void setNextcheckdate(Date nextcheckdate) {
        this.nextcheckdate = nextcheckdate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public Integer getInstalation() {
        return instalation;
    }

    public void setInstalation(Integer instalation) {
        this.instalation = instalation;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
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

    public Integer getStopperTypeCode() {
        return stopperTypeCode;
    }

    public void setStopperTypeCode(Integer stopperTypeCode) {
        this.stopperTypeCode = stopperTypeCode;
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
        if (!(object instanceof HStopper)) {
            return false;
        }
        HStopper other = (HStopper) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HStopper[ code=" + code + " ]";
    }
    
}
