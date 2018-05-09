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
@Table(name = "METER_PIPE_VALUE")
@NamedQueries({
    @NamedQuery(name = "MeterPipeValue.findAll", query = "SELECT m FROM MeterPipeValue m")})
public class MeterPipeValue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int pipecode;
    private Integer metercode;
    @Basic(optional = false)
    @NotNull
    private int tt;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal beginvalue;
    private BigDecimal endvalue;
    private BigDecimal volume;
    private Integer metermethod;
    private Integer info;
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    @Column(name = "TYPE_VALUE")
    private Integer typeValue;
    private Integer doccode;
    private Integer docpos;
    private Integer edizm;
    private BigDecimal kf;

    public MeterPipeValue() {
    }

    public MeterPipeValue(Integer code) {
        this.code = code;
    }

    public MeterPipeValue(Integer code, int pipecode, int tt, int procdate) {
        this.code = code;
        this.pipecode = pipecode;
        this.tt = tt;
        this.procdate = procdate;
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

    public Integer getMetercode() {
        return metercode;
    }

    public void setMetercode(Integer metercode) {
        this.metercode = metercode;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public BigDecimal getBeginvalue() {
        return beginvalue;
    }

    public void setBeginvalue(BigDecimal beginvalue) {
        this.beginvalue = beginvalue;
    }

    public BigDecimal getEndvalue() {
        return endvalue;
    }

    public void setEndvalue(BigDecimal endvalue) {
        this.endvalue = endvalue;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Integer getMetermethod() {
        return metermethod;
    }

    public void setMetermethod(Integer metermethod) {
        this.metermethod = metermethod;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
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

    public Integer getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(Integer typeValue) {
        this.typeValue = typeValue;
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

    public Integer getEdizm() {
        return edizm;
    }

    public void setEdizm(Integer edizm) {
        this.edizm = edizm;
    }

    public BigDecimal getKf() {
        return kf;
    }

    public void setKf(BigDecimal kf) {
        this.kf = kf;
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
        if (!(object instanceof MeterPipeValue)) {
            return false;
        }
        MeterPipeValue other = (MeterPipeValue) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.MeterPipeValue[ code=" + code + " ]";
    }
    
}
