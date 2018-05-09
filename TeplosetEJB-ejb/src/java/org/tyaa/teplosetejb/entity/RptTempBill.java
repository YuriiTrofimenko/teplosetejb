/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "RPT_TEMP_BILL")
@NamedQueries({
    @NamedQuery(name = "RptTempBill.findAll", query = "SELECT r FROM RptTempBill r")})
public class RptTempBill implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RptTempBillPK rptTempBillPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal s2;
    @Column(name = "IS_METER")
    private Integer isMeter;
    @Column(name = "MONTH_CALC_VOLUME")
    private BigDecimal monthCalcVolume;
    @Column(name = "PRICE_MONTH_1_M2")
    private BigDecimal priceMonth1M2;
    @Column(name = "HOUSE_S2_ARENDA")
    private BigDecimal houseS2Arenda;
    @Column(name = "HOUSE_HEAT_MONTH_ARENDA_VOLUME")
    private BigDecimal houseHeatMonthArendaVolume;
    @Column(name = "HOUSE_LAST_METER_VALUE")
    private BigDecimal houseLastMeterValue;
    @Column(name = "HOUSE_PREV_METER_VALUE")
    private BigDecimal housePrevMeterValue;
    private Integer edizm;

    public RptTempBill() {
    }

    public RptTempBill(RptTempBillPK rptTempBillPK) {
        this.rptTempBillPK = rptTempBillPK;
    }

    public RptTempBill(int houseCode, int housePipeCode) {
        this.rptTempBillPK = new RptTempBillPK(houseCode, housePipeCode);
    }

    public RptTempBillPK getRptTempBillPK() {
        return rptTempBillPK;
    }

    public void setRptTempBillPK(RptTempBillPK rptTempBillPK) {
        this.rptTempBillPK = rptTempBillPK;
    }

    public BigDecimal getS2() {
        return s2;
    }

    public void setS2(BigDecimal s2) {
        this.s2 = s2;
    }

    public Integer getIsMeter() {
        return isMeter;
    }

    public void setIsMeter(Integer isMeter) {
        this.isMeter = isMeter;
    }

    public BigDecimal getMonthCalcVolume() {
        return monthCalcVolume;
    }

    public void setMonthCalcVolume(BigDecimal monthCalcVolume) {
        this.monthCalcVolume = monthCalcVolume;
    }

    public BigDecimal getPriceMonth1M2() {
        return priceMonth1M2;
    }

    public void setPriceMonth1M2(BigDecimal priceMonth1M2) {
        this.priceMonth1M2 = priceMonth1M2;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rptTempBillPK != null ? rptTempBillPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RptTempBill)) {
            return false;
        }
        RptTempBill other = (RptTempBill) object;
        if ((this.rptTempBillPK == null && other.rptTempBillPK != null) || (this.rptTempBillPK != null && !this.rptTempBillPK.equals(other.rptTempBillPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.RptTempBill[ rptTempBillPK=" + rptTempBillPK + " ]";
    }
    
}
