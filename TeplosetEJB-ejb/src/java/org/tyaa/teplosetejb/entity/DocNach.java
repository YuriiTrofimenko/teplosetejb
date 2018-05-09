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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_NACH")
@NamedQueries({
    @NamedQuery(name = "DocNach.findAll", query = "SELECT d FROM DocNach d")})
public class DocNach implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer firmcode;
    private Integer saldokind;
    private BigInteger accountcode;
    private Integer todate;
    private Integer pipecode;
    private Integer ps;
    private Integer pskind;
    private Integer service;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal volume;
    private BigDecimal s;
    private BigDecimal summ;
    @Temporal(TemporalType.DATE)
    private Date datefrom;
    @Temporal(TemporalType.DATE)
    private Date datetill;
    private Integer tt;
    private Integer gt;
    private Integer tariffcode;
    private BigDecimal tariff;
    private Integer lgota;
    private BigDecimal lgotapercent;
    private Integer lgoternumber;
    private Integer formnach;
    private Integer normcode;
    private Double norm;
    @Size(max = 128)
    private String remark;
    @Column(name = "LGOTA_VOLUME")
    private BigDecimal lgotaVolume;
    @Column(name = "LGOTA_S")
    private BigDecimal lgotaS;
    @Column(name = "LGOTA_SUMM")
    private BigDecimal lgotaSumm;
    private Integer reasoncode;
    @Column(name = "ITOGO_SUMM")
    private BigDecimal itogoSumm;
    @Column(name = "RESP_PERSONS_CODE")
    private Integer respPersonsCode;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocNach> errDocNachList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocNach() {
    }

    public DocNach(Integer code) {
        this.code = code;
    }

    public DocNach(Integer code, int state) {
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

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public Integer getPs() {
        return ps;
    }

    public void setPs(Integer ps) {
        this.ps = ps;
    }

    public Integer getPskind() {
        return pskind;
    }

    public void setPskind(Integer pskind) {
        this.pskind = pskind;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getS() {
        return s;
    }

    public void setS(BigDecimal s) {
        this.s = s;
    }

    public BigDecimal getSumm() {
        return summ;
    }

    public void setSumm(BigDecimal summ) {
        this.summ = summ;
    }

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDatetill() {
        return datetill;
    }

    public void setDatetill(Date datetill) {
        this.datetill = datetill;
    }

    public Integer getTt() {
        return tt;
    }

    public void setTt(Integer tt) {
        this.tt = tt;
    }

    public Integer getGt() {
        return gt;
    }

    public void setGt(Integer gt) {
        this.gt = gt;
    }

    public Integer getTariffcode() {
        return tariffcode;
    }

    public void setTariffcode(Integer tariffcode) {
        this.tariffcode = tariffcode;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public Integer getLgota() {
        return lgota;
    }

    public void setLgota(Integer lgota) {
        this.lgota = lgota;
    }

    public BigDecimal getLgotapercent() {
        return lgotapercent;
    }

    public void setLgotapercent(BigDecimal lgotapercent) {
        this.lgotapercent = lgotapercent;
    }

    public Integer getLgoternumber() {
        return lgoternumber;
    }

    public void setLgoternumber(Integer lgoternumber) {
        this.lgoternumber = lgoternumber;
    }

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getNormcode() {
        return normcode;
    }

    public void setNormcode(Integer normcode) {
        this.normcode = normcode;
    }

    public Double getNorm() {
        return norm;
    }

    public void setNorm(Double norm) {
        this.norm = norm;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getLgotaVolume() {
        return lgotaVolume;
    }

    public void setLgotaVolume(BigDecimal lgotaVolume) {
        this.lgotaVolume = lgotaVolume;
    }

    public BigDecimal getLgotaS() {
        return lgotaS;
    }

    public void setLgotaS(BigDecimal lgotaS) {
        this.lgotaS = lgotaS;
    }

    public BigDecimal getLgotaSumm() {
        return lgotaSumm;
    }

    public void setLgotaSumm(BigDecimal lgotaSumm) {
        this.lgotaSumm = lgotaSumm;
    }

    public Integer getReasoncode() {
        return reasoncode;
    }

    public void setReasoncode(Integer reasoncode) {
        this.reasoncode = reasoncode;
    }

    public BigDecimal getItogoSumm() {
        return itogoSumm;
    }

    public void setItogoSumm(BigDecimal itogoSumm) {
        this.itogoSumm = itogoSumm;
    }

    public Integer getRespPersonsCode() {
        return respPersonsCode;
    }

    public void setRespPersonsCode(Integer respPersonsCode) {
        this.respPersonsCode = respPersonsCode;
    }

    public List<ErrDocNach> getErrDocNachList() {
        return errDocNachList;
    }

    public void setErrDocNachList(List<ErrDocNach> errDocNachList) {
        this.errDocNachList = errDocNachList;
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
        if (!(object instanceof DocNach)) {
            return false;
        }
        DocNach other = (DocNach) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocNach[ code=" + code + " ]";
    }
    
}
