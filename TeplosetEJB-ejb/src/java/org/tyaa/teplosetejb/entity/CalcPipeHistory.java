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
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "CALC_PIPE_HISTORY")
@NamedQueries({
    @NamedQuery(name = "CalcPipeHistory.findAll", query = "SELECT c FROM CalcPipeHistory c")})
public class CalcPipeHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer pipecode;
    @Column(name = "OWNER_PIPECODE")
    private Integer ownerPipecode;
    @Column(name = "PIPE_LEVEL")
    private Integer pipeLevel;
    @Size(max = 16)
    @Column(name = "PIPE_SHIFR")
    private String pipeShifr;
    @Column(name = "PIPE_SERVICE")
    private Integer pipeService;
    private Integer procdate;
    private Integer todate;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer formnach;
    private Integer calctype;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double koefnorm;
    @Column(name = "VOLUME_READY")
    private BigDecimal volumeReady;
    @Column(name = "VOLUME_REAL")
    private BigDecimal volumeReal;
    @Column(name = "VOLUME_MINUS")
    private BigDecimal volumeMinus;
    @Column(name = "VOLUME_MINUS_ADD")
    private BigDecimal volumeMinusAdd;
    @Column(name = "VOLUME_NORM")
    private BigDecimal volumeNorm;
    private Integer calcruncode;
    private Integer algoritm;
    @Column(name = "READY_TARIFF")
    private BigDecimal readyTariff;
    @Column(name = "WORK_TIME")
    private BigDecimal workTime;
    private BigDecimal temperature;
    @Column(name = "HEAT_LOAD")
    private BigDecimal heatLoad;
    @Column(name = "S_NORM")
    private BigDecimal sNorm;
    @Column(name = "NACH_SUMM")
    private BigDecimal nachSumm;
    @Column(name = "NACH_VOLUME")
    private BigDecimal nachVolume;

    public CalcPipeHistory() {
    }

    public CalcPipeHistory(Integer code) {
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

    public Integer getOwnerPipecode() {
        return ownerPipecode;
    }

    public void setOwnerPipecode(Integer ownerPipecode) {
        this.ownerPipecode = ownerPipecode;
    }

    public Integer getPipeLevel() {
        return pipeLevel;
    }

    public void setPipeLevel(Integer pipeLevel) {
        this.pipeLevel = pipeLevel;
    }

    public String getPipeShifr() {
        return pipeShifr;
    }

    public void setPipeShifr(String pipeShifr) {
        this.pipeShifr = pipeShifr;
    }

    public Integer getPipeService() {
        return pipeService;
    }

    public void setPipeService(Integer pipeService) {
        this.pipeService = pipeService;
    }

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
        this.procdate = procdate;
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
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

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getCalctype() {
        return calctype;
    }

    public void setCalctype(Integer calctype) {
        this.calctype = calctype;
    }

    public Double getKoefnorm() {
        return koefnorm;
    }

    public void setKoefnorm(Double koefnorm) {
        this.koefnorm = koefnorm;
    }

    public BigDecimal getVolumeReady() {
        return volumeReady;
    }

    public void setVolumeReady(BigDecimal volumeReady) {
        this.volumeReady = volumeReady;
    }

    public BigDecimal getVolumeReal() {
        return volumeReal;
    }

    public void setVolumeReal(BigDecimal volumeReal) {
        this.volumeReal = volumeReal;
    }

    public BigDecimal getVolumeMinus() {
        return volumeMinus;
    }

    public void setVolumeMinus(BigDecimal volumeMinus) {
        this.volumeMinus = volumeMinus;
    }

    public BigDecimal getVolumeMinusAdd() {
        return volumeMinusAdd;
    }

    public void setVolumeMinusAdd(BigDecimal volumeMinusAdd) {
        this.volumeMinusAdd = volumeMinusAdd;
    }

    public BigDecimal getVolumeNorm() {
        return volumeNorm;
    }

    public void setVolumeNorm(BigDecimal volumeNorm) {
        this.volumeNorm = volumeNorm;
    }

    public Integer getCalcruncode() {
        return calcruncode;
    }

    public void setCalcruncode(Integer calcruncode) {
        this.calcruncode = calcruncode;
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

    public BigDecimal getSNorm() {
        return sNorm;
    }

    public void setSNorm(BigDecimal sNorm) {
        this.sNorm = sNorm;
    }

    public BigDecimal getNachSumm() {
        return nachSumm;
    }

    public void setNachSumm(BigDecimal nachSumm) {
        this.nachSumm = nachSumm;
    }

    public BigDecimal getNachVolume() {
        return nachVolume;
    }

    public void setNachVolume(BigDecimal nachVolume) {
        this.nachVolume = nachVolume;
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
        if (!(object instanceof CalcPipeHistory)) {
            return false;
        }
        CalcPipeHistory other = (CalcPipeHistory) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.CalcPipeHistory[ code=" + code + " ]";
    }
    
}
