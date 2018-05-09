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
@Table(name = "DOC_F2")
@NamedQueries({
    @NamedQuery(name = "DocF2.findAll", query = "SELECT d FROM DocF2 d")})
public class DocF2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer firmcode;
    private Integer lgcode;
    private Integer finsource;
    private BigInteger accountcode;
    private Integer lgoternumber;
    @Size(max = 16)
    private String inn;
    @Size(max = 128)
    @Column(name = "LGOTER_FIO")
    private String lgoterFio;
    @Size(max = 48)
    private String doclgnumber;
    private Integer lgota;
    private Integer usznlgota;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal lgotapercent;
    @Column(name = "LGOTER_COUNT")
    private Integer lgoterCount;
    private Integer formnach;
    private Integer todate;
    private BigDecimal summ;
    private BigDecimal volume;
    private BigDecimal tariff;
    private Integer days;
    @Temporal(TemporalType.DATE)
    private Date datefrom;
    @Temporal(TemporalType.DATE)
    private Date datetill;
    private Integer yearlgota;
    private Integer monthlgota;
    private Integer yearin;
    private Integer monthin;
    private Integer flag;
    private Integer utszn;
    @Column(name = "SUMM_PREV")
    private BigDecimal summPrev;
    @Column(name = "VOLUME_PREV")
    private BigDecimal volumePrev;
    @Column(name = "SUMM_DELTA")
    private BigDecimal summDelta;
    @Column(name = "VOLUME_DELTA")
    private BigDecimal volumeDelta;
    @Column(name = "TARIFF_PREV")
    private BigDecimal tariffPrev;
    @Column(name = "TARIFF_NEW")
    private BigDecimal tariffNew;
    @Column(name = "SUMM_NEW")
    private BigDecimal summNew;
    @Column(name = "VOLUME_NEW")
    private BigDecimal volumeNew;
    @Column(name = "SUMM_ALL")
    private BigDecimal summAll;
    @Column(name = "SUMM20_25_120")
    private BigDecimal summ2025120;
    private BigDecimal summ220;
    @Column(name = "VOLUME_ALL")
    private BigDecimal volumeAll;
    @Column(name = "VOLUME20_25_120")
    private BigDecimal volume2025120;
    private BigDecimal volume220;
    @Column(name = "LIST_F2_SUMM")
    private BigDecimal listF2Summ;
    @Column(name = "CODE_LIST_F2")
    private Integer codeListF2;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocF2() {
    }

    public DocF2(Integer code) {
        this.code = code;
    }

    public DocF2(Integer code, int state) {
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

    public Integer getLgcode() {
        return lgcode;
    }

    public void setLgcode(Integer lgcode) {
        this.lgcode = lgcode;
    }

    public Integer getFinsource() {
        return finsource;
    }

    public void setFinsource(Integer finsource) {
        this.finsource = finsource;
    }

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public Integer getLgoternumber() {
        return lgoternumber;
    }

    public void setLgoternumber(Integer lgoternumber) {
        this.lgoternumber = lgoternumber;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getLgoterFio() {
        return lgoterFio;
    }

    public void setLgoterFio(String lgoterFio) {
        this.lgoterFio = lgoterFio;
    }

    public String getDoclgnumber() {
        return doclgnumber;
    }

    public void setDoclgnumber(String doclgnumber) {
        this.doclgnumber = doclgnumber;
    }

    public Integer getLgota() {
        return lgota;
    }

    public void setLgota(Integer lgota) {
        this.lgota = lgota;
    }

    public Integer getUsznlgota() {
        return usznlgota;
    }

    public void setUsznlgota(Integer usznlgota) {
        this.usznlgota = usznlgota;
    }

    public BigDecimal getLgotapercent() {
        return lgotapercent;
    }

    public void setLgotapercent(BigDecimal lgotapercent) {
        this.lgotapercent = lgotapercent;
    }

    public Integer getLgoterCount() {
        return lgoterCount;
    }

    public void setLgoterCount(Integer lgoterCount) {
        this.lgoterCount = lgoterCount;
    }

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public BigDecimal getSumm() {
        return summ;
    }

    public void setSumm(BigDecimal summ) {
        this.summ = summ;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
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

    public Integer getYearlgota() {
        return yearlgota;
    }

    public void setYearlgota(Integer yearlgota) {
        this.yearlgota = yearlgota;
    }

    public Integer getMonthlgota() {
        return monthlgota;
    }

    public void setMonthlgota(Integer monthlgota) {
        this.monthlgota = monthlgota;
    }

    public Integer getYearin() {
        return yearin;
    }

    public void setYearin(Integer yearin) {
        this.yearin = yearin;
    }

    public Integer getMonthin() {
        return monthin;
    }

    public void setMonthin(Integer monthin) {
        this.monthin = monthin;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getUtszn() {
        return utszn;
    }

    public void setUtszn(Integer utszn) {
        this.utszn = utszn;
    }

    public BigDecimal getSummPrev() {
        return summPrev;
    }

    public void setSummPrev(BigDecimal summPrev) {
        this.summPrev = summPrev;
    }

    public BigDecimal getVolumePrev() {
        return volumePrev;
    }

    public void setVolumePrev(BigDecimal volumePrev) {
        this.volumePrev = volumePrev;
    }

    public BigDecimal getSummDelta() {
        return summDelta;
    }

    public void setSummDelta(BigDecimal summDelta) {
        this.summDelta = summDelta;
    }

    public BigDecimal getVolumeDelta() {
        return volumeDelta;
    }

    public void setVolumeDelta(BigDecimal volumeDelta) {
        this.volumeDelta = volumeDelta;
    }

    public BigDecimal getTariffPrev() {
        return tariffPrev;
    }

    public void setTariffPrev(BigDecimal tariffPrev) {
        this.tariffPrev = tariffPrev;
    }

    public BigDecimal getTariffNew() {
        return tariffNew;
    }

    public void setTariffNew(BigDecimal tariffNew) {
        this.tariffNew = tariffNew;
    }

    public BigDecimal getSummNew() {
        return summNew;
    }

    public void setSummNew(BigDecimal summNew) {
        this.summNew = summNew;
    }

    public BigDecimal getVolumeNew() {
        return volumeNew;
    }

    public void setVolumeNew(BigDecimal volumeNew) {
        this.volumeNew = volumeNew;
    }

    public BigDecimal getSummAll() {
        return summAll;
    }

    public void setSummAll(BigDecimal summAll) {
        this.summAll = summAll;
    }

    public BigDecimal getSumm2025120() {
        return summ2025120;
    }

    public void setSumm2025120(BigDecimal summ2025120) {
        this.summ2025120 = summ2025120;
    }

    public BigDecimal getSumm220() {
        return summ220;
    }

    public void setSumm220(BigDecimal summ220) {
        this.summ220 = summ220;
    }

    public BigDecimal getVolumeAll() {
        return volumeAll;
    }

    public void setVolumeAll(BigDecimal volumeAll) {
        this.volumeAll = volumeAll;
    }

    public BigDecimal getVolume2025120() {
        return volume2025120;
    }

    public void setVolume2025120(BigDecimal volume2025120) {
        this.volume2025120 = volume2025120;
    }

    public BigDecimal getVolume220() {
        return volume220;
    }

    public void setVolume220(BigDecimal volume220) {
        this.volume220 = volume220;
    }

    public BigDecimal getListF2Summ() {
        return listF2Summ;
    }

    public void setListF2Summ(BigDecimal listF2Summ) {
        this.listF2Summ = listF2Summ;
    }

    public Integer getCodeListF2() {
        return codeListF2;
    }

    public void setCodeListF2(Integer codeListF2) {
        this.codeListF2 = codeListF2;
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
        if (!(object instanceof DocF2)) {
            return false;
        }
        DocF2 other = (DocF2) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocF2[ code=" + code + " ]";
    }
    
}
