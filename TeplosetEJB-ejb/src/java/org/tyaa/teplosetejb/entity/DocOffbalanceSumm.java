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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_OFFBALANCE_SUMM")
@NamedQueries({
    @NamedQuery(name = "DocOffbalanceSumm.findAll", query = "SELECT d FROM DocOffbalanceSumm d")})
public class DocOffbalanceSumm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int doc;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer firmcode;
    private Integer saldokind;
    private Integer procdate;
    private Integer todate;
    private BigInteger accountcode;
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
    @Temporal(TemporalType.DATE)
    private Date dateaction;
    private Integer tt;
    private Integer gt;
    private Integer tariffcode;
    private BigDecimal tariff;
    private Integer lgota;
    private BigDecimal lgotapercent;
    private Integer lgoternumber;
    private Integer formnach;
    private Integer normcode;
    private Integer lodgers;
    private Integer code1;
    private Integer code2;
    private Integer code3;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocOffbalanceSumm> errDocOffbalanceSummList;

    public DocOffbalanceSumm() {
    }

    public DocOffbalanceSumm(Integer code) {
        this.code = code;
    }

    public DocOffbalanceSumm(Integer code, int doc, int state) {
        this.code = code;
        this.doc = doc;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
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

    public Integer getProcdate() {
        return procdate;
    }

    public void setProcdate(Integer procdate) {
        this.procdate = procdate;
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
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

    public Date getDateaction() {
        return dateaction;
    }

    public void setDateaction(Date dateaction) {
        this.dateaction = dateaction;
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

    public Integer getLodgers() {
        return lodgers;
    }

    public void setLodgers(Integer lodgers) {
        this.lodgers = lodgers;
    }

    public Integer getCode1() {
        return code1;
    }

    public void setCode1(Integer code1) {
        this.code1 = code1;
    }

    public Integer getCode2() {
        return code2;
    }

    public void setCode2(Integer code2) {
        this.code2 = code2;
    }

    public Integer getCode3() {
        return code3;
    }

    public void setCode3(Integer code3) {
        this.code3 = code3;
    }

    public List<ErrDocOffbalanceSumm> getErrDocOffbalanceSummList() {
        return errDocOffbalanceSummList;
    }

    public void setErrDocOffbalanceSummList(List<ErrDocOffbalanceSumm> errDocOffbalanceSummList) {
        this.errDocOffbalanceSummList = errDocOffbalanceSummList;
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
        if (!(object instanceof DocOffbalanceSumm)) {
            return false;
        }
        DocOffbalanceSumm other = (DocOffbalanceSumm) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocOffbalanceSumm[ code=" + code + " ]";
    }
    
}
