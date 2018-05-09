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
@Table(name = "DOC_TICKET")
@NamedQueries({
    @NamedQuery(name = "DocTicket.findAll", query = "SELECT d FROM DocTicket d")})
public class DocTicket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "IS_IMPORT")
    private Integer isImport;
    private Integer firmcode;
    private Integer saldokind;
    private BigInteger accountcode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUMM_ALL")
    private BigDecimal summAll;
    @Column(name = "SUMM_MAIN")
    private BigDecimal summMain;
    private BigDecimal summ;
    private Integer pskind;
    @Column(name = "TODATE_FROM")
    private Integer todateFrom;
    @Column(name = "TODATE_TILL")
    private Integer todateTill;
    @Column(name = "TYPE_VALUE")
    private Integer typeValue;
    private Integer service;
    private Integer pipecode;
    private Integer metercode;
    @Column(name = "USER_SET_VALUE")
    private Integer userSetValue;
    @Column(name = "CHECKDATE_PREV")
    @Temporal(TemporalType.DATE)
    private Date checkdatePrev;
    private BigDecimal beginwmvalue1;
    private BigDecimal endwmvalue1;
    private BigDecimal wmvolume1;
    private Integer info1;
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    private BigDecimal beginwmvalue2;
    private BigDecimal endwmvalue2;
    private BigDecimal wmvolume2;
    private Integer info2;
    private BigDecimal beginwmvalue3;
    private BigDecimal endwmvalue3;
    private BigDecimal wmvolume3;
    private Integer info3;
    private BigDecimal beginwmvalue4;
    private BigDecimal endwmvalue4;
    private BigDecimal wmvolume4;
    private Integer info4;
    @Column(name = "SB_CODE_FIRME")
    private Integer sbCodeFirme;
    @Size(max = 16)
    @Column(name = "SB_RC")
    private String sbRc;
    @Column(name = "SB_MFO")
    private Integer sbMfo;
    @Column(name = "SB_MFO_OT")
    private Integer sbMfoOt;
    @Column(name = "SB_CODE_PLAT")
    private Integer sbCodePlat;
    @Column(name = "SB_NUMBER")
    private Integer sbNumber;
    @Column(name = "SB_C_FIL")
    private Integer sbCFil;
    @Column(name = "SB_C_COM")
    private Integer sbCCom;
    @Column(name = "SB_N_SF")
    private Integer sbNSf;
    @Column(name = "SB_NOP")
    private Integer sbNop;
    @Size(max = 48)
    @Column(name = "SB_ABCOUNT")
    private String sbAbcount;
    @Column(name = "SB_PDATE")
    @Temporal(TemporalType.DATE)
    private Date sbPdate;
    @Size(max = 16)
    @Column(name = "SB_PTIME")
    private String sbPtime;
    @Column(name = "SB_DATE_OB")
    @Temporal(TemporalType.DATE)
    private Date sbDateOb;
    @Column(name = "SB_N_PLAT")
    private Integer sbNPlat;
    @Column(name = "SB_DATEB")
    @Temporal(TemporalType.DATE)
    private Date sbDateb;
    @Column(name = "SB_DATEE")
    @Temporal(TemporalType.DATE)
    private Date sbDatee;
    @Column(name = "SB_SUMM")
    private BigDecimal sbSumm;
    @Column(name = "SB_SUMM_P")
    private BigDecimal sbSummP;
    @Column(name = "SB_COUNTB")
    private BigDecimal sbCountb;
    @Column(name = "SB_COUNTE")
    private BigDecimal sbCounte;
    @Column(name = "SB_COUNTD")
    private BigDecimal sbCountd;
    @Size(max = 48)
    @Column(name = "SB_FIO")
    private String sbFio;
    @Column(name = "SB_CODE_C")
    private Integer sbCodeC;
    @Column(name = "SB_CODE_S")
    private Integer sbCodeS;
    @Size(max = 48)
    @Column(name = "SB_NAME_STRIT")
    private String sbNameStrit;
    @Column(name = "SB_N_HOUSE")
    private Integer sbNHouse;
    @Column(name = "SB_F_HOUSE")
    private Integer sbFHouse;
    @Size(max = 16)
    @Column(name = "SB_A_HOUSE")
    private String sbAHouse;
    @Column(name = "SB_D_HOUSE")
    private Integer sbDHouse;
    @Column(name = "SB_N_ROOM")
    private Integer sbNRoom;
    @Size(max = 16)
    @Column(name = "SB_A_ROOM")
    private String sbARoom;
    @Column(name = "USER_SERVICE")
    private Integer userService;
    @Column(name = "SUMM_MAIN_1")
    private BigDecimal summMain1;
    @Column(name = "SUMM_MAIN_2")
    private BigDecimal summMain2;
    @Column(name = "SUMM_PS")
    private BigDecimal summPs;
    @Column(name = "SUMM_PS_1")
    private BigDecimal summPs1;
    @Column(name = "SUMM_PS_2")
    private BigDecimal summPs2;
    @Column(name = "REAL_SERVICE_1")
    private Integer realService1;
    @Column(name = "REAL_SERVICE_2")
    private Integer realService2;
    @Size(max = 128)
    private String remark;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    @Column(name = "SUMM_MAIN_3")
    private BigDecimal summMain3;
    @Column(name = "USER_SET_SUMM")
    private Integer userSetSumm;
    @Column(name = "REAL_SERVICE_3")
    private Integer realService3;
    @Column(name = "SUMM_PS_3")
    private BigDecimal summPs3;
    private Integer claimcode;
    @Size(max = 1024)
    @Column(name = "IMP_TXT")
    private String impTxt;
    @Temporal(TemporalType.DATE)
    private Date datetariff;
    @Size(max = 150)
    @Column(name = "SB_PRIM")
    private String sbPrim;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocTicket> errDocTicketList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocTicket() {
    }

    public DocTicket(Integer code) {
        this.code = code;
    }

    public DocTicket(Integer code, int state) {
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

    public Integer getIsImport() {
        return isImport;
    }

    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public Integer getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(Integer saldokind) {
        this.saldokind = saldokind;
    }

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public BigDecimal getSummAll() {
        return summAll;
    }

    public void setSummAll(BigDecimal summAll) {
        this.summAll = summAll;
    }

    public BigDecimal getSummMain() {
        return summMain;
    }

    public void setSummMain(BigDecimal summMain) {
        this.summMain = summMain;
    }

    public BigDecimal getSumm() {
        return summ;
    }

    public void setSumm(BigDecimal summ) {
        this.summ = summ;
    }

    public Integer getPskind() {
        return pskind;
    }

    public void setPskind(Integer pskind) {
        this.pskind = pskind;
    }

    public Integer getTodateFrom() {
        return todateFrom;
    }

    public void setTodateFrom(Integer todateFrom) {
        this.todateFrom = todateFrom;
    }

    public Integer getTodateTill() {
        return todateTill;
    }

    public void setTodateTill(Integer todateTill) {
        this.todateTill = todateTill;
    }

    public Integer getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(Integer typeValue) {
        this.typeValue = typeValue;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public Integer getMetercode() {
        return metercode;
    }

    public void setMetercode(Integer metercode) {
        this.metercode = metercode;
    }

    public Integer getUserSetValue() {
        return userSetValue;
    }

    public void setUserSetValue(Integer userSetValue) {
        this.userSetValue = userSetValue;
    }

    public Date getCheckdatePrev() {
        return checkdatePrev;
    }

    public void setCheckdatePrev(Date checkdatePrev) {
        this.checkdatePrev = checkdatePrev;
    }

    public BigDecimal getBeginwmvalue1() {
        return beginwmvalue1;
    }

    public void setBeginwmvalue1(BigDecimal beginwmvalue1) {
        this.beginwmvalue1 = beginwmvalue1;
    }

    public BigDecimal getEndwmvalue1() {
        return endwmvalue1;
    }

    public void setEndwmvalue1(BigDecimal endwmvalue1) {
        this.endwmvalue1 = endwmvalue1;
    }

    public BigDecimal getWmvolume1() {
        return wmvolume1;
    }

    public void setWmvolume1(BigDecimal wmvolume1) {
        this.wmvolume1 = wmvolume1;
    }

    public Integer getInfo1() {
        return info1;
    }

    public void setInfo1(Integer info1) {
        this.info1 = info1;
    }

    public Date getCalcDatefrom() {
        return calcDatefrom;
    }

    public void setCalcDatefrom(Date calcDatefrom) {
        this.calcDatefrom = calcDatefrom;
    }

    public Date getCalcDatetill() {
        return calcDatetill;
    }

    public void setCalcDatetill(Date calcDatetill) {
        this.calcDatetill = calcDatetill;
    }

    public BigDecimal getBeginwmvalue2() {
        return beginwmvalue2;
    }

    public void setBeginwmvalue2(BigDecimal beginwmvalue2) {
        this.beginwmvalue2 = beginwmvalue2;
    }

    public BigDecimal getEndwmvalue2() {
        return endwmvalue2;
    }

    public void setEndwmvalue2(BigDecimal endwmvalue2) {
        this.endwmvalue2 = endwmvalue2;
    }

    public BigDecimal getWmvolume2() {
        return wmvolume2;
    }

    public void setWmvolume2(BigDecimal wmvolume2) {
        this.wmvolume2 = wmvolume2;
    }

    public Integer getInfo2() {
        return info2;
    }

    public void setInfo2(Integer info2) {
        this.info2 = info2;
    }

    public BigDecimal getBeginwmvalue3() {
        return beginwmvalue3;
    }

    public void setBeginwmvalue3(BigDecimal beginwmvalue3) {
        this.beginwmvalue3 = beginwmvalue3;
    }

    public BigDecimal getEndwmvalue3() {
        return endwmvalue3;
    }

    public void setEndwmvalue3(BigDecimal endwmvalue3) {
        this.endwmvalue3 = endwmvalue3;
    }

    public BigDecimal getWmvolume3() {
        return wmvolume3;
    }

    public void setWmvolume3(BigDecimal wmvolume3) {
        this.wmvolume3 = wmvolume3;
    }

    public Integer getInfo3() {
        return info3;
    }

    public void setInfo3(Integer info3) {
        this.info3 = info3;
    }

    public BigDecimal getBeginwmvalue4() {
        return beginwmvalue4;
    }

    public void setBeginwmvalue4(BigDecimal beginwmvalue4) {
        this.beginwmvalue4 = beginwmvalue4;
    }

    public BigDecimal getEndwmvalue4() {
        return endwmvalue4;
    }

    public void setEndwmvalue4(BigDecimal endwmvalue4) {
        this.endwmvalue4 = endwmvalue4;
    }

    public BigDecimal getWmvolume4() {
        return wmvolume4;
    }

    public void setWmvolume4(BigDecimal wmvolume4) {
        this.wmvolume4 = wmvolume4;
    }

    public Integer getInfo4() {
        return info4;
    }

    public void setInfo4(Integer info4) {
        this.info4 = info4;
    }

    public Integer getSbCodeFirme() {
        return sbCodeFirme;
    }

    public void setSbCodeFirme(Integer sbCodeFirme) {
        this.sbCodeFirme = sbCodeFirme;
    }

    public String getSbRc() {
        return sbRc;
    }

    public void setSbRc(String sbRc) {
        this.sbRc = sbRc;
    }

    public Integer getSbMfo() {
        return sbMfo;
    }

    public void setSbMfo(Integer sbMfo) {
        this.sbMfo = sbMfo;
    }

    public Integer getSbMfoOt() {
        return sbMfoOt;
    }

    public void setSbMfoOt(Integer sbMfoOt) {
        this.sbMfoOt = sbMfoOt;
    }

    public Integer getSbCodePlat() {
        return sbCodePlat;
    }

    public void setSbCodePlat(Integer sbCodePlat) {
        this.sbCodePlat = sbCodePlat;
    }

    public Integer getSbNumber() {
        return sbNumber;
    }

    public void setSbNumber(Integer sbNumber) {
        this.sbNumber = sbNumber;
    }

    public Integer getSbCFil() {
        return sbCFil;
    }

    public void setSbCFil(Integer sbCFil) {
        this.sbCFil = sbCFil;
    }

    public Integer getSbCCom() {
        return sbCCom;
    }

    public void setSbCCom(Integer sbCCom) {
        this.sbCCom = sbCCom;
    }

    public Integer getSbNSf() {
        return sbNSf;
    }

    public void setSbNSf(Integer sbNSf) {
        this.sbNSf = sbNSf;
    }

    public Integer getSbNop() {
        return sbNop;
    }

    public void setSbNop(Integer sbNop) {
        this.sbNop = sbNop;
    }

    public String getSbAbcount() {
        return sbAbcount;
    }

    public void setSbAbcount(String sbAbcount) {
        this.sbAbcount = sbAbcount;
    }

    public Date getSbPdate() {
        return sbPdate;
    }

    public void setSbPdate(Date sbPdate) {
        this.sbPdate = sbPdate;
    }

    public String getSbPtime() {
        return sbPtime;
    }

    public void setSbPtime(String sbPtime) {
        this.sbPtime = sbPtime;
    }

    public Date getSbDateOb() {
        return sbDateOb;
    }

    public void setSbDateOb(Date sbDateOb) {
        this.sbDateOb = sbDateOb;
    }

    public Integer getSbNPlat() {
        return sbNPlat;
    }

    public void setSbNPlat(Integer sbNPlat) {
        this.sbNPlat = sbNPlat;
    }

    public Date getSbDateb() {
        return sbDateb;
    }

    public void setSbDateb(Date sbDateb) {
        this.sbDateb = sbDateb;
    }

    public Date getSbDatee() {
        return sbDatee;
    }

    public void setSbDatee(Date sbDatee) {
        this.sbDatee = sbDatee;
    }

    public BigDecimal getSbSumm() {
        return sbSumm;
    }

    public void setSbSumm(BigDecimal sbSumm) {
        this.sbSumm = sbSumm;
    }

    public BigDecimal getSbSummP() {
        return sbSummP;
    }

    public void setSbSummP(BigDecimal sbSummP) {
        this.sbSummP = sbSummP;
    }

    public BigDecimal getSbCountb() {
        return sbCountb;
    }

    public void setSbCountb(BigDecimal sbCountb) {
        this.sbCountb = sbCountb;
    }

    public BigDecimal getSbCounte() {
        return sbCounte;
    }

    public void setSbCounte(BigDecimal sbCounte) {
        this.sbCounte = sbCounte;
    }

    public BigDecimal getSbCountd() {
        return sbCountd;
    }

    public void setSbCountd(BigDecimal sbCountd) {
        this.sbCountd = sbCountd;
    }

    public String getSbFio() {
        return sbFio;
    }

    public void setSbFio(String sbFio) {
        this.sbFio = sbFio;
    }

    public Integer getSbCodeC() {
        return sbCodeC;
    }

    public void setSbCodeC(Integer sbCodeC) {
        this.sbCodeC = sbCodeC;
    }

    public Integer getSbCodeS() {
        return sbCodeS;
    }

    public void setSbCodeS(Integer sbCodeS) {
        this.sbCodeS = sbCodeS;
    }

    public String getSbNameStrit() {
        return sbNameStrit;
    }

    public void setSbNameStrit(String sbNameStrit) {
        this.sbNameStrit = sbNameStrit;
    }

    public Integer getSbNHouse() {
        return sbNHouse;
    }

    public void setSbNHouse(Integer sbNHouse) {
        this.sbNHouse = sbNHouse;
    }

    public Integer getSbFHouse() {
        return sbFHouse;
    }

    public void setSbFHouse(Integer sbFHouse) {
        this.sbFHouse = sbFHouse;
    }

    public String getSbAHouse() {
        return sbAHouse;
    }

    public void setSbAHouse(String sbAHouse) {
        this.sbAHouse = sbAHouse;
    }

    public Integer getSbDHouse() {
        return sbDHouse;
    }

    public void setSbDHouse(Integer sbDHouse) {
        this.sbDHouse = sbDHouse;
    }

    public Integer getSbNRoom() {
        return sbNRoom;
    }

    public void setSbNRoom(Integer sbNRoom) {
        this.sbNRoom = sbNRoom;
    }

    public String getSbARoom() {
        return sbARoom;
    }

    public void setSbARoom(String sbARoom) {
        this.sbARoom = sbARoom;
    }

    public Integer getUserService() {
        return userService;
    }

    public void setUserService(Integer userService) {
        this.userService = userService;
    }

    public BigDecimal getSummMain1() {
        return summMain1;
    }

    public void setSummMain1(BigDecimal summMain1) {
        this.summMain1 = summMain1;
    }

    public BigDecimal getSummMain2() {
        return summMain2;
    }

    public void setSummMain2(BigDecimal summMain2) {
        this.summMain2 = summMain2;
    }

    public BigDecimal getSummPs() {
        return summPs;
    }

    public void setSummPs(BigDecimal summPs) {
        this.summPs = summPs;
    }

    public BigDecimal getSummPs1() {
        return summPs1;
    }

    public void setSummPs1(BigDecimal summPs1) {
        this.summPs1 = summPs1;
    }

    public BigDecimal getSummPs2() {
        return summPs2;
    }

    public void setSummPs2(BigDecimal summPs2) {
        this.summPs2 = summPs2;
    }

    public Integer getRealService1() {
        return realService1;
    }

    public void setRealService1(Integer realService1) {
        this.realService1 = realService1;
    }

    public Integer getRealService2() {
        return realService2;
    }

    public void setRealService2(Integer realService2) {
        this.realService2 = realService2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public BigDecimal getSummMain3() {
        return summMain3;
    }

    public void setSummMain3(BigDecimal summMain3) {
        this.summMain3 = summMain3;
    }

    public Integer getUserSetSumm() {
        return userSetSumm;
    }

    public void setUserSetSumm(Integer userSetSumm) {
        this.userSetSumm = userSetSumm;
    }

    public Integer getRealService3() {
        return realService3;
    }

    public void setRealService3(Integer realService3) {
        this.realService3 = realService3;
    }

    public BigDecimal getSummPs3() {
        return summPs3;
    }

    public void setSummPs3(BigDecimal summPs3) {
        this.summPs3 = summPs3;
    }

    public Integer getClaimcode() {
        return claimcode;
    }

    public void setClaimcode(Integer claimcode) {
        this.claimcode = claimcode;
    }

    public String getImpTxt() {
        return impTxt;
    }

    public void setImpTxt(String impTxt) {
        this.impTxt = impTxt;
    }

    public Date getDatetariff() {
        return datetariff;
    }

    public void setDatetariff(Date datetariff) {
        this.datetariff = datetariff;
    }

    public String getSbPrim() {
        return sbPrim;
    }

    public void setSbPrim(String sbPrim) {
        this.sbPrim = sbPrim;
    }

    public List<ErrDocTicket> getErrDocTicketList() {
        return errDocTicketList;
    }

    public void setErrDocTicketList(List<ErrDocTicket> errDocTicketList) {
        this.errDocTicketList = errDocTicketList;
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
        if (!(object instanceof DocTicket)) {
            return false;
        }
        DocTicket other = (DocTicket) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocTicket[ code=" + code + " ]";
    }
    
}
