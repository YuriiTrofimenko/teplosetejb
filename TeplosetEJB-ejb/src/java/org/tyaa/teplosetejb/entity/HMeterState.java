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
@Table(name = "H_METER_STATE")
@NamedQueries({
    @NamedQuery(name = "HMeterState.findAll", query = "SELECT h FROM HMeterState h")})
public class HMeterState implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Column(name = "SET_RVERSION")
    private Integer setRversion;
    @Basic(optional = false)
    @NotNull
    private int meterstatecode;
    @Basic(optional = false)
    @NotNull
    private int metercode;
    @Basic(optional = false)
    @NotNull
    private int pipecode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String number;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer metertype;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    @Temporal(TemporalType.DATE)
    private Date permissiondate;
    @Size(max = 16)
    private String plnumber;
    private Integer meterinstalation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal beginvalue1;
    private BigDecimal beginvalue2;
    private BigDecimal beginvalue3;
    private BigDecimal beginvalue4;
    @Column(name = "DATE_ACT")
    @Temporal(TemporalType.DATE)
    private Date dateAct;
    private Integer metercheker;
    @Size(max = 16)
    @Column(name = "INDICATOR_NUMBER")
    private String indicatorNumber;
    @Column(name = "INDICATOR_DATE")
    @Temporal(TemporalType.DATE)
    private Date indicatorDate;
    @Size(max = 128)
    private String remark;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;
    @Size(max = 16)
    @Column(name = "NUMBER_CALCULATOR")
    private String numberCalculator;
    @Size(max = 16)
    @Column(name = "NUMBER_FLOWMETER")
    private String numberFlowmeter;
    @Size(max = 16)
    @Column(name = "NUMBER_PRESSURE_1")
    private String numberPressure1;
    @Size(max = 16)
    @Column(name = "NUMBER_PRESSURE_2")
    private String numberPressure2;
    @Column(name = "TYPE_CONNECTION")
    private Integer typeConnection;
    private Integer flowmetertype;
    private Integer du;
    private Integer l;
    @Size(max = 16)
    @Column(name = "ACT_NUMBER")
    private String actNumber;
    @Column(name = "NEXT_CHECKDATE")
    @Temporal(TemporalType.DATE)
    private Date nextCheckdate;
    @Size(max = 16)
    @Column(name = "ACT_NUMBER_DEL")
    private String actNumberDel;

    public HMeterState() {
    }

    public HMeterState(Integer code) {
        this.code = code;
    }

    public HMeterState(Integer code, int meterstatecode, int metercode, int pipecode, String number, Date begindate) {
        this.code = code;
        this.meterstatecode = meterstatecode;
        this.metercode = metercode;
        this.pipecode = pipecode;
        this.number = number;
        this.begindate = begindate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getHProcdate() {
        return hProcdate;
    }

    public void setHProcdate(Integer hProcdate) {
        this.hProcdate = hProcdate;
    }

    public Integer getSetRversion() {
        return setRversion;
    }

    public void setSetRversion(Integer setRversion) {
        this.setRversion = setRversion;
    }

    public int getMeterstatecode() {
        return meterstatecode;
    }

    public void setMeterstatecode(int meterstatecode) {
        this.meterstatecode = meterstatecode;
    }

    public int getMetercode() {
        return metercode;
    }

    public void setMetercode(int metercode) {
        this.metercode = metercode;
    }

    public int getPipecode() {
        return pipecode;
    }

    public void setPipecode(int pipecode) {
        this.pipecode = pipecode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getMetertype() {
        return metertype;
    }

    public void setMetertype(Integer metertype) {
        this.metertype = metertype;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Date getPermissiondate() {
        return permissiondate;
    }

    public void setPermissiondate(Date permissiondate) {
        this.permissiondate = permissiondate;
    }

    public String getPlnumber() {
        return plnumber;
    }

    public void setPlnumber(String plnumber) {
        this.plnumber = plnumber;
    }

    public Integer getMeterinstalation() {
        return meterinstalation;
    }

    public void setMeterinstalation(Integer meterinstalation) {
        this.meterinstalation = meterinstalation;
    }

    public BigDecimal getBeginvalue1() {
        return beginvalue1;
    }

    public void setBeginvalue1(BigDecimal beginvalue1) {
        this.beginvalue1 = beginvalue1;
    }

    public BigDecimal getBeginvalue2() {
        return beginvalue2;
    }

    public void setBeginvalue2(BigDecimal beginvalue2) {
        this.beginvalue2 = beginvalue2;
    }

    public BigDecimal getBeginvalue3() {
        return beginvalue3;
    }

    public void setBeginvalue3(BigDecimal beginvalue3) {
        this.beginvalue3 = beginvalue3;
    }

    public BigDecimal getBeginvalue4() {
        return beginvalue4;
    }

    public void setBeginvalue4(BigDecimal beginvalue4) {
        this.beginvalue4 = beginvalue4;
    }

    public Date getDateAct() {
        return dateAct;
    }

    public void setDateAct(Date dateAct) {
        this.dateAct = dateAct;
    }

    public Integer getMetercheker() {
        return metercheker;
    }

    public void setMetercheker(Integer metercheker) {
        this.metercheker = metercheker;
    }

    public String getIndicatorNumber() {
        return indicatorNumber;
    }

    public void setIndicatorNumber(String indicatorNumber) {
        this.indicatorNumber = indicatorNumber;
    }

    public Date getIndicatorDate() {
        return indicatorDate;
    }

    public void setIndicatorDate(Date indicatorDate) {
        this.indicatorDate = indicatorDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public Integer getDoccode() {
        return doccode;
    }

    public void setDoccode(Integer doccode) {
        this.doccode = doccode;
    }

    public Integer getDocpos() {
        return docpos;
    }

    public void setDocpos(Integer docpos) {
        this.docpos = docpos;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public String getNumberCalculator() {
        return numberCalculator;
    }

    public void setNumberCalculator(String numberCalculator) {
        this.numberCalculator = numberCalculator;
    }

    public String getNumberFlowmeter() {
        return numberFlowmeter;
    }

    public void setNumberFlowmeter(String numberFlowmeter) {
        this.numberFlowmeter = numberFlowmeter;
    }

    public String getNumberPressure1() {
        return numberPressure1;
    }

    public void setNumberPressure1(String numberPressure1) {
        this.numberPressure1 = numberPressure1;
    }

    public String getNumberPressure2() {
        return numberPressure2;
    }

    public void setNumberPressure2(String numberPressure2) {
        this.numberPressure2 = numberPressure2;
    }

    public Integer getTypeConnection() {
        return typeConnection;
    }

    public void setTypeConnection(Integer typeConnection) {
        this.typeConnection = typeConnection;
    }

    public Integer getFlowmetertype() {
        return flowmetertype;
    }

    public void setFlowmetertype(Integer flowmetertype) {
        this.flowmetertype = flowmetertype;
    }

    public Integer getDu() {
        return du;
    }

    public void setDu(Integer du) {
        this.du = du;
    }

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public String getActNumber() {
        return actNumber;
    }

    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    public Date getNextCheckdate() {
        return nextCheckdate;
    }

    public void setNextCheckdate(Date nextCheckdate) {
        this.nextCheckdate = nextCheckdate;
    }

    public String getActNumberDel() {
        return actNumberDel;
    }

    public void setActNumberDel(String actNumberDel) {
        this.actNumberDel = actNumberDel;
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
        if (!(object instanceof HMeterState)) {
            return false;
        }
        HMeterState other = (HMeterState) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HMeterState[ code=" + code + " ]";
    }
    
}
