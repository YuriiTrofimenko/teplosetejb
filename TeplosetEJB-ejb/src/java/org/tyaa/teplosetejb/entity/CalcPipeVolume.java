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

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "CALC_PIPE_VOLUME")
@NamedQueries({
    @NamedQuery(name = "CalcPipeVolume.findAll", query = "SELECT c FROM CalcPipeVolume c")})
public class CalcPipeVolume implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "PIPE_VOLUME_CODE")
    private Integer pipeVolumeCode;
    @Basic(optional = false)
    @NotNull
    private int pipecode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Column(name = "DOC_PROCDATE")
    private Short docProcdate;
    @Column(name = "CALC_PROCDATE")
    private Integer calcProcdate;
    @Column(name = "PROCDATE_IN_CALC")
    private Integer procdateInCalc;
    @Basic(optional = false)
    @NotNull
    private int tt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal volume;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    @Temporal(TemporalType.DATE)
    private Date datetariff;
    private Integer takeincalc;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timetakeincalc;
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    @Column(name = "IS_ADD_VOLUME")
    private Integer isAddVolume;
    private Integer calcruncode;
    private Double kf;
    private Integer algoritm;
    @Column(name = "READY_TARIFF")
    private BigDecimal readyTariff;
    @Column(name = "PIPE_OBJECT")
    private BigInteger pipeObject;
    @Column(name = "WORK_TIME")
    private BigDecimal workTime;
    private BigDecimal temperature;
    @Column(name = "HEAT_LOAD")
    private BigDecimal heatLoad;

    public CalcPipeVolume() {
    }

    public CalcPipeVolume(Integer code) {
        this.code = code;
    }

    public CalcPipeVolume(Integer code, int pipecode, int procdate, int tt) {
        this.code = code;
        this.pipecode = pipecode;
        this.procdate = procdate;
        this.tt = tt;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getPipeVolumeCode() {
        return pipeVolumeCode;
    }

    public void setPipeVolumeCode(Integer pipeVolumeCode) {
        this.pipeVolumeCode = pipeVolumeCode;
    }

    public int getPipecode() {
        return pipecode;
    }

    public void setPipecode(int pipecode) {
        this.pipecode = pipecode;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public Short getDocProcdate() {
        return docProcdate;
    }

    public void setDocProcdate(Short docProcdate) {
        this.docProcdate = docProcdate;
    }

    public Integer getCalcProcdate() {
        return calcProcdate;
    }

    public void setCalcProcdate(Integer calcProcdate) {
        this.calcProcdate = calcProcdate;
    }

    public Integer getProcdateInCalc() {
        return procdateInCalc;
    }

    public void setProcdateInCalc(Integer procdateInCalc) {
        this.procdateInCalc = procdateInCalc;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Date getDatetariff() {
        return datetariff;
    }

    public void setDatetariff(Date datetariff) {
        this.datetariff = datetariff;
    }

    public Integer getTakeincalc() {
        return takeincalc;
    }

    public void setTakeincalc(Integer takeincalc) {
        this.takeincalc = takeincalc;
    }

    public Date getTimetakeincalc() {
        return timetakeincalc;
    }

    public void setTimetakeincalc(Date timetakeincalc) {
        this.timetakeincalc = timetakeincalc;
    }

    public Date getCalcDatefrom() {
        return calcDatefrom;
    }

    public void setCalcDatefrom(Date calcDatefrom) {
        this.calcDatefrom = calcDatefrom;
    }

    public Date getCalcDatetill() {
        return calcDatetill;
    }

    public void setCalcDatetill(Date calcDatetill) {
        this.calcDatetill = calcDatetill;
    }

    public Integer getIsAddVolume() {
        return isAddVolume;
    }

    public void setIsAddVolume(Integer isAddVolume) {
        this.isAddVolume = isAddVolume;
    }

    public Integer getCalcruncode() {
        return calcruncode;
    }

    public void setCalcruncode(Integer calcruncode) {
        this.calcruncode = calcruncode;
    }

    public Double getKf() {
        return kf;
    }

    public void setKf(Double kf) {
        this.kf = kf;
    }

    public Integer getAlgoritm() {
        return algoritm;
    }

    public void setAlgoritm(Integer algoritm) {
        this.algoritm = algoritm;
    }

    public BigDecimal getReadyTariff() {
        return readyTariff;
    }

    public void setReadyTariff(BigDecimal readyTariff) {
        this.readyTariff = readyTariff;
    }

    public BigInteger getPipeObject() {
        return pipeObject;
    }

    public void setPipeObject(BigInteger pipeObject) {
        this.pipeObject = pipeObject;
    }

    public BigDecimal getWorkTime() {
        return workTime;
    }

    public void setWorkTime(BigDecimal workTime) {
        this.workTime = workTime;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getHeatLoad() {
        return heatLoad;
    }

    public void setHeatLoad(BigDecimal heatLoad) {
        this.heatLoad = heatLoad;
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
        if (!(object instanceof CalcPipeVolume)) {
            return false;
        }
        CalcPipeVolume other = (CalcPipeVolume) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.CalcPipeVolume[ code=" + code + " ]";
    }
    
}
