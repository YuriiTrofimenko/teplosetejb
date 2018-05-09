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
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_VOLUME_TAR")
@NamedQueries({
    @NamedQuery(name = "DocVolumeTar.findAll", query = "SELECT d FROM DocVolumeTar d")})
public class DocVolumeTar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int dockind;
    @Basic(optional = false)
    @NotNull
    private int doc;
    @Basic(optional = false)
    @NotNull
    private int poscode;
    @Column(name = "OBJECT_CODE")
    private BigInteger objectCode;
    private Integer service;
    private Integer pipecode;
    private Integer metercode;
    private Integer tt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal beginwmvalue;
    private BigDecimal endwmvalue;
    private BigDecimal wmvolume;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    @Column(name = "CHECKDATE_PREV")
    @Temporal(TemporalType.DATE)
    private Date checkdatePrev;
    @Column(name = "VALUEPROCDATE_PREV")
    private Integer valueprocdatePrev;
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    @Column(name = "PROCDATE_FROM")
    private Integer procdateFrom;
    @Column(name = "PROCDATE_TILL")
    private Integer procdateTill;
    @Column(name = "TYPE_VALUE")
    private Integer typeValue;
    @Size(max = 128)
    private String remark;

    public DocVolumeTar() {
    }

    public DocVolumeTar(Integer code) {
        this.code = code;
    }

    public DocVolumeTar(Integer code, int dockind, int doc, int poscode) {
        this.code = code;
        this.dockind = dockind;
        this.doc = doc;
        this.poscode = poscode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getDockind() {
        return dockind;
    }

    public void setDockind(int dockind) {
        this.dockind = dockind;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public int getPoscode() {
        return poscode;
    }

    public void setPoscode(int poscode) {
        this.poscode = poscode;
    }

    public BigInteger getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(BigInteger objectCode) {
        this.objectCode = objectCode;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
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

    public BigDecimal getBeginwmvalue() {
        return beginwmvalue;
    }

    public void setBeginwmvalue(BigDecimal beginwmvalue) {
        this.beginwmvalue = beginwmvalue;
    }

    public BigDecimal getEndwmvalue() {
        return endwmvalue;
    }

    public void setEndwmvalue(BigDecimal endwmvalue) {
        this.endwmvalue = endwmvalue;
    }

    public BigDecimal getWmvolume() {
        return wmvolume;
    }

    public void setWmvolume(BigDecimal wmvolume) {
        this.wmvolume = wmvolume;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Date getCheckdatePrev() {
        return checkdatePrev;
    }

    public void setCheckdatePrev(Date checkdatePrev) {
        this.checkdatePrev = checkdatePrev;
    }

    public Integer getValueprocdatePrev() {
        return valueprocdatePrev;
    }

    public void setValueprocdatePrev(Integer valueprocdatePrev) {
        this.valueprocdatePrev = valueprocdatePrev;
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

    public Integer getProcdateFrom() {
        return procdateFrom;
    }

    public void setProcdateFrom(Integer procdateFrom) {
        this.procdateFrom = procdateFrom;
    }

    public Integer getProcdateTill() {
        return procdateTill;
    }

    public void setProcdateTill(Integer procdateTill) {
        this.procdateTill = procdateTill;
    }

    public Integer getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(Integer typeValue) {
        this.typeValue = typeValue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        if (!(object instanceof DocVolumeTar)) {
            return false;
        }
        DocVolumeTar other = (DocVolumeTar) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocVolumeTar[ code=" + code + " ]";
    }
    
}
