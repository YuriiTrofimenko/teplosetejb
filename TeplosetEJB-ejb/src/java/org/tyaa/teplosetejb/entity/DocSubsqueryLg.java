/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_SUBSQUERY_LG")
@NamedQueries({
    @NamedQuery(name = "DocSubsqueryLg.findAll", query = "SELECT d FROM DocSubsqueryLg d")})
public class DocSubsqueryLg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    @Size(max = 16)
    @Column(name = "OWN_NUM")
    private String ownNum;
    @Column(name = "REE_NUM")
    private Integer reeNum;
    @Size(max = 16)
    @Column(name = "OWN_NUM_SR")
    private String ownNumSr;
    @Column(name = "FAM_NUM")
    private Integer famNum;
    @Size(max = 48)
    @Column(name = "SUR_NAM")
    private String surNam;
    @Size(max = 48)
    @Column(name = "F_NAM")
    private String fNam;
    @Size(max = 48)
    @Column(name = "M_NAM")
    private String mNam;
    @Size(max = 16)
    @Column(name = "IND_COD")
    private String indCod;
    @Size(max = 16)
    @Column(name = "PSP_SER")
    private String pspSer;
    @Size(max = 16)
    @Column(name = "PSP_NUM")
    private String pspNum;
    private Integer ozn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CM_AREA")
    private BigDecimal cmArea;
    @Column(name = "HEAT_AREA")
    private BigDecimal heatArea;
    @Column(name = "OWN_FRM")
    private Integer ownFrm;
    private Integer hostel;
    @Column(name = "PRIV_CAT")
    private Integer privCat;
    @Column(name = "ORD_FAM")
    private Integer ordFam;
    @Column(name = "OZN_SQ_ADD")
    private Integer oznSqAdd;
    @Column(name = "OZN_ABS")
    private Integer oznAbs;
    private BigDecimal reserv1;
    @Size(max = 16)
    private String reserv2;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocSubsqueryLg() {
    }

    public DocSubsqueryLg(Integer code) {
        this.code = code;
    }

    public DocSubsqueryLg(Integer code, int state) {
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

    public String getOwnNum() {
        return ownNum;
    }

    public void setOwnNum(String ownNum) {
        this.ownNum = ownNum;
    }

    public Integer getReeNum() {
        return reeNum;
    }

    public void setReeNum(Integer reeNum) {
        this.reeNum = reeNum;
    }

    public String getOwnNumSr() {
        return ownNumSr;
    }

    public void setOwnNumSr(String ownNumSr) {
        this.ownNumSr = ownNumSr;
    }

    public Integer getFamNum() {
        return famNum;
    }

    public void setFamNum(Integer famNum) {
        this.famNum = famNum;
    }

    public String getSurNam() {
        return surNam;
    }

    public void setSurNam(String surNam) {
        this.surNam = surNam;
    }

    public String getFNam() {
        return fNam;
    }

    public void setFNam(String fNam) {
        this.fNam = fNam;
    }

    public String getMNam() {
        return mNam;
    }

    public void setMNam(String mNam) {
        this.mNam = mNam;
    }

    public String getIndCod() {
        return indCod;
    }

    public void setIndCod(String indCod) {
        this.indCod = indCod;
    }

    public String getPspSer() {
        return pspSer;
    }

    public void setPspSer(String pspSer) {
        this.pspSer = pspSer;
    }

    public String getPspNum() {
        return pspNum;
    }

    public void setPspNum(String pspNum) {
        this.pspNum = pspNum;
    }

    public Integer getOzn() {
        return ozn;
    }

    public void setOzn(Integer ozn) {
        this.ozn = ozn;
    }

    public BigDecimal getCmArea() {
        return cmArea;
    }

    public void setCmArea(BigDecimal cmArea) {
        this.cmArea = cmArea;
    }

    public BigDecimal getHeatArea() {
        return heatArea;
    }

    public void setHeatArea(BigDecimal heatArea) {
        this.heatArea = heatArea;
    }

    public Integer getOwnFrm() {
        return ownFrm;
    }

    public void setOwnFrm(Integer ownFrm) {
        this.ownFrm = ownFrm;
    }

    public Integer getHostel() {
        return hostel;
    }

    public void setHostel(Integer hostel) {
        this.hostel = hostel;
    }

    public Integer getPrivCat() {
        return privCat;
    }

    public void setPrivCat(Integer privCat) {
        this.privCat = privCat;
    }

    public Integer getOrdFam() {
        return ordFam;
    }

    public void setOrdFam(Integer ordFam) {
        this.ordFam = ordFam;
    }

    public Integer getOznSqAdd() {
        return oznSqAdd;
    }

    public void setOznSqAdd(Integer oznSqAdd) {
        this.oznSqAdd = oznSqAdd;
    }

    public Integer getOznAbs() {
        return oznAbs;
    }

    public void setOznAbs(Integer oznAbs) {
        this.oznAbs = oznAbs;
    }

    public BigDecimal getReserv1() {
        return reserv1;
    }

    public void setReserv1(BigDecimal reserv1) {
        this.reserv1 = reserv1;
    }

    public String getReserv2() {
        return reserv2;
    }

    public void setReserv2(String reserv2) {
        this.reserv2 = reserv2;
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
        if (!(object instanceof DocSubsqueryLg)) {
            return false;
        }
        DocSubsqueryLg other = (DocSubsqueryLg) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocSubsqueryLg[ code=" + code + " ]";
    }
    
}
