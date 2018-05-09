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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_ACCOUNT_U")
@NamedQueries({
    @NamedQuery(name = "DocAccountU.findAll", query = "SELECT d FROM DocAccountU d")})
public class DocAccountU implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    private Integer yyyy;
    private Integer pd;
    @Size(max = 16)
    @Column(name = "PD_NAME")
    private String pdName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALDO_IN")
    private BigDecimal saldoIn;
    @Column(name = "HEATING_SUMM_DT")
    private BigDecimal heatingSummDt;
    @Column(name = "WATER_SUMM_DT")
    private BigDecimal waterSummDt;
    @Column(name = "HEATING_SUMM_RECALC_MINUS")
    private BigDecimal heatingSummRecalcMinus;
    @Column(name = "WATER_SUMM_RECALC_MINUS")
    private BigDecimal waterSummRecalcMinus;
    @Column(name = "ALL_SUMM_DT")
    private BigDecimal allSummDt;
    @Column(name = "ALL_SUMM_KT")
    private BigDecimal allSummKt;
    @Column(name = "SUBSIDY_SUMM")
    private BigDecimal subsidySumm;
    @Column(name = "SALDO_OUT")
    private BigDecimal saldoOut;
    @Column(name = "IS_EDIT")
    private Integer isEdit;
    @Size(max = 128)
    private String remark;
    @Column(name = "INFLATION_PERCENT")
    private BigDecimal inflationPercent;
    @Column(name = "INFLATION_SUMM")
    private BigDecimal inflationSumm;
    @Size(max = 128)
    @Column(name = "INFLATION_CALC")
    private String inflationCalc;
    @Column(name = "NBU_PERCENT")
    private BigDecimal nbuPercent;
    @Column(name = "NBU_SUMM")
    private BigDecimal nbuSumm;
    @Size(max = 128)
    @Column(name = "NBU_CALC")
    private String nbuCalc;
    @Column(name = "HEATING_SUMM_KT")
    private BigDecimal heatingSummKt;
    @Column(name = "WATER_SUMM_KT")
    private BigDecimal waterSummKt;
    @Column(name = "OTHER_SUMM_KT")
    private BigDecimal otherSummKt;
    @Column(name = "HEATING_NACH_SUMM")
    private BigDecimal heatingNachSumm;
    @Column(name = "WATER_NACH_SUMM")
    private BigDecimal waterNachSumm;
    @Column(name = "HEATING_SUMM_RECALCULATION")
    private BigDecimal heatingSummRecalculation;
    @Column(name = "WATER_SUMM_RECALCULATION")
    private BigDecimal waterSummRecalculation;
    @Column(name = "SUMM_FOR_CALC")
    private BigDecimal summForCalc;
    @Column(name = "HEATING_SUBSIDY_SUMM")
    private BigDecimal heatingSubsidySumm;
    @Column(name = "WATER_SUBSIDY_SUMM")
    private BigDecimal waterSubsidySumm;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocAccountU() {
    }

    public DocAccountU(Integer code) {
        this.code = code;
    }

    public DocAccountU(Integer code, int state) {
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

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public Integer getYyyy() {
        return yyyy;
    }

    public void setYyyy(Integer yyyy) {
        this.yyyy = yyyy;
    }

    public Integer getPd() {
        return pd;
    }

    public void setPd(Integer pd) {
        this.pd = pd;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public BigDecimal getSaldoIn() {
        return saldoIn;
    }

    public void setSaldoIn(BigDecimal saldoIn) {
        this.saldoIn = saldoIn;
    }

    public BigDecimal getHeatingSummDt() {
        return heatingSummDt;
    }

    public void setHeatingSummDt(BigDecimal heatingSummDt) {
        this.heatingSummDt = heatingSummDt;
    }

    public BigDecimal getWaterSummDt() {
        return waterSummDt;
    }

    public void setWaterSummDt(BigDecimal waterSummDt) {
        this.waterSummDt = waterSummDt;
    }

    public BigDecimal getHeatingSummRecalcMinus() {
        return heatingSummRecalcMinus;
    }

    public void setHeatingSummRecalcMinus(BigDecimal heatingSummRecalcMinus) {
        this.heatingSummRecalcMinus = heatingSummRecalcMinus;
    }

    public BigDecimal getWaterSummRecalcMinus() {
        return waterSummRecalcMinus;
    }

    public void setWaterSummRecalcMinus(BigDecimal waterSummRecalcMinus) {
        this.waterSummRecalcMinus = waterSummRecalcMinus;
    }

    public BigDecimal getAllSummDt() {
        return allSummDt;
    }

    public void setAllSummDt(BigDecimal allSummDt) {
        this.allSummDt = allSummDt;
    }

    public BigDecimal getAllSummKt() {
        return allSummKt;
    }

    public void setAllSummKt(BigDecimal allSummKt) {
        this.allSummKt = allSummKt;
    }

    public BigDecimal getSubsidySumm() {
        return subsidySumm;
    }

    public void setSubsidySumm(BigDecimal subsidySumm) {
        this.subsidySumm = subsidySumm;
    }

    public BigDecimal getSaldoOut() {
        return saldoOut;
    }

    public void setSaldoOut(BigDecimal saldoOut) {
        this.saldoOut = saldoOut;
    }

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getInflationPercent() {
        return inflationPercent;
    }

    public void setInflationPercent(BigDecimal inflationPercent) {
        this.inflationPercent = inflationPercent;
    }

    public BigDecimal getInflationSumm() {
        return inflationSumm;
    }

    public void setInflationSumm(BigDecimal inflationSumm) {
        this.inflationSumm = inflationSumm;
    }

    public String getInflationCalc() {
        return inflationCalc;
    }

    public void setInflationCalc(String inflationCalc) {
        this.inflationCalc = inflationCalc;
    }

    public BigDecimal getNbuPercent() {
        return nbuPercent;
    }

    public void setNbuPercent(BigDecimal nbuPercent) {
        this.nbuPercent = nbuPercent;
    }

    public BigDecimal getNbuSumm() {
        return nbuSumm;
    }

    public void setNbuSumm(BigDecimal nbuSumm) {
        this.nbuSumm = nbuSumm;
    }

    public String getNbuCalc() {
        return nbuCalc;
    }

    public void setNbuCalc(String nbuCalc) {
        this.nbuCalc = nbuCalc;
    }

    public BigDecimal getHeatingSummKt() {
        return heatingSummKt;
    }

    public void setHeatingSummKt(BigDecimal heatingSummKt) {
        this.heatingSummKt = heatingSummKt;
    }

    public BigDecimal getWaterSummKt() {
        return waterSummKt;
    }

    public void setWaterSummKt(BigDecimal waterSummKt) {
        this.waterSummKt = waterSummKt;
    }

    public BigDecimal getOtherSummKt() {
        return otherSummKt;
    }

    public void setOtherSummKt(BigDecimal otherSummKt) {
        this.otherSummKt = otherSummKt;
    }

    public BigDecimal getHeatingNachSumm() {
        return heatingNachSumm;
    }

    public void setHeatingNachSumm(BigDecimal heatingNachSumm) {
        this.heatingNachSumm = heatingNachSumm;
    }

    public BigDecimal getWaterNachSumm() {
        return waterNachSumm;
    }

    public void setWaterNachSumm(BigDecimal waterNachSumm) {
        this.waterNachSumm = waterNachSumm;
    }

    public BigDecimal getHeatingSummRecalculation() {
        return heatingSummRecalculation;
    }

    public void setHeatingSummRecalculation(BigDecimal heatingSummRecalculation) {
        this.heatingSummRecalculation = heatingSummRecalculation;
    }

    public BigDecimal getWaterSummRecalculation() {
        return waterSummRecalculation;
    }

    public void setWaterSummRecalculation(BigDecimal waterSummRecalculation) {
        this.waterSummRecalculation = waterSummRecalculation;
    }

    public BigDecimal getSummForCalc() {
        return summForCalc;
    }

    public void setSummForCalc(BigDecimal summForCalc) {
        this.summForCalc = summForCalc;
    }

    public BigDecimal getHeatingSubsidySumm() {
        return heatingSubsidySumm;
    }

    public void setHeatingSubsidySumm(BigDecimal heatingSubsidySumm) {
        this.heatingSubsidySumm = heatingSubsidySumm;
    }

    public BigDecimal getWaterSubsidySumm() {
        return waterSubsidySumm;
    }

    public void setWaterSubsidySumm(BigDecimal waterSubsidySumm) {
        this.waterSubsidySumm = waterSubsidySumm;
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
        if (!(object instanceof DocAccountU)) {
            return false;
        }
        DocAccountU other = (DocAccountU) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAccountU[ code=" + code + " ]";
    }
    
}
