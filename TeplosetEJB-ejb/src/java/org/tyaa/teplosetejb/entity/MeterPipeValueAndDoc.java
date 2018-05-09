/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "METER_PIPE_VALUE_AND_DOC")
@NamedQueries({
    @NamedQuery(name = "MeterPipeValueAndDoc.findAll", query = "SELECT m FROM MeterPipeValueAndDoc m")})
public class MeterPipeValueAndDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Z_DOC")
    @Id
    private Integer zDoc;
    @Column(name = "Z_POS")
    private Integer zPos;
    @Column(name = "IS_DOC")
    private Integer isDoc;
    private Integer code;
    private Integer pipecode;
    private Integer metercode;
    private Integer tt;
    private Integer procdate;
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

    public MeterPipeValueAndDoc() {
    }

    public Integer getZDoc() {
        return zDoc;
    }

    public void setZDoc(Integer zDoc) {
        this.zDoc = zDoc;
    }

    public Integer getZPos() {
        return zPos;
    }

    public void setZPos(Integer zPos) {
        this.zPos = zPos;
    }

    public Integer getIsDoc() {
        return isDoc;
    }

    public void setIsDoc(Integer isDoc) {
        this.isDoc = isDoc;
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

    public Integer getMetercode() {
        return metercode;
    }

    public void setMetercode(Integer metercode) {
        this.metercode = metercode;
    }

    public Integer getTt() {
        return tt;
    }

    public void setTt(Integer tt) {
        this.tt = tt;
    }

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
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
    
}
