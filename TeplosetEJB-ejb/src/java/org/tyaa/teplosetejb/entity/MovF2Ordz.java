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
@Table(name = "MOV_F2_ORDZ")
@NamedQueries({
    @NamedQuery(name = "MovF2Ordz.findAll", query = "SELECT m FROM MovF2Ordz m")})
public class MovF2Ordz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID$")
    private Integer id;
    private Long cdpr;
    @Size(max = 10)
    private String idcode;
    @Size(max = 50)
    private String fio;
    @Size(max = 15)
    private String ppos;
    @Size(max = 25)
    private String rs;
    private Integer yearin;
    private Integer monthin;
    private Integer lgcode;
    @Temporal(TemporalType.DATE)
    private Date data1;
    @Temporal(TemporalType.DATE)
    private Date data2;
    private Integer lgkol;
    private Integer lgkat;
    private Integer lgprc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal summ;
    private BigDecimal fact;
    private BigDecimal tarif;
    private Integer flag;
    @Column(name = "CR_PROCDATE")
    private Integer crProcdate;
    @Column(name = "CR_LGOTERNUMBER")
    private Integer crLgoternumber;
    @Column(name = "CR_SERVICE")
    private Integer crService;
    @Column(name = "CR_LGOTERNUMBER_ALGORITM")
    private Short crLgoternumberAlgoritm;

    public MovF2Ordz() {
    }

    public MovF2Ordz(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCdpr() {
        return cdpr;
    }

    public void setCdpr(Long cdpr) {
        this.cdpr = cdpr;
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPpos() {
        return ppos;
    }

    public void setPpos(String ppos) {
        this.ppos = ppos;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
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

    public Integer getLgcode() {
        return lgcode;
    }

    public void setLgcode(Integer lgcode) {
        this.lgcode = lgcode;
    }

    public Date getData1() {
        return data1;
    }

    public void setData1(Date data1) {
        this.data1 = data1;
    }

    public Date getData2() {
        return data2;
    }

    public void setData2(Date data2) {
        this.data2 = data2;
    }

    public Integer getLgkol() {
        return lgkol;
    }

    public void setLgkol(Integer lgkol) {
        this.lgkol = lgkol;
    }

    public Integer getLgkat() {
        return lgkat;
    }

    public void setLgkat(Integer lgkat) {
        this.lgkat = lgkat;
    }

    public Integer getLgprc() {
        return lgprc;
    }

    public void setLgprc(Integer lgprc) {
        this.lgprc = lgprc;
    }

    public BigDecimal getSumm() {
        return summ;
    }

    public void setSumm(BigDecimal summ) {
        this.summ = summ;
    }

    public BigDecimal getFact() {
        return fact;
    }

    public void setFact(BigDecimal fact) {
        this.fact = fact;
    }

    public BigDecimal getTarif() {
        return tarif;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getCrProcdate() {
        return crProcdate;
    }

    public void setCrProcdate(Integer crProcdate) {
        this.crProcdate = crProcdate;
    }

    public Integer getCrLgoternumber() {
        return crLgoternumber;
    }

    public void setCrLgoternumber(Integer crLgoternumber) {
        this.crLgoternumber = crLgoternumber;
    }

    public Integer getCrService() {
        return crService;
    }

    public void setCrService(Integer crService) {
        this.crService = crService;
    }

    public Short getCrLgoternumberAlgoritm() {
        return crLgoternumberAlgoritm;
    }

    public void setCrLgoternumberAlgoritm(Short crLgoternumberAlgoritm) {
        this.crLgoternumberAlgoritm = crLgoternumberAlgoritm;
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
        if (!(object instanceof MovF2Ordz)) {
            return false;
        }
        MovF2Ordz other = (MovF2Ordz) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.MovF2Ordz[ id=" + id + " ]";
    }
    
}
