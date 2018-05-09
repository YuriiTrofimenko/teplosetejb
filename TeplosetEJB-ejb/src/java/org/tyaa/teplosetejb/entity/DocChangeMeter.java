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
import javax.persistence.CascadeType;
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
@Table(name = "DOC_CHANGE_METER")
@NamedQueries({
    @NamedQuery(name = "DocChangeMeter.findAll", query = "SELECT d FROM DocChangeMeter d")})
public class DocChangeMeter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "OBJECT_CODE")
    private BigInteger objectCode;
    private Integer pipecode;
    private Integer metercode;
    @Size(max = 16)
    private String meternumber;
    @Temporal(TemporalType.DATE)
    private Date meterbegindate;
    @Temporal(TemporalType.DATE)
    private Date meterenddate;
    private Integer metertype;
    @Temporal(TemporalType.DATE)
    private Date metercheckdate;
    @Temporal(TemporalType.DATE)
    private Date meterpermissiondate;
    @Size(max = 16)
    private String meterplnumber;
    private Integer meterinstalation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal meterbeginvalue1;
    private BigDecimal meterbeginvalue2;
    private BigDecimal meterbeginvalue3;
    private BigDecimal meterbeginvalue4;
    @Column(name = "METERDATE_ACT")
    @Temporal(TemporalType.DATE)
    private Date meterdateAct;
    private Integer metercheker;
    @Size(max = 16)
    @Column(name = "METERINDICATOR_NUMBER")
    private String meterindicatorNumber;
    @Column(name = "METERINDICATOR_DATE")
    @Temporal(TemporalType.DATE)
    private Date meterindicatorDate;
    @Size(max = 128)
    private String remark;
    @Column(name = "TYPE_VALUE")
    private Integer typeValue;
    @Column(name = "USER_SET_VALUE")
    private Integer userSetValue;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    private BigDecimal value1;
    private BigDecimal value2;
    private BigDecimal value3;
    private BigDecimal value4;
    private BigDecimal meterendvalue1;
    private BigDecimal meterendvalue2;
    private BigDecimal meterendvalue3;
    private BigDecimal meterendvalue4;
    private BigDecimal volume1;
    private BigDecimal volume2;
    private BigDecimal volume3;
    private BigDecimal volume4;
    @Column(name = "ADD_VOLUME1")
    private BigDecimal addVolume1;
    @Column(name = "ADD_VOLUME2")
    private BigDecimal addVolume2;
    @Column(name = "ADD_VOLUME3")
    private BigDecimal addVolume3;
    @Column(name = "ADD_VOLUME4")
    private BigDecimal addVolume4;
    @Column(name = "CHECKDATE_PREV")
    @Temporal(TemporalType.DATE)
    private Date checkdatePrev;
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    private Integer formnach;
    private BigDecimal metervalue1;
    private BigDecimal metervalue2;
    private BigDecimal metervalue3;
    private BigDecimal metervalue4;
    @Size(max = 16)
    @Column(name = "METER_NUMBER_CALCULATOR")
    private String meterNumberCalculator;
    @Size(max = 16)
    @Column(name = "METER_NUMBER_FLOWMETER")
    private String meterNumberFlowmeter;
    @Size(max = 16)
    @Column(name = "METER_NUMBER_PRESSURE_1")
    private String meterNumberPressure1;
    @Size(max = 16)
    @Column(name = "METER_NUMBER_PRESSURE_2")
    private String meterNumberPressure2;
    @Column(name = "METER_TYPE_CONNECTION")
    private Integer meterTypeConnection;
    @Column(name = "METER_FLOWMETERTYPE")
    private Integer meterFlowmetertype;
    @Column(name = "METER_DU")
    private Integer meterDu;
    @Column(name = "METER_L")
    private Integer meterL;
    @Column(name = "METER_NEXT_CHECKDATE")
    @Temporal(TemporalType.DATE)
    private Date meterNextCheckdate;
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
    @Column(name = "NORM_BEGINDATE")
    @Temporal(TemporalType.DATE)
    private Date normBegindate;
    @Column(name = "NORM_ENDDATE")
    @Temporal(TemporalType.DATE)
    private Date normEnddate;
    @Column(name = "ADD_VOLUME_G1")
    private BigDecimal addVolumeG1;
    @Column(name = "ADD_VOLUME_G2")
    private BigDecimal addVolumeG2;
    @Column(name = "ADD_VOLUME_G3")
    private BigDecimal addVolumeG3;
    @Column(name = "ADD_VOLUME_G4")
    private BigDecimal addVolumeG4;
    @Temporal(TemporalType.DATE)
    private Date datetariff;
    @Size(max = 16)
    @Column(name = "ACT_NUMBER")
    private String actNumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pos")
    private List<DocChangeMeterReplaceNgt> docChangeMeterReplaceNgtList;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocChangeMeter> errDocChangeMeterList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocChangeMeter() {
    }

    public DocChangeMeter(Integer code) {
        this.code = code;
    }

    public DocChangeMeter(Integer code, int state) {
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

    public BigInteger getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(BigInteger objectCode) {
        this.objectCode = objectCode;
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

    public String getMeternumber() {
        return meternumber;
    }

    public void setMeternumber(String meternumber) {
        this.meternumber = meternumber;
    }

    public Date getMeterbegindate() {
        return meterbegindate;
    }

    public void setMeterbegindate(Date meterbegindate) {
        this.meterbegindate = meterbegindate;
    }

    public Date getMeterenddate() {
        return meterenddate;
    }

    public void setMeterenddate(Date meterenddate) {
        this.meterenddate = meterenddate;
    }

    public Integer getMetertype() {
        return metertype;
    }

    public void setMetertype(Integer metertype) {
        this.metertype = metertype;
    }

    public Date getMetercheckdate() {
        return metercheckdate;
    }

    public void setMetercheckdate(Date metercheckdate) {
        this.metercheckdate = metercheckdate;
    }

    public Date getMeterpermissiondate() {
        return meterpermissiondate;
    }

    public void setMeterpermissiondate(Date meterpermissiondate) {
        this.meterpermissiondate = meterpermissiondate;
    }

    public String getMeterplnumber() {
        return meterplnumber;
    }

    public void setMeterplnumber(String meterplnumber) {
        this.meterplnumber = meterplnumber;
    }

    public Integer getMeterinstalation() {
        return meterinstalation;
    }

    public void setMeterinstalation(Integer meterinstalation) {
        this.meterinstalation = meterinstalation;
    }

    public BigDecimal getMeterbeginvalue1() {
        return meterbeginvalue1;
    }

    public void setMeterbeginvalue1(BigDecimal meterbeginvalue1) {
        this.meterbeginvalue1 = meterbeginvalue1;
    }

    public BigDecimal getMeterbeginvalue2() {
        return meterbeginvalue2;
    }

    public void setMeterbeginvalue2(BigDecimal meterbeginvalue2) {
        this.meterbeginvalue2 = meterbeginvalue2;
    }

    public BigDecimal getMeterbeginvalue3() {
        return meterbeginvalue3;
    }

    public void setMeterbeginvalue3(BigDecimal meterbeginvalue3) {
        this.meterbeginvalue3 = meterbeginvalue3;
    }

    public BigDecimal getMeterbeginvalue4() {
        return meterbeginvalue4;
    }

    public void setMeterbeginvalue4(BigDecimal meterbeginvalue4) {
        this.meterbeginvalue4 = meterbeginvalue4;
    }

    public Date getMeterdateAct() {
        return meterdateAct;
    }

    public void setMeterdateAct(Date meterdateAct) {
        this.meterdateAct = meterdateAct;
    }

    public Integer getMetercheker() {
        return metercheker;
    }

    public void setMetercheker(Integer metercheker) {
        this.metercheker = metercheker;
    }

    public String getMeterindicatorNumber() {
        return meterindicatorNumber;
    }

    public void setMeterindicatorNumber(String meterindicatorNumber) {
        this.meterindicatorNumber = meterindicatorNumber;
    }

    public Date getMeterindicatorDate() {
        return meterindicatorDate;
    }

    public void setMeterindicatorDate(Date meterindicatorDate) {
        this.meterindicatorDate = meterindicatorDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(Integer typeValue) {
        this.typeValue = typeValue;
    }

    public Integer getUserSetValue() {
        return userSetValue;
    }

    public void setUserSetValue(Integer userSetValue) {
        this.userSetValue = userSetValue;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public BigDecimal getValue1() {
        return value1;
    }

    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    public BigDecimal getValue2() {
        return value2;
    }

    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    public BigDecimal getValue3() {
        return value3;
    }

    public void setValue3(BigDecimal value3) {
        this.value3 = value3;
    }

    public BigDecimal getValue4() {
        return value4;
    }

    public void setValue4(BigDecimal value4) {
        this.value4 = value4;
    }

    public BigDecimal getMeterendvalue1() {
        return meterendvalue1;
    }

    public void setMeterendvalue1(BigDecimal meterendvalue1) {
        this.meterendvalue1 = meterendvalue1;
    }

    public BigDecimal getMeterendvalue2() {
        return meterendvalue2;
    }

    public void setMeterendvalue2(BigDecimal meterendvalue2) {
        this.meterendvalue2 = meterendvalue2;
    }

    public BigDecimal getMeterendvalue3() {
        return meterendvalue3;
    }

    public void setMeterendvalue3(BigDecimal meterendvalue3) {
        this.meterendvalue3 = meterendvalue3;
    }

    public BigDecimal getMeterendvalue4() {
        return meterendvalue4;
    }

    public void setMeterendvalue4(BigDecimal meterendvalue4) {
        this.meterendvalue4 = meterendvalue4;
    }

    public BigDecimal getVolume1() {
        return volume1;
    }

    public void setVolume1(BigDecimal volume1) {
        this.volume1 = volume1;
    }

    public BigDecimal getVolume2() {
        return volume2;
    }

    public void setVolume2(BigDecimal volume2) {
        this.volume2 = volume2;
    }

    public BigDecimal getVolume3() {
        return volume3;
    }

    public void setVolume3(BigDecimal volume3) {
        this.volume3 = volume3;
    }

    public BigDecimal getVolume4() {
        return volume4;
    }

    public void setVolume4(BigDecimal volume4) {
        this.volume4 = volume4;
    }

    public BigDecimal getAddVolume1() {
        return addVolume1;
    }

    public void setAddVolume1(BigDecimal addVolume1) {
        this.addVolume1 = addVolume1;
    }

    public BigDecimal getAddVolume2() {
        return addVolume2;
    }

    public void setAddVolume2(BigDecimal addVolume2) {
        this.addVolume2 = addVolume2;
    }

    public BigDecimal getAddVolume3() {
        return addVolume3;
    }

    public void setAddVolume3(BigDecimal addVolume3) {
        this.addVolume3 = addVolume3;
    }

    public BigDecimal getAddVolume4() {
        return addVolume4;
    }

    public void setAddVolume4(BigDecimal addVolume4) {
        this.addVolume4 = addVolume4;
    }

    public Date getCheckdatePrev() {
        return checkdatePrev;
    }

    public void setCheckdatePrev(Date checkdatePrev) {
        this.checkdatePrev = checkdatePrev;
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

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public BigDecimal getMetervalue1() {
        return metervalue1;
    }

    public void setMetervalue1(BigDecimal metervalue1) {
        this.metervalue1 = metervalue1;
    }

    public BigDecimal getMetervalue2() {
        return metervalue2;
    }

    public void setMetervalue2(BigDecimal metervalue2) {
        this.metervalue2 = metervalue2;
    }

    public BigDecimal getMetervalue3() {
        return metervalue3;
    }

    public void setMetervalue3(BigDecimal metervalue3) {
        this.metervalue3 = metervalue3;
    }

    public BigDecimal getMetervalue4() {
        return metervalue4;
    }

    public void setMetervalue4(BigDecimal metervalue4) {
        this.metervalue4 = metervalue4;
    }

    public String getMeterNumberCalculator() {
        return meterNumberCalculator;
    }

    public void setMeterNumberCalculator(String meterNumberCalculator) {
        this.meterNumberCalculator = meterNumberCalculator;
    }

    public String getMeterNumberFlowmeter() {
        return meterNumberFlowmeter;
    }

    public void setMeterNumberFlowmeter(String meterNumberFlowmeter) {
        this.meterNumberFlowmeter = meterNumberFlowmeter;
    }

    public String getMeterNumberPressure1() {
        return meterNumberPressure1;
    }

    public void setMeterNumberPressure1(String meterNumberPressure1) {
        this.meterNumberPressure1 = meterNumberPressure1;
    }

    public String getMeterNumberPressure2() {
        return meterNumberPressure2;
    }

    public void setMeterNumberPressure2(String meterNumberPressure2) {
        this.meterNumberPressure2 = meterNumberPressure2;
    }

    public Integer getMeterTypeConnection() {
        return meterTypeConnection;
    }

    public void setMeterTypeConnection(Integer meterTypeConnection) {
        this.meterTypeConnection = meterTypeConnection;
    }

    public Integer getMeterFlowmetertype() {
        return meterFlowmetertype;
    }

    public void setMeterFlowmetertype(Integer meterFlowmetertype) {
        this.meterFlowmetertype = meterFlowmetertype;
    }

    public Integer getMeterDu() {
        return meterDu;
    }

    public void setMeterDu(Integer meterDu) {
        this.meterDu = meterDu;
    }

    public Integer getMeterL() {
        return meterL;
    }

    public void setMeterL(Integer meterL) {
        this.meterL = meterL;
    }

    public Date getMeterNextCheckdate() {
        return meterNextCheckdate;
    }

    public void setMeterNextCheckdate(Date meterNextCheckdate) {
        this.meterNextCheckdate = meterNextCheckdate;
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

    public Date getNormBegindate() {
        return normBegindate;
    }

    public void setNormBegindate(Date normBegindate) {
        this.normBegindate = normBegindate;
    }

    public Date getNormEnddate() {
        return normEnddate;
    }

    public void setNormEnddate(Date normEnddate) {
        this.normEnddate = normEnddate;
    }

    public BigDecimal getAddVolumeG1() {
        return addVolumeG1;
    }

    public void setAddVolumeG1(BigDecimal addVolumeG1) {
        this.addVolumeG1 = addVolumeG1;
    }

    public BigDecimal getAddVolumeG2() {
        return addVolumeG2;
    }

    public void setAddVolumeG2(BigDecimal addVolumeG2) {
        this.addVolumeG2 = addVolumeG2;
    }

    public BigDecimal getAddVolumeG3() {
        return addVolumeG3;
    }

    public void setAddVolumeG3(BigDecimal addVolumeG3) {
        this.addVolumeG3 = addVolumeG3;
    }

    public BigDecimal getAddVolumeG4() {
        return addVolumeG4;
    }

    public void setAddVolumeG4(BigDecimal addVolumeG4) {
        this.addVolumeG4 = addVolumeG4;
    }

    public Date getDatetariff() {
        return datetariff;
    }

    public void setDatetariff(Date datetariff) {
        this.datetariff = datetariff;
    }

    public String getActNumber() {
        return actNumber;
    }

    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    public List<DocChangeMeterReplaceNgt> getDocChangeMeterReplaceNgtList() {
        return docChangeMeterReplaceNgtList;
    }

    public void setDocChangeMeterReplaceNgtList(List<DocChangeMeterReplaceNgt> docChangeMeterReplaceNgtList) {
        this.docChangeMeterReplaceNgtList = docChangeMeterReplaceNgtList;
    }

    public List<ErrDocChangeMeter> getErrDocChangeMeterList() {
        return errDocChangeMeterList;
    }

    public void setErrDocChangeMeterList(List<ErrDocChangeMeter> errDocChangeMeterList) {
        this.errDocChangeMeterList = errDocChangeMeterList;
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
        if (!(object instanceof DocChangeMeter)) {
            return false;
        }
        DocChangeMeter other = (DocChangeMeter) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocChangeMeter[ code=" + code + " ]";
    }
    
}
