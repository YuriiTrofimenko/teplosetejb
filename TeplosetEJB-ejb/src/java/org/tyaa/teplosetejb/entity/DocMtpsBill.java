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
@Table(name = "DOC_MTPS_BILL")
@NamedQueries({
    @NamedQuery(name = "DocMtpsBill.findAll", query = "SELECT d FROM DocMtpsBill d")})
public class DocMtpsBill implements Serializable {

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
    private BigInteger accountcode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal s2;
    private Integer lodgers;
    @Column(name = "LGOTA_S2")
    private BigDecimal lgotaS2;
    @Column(name = "LGOTA_LODGERS")
    private Integer lgotaLodgers;
    @Size(max = 128)
    @Column(name = "LGOTA_TXT")
    private String lgotaTxt;
    @Column(name = "BEGIN_SALDO")
    private BigDecimal beginSaldo;
    @Column(name = "GROUP_SERVICE_CODE")
    private Integer groupServiceCode;
    @Column(name = "BILL_TYPE")
    private Integer billType;
    @Size(max = 128)
    private String fio;
    @Size(max = 48)
    @Column(name = "LODGERS_TXT")
    private String lodgersTxt;
    @Size(max = 48)
    @Column(name = "NORM_TXT")
    private String normTxt;
    @Size(max = 48)
    @Column(name = "S2_TXT")
    private String s2Txt;
    @Column(name = "BEGIN_METER_VALUE")
    private BigDecimal beginMeterValue;
    private BigDecimal volume;
    @Size(max = 48)
    @Column(name = "TARIFF_TXT")
    private String tariffTxt;
    @Column(name = "NACH_SUMM")
    private BigDecimal nachSumm;
    @Column(name = "LGOTA_SUMM")
    private BigDecimal lgotaSumm;
    @Column(name = "RECALC_SUMM")
    private BigDecimal recalcSumm;
    @Column(name = "K_OPLATE_SUMM")
    private BigDecimal kOplateSumm;
    @Column(name = "PAY_SUMM")
    private BigDecimal paySumm;
    @Column(name = "END_MONTH_SUMM")
    private BigDecimal endMonthSumm;
    @Size(max = 128)
    @Column(name = "LGOTA_S2_TXT")
    private String lgotaS2Txt;
    @Column(name = "BEGIN_SALDO_ALL")
    private BigDecimal beginSaldoAll;
    @Column(name = "PAY_SUMM_ALL")
    private BigDecimal paySummAll;
    @Column(name = "LAST_PAY_DATE")
    @Temporal(TemporalType.DATE)
    private Date lastPayDate;
    @Column(name = "LAST_PAY_DATE_ALL")
    @Temporal(TemporalType.DATE)
    private Date lastPayDateAll;
    @Column(name = "BEGIN_SALDO_DPP")
    private BigDecimal beginSaldoDpp;
    @Column(name = "TARIFF_WATER_VALUE")
    private BigDecimal tariffWaterValue;
    @Column(name = "HOUSE_S2")
    private BigDecimal houseS2;
    @Column(name = "HOUSE_HEAT_MONTH_CALC_VOLUME")
    private BigDecimal houseHeatMonthCalcVolume;
    @Column(name = "HOUSE_PRICE_MONTH_1_M2")
    private BigDecimal housePriceMonth1M2;
    @Column(name = "PAY_PROCDATE")
    private Integer payProcdate;
    @Column(name = "PAY_ALL_PROCDATE")
    private Integer payAllProcdate;
    @Column(name = "LAST_METER_VALUE")
    private BigDecimal lastMeterValue;
    @Column(name = "PAY_SUMM_DPP")
    private BigDecimal paySummDpp;
    @Column(name = "PAY_DPP_PROCDATE")
    private Integer payDppProcdate;
    @Size(max = 128)
    @Column(name = "TEXT_FOR_RECALC_SERVICE_2")
    private String textForRecalcService2;
    @Column(name = "SUBS_SUMM")
    private BigDecimal subsSumm;
    @Column(name = "OB_SUMM")
    private BigDecimal obSumm;
    @Column(name = "WATER_GT")
    private Integer waterGt;
    @Column(name = "PAY_PART_SUMM")
    private BigDecimal payPartSumm;
    @Column(name = "BEGIN_SALDO_PAY_PART_ALL")
    private BigDecimal beginSaldoPayPartAll;
    @Column(name = "HOUSE_P_S2")
    private BigDecimal housePS2;
    @Column(name = "HOUSE_S2_ARENDA")
    private BigDecimal houseS2Arenda;
    @Column(name = "HOUSE_HEAT_MONTH_ARENDA_VOLUME")
    private BigDecimal houseHeatMonthArendaVolume;
    @Column(name = "HOUSE_LAST_METER_VALUE")
    private BigDecimal houseLastMeterValue;
    @Column(name = "HOUSE_PREV_METER_VALUE")
    private BigDecimal housePrevMeterValue;
    private Integer edizm;
    @Column(name = "SUMM_KV_NORM")
    private BigDecimal summKvNorm;
    @Column(name = "VOLUME_KV_NORM")
    private BigDecimal volumeKvNorm;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocMtpsBill() {
    }

