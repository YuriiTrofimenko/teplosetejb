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
@Table(name = "H_ACCOUNT_DOGOVOR_PAY_PART")
@NamedQueries({
    @NamedQuery(name = "HAccountDogovorPayPart.findAll", query = "SELECT h FROM HAccountDogovorPayPart h")})
public class HAccountDogovorPayPart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCOUNT_DOGOVOR_PAY_PART_CODE")
    private int accountDogovorPayPartCode;
    private Integer firmcode;
    private Integer saldokind;
    @Column(name = "ACCOUNT_CODE")
    private BigInteger accountCode;
    @Column(name = "FLAT_ATTITUDE_CODE")
    private Integer flatAttitudeCode;
    private BigInteger rversion;
    private Integer doccode;
    private Integer docpos;
    @Size(max = 128)
    private String remark;
    @Size(max = 128)
    private String fio;
    @Column(name = "DOGOVOR_DATE")
    @Temporal(TemporalType.DATE)
    private Date dogovorDate;
    @Size(max = 16)
    @Column(name = "DOGOVOR_NUMBER")
    private String dogovorNumber;
    @Column(name = "BEGIN_DATE")
    @Temporal(TemporalType.DATE)
    private Date beginDate;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name = "BEGIN_DATE_PAY")
    @Temporal(TemporalType.DATE)
    private Date beginDatePay;
    @Column(name = "END_DATE_PAY")
    @Temporal(TemporalType.DATE)
    private Date endDatePay;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PAY_PART_PERCENT")
    private BigDecimal payPartPercent;
    private Integer service;
    private Integer hidden;

    public HAccountDogovorPayPart() {
    }

    public HAccountDogovorPayPart(Integer code) {
        this.code = code;
    }

    public HAccountDogovorPayPart(Integer code, int accountDogovorPayPartCode) {
        this.code = code;
        this.accountDogovorPayPartCode = accountDogovorPayPartCode;
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

    public int getAccountDogovorPayPartCode() {
        return accountDogovorPayPartCode;
    }

    public void setAccountDogovorPayPartCode(int accountDogovorPayPartCode) {
        this.accountDogovorPayPartCode = accountDogovorPayPartCode;
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

    public BigInteger getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(BigInteger accountCode) {
        this.accountCode = accountCode;
    }

    public Integer getFlatAttitudeCode() {
        return flatAttitudeCode;
    }

    public void setFlatAttitudeCode(Integer flatAttitudeCode) {
        this.flatAttitudeCode = flatAttitudeCode;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getDogovorDate() {
        return dogovorDate;
    }

    public void setDogovorDate(Date dogovorDate) {
        this.dogovorDate = dogovorDate;
    }

    public String getDogovorNumber() {
        return dogovorNumber;
    }

    public void setDogovorNumber(String dogovorNumber) {
        this.dogovorNumber = dogovorNumber;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getBeginDatePay() {
        return beginDatePay;
    }

    public void setBeginDatePay(Date beginDatePay) {
        this.beginDatePay = beginDatePay;
    }

    public Date getEndDatePay() {
        return endDatePay;
    }

    public void setEndDatePay(Date endDatePay) {
        this.endDatePay = endDatePay;
    }

    public BigDecimal getPayPartPercent() {
        return payPartPercent;
    }

    public void setPayPartPercent(BigDecimal payPartPercent) {
        this.payPartPercent = payPartPercent;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
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
        if (!(object instanceof HAccountDogovorPayPart)) {
            return false;
        }
        HAccountDogovorPayPart other = (HAccountDogovorPayPart) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HAccountDogovorPayPart[ code=" + code + " ]";
    }
    
}
