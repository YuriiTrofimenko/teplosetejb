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
@Table(name = "DOC_SUBSQUERY")
@NamedQueries({
    @NamedQuery(name = "DocSubsquery.findAll", query = "SELECT d FROM DocSubsquery d")})
public class DocSubsquery implements Serializable {

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
    private String opp;
    private Integer mark;
    private Integer scode;
    @Column(name = "ENT_COD")
    private Integer entCod;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal frog;
    @Column(name = "FL_PAY")
    private BigDecimal flPay;
    @Column(name = "NM_PAY")
    private BigDecimal nmPay;
    private BigDecimal debt;
    @Column(name = "CODE2_1")
    private Integer code21;
    @Column(name = "CODE2_2")
    private Integer code22;
    @Column(name = "CODE2_3")
    private Integer code23;
    @Column(name = "CODE2_4")
    private Integer code24;
    @Column(name = "CODE2_5")
    private Integer code25;
    @Column(name = "CODE2_6")
    private Integer code26;
    @Column(name = "CODE2_7")
    private Integer code27;
    @Column(name = "CODE2_8")
    private Integer code28;
    @Column(name = "NORM_F_1")
    private BigDecimal normF1;
    @Column(name = "NORM_F_2")
    private BigDecimal normF2;
    @Column(name = "NORM_F_3")
    private BigDecimal normF3;
    @Column(name = "NORM_F_4")
    private BigDecimal normF4;
    @Column(name = "NORM_F_5")
    private BigDecimal normF5;
    @Column(name = "NORM_F_6")
    private BigDecimal normF6;
    @Column(name = "NORM_F_7")
    private BigDecimal normF7;
    @Column(name = "NORM_F_8")
    private BigDecimal normF8;
    @Size(max = 16)
    @Column(name = "OWN_NUM_SR")
    private String ownNumSr;
    @Temporal(TemporalType.DATE)
    private Date dat1;
    @Temporal(TemporalType.DATE)
    private Date dat2;
    @Size(max = 16)
    @Column(name = "ID_RAJ")
    private String idRaj;
    @Column(name = "CODE3_1")
    private Integer code31;
    @Column(name = "CODE3_2")
    private Integer code32;
    @Column(name = "CODE3_3")
    private Integer code33;
    @Column(name = "CODE3_4")
    private Integer code34;
    @Column(name = "CODE3_5")
    private Integer code35;
    @Column(name = "CODE3_6")
    private Integer code36;
    @Column(name = "CODE3_7")
    private Integer code37;
    @Column(name = "CODE3_8")
    private Integer code38;
    private Integer numb;
    @Size(max = 16)
    @Column(name = "IND_COD")
    private String indCod;
    @Column(name = "DAT_F_1")
    @Temporal(TemporalType.DATE)
    private Date datF1;
    @Column(name = "DAT_F_2")
    @Temporal(TemporalType.DATE)
    private Date datF2;
    @Column(name = "DAT_FOP_1")
    @Temporal(TemporalType.DATE)
    private Date datFop1;
    @Column(name = "DAT_FOP_2")
    @Temporal(TemporalType.DATE)
    private Date datFop2;
    @Column(name = "OSN_PRZ")
    private Integer osnPrz;
    @Size(max = 16)
    @Column(name = "OPP_SERV")
    private String oppServ;
    @Column(name = "REE_NUM")
    private Integer reeNum;
    @Size(max = 16)
    private String indx;
    @Size(max = 48)
    @Column(name = "N_NAME")
    private String nName;
    @Size(max = 48)
    @Column(name = "VUL_NAME")
    private String vulName;
    @Size(max = 16)
    @Column(name = "BLD_NUM")
    private String bldNum;
    @Size(max = 16)
    @Column(name = "CORP_NUM")
    private String corpNum;
    @Size(max = 16)
    private String flat;
    @Column(name = "CM_AREA")
    private BigDecimal cmArea;
    @Column(name = "NM_AREA")
    private BigDecimal nmArea;
    @Column(name = "BLC_AREA")
    private BigDecimal blcArea;
    private Integer reserv1;
    @Size(max = 16)
    private String reserv2;
    @Column(name = "CALC_TARIFF")
    private BigDecimal calcTariff;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocSubsquery() {
    }

    public DocSubsquery(Integer code) {
        this.code = code;
    }

