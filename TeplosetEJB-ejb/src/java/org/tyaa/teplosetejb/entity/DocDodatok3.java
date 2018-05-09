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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DOC_DODATOK3")
@NamedQueries({
    @NamedQuery(name = "DocDodatok3.findAll", query = "SELECT d FROM DocDodatok3 d")})
public class DocDodatok3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "ACCOUNT_CODE")
    private BigInteger accountCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ACCOUNT_S2")
    private BigDecimal accountS2;
    private BigDecimal gk;
    @Column(name = "GK_1M2")
    private BigDecimal gk1m2;
    @Column(name = "GK_GRN")
    private BigDecimal gkGrn;
    private BigDecimal kvt;
    @Column(name = "KVT_1M2")
    private BigDecimal kvt1m2;
    private BigDecimal m3;
    @Column(name = "M3_GRN")
    private BigDecimal m3Grn;
    @Size(max = 16)
    @Column(name = "HOUSE_HEAT_METER")
    private String houseHeatMeter;
    @Size(max = 16)
    @Column(name = "FLAT_HEAT_METER")
    private String flatHeatMeter;
    @Size(max = 16)
    @Column(name = "FLAT_WATER_METER")
    private String flatWaterMeter;
    @Column(name = "FLAT_HEAT_METER_CHECK")
    @Temporal(TemporalType.DATE)
    private Date flatHeatMeterCheck;
    @Column(name = "FLAT_WATER_METER_CHECK")
    @Temporal(TemporalType.DATE)
    private Date flatWaterMeterCheck;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocDodatok3() {
    }

    public DocDodatok3(Integer code) {
        this.code = code;
    }

    public DocDodatok3(Integer code, int state) {
        this.code = code;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public BigInteger getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(BigInteger accountCode) {
        this.accountCode = accountCode;
    }

    public BigDecimal getAccountS2() {
        return accountS2;
    }

    public void setAccountS2(BigDecimal accountS2) {
        this.accountS2 = accountS2;
    }

    public BigDecimal getGk() {
        return gk;
    }

    public void setGk(BigDecimal gk) {
        this.gk = gk;
    }

    public BigDecimal getGk1m2() {
        return gk1m2;
    }

    public void setGk1m2(BigDecimal gk1m2) {
        this.gk1m2 = gk1m2;
    }

    public BigDecimal getGkGrn() {
        return gkGrn;
    }

    public void setGkGrn(BigDecimal gkGrn) {
        this.gkGrn = gkGrn;
    }

    public BigDecimal getKvt() {
        return kvt;
    }

    public void setKvt(BigDecimal kvt) {
        this.kvt = kvt;
    }

    public BigDecimal getKvt1m2() {
        return kvt1m2;
    }

    public void setKvt1m2(BigDecimal kvt1m2) {
        this.kvt1m2 = kvt1m2;
    }

    public BigDecimal getM3() {
        return m3;
    }

    public void setM3(BigDecimal m3) {
        this.m3 = m3;
    }

    public BigDecimal getM3Grn() {
        return m3Grn;
    }

    public void setM3Grn(BigDecimal m3Grn) {
        this.m3Grn = m3Grn;
    }

    public String getHouseHeatMeter() {
        return houseHeatMeter;
    }

    public void setHouseHeatMeter(String houseHeatMeter) {
        this.houseHeatMeter = houseHeatMeter;
    }

    public String getFlatHeatMeter() {
        return flatHeatMeter;
    }

    public void setFlatHeatMeter(String flatHeatMeter) {
        this.flatHeatMeter = flatHeatMeter;
    }

    public String getFlatWaterMeter() {
        return flatWaterMeter;
    }

    public void setFlatWaterMeter(String flatWaterMeter) {
        this.flatWaterMeter = flatWaterMeter;
    }

    public Date getFlatHeatMeterCheck() {
        return flatHeatMeterCheck;
    }

    public void setFlatHeatMeterCheck(Date flatHeatMeterCheck) {
        this.flatHeatMeterCheck = flatHeatMeterCheck;
    }

    public Date getFlatWaterMeterCheck() {
        return flatWaterMeterCheck;
    }

    public void setFlatWaterMeterCheck(Date flatWaterMeterCheck) {
        this.flatWaterMeterCheck = flatWaterMeterCheck;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
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
        if (!(object instanceof DocDodatok3)) {
            return false;
        }
        DocDodatok3 other = (DocDodatok3) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocDodatok3[ code=" + code + " ]";
    }
    
}
