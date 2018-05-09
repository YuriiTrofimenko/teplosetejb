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
@Table(name = "DOC_BRD_BILL")
@NamedQueries({
    @NamedQuery(name = "DocBrdBill.findAll", query = "SELECT d FROM DocBrdBill d")})
public class DocBrdBill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "AREA_CODE")
    private Integer areaCode;
    @Column(name = "DISTRICT_CODE")
    private Integer districtCode;
    @Column(name = "GROUPZHEK_CODE")
    private Integer groupzhekCode;
    @Column(name = "ZHEK_CODE")
    private Integer zhekCode;
    @Column(name = "HOUSE_CODE")
    private Integer houseCode;
    @Column(name = "INSPECTOR_CODE")
    private Integer inspectorCode;
    private BigInteger accountcode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal s2;
    @Size(max = 128)
    @Column(name = "LGOTA_TXT")
    private String lgotaTxt;
    @Size(max = 128)
    private String fio;
    @Column(name = "BEGIN_SALDO")
    private BigDecimal beginSaldo;
    @Column(name = "K_OPLATE_SUMM")
    private BigDecimal kOplateSumm;
    @Column(name = "RECALC_SUMM")
    private BigDecimal recalcSumm;
    @Column(name = "PAY_SUMM")
    private BigDecimal paySumm;
    @Column(name = "SUBS_SUMM")
    private BigDecimal subsSumm;
    @Column(name = "END_SALDO")
    private BigDecimal endSaldo;
    @Column(name = "AO_DAYS")
    private Integer aoDays;
    @Column(name = "AO_TARIFF")
    private BigDecimal aoTariff;
    @Column(name = "AO_SQ")
    private BigDecimal aoSq;
    @Column(name = "AO_SUMM_NL")
    private BigDecimal aoSummNl;
    @Column(name = "AO_LGOTA_PERCENT")
    private BigDecimal aoLgotaPercent;
    @Column(name = "AO_LGOTA_SQ")
    private BigDecimal aoLgotaSq;
    @Column(name = "AO_SUMM_L")
    private BigDecimal aoSummL;
    @Column(name = "O_DAYS_FN1")
    private Integer oDaysFn1;
    @Column(name = "O_TARIFF_FN1")
    private BigDecimal oTariffFn1;
    @Column(name = "O_VOLUME_FN1")
    private BigDecimal oVolumeFn1;
    @Column(name = "O_SQ_FN1")
    private BigDecimal oSqFn1;
    @Column(name = "O_SUMM_NL_FN1")
    private BigDecimal oSummNlFn1;
    @Column(name = "O_LGOTA_PERCENT_FN1")
    private BigDecimal oLgotaPercentFn1;
    @Column(name = "O_LGOTA_SQ_FN1")
    private BigDecimal oLgotaSqFn1;
    @Column(name = "O_SUMM_L_FN1")
    private BigDecimal oSummLFn1;
    @Column(name = "O_DAYS_FN3")
    private Integer oDaysFn3;
    @Column(name = "O_TARIFF_FN3")
    private BigDecimal oTariffFn3;
    @Column(name = "O_VOLUME_FN3")
    private BigDecimal oVolumeFn3;
    @Column(name = "O_SQ_FN3")
    private BigDecimal oSqFn3;
    @Column(name = "O_SUMM_NL_FN3")
    private BigDecimal oSummNlFn3;
    @Column(name = "O_LGOTA_PERCENT_FN3")
    private BigDecimal oLgotaPercentFn3;
    @Column(name = "O_LGOTA_SQ_FN3")
    private BigDecimal oLgotaSqFn3;
    @Column(name = "O_SUMM_L_FN3")
    private BigDecimal oSummLFn3;
    private BigDecimal turndt;
    @Column(name = "IS_ERROR")
    private Integer isError;
    @Column(name = "OD_TARIFF_FN3")
    private BigDecimal odTariffFn3;
    @Column(name = "O_TKF_FN3")
    private BigDecimal oTkfFn3;
    @Column(name = "O_OB2")
    private BigDecimal oOb2;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocBrdBill() {
    }

    public DocBrdBill(Integer code) {
        this.code = code;
    }

    public DocBrdBill(Integer code, int state) {
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

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public Integer getGroupzhekCode() {
        return groupzhekCode;
    }

    public void setGroupzhekCode(Integer groupzhekCode) {
        this.groupzhekCode = groupzhekCode;
    }

    public Integer getZhekCode() {
        return zhekCode;
    }

    public void setZhekCode(Integer zhekCode) {
        this.zhekCode = zhekCode;
    }

    public Integer getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(Integer houseCode) {
        this.houseCode = houseCode;
    }

    public Integer getInspectorCode() {
        return inspectorCode;
    }

    public void setInspectorCode(Integer inspectorCode) {
        this.inspectorCode = inspectorCode;
    }

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public BigDecimal getS2() {
        return s2;
    }

    public void setS2(BigDecimal s2) {
        this.s2 = s2;
    }

    public String getLgotaTxt() {
        return lgotaTxt;
    }

    public void setLgotaTxt(String lgotaTxt) {
        this.lgotaTxt = lgotaTxt;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public BigDecimal getBeginSaldo() {
        return beginSaldo;
    }

    public void setBeginSaldo(BigDecimal beginSaldo) {
        this.beginSaldo = beginSaldo;
    }

    public BigDecimal getKOplateSumm() {
        return kOplateSumm;
    }

    public void setKOplateSumm(BigDecimal kOplateSumm) {
        this.kOplateSumm = kOplateSumm;
    }

    public BigDecimal getRecalcSumm() {
        return recalcSumm;
    }

    public void setRecalcSumm(BigDecimal recalcSumm) {
        this.recalcSumm = recalcSumm;
    }

    public BigDecimal getPaySumm() {
        return paySumm;
    }

    public void setPaySumm(BigDecimal paySumm) {
        this.paySumm = paySumm;
    }

    public BigDecimal getSubsSumm() {
        return subsSumm;
    }

    public void setSubsSumm(BigDecimal subsSumm) {
        this.subsSumm = subsSumm;
    }

    public BigDecimal getEndSaldo() {
        return endSaldo;
    }

    public void setEndSaldo(BigDecimal endSaldo) {
        this.endSaldo = endSaldo;
    }

    public Integer getAoDays() {
        return aoDays;
    }

    public void setAoDays(Integer aoDays) {
        this.aoDays = aoDays;
    }

    public BigDecimal getAoTariff() {
        return aoTariff;
    }

    public void setAoTariff(BigDecimal aoTariff) {
        this.aoTariff = aoTariff;
    }

    public BigDecimal getAoSq() {
        return aoSq;
    }

    public void setAoSq(BigDecimal aoSq) {
        this.aoSq = aoSq;
    }

    public BigDecimal getAoSummNl() {
        return aoSummNl;
    }

    public void setAoSummNl(BigDecimal aoSummNl) {
        this.aoSummNl = aoSummNl;
    }

    public BigDecimal getAoLgotaPercent() {
        return aoLgotaPercent;
    }

    public void setAoLgotaPercent(BigDecimal aoLgotaPercent) {
        this.aoLgotaPercent = aoLgotaPercent;
    }

    public BigDecimal getAoLgotaSq() {
        return aoLgotaSq;
    }

    public void setAoLgotaSq(BigDecimal aoLgotaSq) {
        this.aoLgotaSq = aoLgotaSq;
    }

    public BigDecimal getAoSummL() {
        return aoSummL;
    }

    public void setAoSummL(BigDecimal aoSummL) {
        this.aoSummL = aoSummL;
    }

    public Integer getODaysFn1() {
        return oDaysFn1;
    }

    public void setODaysFn1(Integer oDaysFn1) {
        this.oDaysFn1 = oDaysFn1;
    }

    public BigDecimal getOTariffFn1() {
        return oTariffFn1;
    }

    public void setOTariffFn1(BigDecimal oTariffFn1) {
        this.oTariffFn1 = oTariffFn1;
    }

    public BigDecimal getOVolumeFn1() {
        return oVolumeFn1;
    }

    public void setOVolumeFn1(BigDecimal oVolumeFn1) {
        this.oVolumeFn1 = oVolumeFn1;
    }

    public BigDecimal getOSqFn1() {
        return oSqFn1;
    }

    public void setOSqFn1(BigDecimal oSqFn1) {
        this.oSqFn1 = oSqFn1;
    }

    public BigDecimal getOSummNlFn1() {
        return oSummNlFn1;
    }

    public void setOSummNlFn1(BigDecimal oSummNlFn1) {
        this.oSummNlFn1 = oSummNlFn1;
    }

    public BigDecimal getOLgotaPercentFn1() {
        return oLgotaPercentFn1;
    }

    public void setOLgotaPercentFn1(BigDecimal oLgotaPercentFn1) {
        this.oLgotaPercentFn1 = oLgotaPercentFn1;
    }

    public BigDecimal getOLgotaSqFn1() {
        return oLgotaSqFn1;
    }

    public void setOLgotaSqFn1(BigDecimal oLgotaSqFn1) {
        this.oLgotaSqFn1 = oLgotaSqFn1;
    }

    public BigDecimal getOSummLFn1() {
        return oSummLFn1;
    }

    public void setOSummLFn1(BigDecimal oSummLFn1) {
        this.oSummLFn1 = oSummLFn1;
    }

    public Integer getODaysFn3() {
        return oDaysFn3;
    }

    public void setODaysFn3(Integer oDaysFn3) {
        this.oDaysFn3 = oDaysFn3;
    }

    public BigDecimal getOTariffFn3() {
        return oTariffFn3;
    }

    public void setOTariffFn3(BigDecimal oTariffFn3) {
        this.oTariffFn3 = oTariffFn3;
    }

    public BigDecimal getOVolumeFn3() {
        return oVolumeFn3;
    }

    public void setOVolumeFn3(BigDecimal oVolumeFn3) {
        this.oVolumeFn3 = oVolumeFn3;
    }

    public BigDecimal getOSqFn3() {
        return oSqFn3;
    }

    public void setOSqFn3(BigDecimal oSqFn3) {
        this.oSqFn3 = oSqFn3;
    }

    public BigDecimal getOSummNlFn3() {
        return oSummNlFn3;
    }

    public void setOSummNlFn3(BigDecimal oSummNlFn3) {
        this.oSummNlFn3 = oSummNlFn3;
    }

    public BigDecimal getOLgotaPercentFn3() {
        return oLgotaPercentFn3;
    }

    public void setOLgotaPercentFn3(BigDecimal oLgotaPercentFn3) {
        this.oLgotaPercentFn3 = oLgotaPercentFn3;
    }

    public BigDecimal getOLgotaSqFn3() {
        return oLgotaSqFn3;
    }

    public void setOLgotaSqFn3(BigDecimal oLgotaSqFn3) {
        this.oLgotaSqFn3 = oLgotaSqFn3;
    }

    public BigDecimal getOSummLFn3() {
        return oSummLFn3;
    }

    public void setOSummLFn3(BigDecimal oSummLFn3) {
        this.oSummLFn3 = oSummLFn3;
    }

    public BigDecimal getTurndt() {
        return turndt;
    }

    public void setTurndt(BigDecimal turndt) {
        this.turndt = turndt;
    }

    public Integer getIsError() {
        return isError;
    }

    public void setIsError(Integer isError) {
        this.isError = isError;
    }

    public BigDecimal getOdTariffFn3() {
        return odTariffFn3;
    }

    public void setOdTariffFn3(BigDecimal odTariffFn3) {
        this.odTariffFn3 = odTariffFn3;
    }

    public BigDecimal getOTkfFn3() {
        return oTkfFn3;
    }

    public void setOTkfFn3(BigDecimal oTkfFn3) {
        this.oTkfFn3 = oTkfFn3;
    }

    public BigDecimal getOOb2() {
        return oOb2;
    }

    public void setOOb2(BigDecimal oOb2) {
        this.oOb2 = oOb2;
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
        if (!(object instanceof DocBrdBill)) {
            return false;
        }
        DocBrdBill other = (DocBrdBill) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocBrdBill[ code=" + code + " ]";
    }
    
}
