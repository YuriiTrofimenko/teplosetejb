/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_SALDO")
@NamedQueries({
    @NamedQuery(name = "DocSaldo.findAll", query = "SELECT d FROM DocSaldo d")})
public class DocSaldo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    private Integer firmcode;
    private Integer saldokind;
    private Integer procdate;
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
    @Column(name = "NONACH_SUMM")
    private BigDecimal nonachSumm;
    @Column(name = "RECALCNONACH_SUMM")
    private BigDecimal recalcnonachSumm;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocSaldo> errDocSaldoList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pos")
    private List<DocSaldoDetail> docSaldoDetailList;

    public DocSaldo() {
    }

    public DocSaldo(Integer code) {
        this.code = code;
    }

    public DocSaldo(Integer code, int state) {
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

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public Integer getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(Integer saldokind) {
        this.saldokind = saldokind;
    }

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
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

    public List<ErrDocSaldo> getErrDocSaldoList() {
        return errDocSaldoList;
    }

    public void setErrDocSaldoList(List<ErrDocSaldo> errDocSaldoList) {
        this.errDocSaldoList = errDocSaldoList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<DocSaldoDetail> getDocSaldoDetailList() {
        return docSaldoDetailList;
    }

    public void setDocSaldoDetailList(List<DocSaldoDetail> docSaldoDetailList) {
        this.docSaldoDetailList = docSaldoDetailList;
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
        if (!(object instanceof DocSaldo)) {
            return false;
        }
        DocSaldo other = (DocSaldo) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocSaldo[ code=" + code + " ]";
    }
    
}
