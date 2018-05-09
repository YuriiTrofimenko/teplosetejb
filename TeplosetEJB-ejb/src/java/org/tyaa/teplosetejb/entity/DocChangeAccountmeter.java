/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DOC_CHANGE_ACCOUNTMETER")
@NamedQueries({
    @NamedQuery(name = "DocChangeAccountmeter.findAll", query = "SELECT d FROM DocChangeAccountmeter d")})
public class DocChangeAccountmeter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int pos;
    @Basic(optional = false)
    @NotNull
    private int posadd;
    @Basic(optional = false)
    @NotNull
    private int state;
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
    @Column(name = "METER_HIDDEN")
    private Integer meterHidden;
    @Column(name = "METER_STATECODE")
    private Integer meterStatecode;
    @Column(name = "METERCODE_NEW")
    private Integer metercodeNew;
    @Column(name = "IS_CHANGE_SETUP_DATA")
    private Integer isChangeSetupData;
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
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocChangeAccountmeter() {
    }

    public DocChangeAccountmeter(Integer code) {
        this.code = code;
    }

    public DocChangeAccountmeter(Integer code, int pos, int posadd, int state) {
        this.code = code;
        this.pos = pos;
        this.posadd = posadd;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPosadd() {
        return posadd;
    }

    public void setPosadd(int posadd) {
        this.posadd = posadd;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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

    public Integer getMeterHidden() {
        return meterHidden;
    }

    public void setMeterHidden(Integer meterHidden) {
        this.meterHidden = meterHidden;
    }

    public Integer getMeterStatecode() {
        return meterStatecode;
    }

    public void setMeterStatecode(Integer meterStatecode) {
        this.meterStatecode = meterStatecode;
    }

    public Integer getMetercodeNew() {
        return metercodeNew;
    }

    public void setMetercodeNew(Integer metercodeNew) {
        this.metercodeNew = metercodeNew;
    }

    public Integer getIsChangeSetupData() {
        return isChangeSetupData;
    }

    public void setIsChangeSetupData(Integer isChangeSetupData) {
        this.isChangeSetupData = isChangeSetupData;
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
        if (!(object instanceof DocChangeAccountmeter)) {
            return false;
        }
        DocChangeAccountmeter other = (DocChangeAccountmeter) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocChangeAccountmeter[ code=" + code + " ]";
    }
    
}
