/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
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
@Table(name = "DOC_USZN")
@NamedQueries({
    @NamedQuery(name = "DocUszn.findAll", query = "SELECT d FROM DocUszn d")})
public class DocUszn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    private Integer cod;
    @Size(max = 16)
    private String cdpr;
    private Integer ncard;
    @Size(max = 16)
    private String idcode;
    @Size(max = 16)
    private String pasp;
    @Size(max = 64)
    private String fio;
    @Size(max = 16)
    private String idpil;
    @Size(max = 16)
    private String pasppil;
    @Size(max = 64)
    private String fiopil;
    private Integer postindex;
    private Integer cdul;
    @Size(max = 16)
    private String housenumber;
    @Size(max = 16)
    private String build;
    @Size(max = 16)
    private String apt;
    private Integer lgcode;
    private Integer kat;
    private Integer yearin;
    private Integer monthin;
    private Integer yearout;
    private Integer monthout;
    @Size(max = 16)
    private String rah;
    private Integer rizn;
    private Integer tarif;
    @Temporal(TemporalType.DATE)
    private Date datein;
    @Temporal(TemporalType.DATE)
    private Date dateout;
    @Column(name = "LGOTA_CODE")
    private Integer lgotaCode;
    @Column(name = "LGOTA_CODE_USER")
    private Integer lgotaCodeUser;
    @Column(name = "LG_NUMBER")
    private Integer lgNumber;
    @Column(name = "LG_COUNT")
    private Integer lgCount;
    @Column(name = "LG_COUNT_USER")
    private Integer lgCountUser;
    @Column(name = "IS_CHECK")
    private Integer isCheck;
    @Column(name = "IS_DUBL")
    private Integer isDubl;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocUszn> errDocUsznList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocUszn() {
    }

    public DocUszn(Integer code) {
        this.code = code;
    }

    public DocUszn(Integer code, int state) {
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

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getCdpr() {
        return cdpr;
    }

    public void setCdpr(String cdpr) {
        this.cdpr = cdpr;
    }

    public Integer getNcard() {
        return ncard;
    }

    public void setNcard(Integer ncard) {
        this.ncard = ncard;
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }

    public String getPasp() {
        return pasp;
    }

    public void setPasp(String pasp) {
        this.pasp = pasp;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getIdpil() {
        return idpil;
    }

    public void setIdpil(String idpil) {
        this.idpil = idpil;
    }

    public String getPasppil() {
        return pasppil;
    }

    public void setPasppil(String pasppil) {
        this.pasppil = pasppil;
    }

    public String getFiopil() {
        return fiopil;
    }

    public void setFiopil(String fiopil) {
        this.fiopil = fiopil;
    }

    public Integer getPostindex() {
        return postindex;
    }

    public void setPostindex(Integer postindex) {
        this.postindex = postindex;
    }

    public Integer getCdul() {
        return cdul;
    }

    public void setCdul(Integer cdul) {
        this.cdul = cdul;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public Integer getLgcode() {
        return lgcode;
    }

    public void setLgcode(Integer lgcode) {
        this.lgcode = lgcode;
    }

    public Integer getKat() {
        return kat;
    }

    public void setKat(Integer kat) {
        this.kat = kat;
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

    public Integer getYearout() {
        return yearout;
    }

    public void setYearout(Integer yearout) {
        this.yearout = yearout;
    }

    public Integer getMonthout() {
        return monthout;
    }

    public void setMonthout(Integer monthout) {
        this.monthout = monthout;
    }

    public String getRah() {
        return rah;
    }

    public void setRah(String rah) {
        this.rah = rah;
    }

    public Integer getRizn() {
        return rizn;
    }

    public void setRizn(Integer rizn) {
        this.rizn = rizn;
    }

    public Integer getTarif() {
        return tarif;
    }

    public void setTarif(Integer tarif) {
        this.tarif = tarif;
    }

    public Date getDatein() {
        return datein;
    }

    public void setDatein(Date datein) {
        this.datein = datein;
    }

    public Date getDateout() {
        return dateout;
    }

    public void setDateout(Date dateout) {
        this.dateout = dateout;
    }

    public Integer getLgotaCode() {
        return lgotaCode;
    }

    public void setLgotaCode(Integer lgotaCode) {
        this.lgotaCode = lgotaCode;
    }

    public Integer getLgotaCodeUser() {
        return lgotaCodeUser;
    }

    public void setLgotaCodeUser(Integer lgotaCodeUser) {
        this.lgotaCodeUser = lgotaCodeUser;
    }

    public Integer getLgNumber() {
        return lgNumber;
    }

    public void setLgNumber(Integer lgNumber) {
        this.lgNumber = lgNumber;
    }

    public Integer getLgCount() {
        return lgCount;
    }

    public void setLgCount(Integer lgCount) {
        this.lgCount = lgCount;
    }

    public Integer getLgCountUser() {
        return lgCountUser;
    }

    public void setLgCountUser(Integer lgCountUser) {
        this.lgCountUser = lgCountUser;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getIsDubl() {
        return isDubl;
    }

    public void setIsDubl(Integer isDubl) {
        this.isDubl = isDubl;
    }

    public List<ErrDocUszn> getErrDocUsznList() {
        return errDocUsznList;
    }

    public void setErrDocUsznList(List<ErrDocUszn> errDocUsznList) {
        this.errDocUsznList = errDocUsznList;
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
        if (!(object instanceof DocUszn)) {
            return false;
        }
        DocUszn other = (DocUszn) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocUszn[ code=" + code + " ]";
    }
    
}
