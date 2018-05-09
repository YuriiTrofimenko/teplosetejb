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
@Table(name = "DOC_SUBSIDIA")
@NamedQueries({
    @NamedQuery(name = "DocSubsidia.findAll", query = "SELECT d FROM DocSubsidia d")})
public class DocSubsidia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    private Integer firmcode;
    private Integer saldokind;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal summ;
    private BigDecimal ksumm;
    @Size(max = 128)
    private String remark;
    private Integer todate;
    private Integer todate1;
    private Integer pskind;
    @Column(name = "IS_EDIT")
    private Integer isEdit;
    @Size(max = 32)
    @Column(name = "S_FIO")
    private String sFio;
    @Size(max = 16)
    @Column(name = "S_CAT_V")
    private String sCatV;
    @Size(max = 16)
    @Column(name = "S_VULCOD")
    private String sVulcod;
    @Size(max = 32)
    @Column(name = "S_NAME_V")
    private String sNameV;
    @Size(max = 16)
    @Column(name = "S_BLD")
    private String sBld;
    @Size(max = 16)
    @Column(name = "S_FLAT")
    private String sFlat;
    @Size(max = 16)
    @Column(name = "S_RASH")
    private String sRash;
    @Size(max = 16)
    @Column(name = "S_NUMB")
    private String sNumb;
    @Column(name = "S_SUMM")
    private BigDecimal sSumm;
    @Column(name = "S_NUMM")
    private Integer sNumm;
    @Column(name = "S_SUBS")
    private BigDecimal sSubs;
    @Column(name = "S_DAT1")
    @Temporal(TemporalType.DATE)
    private Date sDat1;
    @Column(name = "S_DAT2")
    @Temporal(TemporalType.DATE)
    private Date sDat2;
    @Column(name = "SUMM_1")
    private BigDecimal summ1;
    @Column(name = "SUMM_2")
    private BigDecimal summ2;
    @Column(name = "KSUMM_1")
    private BigDecimal ksumm1;
    @Column(name = "KSUMM_2")
    private BigDecimal ksumm2;
    @Column(name = "REAL_SERVICE_1")
    private Integer realService1;
    @Column(name = "REAL_SERVICE_2")
    private Integer realService2;
    @Column(name = "USER_SERVICE")
    private Integer userService;
    @Column(name = "S_SM2")
    private BigDecimal sSm2;
    @Column(name = "S_SM3")
    private BigDecimal sSm3;
    @Column(name = "S_OB2")
    private BigDecimal sOb2;
    @Column(name = "S_OB3")
    private BigDecimal sOb3;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocSubsidia> errDocSubsidiaList;

    public DocSubsidia() {
    }

    public DocSubsidia(Integer code) {
        this.code = code;
    }

    public DocSubsidia(Integer code, int state) {
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

    public BigDecimal getSumm() {
        return summ;
    }

    public void setSumm(BigDecimal summ) {
        this.summ = summ;
    }

    public BigDecimal getKsumm() {
        return ksumm;
    }

    public void setKsumm(BigDecimal ksumm) {
        this.ksumm = ksumm;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public Integer getTodate1() {
        return todate1;
    }

    public void setTodate1(Integer todate1) {
        this.todate1 = todate1;
    }

    public Integer getPskind() {
        return pskind;
    }

    public void setPskind(Integer pskind) {
        this.pskind = pskind;
    }

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }

    public String getSFio() {
        return sFio;
    }

    public void setSFio(String sFio) {
        this.sFio = sFio;
    }

    public String getSCatV() {
        return sCatV;
    }

    public void setSCatV(String sCatV) {
        this.sCatV = sCatV;
    }

    public String getSVulcod() {
        return sVulcod;
    }

    public void setSVulcod(String sVulcod) {
        this.sVulcod = sVulcod;
    }

    public String getSNameV() {
        return sNameV;
    }

    public void setSNameV(String sNameV) {
        this.sNameV = sNameV;
    }

    public String getSBld() {
        return sBld;
    }

    public void setSBld(String sBld) {
        this.sBld = sBld;
    }

    public String getSFlat() {
        return sFlat;
    }

    public void setSFlat(String sFlat) {
        this.sFlat = sFlat;
    }

    public String getSRash() {
        return sRash;
    }

    public void setSRash(String sRash) {
        this.sRash = sRash;
    }

    public String getSNumb() {
        return sNumb;
    }

    public void setSNumb(String sNumb) {
        this.sNumb = sNumb;
    }

    public BigDecimal getSSumm() {
        return sSumm;
    }

    public void setSSumm(BigDecimal sSumm) {
        this.sSumm = sSumm;
    }

    public Integer getSNumm() {
        return sNumm;
    }

    public void setSNumm(Integer sNumm) {
        this.sNumm = sNumm;
    }

    public BigDecimal getSSubs() {
        return sSubs;
    }

    public void setSSubs(BigDecimal sSubs) {
        this.sSubs = sSubs;
    }

    public Date getSDat1() {
        return sDat1;
    }

    public void setSDat1(Date sDat1) {
        this.sDat1 = sDat1;
    }

    public Date getSDat2() {
        return sDat2;
    }

    public void setSDat2(Date sDat2) {
        this.sDat2 = sDat2;
    }

    public BigDecimal getSumm1() {
        return summ1;
    }

    public void setSumm1(BigDecimal summ1) {
        this.summ1 = summ1;
    }

    public BigDecimal getSumm2() {
        return summ2;
    }

    public void setSumm2(BigDecimal summ2) {
        this.summ2 = summ2;
    }

    public BigDecimal getKsumm1() {
        return ksumm1;
    }

    public void setKsumm1(BigDecimal ksumm1) {
        this.ksumm1 = ksumm1;
    }

    public BigDecimal getKsumm2() {
        return ksumm2;
    }

    public void setKsumm2(BigDecimal ksumm2) {
        this.ksumm2 = ksumm2;
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

    public Integer getUserService() {
        return userService;
    }

    public void setUserService(Integer userService) {
        this.userService = userService;
    }

    public BigDecimal getSSm2() {
        return sSm2;
    }

    public void setSSm2(BigDecimal sSm2) {
        this.sSm2 = sSm2;
    }

    public BigDecimal getSSm3() {
        return sSm3;
    }

    public void setSSm3(BigDecimal sSm3) {
        this.sSm3 = sSm3;
    }

    public BigDecimal getSOb2() {
        return sOb2;
    }

    public void setSOb2(BigDecimal sOb2) {
        this.sOb2 = sOb2;
    }

    public BigDecimal getSOb3() {
        return sOb3;
    }

    public void setSOb3(BigDecimal sOb3) {
        this.sOb3 = sOb3;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocSubsidia> getErrDocSubsidiaList() {
        return errDocSubsidiaList;
    }

    public void setErrDocSubsidiaList(List<ErrDocSubsidia> errDocSubsidiaList) {
        this.errDocSubsidiaList = errDocSubsidiaList;
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
        if (!(object instanceof DocSubsidia)) {
            return false;
        }
        DocSubsidia other = (DocSubsidia) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocSubsidia[ code=" + code + " ]";
    }
    
}
