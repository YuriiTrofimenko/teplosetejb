/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Calcresult13.findAll", query = "SELECT c FROM Calcresult13 c")})
public class Calcresult13 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int firmcode;
    @Basic(optional = false)
    @NotNull
    private int saldokind;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Basic(optional = false)
    @NotNull
    private int todate;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int housecode;
    private Integer pipecode;
    @Column(name = "OWNER_PIPECODE")
    private Integer ownerPipecode;
    @Basic(optional = false)
    @NotNull
    private int ps;
    @Basic(optional = false)
    @NotNull
    private int pskind;
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
    private BigDecimal koeff;
    private BigDecimal koeff2;
    private Integer lgota;
    private BigDecimal lgotapercent;
    private Integer lgoternumber;
    private Integer formnach;
    private Integer calctype;
    private Integer normcode;
    private Double norm;
    private Integer lodgers;
    private Integer leaveds;
    private Integer calcruncode;
    private Integer doccode;
    private Integer docpos;
    private Integer code1;
    private Integer code2;
    private Integer code3;

    public Calcresult13() {
    }

    public Calcresult13(Integer code) {
        this.code = code;
    }

    public Calcresult13(Integer code, int firmcode, int saldokind, int procdate, int todate, long accountcode, int housecode, int ps, int pskind) {
        this.code = code;
        this.firmcode = firmcode;
        this.saldokind = saldokind;
        this.procdate = procdate;
        this.todate = todate;
        this.accountcode = accountcode;
        this.housecode = housecode;
        this.ps = ps;
        this.pskind = pskind;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public int getTodate() {
        return todate;
    }

    public void setTodate(int todate) {
        this.todate = todate;
    }

    public long getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(long accountcode) {
        this.accountcode = accountcode;
    }

    public int getHousecode() {
        return housecode;
    }

    public void setHousecode(int housecode) {
        this.housecode = housecode;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public Integer getOwnerPipecode() {
        return ownerPipecode;
    }

    public void setOwnerPipecode(Integer ownerPipecode) {
        this.ownerPipecode = ownerPipecode;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getPskind() {
        return pskind;
    }

    public void setPskind(int pskind) {
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

    public BigDecimal getKoeff() {
        return koeff;
    }

    public void setKoeff(BigDecimal koeff) {
        this.koeff = koeff;
    }

    public BigDecimal getKoeff2() {
        return koeff2;
    }

    public void setKoeff2(BigDecimal koeff2) {
        this.koeff2 = koeff2;
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

    public Integer getCalctype() {
        return calctype;
    }

    public void setCalctype(Integer calctype) {
        this.calctype = calctype;
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

    public Integer getLodgers() {
        return lodgers;
    }

    public void setLodgers(Integer lodgers) {
        this.lodgers = lodgers;
    }

    public Integer getLeaveds() {
        return leaveds;
    }

    public void setLeaveds(Integer leaveds) {
        this.leaveds = leaveds;
    }

    public Integer getCalcruncode() {
        return calcruncode;
    }

    public void setCalcruncode(Integer calcruncode) {
        this.calcruncode = calcruncode;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calcresult13)) {
            return false;
        }
        Calcresult13 other = (Calcresult13) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Calcresult13[ code=" + code + " ]";
    }
    
}
