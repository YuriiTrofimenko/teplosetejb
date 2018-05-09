/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "SALDO_LGOTA")
@NamedQueries({
    @NamedQuery(name = "SaldoLgota.findAll", query = "SELECT s FROM SaldoLgota s")})
public class SaldoLgota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LGOTA_CODE")
    private int lgotaCode;
    @Column(name = "SERVICE_CODE")
    private Integer serviceCode;
    @Column(name = "AREA_CODE")
    private Integer areaCode;
    @Basic(optional = false)
    @NotNull
    private int firmcode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal saldoin;
    @Column(name = "LGOTA_NACH_FOR_PAY")
    private BigDecimal lgotaNachForPay;
    @Column(name = "LGOTA_PAY")
    private BigDecimal lgotaPay;
    private BigDecimal saldoout;
    @Column(name = "F2_SUMM")
    private BigDecimal f2Summ;
    @Column(name = "NP_SUMM")
    private BigDecimal npSumm;
    @Column(name = "LGOTA_SUMM")
    private BigDecimal lgotaSumm;
    private Integer doccode;
    private Integer docpos;

    public SaldoLgota() {
    }

    public SaldoLgota(Integer code) {
        this.code = code;
    }

    public SaldoLgota(Integer code, int lgotaCode, int firmcode, int procdate) {
        this.code = code;
        this.lgotaCode = lgotaCode;
        this.firmcode = firmcode;
        this.procdate = procdate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getLgotaCode() {
        return lgotaCode;
    }

    public void setLgotaCode(int lgotaCode) {
        this.lgotaCode = lgotaCode;
    }

    public Integer getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public int getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(int firmcode) {
        this.firmcode = firmcode;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public BigDecimal getSaldoin() {
        return saldoin;
    }

    public void setSaldoin(BigDecimal saldoin) {
        this.saldoin = saldoin;
    }

    public BigDecimal getLgotaNachForPay() {
        return lgotaNachForPay;
    }

    public void setLgotaNachForPay(BigDecimal lgotaNachForPay) {
        this.lgotaNachForPay = lgotaNachForPay;
    }

    public BigDecimal getLgotaPay() {
        return lgotaPay;
    }

    public void setLgotaPay(BigDecimal lgotaPay) {
        this.lgotaPay = lgotaPay;
    }

    public BigDecimal getSaldoout() {
        return saldoout;
    }

    public void setSaldoout(BigDecimal saldoout) {
        this.saldoout = saldoout;
    }

    public BigDecimal getF2Summ() {
        return f2Summ;
    }

    public void setF2Summ(BigDecimal f2Summ) {
        this.f2Summ = f2Summ;
    }

    public BigDecimal getNpSumm() {
        return npSumm;
    }

    public void setNpSumm(BigDecimal npSumm) {
        this.npSumm = npSumm;
    }

    public BigDecimal getLgotaSumm() {
        return lgotaSumm;
    }

    public void setLgotaSumm(BigDecimal lgotaSumm) {
        this.lgotaSumm = lgotaSumm;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaldoLgota)) {
            return false;
        }
        SaldoLgota other = (SaldoLgota) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SaldoLgota[ code=" + code + " ]";
    }
    
}
