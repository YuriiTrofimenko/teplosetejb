/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "CALC_PIPE_AVGVOLUME")
@NamedQueries({
    @NamedQuery(name = "CalcPipeAvgvolume.findAll", query = "SELECT c FROM CalcPipeAvgvolume c")})
public class CalcPipeAvgvolume implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer pipecode;
    private Integer procdate;
    @Temporal(TemporalType.DATE)
    private Date calcdate;
    private Integer tt;
    private Integer todate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal totalvolume;
    private BigDecimal avgvolume;
    private Integer days;
    @Column(name = "MIN_DATEFROM_FOR_AVG")
    @Temporal(TemporalType.DATE)
    private Date minDatefromForAvg;
    @Column(name = "MAX_DATETILL_FOR_AVG")
    @Temporal(TemporalType.DATE)
    private Date maxDatetillForAvg;

    public CalcPipeAvgvolume() {
    }

    public CalcPipeAvgvolume(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public Date getCalcdate() {
        return calcdate;
    }

    public void setCalcdate(Date calcdate) {
        this.calcdate = calcdate;
    }

    public Integer getTt() {
        return tt;
    }

    public void setTt(Integer tt) {
        this.tt = tt;
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public BigDecimal getTotalvolume() {
        return totalvolume;
    }

    public void setTotalvolume(BigDecimal totalvolume) {
        this.totalvolume = totalvolume;
    }

    public BigDecimal getAvgvolume() {
        return avgvolume;
    }

    public void setAvgvolume(BigDecimal avgvolume) {
        this.avgvolume = avgvolume;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Date getMinDatefromForAvg() {
        return minDatefromForAvg;
    }

    public void setMinDatefromForAvg(Date minDatefromForAvg) {
        this.minDatefromForAvg = minDatefromForAvg;
    }

    public Date getMaxDatetillForAvg() {
        return maxDatetillForAvg;
    }

    public void setMaxDatetillForAvg(Date maxDatetillForAvg) {
        this.maxDatetillForAvg = maxDatetillForAvg;
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
        if (!(object instanceof CalcPipeAvgvolume)) {
            return false;
        }
        CalcPipeAvgvolume other = (CalcPipeAvgvolume) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.CalcPipeAvgvolume[ code=" + code + " ]";
    }
    
}
