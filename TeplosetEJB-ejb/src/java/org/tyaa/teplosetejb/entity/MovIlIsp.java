/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "MOV_IL_ISP")
@NamedQueries({
    @NamedQuery(name = "MovIlIsp.findAll", query = "SELECT m FROM MovIlIsp m")})
public class MovIlIsp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID$")
    private Integer id;
    @Size(max = 3)
    private String npp;
    @Size(max = 1)
    private String distr;
    @Size(max = 2)
    private String isp;
    @Size(max = 6)
    private String account;
    @Size(max = 40)
    private String addr;
    @Size(max = 24)
    private String fio;
    @Size(max = 12)
    private String pr;
    @Size(max = 12)
    @Column(name = "DATA_PR")
    private String dataPr;
    @Size(max = 11)
    @Column(name = "DATA_POD")
    private String dataPod;
    @Size(max = 8)
    private String summa;
    @Size(max = 7)
    private String shtraf;
    @Size(max = 6)
    private String ito;
    @Size(max = 16)
    private String tsumma;
    @Size(max = 128)
    private String remark;
    @Size(max = 130)
    private String reestr;
    @Size(max = 32)
    @Column(name = "DATA_POV")
    private String dataPov;
    @Size(max = 64)
    @Column(name = "DATA_PRIH")
    private String dataPrih;
    @Size(max = 128)
    private String add0;
    @Size(max = 208)
    private String contact;
    @Column(name = "DATE_PR")
    @Temporal(TemporalType.DATE)
    private Date datePr;
    @Column(name = "DATE_POD")
    @Temporal(TemporalType.DATE)
    private Date datePod;
    @Column(name = "DATE_POV")
    @Temporal(TemporalType.DATE)
    private Date datePov;
    @Column(name = "DATE_PRIH")
    @Temporal(TemporalType.DATE)
    private Date datePrih;

    public MovIlIsp() {
    }

    public MovIlIsp(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNpp() {
        return npp;
    }

    public void setNpp(String npp) {
        this.npp = npp;
    }

    public String getDistr() {
        return distr;
    }

    public void setDistr(String distr) {
        this.distr = distr;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPr() {
        return pr;
    }

    public void setPr(String pr) {
        this.pr = pr;
    }

    public String getDataPr() {
        return dataPr;
    }

    public void setDataPr(String dataPr) {
        this.dataPr = dataPr;
    }

    public String getDataPod() {
        return dataPod;
    }

    public void setDataPod(String dataPod) {
        this.dataPod = dataPod;
    }

    public String getSumma() {
        return summa;
    }

    public void setSumma(String summa) {
        this.summa = summa;
    }

    public String getShtraf() {
        return shtraf;
    }

    public void setShtraf(String shtraf) {
        this.shtraf = shtraf;
    }

    public String getIto() {
        return ito;
    }

    public void setIto(String ito) {
        this.ito = ito;
    }

    public String getTsumma() {
        return tsumma;
    }

    public void setTsumma(String tsumma) {
        this.tsumma = tsumma;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReestr() {
        return reestr;
    }

    public void setReestr(String reestr) {
        this.reestr = reestr;
    }

    public String getDataPov() {
        return dataPov;
    }

    public void setDataPov(String dataPov) {
        this.dataPov = dataPov;
    }

    public String getDataPrih() {
        return dataPrih;
    }

    public void setDataPrih(String dataPrih) {
        this.dataPrih = dataPrih;
    }

    public String getAdd0() {
        return add0;
    }

    public void setAdd0(String add0) {
        this.add0 = add0;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public Date getDatePod() {
        return datePod;
    }

    public void setDatePod(Date datePod) {
        this.datePod = datePod;
    }

    public Date getDatePov() {
        return datePov;
    }

    public void setDatePov(Date datePov) {
        this.datePov = datePov;
    }

    public Date getDatePrih() {
        return datePrih;
    }

    public void setDatePrih(Date datePrih) {
        this.datePrih = datePrih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovIlIsp)) {
            return false;
        }
        MovIlIsp other = (MovIlIsp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.MovIlIsp[ id=" + id + " ]";
    }
    
}
