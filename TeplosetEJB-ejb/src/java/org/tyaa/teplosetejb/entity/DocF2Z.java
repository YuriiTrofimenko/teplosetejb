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
@Table(name = "DOC_F2_Z")
@NamedQueries({
    @NamedQuery(name = "DocF2Z.findAll", query = "SELECT d FROM DocF2Z d")})
public class DocF2Z implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer firmcode;
    @Size(max = 16)
    private String cdpr;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal lgprc;
    private BigDecimal summ;
    private BigDecimal fact;
    private BigDecimal tarif;
    private Integer flag;
    private BigDecimal summrzrh;
    private BigInteger accountcode;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocF2Z() {
    }

    public DocF2Z(Integer code) {
        this.code = code;
    }

    public DocF2Z(Integer code, int state) {
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

    public String getCdpr() {
        return cdpr;
    }

    public void setCdpr(String cdpr) {
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

    public BigDecimal getLgprc() {
        return lgprc;
    }

    public void setLgprc(BigDecimal lgprc) {
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

    public BigDecimal getSummrzrh() {
        return summrzrh;
    }

    public void setSummrzrh(BigDecimal summrzrh) {
        this.summrzrh = summrzrh;
    }

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
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
        if (!(object instanceof DocF2Z)) {
            return false;
        }
        DocF2Z other = (DocF2Z) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocF2Z[ code=" + code + " ]";
    }
    
}
