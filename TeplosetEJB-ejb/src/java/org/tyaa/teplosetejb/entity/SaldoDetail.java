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
@Table(name = "SALDO_DETAIL")
@NamedQueries({
    @NamedQuery(name = "SaldoDetail.findAll", query = "SELECT s FROM SaldoDetail s")})
public class SaldoDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int firmcode;
    @Basic(optional = false)
    @NotNull
    private int saldokind;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal turndt;
    private BigDecimal turnkt;
    @Column(name = "PAY_SUMM")
    private BigDecimal paySumm;
    @Column(name = "SUBS_SUMM")
    private BigDecimal subsSumm;
    @Column(name = "NACH_SUMM")
    private BigDecimal nachSumm;
    @Column(name = "RECALC_SUMM")
    private BigDecimal recalcSumm;
    @Column(name = "KORR_SUMM")
    private BigDecimal korrSumm;
    @Column(name = "LGOTA_SUMM")
    private BigDecimal lgotaSumm;
    @Column(name = "RECALCLGOTA_SUMM")
    private BigDecimal recalclgotaSumm;
    @Column(name = "KORRLGOTA_SUMM")
    private BigDecimal korrlgotaSumm;
    private Integer doccode;
    private Integer docpos;
    @Column(name = "NONACH_SUMM")
    private BigDecimal nonachSumm;
    @Column(name = "RECALCNONACH_SUMM")
    private BigDecimal recalcnonachSumm;
    @Column(name = "NACH_VOLUME")
    private BigDecimal nachVolume;
    @Column(name = "RECALC_VOLUME")
    private BigDecimal recalcVolume;
    @Column(name = "KORR_VOLUME")
    private BigDecimal korrVolume;
    private BigDecimal saldoin;
    private BigDecimal saldoout;
    private Integer groupservice;

    public SaldoDetail() {
    }

    public SaldoDetail(Integer code) {
        this.code = code;
    }

    public SaldoDetail(Integer code, long accountcode, int firmcode, int saldokind, int procdate) {
        this.code = code;
        this.accountcode = accountcode;
        this.firmcode = firmcode;
        this.saldokind = saldokind;
        this.procdate = procdate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public long getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(long accountcode) {
        this.accountcode = accountcode;
    }

    public int getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(int firmcode) {
        this.firmcode = firmcode;
    }

    public int getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(int saldokind) {
        this.saldokind = saldokind;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public BigDecimal getTurndt() {
        return turndt;
    }

    public void setTurndt(BigDecimal turndt) {
        this.turndt = turndt;
    }

    public BigDecimal getTurnkt() {
        return turnkt;
    }

    public void setTurnkt(BigDecimal turnkt) {
        this.turnkt = turnkt;
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

    public BigDecimal getNachSumm() {
        return nachSumm;
    }

    public void setNachSumm(BigDecimal nachSumm) {
        this.nachSumm = nachSumm;
    }

    public BigDecimal getRecalcSumm() {
        return recalcSumm;
    }

    public void setRecalcSumm(BigDecimal recalcSumm) {
        this.recalcSumm = recalcSumm;
    }

    public BigDecimal getKorrSumm() {
        return korrSumm;
    }

    public void setKorrSumm(BigDecimal korrSumm) {
        this.korrSumm = korrSumm;
    }

    public BigDecimal getLgotaSumm() {
        return lgotaSumm;
    }

    public void setLgotaSumm(BigDecimal lgotaSumm) {
        this.lgotaSumm = lgotaSumm;
    }

    public BigDecimal getRecalclgotaSumm() {
        return recalclgotaSumm;
    }

    public void setRecalclgotaSumm(BigDecimal recalclgotaSumm) {
        this.recalclgotaSumm = recalclgotaSumm;
    }

    public BigDecimal getKorrlgotaSumm() {
        return korrlgotaSumm;
    }

    public void setKorrlgotaSumm(BigDecimal korrlgotaSumm) {
        this.korrlgotaSumm = korrlgotaSumm;
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

    public BigDecimal getNonachSumm() {
        return nonachSumm;
    }

    public void setNonachSumm(BigDecimal nonachSumm) {
        this.nonachSumm = nonachSumm;
    }

    public BigDecimal getRecalcnonachSumm() {
        return recalcnonachSumm;
    }

    public void setRecalcnonachSumm(BigDecimal recalcnonachSumm) {
        this.recalcnonachSumm = recalcnonachSumm;
    }

    public BigDecimal getNachVolume() {
        return nachVolume;
    }

    public void setNachVolume(BigDecimal nachVolume) {
        this.nachVolume = nachVolume;
    }

    public BigDecimal getRecalcVolume() {
        return recalcVolume;
    }

    public void setRecalcVolume(BigDecimal recalcVolume) {
        this.recalcVolume = recalcVolume;
    }

    public BigDecimal getKorrVolume() {
        return korrVolume;
    }

    public void setKorrVolume(BigDecimal korrVolume) {
        this.korrVolume = korrVolume;
    }

    public BigDecimal getSaldoin() {
        return saldoin;
    }

    public void setSaldoin(BigDecimal saldoin) {
        this.saldoin = saldoin;
    }

    public BigDecimal getSaldoout() {
        return saldoout;
    }

    public void setSaldoout(BigDecimal saldoout) {
        this.saldoout = saldoout;
    }

    public Integer getGroupservice() {
        return groupservice;
    }

    public void setGroupservice(Integer groupservice) {
        this.groupservice = groupservice;
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
        if (!(object instanceof SaldoDetail)) {
            return false;
        }
        SaldoDetail other = (SaldoDetail) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SaldoDetail[ code=" + code + " ]";
    }
    
}
