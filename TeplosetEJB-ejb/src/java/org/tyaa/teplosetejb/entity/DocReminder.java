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
@Table(name = "DOC_REMINDER")
@NamedQueries({
    @NamedQuery(name = "DocReminder.findAll", query = "SELECT d FROM DocReminder d")})
public class DocReminder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "ACCOUNT_CODE")
    private BigInteger accountCode;
    @Size(max = 128)
    private String remark;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "REMINDER_SUMM")
    private BigDecimal reminderSumm;
    @Column(name = "REMINDER_DATE")
    @Temporal(TemporalType.DATE)
    private Date reminderDate;
    @Column(name = "INFLATION_SUMM")
    private BigDecimal inflationSumm;
    @Column(name = "NBU_SUMM")
    private BigDecimal nbuSumm;
    @Column(name = "MONTH_START_DOLG")
    private Integer monthStartDolg;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocReminder() {
    }

    public DocReminder(Integer code) {
        this.code = code;
    }

    public DocReminder(Integer code, int state) {
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

    public BigInteger getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(BigInteger accountCode) {
        this.accountCode = accountCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getReminderSumm() {
        return reminderSumm;
    }

    public void setReminderSumm(BigDecimal reminderSumm) {
        this.reminderSumm = reminderSumm;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }

    public BigDecimal getInflationSumm() {
        return inflationSumm;
    }

    public void setInflationSumm(BigDecimal inflationSumm) {
        this.inflationSumm = inflationSumm;
    }

    public BigDecimal getNbuSumm() {
        return nbuSumm;
    }

    public void setNbuSumm(BigDecimal nbuSumm) {
        this.nbuSumm = nbuSumm;
    }

    public Integer getMonthStartDolg() {
        return monthStartDolg;
    }

    public void setMonthStartDolg(Integer monthStartDolg) {
        this.monthStartDolg = monthStartDolg;
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
        if (!(object instanceof DocReminder)) {
            return false;
        }
        DocReminder other = (DocReminder) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocReminder[ code=" + code + " ]";
    }
    
}
