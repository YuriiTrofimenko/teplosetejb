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
@Table(name = "PIPE_VOLUME")
@NamedQueries({
    @NamedQuery(name = "PipeVolume.findAll", query = "SELECT p FROM PipeVolume p")})
public class PipeVolume implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int pipecode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
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
    private Integer metervaluecode;
    private Integer doccode;
    private Integer docpos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    @Column(name = "IS_ADD_VOLUME")
    private Integer isAddVolume;
    @Column(name = "TYPE_VALUE")
    private Integer typeValue;
    @Column(name = "READY_TARIFF")
    private BigDecimal readyTariff;
    @Column(name = "INFO_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date infoDatefrom;
    @Column(name = "INFO_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date infoDatetill;
    @Column(name = "SOURCE_VOLUME")
    private BigDecimal sourceVolume;
    private BigDecimal kf;
    private Integer edizm;
    @Column(name = "IS_ARENDA_VOLUME")
    private Integer isArendaVolume;

    public PipeVolume() {
    }

    public PipeVolume(Integer code) {
        this.code = code;
    }

    public PipeVolume(Integer code, int pipecode, int procdate, int tt, Date calcDatefrom, Date calcDatetill) {
        this.code = code;
        this.pipecode = pipecode;
        this.procdate = procdate;
        this.tt = tt;
        this.calcDatefrom = calcDatefrom;
        this.calcDatetill = calcDatetill;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public Integer getMetervaluecode() {
        return metervaluecode;
    }

    public void setMetervaluecode(Integer metervaluecode) {
        this.metervaluecode = metervaluecode;
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

    public Integer getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(Integer typeValue) {
        this.typeValue = typeValue;
    }

    public BigDecimal getReadyTariff() {
        return readyTariff;
    }

    public void setReadyTariff(BigDecimal readyTariff) {
        this.readyTariff = readyTariff;
    }

    public Date getInfoDatefrom() {
        return infoDatefrom;
    }

    public void setInfoDatefrom(Date infoDatefrom) {
        this.infoDatefrom = infoDatefrom;
    }

    public Date getInfoDatetill() {
        return infoDatetill;
    }

    public void setInfoDatetill(Date infoDatetill) {
        this.infoDatetill = infoDatetill;
    }

    public BigDecimal getSourceVolume() {
        return sourceVolume;
    }

    public void setSourceVolume(BigDecimal sourceVolume) {
        this.sourceVolume = sourceVolume;
    }

    public BigDecimal getKf() {
        return kf;
    }

    public void setKf(BigDecimal kf) {
        this.kf = kf;
    }

    public Integer getEdizm() {
        return edizm;
    }

    public void setEdizm(Integer edizm) {
        this.edizm = edizm;
    }

    public Integer getIsArendaVolume() {
        return isArendaVolume;
    }

    public void setIsArendaVolume(Integer isArendaVolume) {
        this.isArendaVolume = isArendaVolume;
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
        if (!(object instanceof PipeVolume)) {
            return false;
        }
        PipeVolume other = (PipeVolume) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.PipeVolume[ code=" + code + " ]";
    }
    
}
