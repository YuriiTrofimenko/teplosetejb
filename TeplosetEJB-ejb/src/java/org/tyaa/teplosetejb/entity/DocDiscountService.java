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
@Table(name = "DOC_DISCOUNT_SERVICE")
@NamedQueries({
    @NamedQuery(name = "DocDiscountService.findAll", query = "SELECT d FROM DocDiscountService d")})
public class DocDiscountService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    @Temporal(TemporalType.DATE)
    private Date datefrom;
    @Temporal(TemporalType.DATE)
    private Date datetill;
    private Integer service;
    private Integer pipecode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DISCOUNT_PERCENT")
    private BigDecimal discountPercent;
    private Double koeff;
    @Column(name = "PROCDATE_FROM")
    private Integer procdateFrom;
    @Size(max = 128)
    private String remark;
    private Integer normcode;
    @Column(name = "IS_STOPPER")
    private Integer isStopper;
    @Column(name = "STOPPER_BEGINDATE")
    @Temporal(TemporalType.DATE)
    private Date stopperBegindate;
    @Column(name = "STOPPER_ENDDATE")
    @Temporal(TemporalType.DATE)
    private Date stopperEnddate;
    @Column(name = "STOPPER_CHECKDATE")
    @Temporal(TemporalType.DATE)
    private Date stopperCheckdate;
    @Column(name = "STOPPER_NEXTCHECKDATE")
    @Temporal(TemporalType.DATE)
    private Date stopperNextcheckdate;
    @Size(max = 16)
    @Column(name = "STOPPER_NUMBER")
    private String stopperNumber;
    @Column(name = "STOPPER_REASON")
    private Integer stopperReason;
    @Column(name = "STOPPER_INSTALATION")
    private Integer stopperInstalation;
    @Size(max = 16)
    @Column(name = "STOPPER_NUMBER2")
    private String stopperNumber2;
    @Column(name = "STOPPER_INSTALATION2")
    private Integer stopperInstalation2;
    @Size(max = 128)
    @Column(name = "CHECK_POS_REMARK")
    private String checkPosRemark;
    private BigInteger housecode;
    private Integer formnach;
    private Integer stoppercode1;
    private Integer stoppercode2;
    @Column(name = "STOPPER_TYPE_CODE")
    private Integer stopperTypeCode;
    private BigDecimal s2;
    @Column(name = "USER_SET_VALUE")
    private Integer userSetValue;
    @Column(name = "DISCOUNT_PERCENT_DAY")
    private BigDecimal discountPercentDay;
    @Column(name = "DISCOUNT_DAYS_DAY")
    private Double discountDaysDay;
    @Column(name = "DISCOUNT_S2")
    private BigDecimal discountS2;
    private Integer gt;
    @Column(name = "NACH_KOEFF")
    private Double nachKoeff;
    @Column(name = "ACCOUNT_DISCOUNT_CODE")
    private Integer accountDiscountCode;
    @Column(name = "ACCOUNT_DISCOUNT_HIDDEN")
    private Integer accountDiscountHidden;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocDiscountService> errDocDiscountServiceList;

    public DocDiscountService() {
    }

    public DocDiscountService(Integer code) {
        this.code = code;
    }

    public DocDiscountService(Integer code, int state) {
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

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Double getKoeff() {
        return koeff;
    }

    public void setKoeff(Double koeff) {
        this.koeff = koeff;
    }

    public Integer getProcdateFrom() {
        return procdateFrom;
    }

    public void setProcdateFrom(Integer procdateFrom) {
        this.procdateFrom = procdateFrom;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getNormcode() {
        return normcode;
    }

    public void setNormcode(Integer normcode) {
        this.normcode = normcode;
    }

    public Integer getIsStopper() {
        return isStopper;
    }

    public void setIsStopper(Integer isStopper) {
        this.isStopper = isStopper;
    }

    public Date getStopperBegindate() {
        return stopperBegindate;
    }

    public void setStopperBegindate(Date stopperBegindate) {
        this.stopperBegindate = stopperBegindate;
    }

    public Date getStopperEnddate() {
        return stopperEnddate;
    }

    public void setStopperEnddate(Date stopperEnddate) {
        this.stopperEnddate = stopperEnddate;
    }

    public Date getStopperCheckdate() {
        return stopperCheckdate;
    }

    public void setStopperCheckdate(Date stopperCheckdate) {
        this.stopperCheckdate = stopperCheckdate;
    }

    public Date getStopperNextcheckdate() {
        return stopperNextcheckdate;
    }

    public void setStopperNextcheckdate(Date stopperNextcheckdate) {
        this.stopperNextcheckdate = stopperNextcheckdate;
    }

    public String getStopperNumber() {
        return stopperNumber;
    }

    public void setStopperNumber(String stopperNumber) {
        this.stopperNumber = stopperNumber;
    }

    public Integer getStopperReason() {
        return stopperReason;
    }

    public void setStopperReason(Integer stopperReason) {
        this.stopperReason = stopperReason;
    }

    public Integer getStopperInstalation() {
        return stopperInstalation;
    }

    public void setStopperInstalation(Integer stopperInstalation) {
        this.stopperInstalation = stopperInstalation;
    }

    public String getStopperNumber2() {
        return stopperNumber2;
    }

    public void setStopperNumber2(String stopperNumber2) {
        this.stopperNumber2 = stopperNumber2;
    }

    public Integer getStopperInstalation2() {
        return stopperInstalation2;
    }

    public void setStopperInstalation2(Integer stopperInstalation2) {
        this.stopperInstalation2 = stopperInstalation2;
    }

    public String getCheckPosRemark() {
        return checkPosRemark;
    }

    public void setCheckPosRemark(String checkPosRemark) {
        this.checkPosRemark = checkPosRemark;
    }

    public BigInteger getHousecode() {
        return housecode;
    }

    public void setHousecode(BigInteger housecode) {
        this.housecode = housecode;
    }

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getStoppercode1() {
        return stoppercode1;
    }

    public void setStoppercode1(Integer stoppercode1) {
        this.stoppercode1 = stoppercode1;
    }

    public Integer getStoppercode2() {
        return stoppercode2;
    }

    public void setStoppercode2(Integer stoppercode2) {
        this.stoppercode2 = stoppercode2;
    }

    public Integer getStopperTypeCode() {
        return stopperTypeCode;
    }

    public void setStopperTypeCode(Integer stopperTypeCode) {
        this.stopperTypeCode = stopperTypeCode;
    }

    public BigDecimal getS2() {
        return s2;
    }

    public void setS2(BigDecimal s2) {
        this.s2 = s2;
    }

    public Integer getUserSetValue() {
        return userSetValue;
    }

    public void setUserSetValue(Integer userSetValue) {
        this.userSetValue = userSetValue;
    }

    public BigDecimal getDiscountPercentDay() {
        return discountPercentDay;
    }

    public void setDiscountPercentDay(BigDecimal discountPercentDay) {
        this.discountPercentDay = discountPercentDay;
    }

    public Double getDiscountDaysDay() {
        return discountDaysDay;
    }

    public void setDiscountDaysDay(Double discountDaysDay) {
        this.discountDaysDay = discountDaysDay;
    }

    public BigDecimal getDiscountS2() {
        return discountS2;
    }

    public void setDiscountS2(BigDecimal discountS2) {
        this.discountS2 = discountS2;
    }

    public Integer getGt() {
        return gt;
    }

    public void setGt(Integer gt) {
        this.gt = gt;
    }

    public Double getNachKoeff() {
        return nachKoeff;
    }

    public void setNachKoeff(Double nachKoeff) {
        this.nachKoeff = nachKoeff;
    }

    public Integer getAccountDiscountCode() {
        return accountDiscountCode;
    }

    public void setAccountDiscountCode(Integer accountDiscountCode) {
        this.accountDiscountCode = accountDiscountCode;
    }

    public Integer getAccountDiscountHidden() {
        return accountDiscountHidden;
    }

    public void setAccountDiscountHidden(Integer accountDiscountHidden) {
        this.accountDiscountHidden = accountDiscountHidden;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocDiscountService> getErrDocDiscountServiceList() {
        return errDocDiscountServiceList;
    }

    public void setErrDocDiscountServiceList(List<ErrDocDiscountService> errDocDiscountServiceList) {
        this.errDocDiscountServiceList = errDocDiscountServiceList;
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
        if (!(object instanceof DocDiscountService)) {
            return false;
        }
        DocDiscountService other = (DocDiscountService) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocDiscountService[ code=" + code + " ]";
    }
    
}
