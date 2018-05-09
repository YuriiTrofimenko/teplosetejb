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
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Saldo.findAll", query = "SELECT s FROM Saldo s")})
public class Saldo implements Serializable {

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
    private BigDecimal saldoin;
    private BigDecimal turndt;
    private BigDecimal turnkt;
    private BigDecimal saldoout;
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
    @Column(name = "ADD_SUMM1")
    private BigDecimal addSumm1;
    @Column(name = "ADD_SUMM2")
    private BigDecimal addSumm2;
    @Column(name = "ADD_SUMM3")
    private BigDecimal addSumm3;
    @Column(name = "ADD_SUMM4")
    private BigDecimal addSumm4;

    public Saldo() {
    }

    public Saldo(Integer code) {
        this.code = code;
    }

    public Saldo(Integer code, long accountcode, int firmcode, int saldokind, int procdate) {
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

    public BigDecimal getSaldoin() {
        return saldoin;
    }

    public void setSaldoin(BigDecimal saldoin) {
        this.saldoin = saldoin;
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

    public BigDecimal getSaldoout() {
        return saldoout;
    }

    public void setSaldoout(BigDecimal saldoout) {
        this.saldoout = saldoout;
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

    public BigDecimal getAddSumm1() {
        return addSumm1;
    }

    public void setAddSumm1(BigDecimal addSumm1) {
        this.addSumm1 = addSumm1;
    }

    public BigDecimal getAddSumm2() {
        return addSumm2;
    }

    public void setAddSumm2(BigDecimal addSumm2) {
        this.addSumm2 = addSumm2;
    }

    public BigDecimal getAddSumm3() {
        return addSumm3;
    }

    public void setAddSumm3(BigDecimal addSumm3) {
        this.addSumm3 = addSumm3;
    }

    public BigDecimal getAddSumm4() {
        return addSumm4;
    }

    public void setAddSumm4(BigDecimal addSumm4) {
        this.addSumm4 = addSumm4;
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
        if (!(object instanceof Saldo)) {
            return false;
        }
        Saldo other = (Saldo) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Saldo[ code=" + code + " ]";
    }
    
}
