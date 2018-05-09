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
@Table(name = "DATE_METER_READING")
@NamedQueries({
    @NamedQuery(name = "DateMeterReading.findAll", query = "SELECT d FROM DateMeterReading d")})
public class DateMeterReading implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int todate;
    @Basic(optional = false)
    @NotNull
    private int housecode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HOUSE_PIPECODE")
    private int housePipecode;
    @Column(name = "DATE_PREV_MONTH")
    @Temporal(TemporalType.DATE)
    private Date datePrevMonth;
    @Column(name = "DATE_CURRENT_MONTH")
    @Temporal(TemporalType.DATE)
    private Date dateCurrentMonth;
    @Column(name = "DATE_COUNT")
    private Integer dateCount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal volume;
    private BigDecimal s2;
    @Size(max = 128)
    private String remark;
    private Integer hidden;
    private Integer doccode;
    private Integer docpos;
    @Column(name = "VOLUME_ADD")
    private BigDecimal volumeAdd;
    @Column(name = "VOLUME_METER")
    private BigDecimal volumeMeter;
    @Column(name = "DATE_TIME_CALC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimeCalc;
    @Column(name = "USER_CALC")
    private Integer userCalc;

    public DateMeterReading() {
    }

    public DateMeterReading(Integer code) {
        this.code = code;
    }

    public DateMeterReading(Integer code, int todate, int housecode, int housePipecode) {
        this.code = code;
        this.todate = todate;
        this.housecode = housecode;
        this.housePipecode = housePipecode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getTodate() {
        return todate;
    }

    public void setTodate(int todate) {
        this.todate = todate;
    }

    public int getHousecode() {
        return housecode;
    }

    public void setHousecode(int housecode) {
        this.housecode = housecode;
    }

    public int getHousePipecode() {
        return housePipecode;
    }

    public void setHousePipecode(int housePipecode) {
        this.housePipecode = housePipecode;
    }

    public Date getDatePrevMonth() {
        return datePrevMonth;
    }

    public void setDatePrevMonth(Date datePrevMonth) {
        this.datePrevMonth = datePrevMonth;
    }

    public Date getDateCurrentMonth() {
        return dateCurrentMonth;
    }

    public void setDateCurrentMonth(Date dateCurrentMonth) {
        this.dateCurrentMonth = dateCurrentMonth;
    }

    public Integer getDateCount() {
        return dateCount;
    }

    public void setDateCount(Integer dateCount) {
        this.dateCount = dateCount;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getS2() {
        return s2;
    }

    public void setS2(BigDecimal s2) {
        this.s2 = s2;
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

    public BigDecimal getVolumeAdd() {
        return volumeAdd;
    }

    public void setVolumeAdd(BigDecimal volumeAdd) {
        this.volumeAdd = volumeAdd;
    }

    public BigDecimal getVolumeMeter() {
        return volumeMeter;
    }

    public void setVolumeMeter(BigDecimal volumeMeter) {
        this.volumeMeter = volumeMeter;
    }

    public Date getDateTimeCalc() {
        return dateTimeCalc;
    }

    public void setDateTimeCalc(Date dateTimeCalc) {
        this.dateTimeCalc = dateTimeCalc;
    }

    public Integer getUserCalc() {
        return userCalc;
    }

    public void setUserCalc(Integer userCalc) {
        this.userCalc = userCalc;
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
        if (!(object instanceof DateMeterReading)) {
            return false;
        }
        DateMeterReading other = (DateMeterReading) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DateMeterReading[ code=" + code + " ]";
    }
    
}
