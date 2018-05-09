/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "DOC_SALDO_LGOTA")
@NamedQueries({
    @NamedQuery(name = "DocSaldoLgota.findAll", query = "SELECT d FROM DocSaldoLgota d")})
public class DocSaldoLgota implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "LGOTA_CODE")
    private int lgotaCode;
    @Column(name = "SERVICE_CODE")
    private Integer serviceCode;
    private Integer firmcode;
    private Integer procdate;
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
    @OneToMany(mappedBy = "pos")
    private List<ErrDocSaldoLgota> errDocSaldoLgotaList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocSaldoLgota() {
    }

    public DocSaldoLgota(Integer code) {
        this.code = code;
    }

    public DocSaldoLgota(Integer code, int state, int lgotaCode) {
        this.code = code;
        this.state = state;
        this.lgotaCode = lgotaCode;
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

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
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

    public List<ErrDocSaldoLgota> getErrDocSaldoLgotaList() {
        return errDocSaldoLgotaList;
    }

    public void setErrDocSaldoLgotaList(List<ErrDocSaldoLgota> errDocSaldoLgotaList) {
        this.errDocSaldoLgotaList = errDocSaldoLgotaList;
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
        if (!(object instanceof DocSaldoLgota)) {
            return false;
        }
        DocSaldoLgota other = (DocSaldoLgota) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocSaldoLgota[ code=" + code + " ]";
    }
    
}