    public DocMtpsBill(Integer code) {
        this.code = code;
    }

    public DocMtpsBill(Integer code, int state) {
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

    public Integer getLodgers() {
        return lodgers;
    }

    public void setLodgers(Integer lodgers) {
        this.lodgers = lodgers;
    }

    public BigDecimal getLgotaS2() {
        return lgotaS2;
    }

    public void setLgotaS2(BigDecimal lgotaS2) {
        this.lgotaS2 = lgotaS2;
    }

    public Integer getLgotaLodgers() {
        return lgotaLodgers;
    }

    public void setLgotaLodgers(Integer lgotaLodgers) {
        this.lgotaLodgers = lgotaLodgers;
    }

    public String getLgotaTxt() {
        return lgotaTxt;
    }

    public void setLgotaTxt(String lgotaTxt) {
        this.lgotaTxt = lgotaTxt;
    }

    public BigDecimal getBeginSaldo() {
        return beginSaldo;
    }

    public void setBeginSaldo(BigDecimal beginSaldo) {
        this.beginSaldo = beginSaldo;
    }

    public Integer getGroupServiceCode() {
        return groupServiceCode;
    }

    public void setGroupServiceCode(Integer groupServiceCode) {
        this.groupServiceCode = groupServiceCode;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getLodgersTxt() {
        return lodgersTxt;
    }

    public void setLodgersTxt(String lodgersTxt) {
        this.lodgersTxt = lodgersTxt;
    }

    public String getNormTxt() {
        return normTxt;
    }

    public void setNormTxt(String normTxt) {
        this.normTxt = normTxt;
    }

    public String getS2Txt() {
        return s2Txt;
    }

    public void setS2Txt(String s2Txt) {
        this.s2Txt = s2Txt;
    }

    public BigDecimal getBeginMeterValue() {
        return beginMeterValue;
    }

    public void setBeginMeterValue(BigDecimal beginMeterValue) {
        this.beginMeterValue = beginMeterValue;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getTariffTxt() {
        return tariffTxt;
    }

    public void setTariffTxt(String tariffTxt) {
        this.tariffTxt = tariffTxt;
    }

    public BigDecimal getNachSumm() {
        return nachSumm;
    }

    public void setNachSumm(BigDecimal nachSumm) {
        this.nachSumm = nachSumm;
    }

    public BigDecimal getLgotaSumm() {
        return lgotaSumm;
    }

    public void setLgotaSumm(BigDecimal lgotaSumm) {
        this.lgotaSumm = lgotaSumm;
    }

    public BigDecimal getRecalcSumm() {
        return recalcSumm;
    }

    public void setRecalcSumm(BigDecimal recalcSumm) {
        this.recalcSumm = recalcSumm;
    }

    public BigDecimal getKOplateSumm() {
        return kOplateSumm;
    }

    public void setKOplateSumm(BigDecimal kOplateSumm) {
        this.kOplateSumm = kOplateSumm;
    }

    public BigDecimal getPaySumm() {
        return paySumm;
    }

    public void setPaySumm(BigDecimal paySumm) {
        this.paySumm = paySumm;
    }

    public BigDecimal getEndMonthSumm() {
        return endMonthSumm;
    }

    public void setEndMonthSumm(BigDecimal endMonthSumm) {
        this.endMonthSumm = endMonthSumm;
    }

    public String getLgotaS2Txt() {
        return lgotaS2Txt;
    }

    public void setLgotaS2Txt(String lgotaS2Txt) {
        this.lgotaS2Txt = lgotaS2Txt;
    }

    public BigDecimal getBeginSaldoAll() {
        return beginSaldoAll;
    }

    public void setBeginSaldoAll(BigDecimal beginSaldoAll) {
        this.beginSaldoAll = beginSaldoAll;
    }

    public BigDecimal getPaySummAll() {
        return paySummAll;
    }

    public void setPaySummAll(BigDecimal paySummAll) {
        this.paySummAll = paySummAll;
    }

    public Date getLastPayDate() {
        return lastPayDate;
    }

    public void setLastPayDate(Date lastPayDate) {
        this.lastPayDate = lastPayDate;
    }

    public Date getLastPayDateAll() {
        return lastPayDateAll;
    }

    public void setLastPayDateAll(Date lastPayDateAll) {
        this.lastPayDateAll = lastPayDateAll;
    }

    public BigDecimal getBeginSaldoDpp() {
        return beginSaldoDpp;
    }

    public void setBeginSaldoDpp(BigDecimal beginSaldoDpp) {
        this.beginSaldoDpp = beginSaldoDpp;
    }

    public BigDecimal getTariffWaterValue() {
        return tariffWaterValue;
    }

    public void setTariffWaterValue(BigDecimal tariffWaterValue) {
        this.tariffWaterValue = tariffWaterValue;
    }

    public BigDecimal getHouseS2() {
        return houseS2;
    }

    public void setHouseS2(BigDecimal houseS2) {
        this.houseS2 = houseS2;
    }

    public BigDecimal getHouseHeatMonthCalcVolume() {
        return houseHeatMonthCalcVolume;
    }

    public void setHouseHeatMonthCalcVolume(BigDecimal houseHeatMonthCalcVolume) {
        this.houseHeatMonthCalcVolume = houseHeatMonthCalcVolume;
    }

    public BigDecimal getHousePriceMonth1M2() {
        return housePriceMonth1M2;
    }

    public void setHousePriceMonth1M2(BigDecimal housePriceMonth1M2) {
        this.housePriceMonth1M2 = housePriceMonth1M2;
    }

    public Integer getPayProcdate() {
        return payProcdate;
    }

    public void setPayProcdate(Integer payProcdate) {
        this.payProcdate = payProcdate;
    }

    public Integer getPayAllProcdate() {
        return payAllProcdate;
    }

    public void setPayAllProcdate(Integer payAllProcdate) {
        this.payAllProcdate = payAllProcdate;
    }

    public BigDecimal getLastMeterValue() {
        return lastMeterValue;
    }

    public void setLastMeterValue(BigDecimal lastMeterValue) {
        this.lastMeterValue = lastMeterValue;
    }

    public BigDecimal getPaySummDpp() {
        return paySummDpp;
    }

    public void setPaySummDpp(BigDecimal paySummDpp) {
        this.paySummDpp = paySummDpp;
    }

    public Integer getPayDppProcdate() {
        return payDppProcdate;
    }

    public void setPayDppProcdate(Integer payDppProcdate) {
        this.payDppProcdate = payDppProcdate;
    }

    public String getTextForRecalcService2() {
        return textForRecalcService2;
    }

    public void setTextForRecalcService2(String textForRecalcService2) {
        this.textForRecalcService2 = textForRecalcService2;
    }

    public BigDecimal getSubsSumm() {
        return subsSumm;
    }

    public void setSubsSumm(BigDecimal subsSumm) {
        this.subsSumm = subsSumm;
    }

    public BigDecimal getObSumm() {
        return obSumm;
    }

    public void setObSumm(BigDecimal obSumm) {
        this.obSumm = obSumm;
    }

    public Integer getWaterGt() {
        return waterGt;
    }

    public void setWaterGt(Integer waterGt) {
        this.waterGt = waterGt;
    }

    public BigDecimal getPayPartSumm() {
        return payPartSumm;
    }

    public void setPayPartSumm(BigDecimal payPartSumm) {
        this.payPartSumm = payPartSumm;
    }

    public BigDecimal getBeginSaldoPayPartAll() {
        return beginSaldoPayPartAll;
    }

    public void setBeginSaldoPayPartAll(BigDecimal beginSaldoPayPartAll) {
        this.beginSaldoPayPartAll = beginSaldoPayPartAll;
    }

    public BigDecimal getHousePS2() {
        return housePS2;
    }

    public void setHousePS2(BigDecimal housePS2) {
        this.housePS2 = housePS2;
    }

    public BigDecimal getHouseS2Arenda() {
        return houseS2Arenda;
    }

    public void setHouseS2Arenda(BigDecimal houseS2Arenda) {
        this.houseS2Arenda = houseS2Arenda;
    }

    public BigDecimal getHouseHeatMonthArendaVolume() {
        return houseHeatMonthArendaVolume;
    }

    public void setHouseHeatMonthArendaVolume(BigDecimal houseHeatMonthArendaVolume) {
        this.houseHeatMonthArendaVolume = houseHeatMonthArendaVolume;
    }

    public BigDecimal getHouseLastMeterValue() {
        return houseLastMeterValue;
    }

    public void setHouseLastMeterValue(BigDecimal houseLastMeterValue) {
        this.houseLastMeterValue = houseLastMeterValue;
    }

    public BigDecimal getHousePrevMeterValue() {
        return housePrevMeterValue;
    }

    public void setHousePrevMeterValue(BigDecimal housePrevMeterValue) {
        this.housePrevMeterValue = housePrevMeterValue;
    }

    public Integer getEdizm() {
        return edizm;
    }

    public void setEdizm(Integer edizm) {
        this.edizm = edizm;
    }

    public BigDecimal getSummKvNorm() {
        return summKvNorm;
    }

    public void setSummKvNorm(BigDecimal summKvNorm) {
        this.summKvNorm = summKvNorm;
    }

    public BigDecimal getVolumeKvNorm() {
        return volumeKvNorm;
    }

    public void setVolumeKvNorm(BigDecimal volumeKvNorm) {
        this.volumeKvNorm = volumeKvNorm;
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
        if (!(object instanceof DocMtpsBill)) {
            return false;
        }
        DocMtpsBill other = (DocMtpsBill) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocMtpsBill[ code=" + code + " ]";
    }
    
}
