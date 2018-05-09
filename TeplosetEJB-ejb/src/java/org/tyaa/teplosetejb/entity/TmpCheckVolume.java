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
@Table(name = "TMP_CHECK_VOLUME")
@NamedQueries({
    @NamedQuery(name = "TmpCheckVolume.findAll", query = "SELECT t FROM TmpCheckVolume t")})
public class TmpCheckVolume implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OBJECT_CODE")
    private Long objectCode;
    @Size(max = 16)
    @Column(name = "OBJECT_SHIFR")
    private String objectShifr;
    @Size(max = 128)
    @Column(name = "OBJECT_NAME")
    private String objectName;
    @Size(max = 128)
    @Column(name = "OBJECT_ADDRESS")
    private String objectAddress;
    private Integer tt;
    @Column(name = "PAY_SUMM_PREV")
    private Integer paySummPrev;
    @Column(name = "PAY_SUMM")
    private Integer paySumm;
    private Integer volume;
    @Column(name = "BEGIN_VALUE")
    private Integer beginValue;
    @Column(name = "END_VALUE")
    private Integer endValue;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NEW_BEGINVALUE")
    private BigDecimal newBeginvalue;
    @Column(name = "NEW_ADD_VOLUME")
    private BigDecimal newAddVolume;
    @Temporal(TemporalType.DATE)
    private Date checkdate;
    @Column(name = "H_DOCKIND")
    private Integer hDockind;
    private Integer doccode;
    private Integer docpos;
    @Column(name = "CALC_DATEFROM")
    @Temporal(TemporalType.DATE)
    private Date calcDatefrom;
    @Column(name = "CALC_DATETILL")
    @Temporal(TemporalType.DATE)
    private Date calcDatetill;
    @Column(name = "IS_ADD_VOLUME")
    private Integer isAddVolume;
    @Column(name = "H_DOCDATE")
    @Temporal(TemporalType.DATE)
    private Date hDocdate;
    @Column(name = "H_DOCDATE1")
    @Temporal(TemporalType.DATE)
    private Date hDocdate1;
    @Size(max = 32)
    @Column(name = "H_DOCNUMBER")
    private String hDocnumber;
    @Column(name = "H_LASTUSERCHANGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hLastuserchange;
    @Column(name = "H_SYSTEMUSER")
    private Integer hSystemuser;
    @Size(max = 128)
    @Column(name = "USER_NAME")
    private String userName;
    @Size(max = 128)
    @Column(name = "H_REMARK")
    private String hRemark;
    private Integer metervaluecode;
    @Column(name = "PIPE_LEVEL")
    private Integer pipeLevel;

    public TmpCheckVolume() {
    }

    public TmpCheckVolume(Long objectCode) {
        this.objectCode = objectCode;
    }

    public Long getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(Long objectCode) {
        this.objectCode = objectCode;
    }

    public String getObjectShifr() {
        return objectShifr;
    }

    public void setObjectShifr(String objectShifr) {
        this.objectShifr = objectShifr;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectAddress() {
        return objectAddress;
    }

    public void setObjectAddress(String objectAddress) {
        this.objectAddress = objectAddress;
    }

    public Integer getTt() {
        return tt;
    }

    public void setTt(Integer tt) {
        this.tt = tt;
    }

    public Integer getPaySummPrev() {
        return paySummPrev;
    }

    public void setPaySummPrev(Integer paySummPrev) {
        this.paySummPrev = paySummPrev;
    }

    public Integer getPaySumm() {
        return paySumm;
    }

    public void setPaySumm(Integer paySumm) {
        this.paySumm = paySumm;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getBeginValue() {
        return beginValue;
    }

    public void setBeginValue(Integer beginValue) {
        this.beginValue = beginValue;
    }

    public Integer getEndValue() {
        return endValue;
    }

    public void setEndValue(Integer endValue) {
        this.endValue = endValue;
    }

    public BigDecimal getNewBeginvalue() {
        return newBeginvalue;
    }

    public void setNewBeginvalue(BigDecimal newBeginvalue) {
        this.newBeginvalue = newBeginvalue;
    }

    public BigDecimal getNewAddVolume() {
        return newAddVolume;
    }

    public void setNewAddVolume(BigDecimal newAddVolume) {
        this.newAddVolume = newAddVolume;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Integer getHDockind() {
        return hDockind;
    }

    public void setHDockind(Integer hDockind) {
        this.hDockind = hDockind;
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

    public Integer getIsAddVolume() {
        return isAddVolume;
    }

    public void setIsAddVolume(Integer isAddVolume) {
        this.isAddVolume = isAddVolume;
    }

    public Date getHDocdate() {
        return hDocdate;
    }

    public void setHDocdate(Date hDocdate) {
        this.hDocdate = hDocdate;
    }

    public Date getHDocdate1() {
        return hDocdate1;
    }

    public void setHDocdate1(Date hDocdate1) {
        this.hDocdate1 = hDocdate1;
    }

    public String getHDocnumber() {
        return hDocnumber;
    }

    public void setHDocnumber(String hDocnumber) {
        this.hDocnumber = hDocnumber;
    }

    public Date getHLastuserchange() {
        return hLastuserchange;
    }

    public void setHLastuserchange(Date hLastuserchange) {
        this.hLastuserchange = hLastuserchange;
    }

    public Integer getHSystemuser() {
        return hSystemuser;
    }

    public void setHSystemuser(Integer hSystemuser) {
        this.hSystemuser = hSystemuser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHRemark() {
        return hRemark;
    }

    public void setHRemark(String hRemark) {
        this.hRemark = hRemark;
    }

    public Integer getMetervaluecode() {
        return metervaluecode;
    }

    public void setMetervaluecode(Integer metervaluecode) {
        this.metervaluecode = metervaluecode;
    }

    public Integer getPipeLevel() {
        return pipeLevel;
    }

    public void setPipeLevel(Integer pipeLevel) {
        this.pipeLevel = pipeLevel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objectCode != null ? objectCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TmpCheckVolume)) {
            return false;
        }
        TmpCheckVolume other = (TmpCheckVolume) object;
        if ((this.objectCode == null && other.objectCode != null) || (this.objectCode != null && !this.objectCode.equals(other.objectCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.TmpCheckVolume[ objectCode=" + objectCode + " ]";
    }
    
}
