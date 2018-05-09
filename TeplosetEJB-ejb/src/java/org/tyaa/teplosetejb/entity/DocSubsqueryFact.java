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
@Table(name = "DOC_SUBSQUERY_FACT")
@NamedQueries({
    @NamedQuery(name = "DocSubsqueryFact.findAll", query = "SELECT d FROM DocSubsqueryFact d")})
public class DocSubsqueryFact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
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
    private String indx;
    @Size(max = 48)
    @Column(name = "N_NAME")
    private String nName;
    @Size(max = 16)
    @Column(name = "N_CODE")
    private String nCode;
    @Size(max = 16)
    @Column(name = "VUL_CAT")
    private String vulCat;
    @Size(max = 48)
    @Column(name = "VUL_NAME")
    private String vulName;
    @Size(max = 16)
    @Column(name = "VUL_CODE")
    private String vulCode;
    @Size(max = 16)
    @Column(name = "BLD_NUM")
    private String bldNum;
    @Size(max = 16)
    @Column(name = "CORP_NUM")
    private String corpNum;
    @Size(max = 16)
    private String flat;
    @Size(max = 16)
    @Column(name = "OWN_NUM")
    private String ownNum;
    @Size(max = 16)
    @Column(name = "APP_NUM")
    private String appNum;
    @Column(name = "DAT_BEG")
    @Temporal(TemporalType.DATE)
    private Date datBeg;
    @Column(name = "DAT_END")
    @Temporal(TemporalType.DATE)
    private Date datEnd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CM_AREA")
    private BigDecimal cmArea;
    @Column(name = "NM_AREA")
    private BigDecimal nmArea;
    @Column(name = "BLC_AREA")
    private BigDecimal blcArea;
    private BigDecimal frog;
    private BigDecimal debt;
    private Integer numb;
    private BigDecimal p1;
    private BigDecimal n1;
    private BigDecimal p2;
    private BigDecimal n2;
    private BigDecimal p3;
    private BigDecimal n3;
    private BigDecimal p4;
    private BigDecimal n4;
    private BigDecimal p5;
    private BigDecimal n5;
    private BigDecimal p6;
    private BigDecimal n6;
    private BigDecimal p7;
    private BigDecimal n7;
    private BigDecimal p8;
    private BigDecimal n8;
    @Column(name = "DAT_BEG_OP")
    @Temporal(TemporalType.DATE)
    private Date datBegOp;
    @Column(name = "DAT_END_OP")
    @Temporal(TemporalType.DATE)
    private Date datEndOp;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocSubsqueryFact() {
    }

    public DocSubsqueryFact(Integer code) {
        this.code = code;
    }

    public DocSubsqueryFact(Integer code, int state) {
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

    public String getIndx() {
        return indx;
    }

    public void setIndx(String indx) {
        this.indx = indx;
    }

    public String getNName() {
        return nName;
    }

    public void setNName(String nName) {
        this.nName = nName;
    }

    public String getNCode() {
        return nCode;
    }

    public void setNCode(String nCode) {
        this.nCode = nCode;
    }

    public String getVulCat() {
        return vulCat;
    }

    public void setVulCat(String vulCat) {
        this.vulCat = vulCat;
    }

    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public String getVulCode() {
        return vulCode;
    }

    public void setVulCode(String vulCode) {
        this.vulCode = vulCode;
    }

    public String getBldNum() {
        return bldNum;
    }

    public void setBldNum(String bldNum) {
        this.bldNum = bldNum;
    }

    public String getCorpNum() {
        return corpNum;
    }

    public void setCorpNum(String corpNum) {
        this.corpNum = corpNum;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getOwnNum() {
        return ownNum;
    }

    public void setOwnNum(String ownNum) {
        this.ownNum = ownNum;
    }

    public String getAppNum() {
        return appNum;
    }

    public void setAppNum(String appNum) {
        this.appNum = appNum;
    }

    public Date getDatBeg() {
        return datBeg;
    }

    public void setDatBeg(Date datBeg) {
        this.datBeg = datBeg;
    }

    public Date getDatEnd() {
        return datEnd;
    }

    public void setDatEnd(Date datEnd) {
        this.datEnd = datEnd;
    }

    public BigDecimal getCmArea() {
        return cmArea;
    }

    public void setCmArea(BigDecimal cmArea) {
        this.cmArea = cmArea;
    }

    public BigDecimal getNmArea() {
        return nmArea;
    }

    public void setNmArea(BigDecimal nmArea) {
        this.nmArea = nmArea;
    }

    public BigDecimal getBlcArea() {
        return blcArea;
    }

    public void setBlcArea(BigDecimal blcArea) {
        this.blcArea = blcArea;
    }

    public BigDecimal getFrog() {
        return frog;
    }

    public void setFrog(BigDecimal frog) {
        this.frog = frog;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    public Integer getNumb() {
        return numb;
    }

    public void setNumb(Integer numb) {
        this.numb = numb;
    }

    public BigDecimal getP1() {
        return p1;
    }

    public void setP1(BigDecimal p1) {
        this.p1 = p1;
    }

    public BigDecimal getN1() {
        return n1;
    }

    public void setN1(BigDecimal n1) {
        this.n1 = n1;
    }

    public BigDecimal getP2() {
        return p2;
    }

    public void setP2(BigDecimal p2) {
        this.p2 = p2;
    }

    public BigDecimal getN2() {
        return n2;
    }

    public void setN2(BigDecimal n2) {
        this.n2 = n2;
    }

    public BigDecimal getP3() {
        return p3;
    }

    public void setP3(BigDecimal p3) {
        this.p3 = p3;
    }

    public BigDecimal getN3() {
        return n3;
    }

    public void setN3(BigDecimal n3) {
        this.n3 = n3;
    }

    public BigDecimal getP4() {
        return p4;
    }

    public void setP4(BigDecimal p4) {
        this.p4 = p4;
    }

    public BigDecimal getN4() {
        return n4;
    }

    public void setN4(BigDecimal n4) {
        this.n4 = n4;
    }

    public BigDecimal getP5() {
        return p5;
    }

    public void setP5(BigDecimal p5) {
        this.p5 = p5;
    }

    public BigDecimal getN5() {
        return n5;
    }

    public void setN5(BigDecimal n5) {
        this.n5 = n5;
    }

    public BigDecimal getP6() {
        return p6;
    }

    public void setP6(BigDecimal p6) {
        this.p6 = p6;
    }

    public BigDecimal getN6() {
        return n6;
    }

    public void setN6(BigDecimal n6) {
        this.n6 = n6;
    }

    public BigDecimal getP7() {
        return p7;
    }

    public void setP7(BigDecimal p7) {
        this.p7 = p7;
    }

    public BigDecimal getN7() {
        return n7;
    }

    public void setN7(BigDecimal n7) {
        this.n7 = n7;
    }

    public BigDecimal getP8() {
        return p8;
    }

    public void setP8(BigDecimal p8) {
        this.p8 = p8;
    }

    public BigDecimal getN8() {
        return n8;
    }

    public void setN8(BigDecimal n8) {
        this.n8 = n8;
    }

    public Date getDatBegOp() {
        return datBegOp;
    }

    public void setDatBegOp(Date datBegOp) {
        this.datBegOp = datBegOp;
    }

    public Date getDatEndOp() {
        return datEndOp;
    }

    public void setDatEndOp(Date datEndOp) {
        this.datEndOp = datEndOp;
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
        if (!(object instanceof DocSubsqueryFact)) {
            return false;
        }
        DocSubsqueryFact other = (DocSubsqueryFact) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocSubsqueryFact[ code=" + code + " ]";
    }
    
}
