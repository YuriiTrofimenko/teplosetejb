/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "H_PIPE_WORK_TIME")
@NamedQueries({
    @NamedQuery(name = "HPipeWorkTime.findAll", query = "SELECT h FROM HPipeWorkTime h")})
public class HPipeWorkTime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Column(name = "SET_RVERSION")
    private Integer setRversion;
    @Column(name = "PIPE_WORK_TIME_CODE")
    private Integer pipeWorkTimeCode;
    private Integer pipecode;
    private Integer procdate;
    @Column(name = "CALC_PROCDATE")
    private Integer calcProcdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "WORK_TIME")
    private BigDecimal workTime;
    private Integer doccode;
    private Integer poscode;
    private Integer hidden;
    private BigInteger rversion;
    private BigDecimal temperature;

    public HPipeWorkTime() {
    }

    public HPipeWorkTime(Integer code) {
        this.code = code;
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

    public Integer getPipeWorkTimeCode() {
        return pipeWorkTimeCode;
    }

    public void setPipeWorkTimeCode(Integer pipeWorkTimeCode) {
        this.pipeWorkTimeCode = pipeWorkTimeCode;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
        this.procdate = procdate;
    }

    public Integer getCalcProcdate() {
        return calcProcdate;
    }

    public void setCalcProcdate(Integer calcProcdate) {
        this.calcProcdate = calcProcdate;
    }

    public BigDecimal getWorkTime() {
        return workTime;
    }

    public void setWorkTime(BigDecimal workTime) {
        this.workTime = workTime;
    }

    public Integer getDoccode() {
        return doccode;
    }

    public void setDoccode(Integer doccode) {
        this.doccode = doccode;
    }

    public Integer getPoscode() {
        return poscode;
    }

    public void setPoscode(Integer poscode) {
        this.poscode = poscode;
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

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
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
        if (!(object instanceof HPipeWorkTime)) {
            return false;
        }
        HPipeWorkTime other = (HPipeWorkTime) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HPipeWorkTime[ code=" + code + " ]";
    }
    
}
