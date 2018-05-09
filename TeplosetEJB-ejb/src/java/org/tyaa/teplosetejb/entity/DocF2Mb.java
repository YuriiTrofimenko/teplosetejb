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
@Table(name = "DOC_F2_MB")
@NamedQueries({
    @NamedQuery(name = "DocF2Mb.findAll", query = "SELECT d FROM DocF2Mb d")})
public class DocF2Mb implements Serializable {

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
    @Column(name = "SERVICE_CODE")
    private Integer serviceCode;
    @Column(name = "IS_NOT_ACCEPT")
    private Integer isNotAccept;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocF2Mb> errDocF2MbList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocF2Mb() {
    }

    public DocF2Mb(Integer code) {
        this.code = code;
    }

    public DocF2Mb(Integer code, int state) {
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

    public Integer getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Integer getIsNotAccept() {
        return isNotAccept;
    }

    public void setIsNotAccept(Integer isNotAccept) {
        this.isNotAccept = isNotAccept;
    }

    public List<ErrDocF2Mb> getErrDocF2MbList() {
        return errDocF2MbList;
    }

    public void setErrDocF2MbList(List<ErrDocF2Mb> errDocF2MbList) {
        this.errDocF2MbList = errDocF2MbList;
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
        if (!(object instanceof DocF2Mb)) {
            return false;
        }
        DocF2Mb other = (DocF2Mb) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocF2Mb[ code=" + code + " ]";
    }
    
}