    public DocSubsquery(Integer code, int state) {
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

    public String getOpp() {
        return opp;
    }

    public void setOpp(String opp) {
        this.opp = opp;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getScode() {
        return scode;
    }

    public void setScode(Integer scode) {
        this.scode = scode;
    }

    public Integer getEntCod() {
        return entCod;
    }

    public void setEntCod(Integer entCod) {
        this.entCod = entCod;
    }

    public BigDecimal getFrog() {
        return frog;
    }

    public void setFrog(BigDecimal frog) {
        this.frog = frog;
    }

    public BigDecimal getFlPay() {
        return flPay;
    }

    public void setFlPay(BigDecimal flPay) {
        this.flPay = flPay;
    }

    public BigDecimal getNmPay() {
        return nmPay;
    }

    public void setNmPay(BigDecimal nmPay) {
        this.nmPay = nmPay;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    public Integer getCode21() {
        return code21;
    }

    public void setCode21(Integer code21) {
        this.code21 = code21;
    }

    public Integer getCode22() {
        return code22;
    }

    public void setCode22(Integer code22) {
        this.code22 = code22;
    }

    public Integer getCode23() {
        return code23;
    }

    public void setCode23(Integer code23) {
        this.code23 = code23;
    }

    public Integer getCode24() {
        return code24;
    }

    public void setCode24(Integer code24) {
        this.code24 = code24;
    }

    public Integer getCode25() {
        return code25;
    }

    public void setCode25(Integer code25) {
        this.code25 = code25;
    }

    public Integer getCode26() {
        return code26;
    }

    public void setCode26(Integer code26) {
        this.code26 = code26;
    }

    public Integer getCode27() {
        return code27;
    }

    public void setCode27(Integer code27) {
        this.code27 = code27;
    }

    public Integer getCode28() {
        return code28;
    }

    public void setCode28(Integer code28) {
        this.code28 = code28;
    }

    public BigDecimal getNormF1() {
        return normF1;
    }

    public void setNormF1(BigDecimal normF1) {
        this.normF1 = normF1;
    }

    public BigDecimal getNormF2() {
        return normF2;
    }

    public void setNormF2(BigDecimal normF2) {
        this.normF2 = normF2;
    }

    public BigDecimal getNormF3() {
        return normF3;
    }

    public void setNormF3(BigDecimal normF3) {
        this.normF3 = normF3;
    }

    public BigDecimal getNormF4() {
        return normF4;
    }

    public void setNormF4(BigDecimal normF4) {
        this.normF4 = normF4;
    }

    public BigDecimal getNormF5() {
        return normF5;
    }

    public void setNormF5(BigDecimal normF5) {
        this.normF5 = normF5;
    }

    public BigDecimal getNormF6() {
        return normF6;
    }

    public void setNormF6(BigDecimal normF6) {
        this.normF6 = normF6;
    }

    public BigDecimal getNormF7() {
        return normF7;
    }

    public void setNormF7(BigDecimal normF7) {
        this.normF7 = normF7;
    }

    public BigDecimal getNormF8() {
        return normF8;
    }

    public void setNormF8(BigDecimal normF8) {
        this.normF8 = normF8;
    }

    public String getOwnNumSr() {
        return ownNumSr;
    }

    public void setOwnNumSr(String ownNumSr) {
        this.ownNumSr = ownNumSr;
    }

    public Date getDat1() {
        return dat1;
    }

    public void setDat1(Date dat1) {
        this.dat1 = dat1;
    }

    public Date getDat2() {
        return dat2;
    }

    public void setDat2(Date dat2) {
        this.dat2 = dat2;
    }

    public String getIdRaj() {
        return idRaj;
    }

    public void setIdRaj(String idRaj) {
        this.idRaj = idRaj;
    }

    public Integer getCode31() {
        return code31;
    }

    public void setCode31(Integer code31) {
        this.code31 = code31;
    }

    public Integer getCode32() {
        return code32;
    }

    public void setCode32(Integer code32) {
        this.code32 = code32;
    }

    public Integer getCode33() {
        return code33;
    }

    public void setCode33(Integer code33) {
        this.code33 = code33;
    }

    public Integer getCode34() {
        return code34;
    }

    public void setCode34(Integer code34) {
        this.code34 = code34;
    }

    public Integer getCode35() {
        return code35;
    }

    public void setCode35(Integer code35) {
        this.code35 = code35;
    }

    public Integer getCode36() {
        return code36;
    }

    public void setCode36(Integer code36) {
        this.code36 = code36;
    }

    public Integer getCode37() {
        return code37;
    }

    public void setCode37(Integer code37) {
        this.code37 = code37;
    }

    public Integer getCode38() {
        return code38;
    }

    public void setCode38(Integer code38) {
        this.code38 = code38;
    }

    public Integer getNumb() {
        return numb;
    }

    public void setNumb(Integer numb) {
        this.numb = numb;
    }

    public String getIndCod() {
        return indCod;
    }

    public void setIndCod(String indCod) {
        this.indCod = indCod;
    }

    public Date getDatF1() {
        return datF1;
    }

    public void setDatF1(Date datF1) {
        this.datF1 = datF1;
    }

    public Date getDatF2() {
        return datF2;
    }

    public void setDatF2(Date datF2) {
        this.datF2 = datF2;
    }

    public Date getDatFop1() {
        return datFop1;
    }

    public void setDatFop1(Date datFop1) {
        this.datFop1 = datFop1;
    }

    public Date getDatFop2() {
        return datFop2;
    }

    public void setDatFop2(Date datFop2) {
        this.datFop2 = datFop2;
    }

    public Integer getOsnPrz() {
        return osnPrz;
    }

    public void setOsnPrz(Integer osnPrz) {
        this.osnPrz = osnPrz;
    }

    public String getOppServ() {
        return oppServ;
    }

    public void setOppServ(String oppServ) {
        this.oppServ = oppServ;
    }

    public Integer getReeNum() {
        return reeNum;
    }

    public void setReeNum(Integer reeNum) {
        this.reeNum = reeNum;
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

    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
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

    public Integer getReserv1() {
        return reserv1;
    }

    public void setReserv1(Integer reserv1) {
        this.reserv1 = reserv1;
    }

    public String getReserv2() {
        return reserv2;
    }

    public void setReserv2(String reserv2) {
        this.reserv2 = reserv2;
    }

    public BigDecimal getCalcTariff() {
        return calcTariff;
    }

    public void setCalcTariff(BigDecimal calcTariff) {
        this.calcTariff = calcTariff;
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
        if (!(object instanceof DocSubsquery)) {
            return false;
        }
        DocSubsquery other = (DocSubsquery) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocSubsquery[ code=" + code + " ]";
    }
    
}
