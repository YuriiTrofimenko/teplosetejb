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
@Table(name = "H_ACCOUNT_DOG_RESTR")
@NamedQueries({
    @NamedQuery(name = "HAccountDogRestr.findAll", query = "SELECT h FROM HAccountDogRestr h")})
public class HAccountDogRestr implements Serializable {

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
    @Column(name = "ACCOUNT_DOG_RESTR_CODE")
    private int accountDogRestrCode;
    @Basic(optional = false)
    @NotNull
    private int saldokind;
    private Integer firmcode;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOG_RESTR_KIND")
    private int dogRestrKind;
    @Size(max = 128)
    private String fio;
    @Size(max = 16)
    private String inn;
    @Size(max = 16)
    @Column(name = "DOG_NUMBER")
    private String dogNumber;
    @Column(name = "DOG_DATE")
    @Temporal(TemporalType.DATE)
    private Date dogDate;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBT_SUMM")
    private BigDecimal debtSumm;
    @Column(name = "MONTH_SUMM")
    private BigDecimal monthSumm;
    @Size(max = 128)
    private String remark;
    private BigDecimal beginpaysumm;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;
    @Column(name = "MONTH_COUNT")
    private Integer monthCount;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 48)
    private String phone;
    @Column(name = "BEFORE_ENDDATE")
    @Temporal(TemporalType.DATE)
    private Date beforeEnddate;
    @Column(name = "BEFORE_END_CODE")
    private Integer beforeEndCode;

    public HAccountDogRestr() {
    }

    public HAccountDogRestr(Integer code) {
        this.code = code;
    }

    public HAccountDogRestr(Integer code, int accountDogRestrCode, int saldokind, long accountcode, int procdate, int dogRestrKind) {
        this.code = code;
        this.accountDogRestrCode = accountDogRestrCode;
        this.saldokind = saldokind;
        this.accountcode = accountcode;
        this.procdate = procdate;
        this.dogRestrKind = dogRestrKind;
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

    public int getAccountDogRestrCode() {
        return accountDogRestrCode;
    }

    public void setAccountDogRestrCode(int accountDogRestrCode) {
        this.accountDogRestrCode = accountDogRestrCode;
    }

    public int getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(int saldokind) {
        this.saldokind = saldokind;
    }

    public Integer getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(Integer firmcode) {
        this.firmcode = firmcode;
    }

    public long getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(long accountcode) {
        this.accountcode = accountcode;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public int getDogRestrKind() {
        return dogRestrKind;
    }

    public void setDogRestrKind(int dogRestrKind) {
        this.dogRestrKind = dogRestrKind;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getDogNumber() {
        return dogNumber;
    }

    public void setDogNumber(String dogNumber) {
        this.dogNumber = dogNumber;
    }

    public Date getDogDate() {
        return dogDate;
    }

    public void setDogDate(Date dogDate) {
        this.dogDate = dogDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getDebtSumm() {
        return debtSumm;
    }

    public void setDebtSumm(BigDecimal debtSumm) {
        this.debtSumm = debtSumm;
    }

    public BigDecimal getMonthSumm() {
        return monthSumm;
    }

    public void setMonthSumm(BigDecimal monthSumm) {
        this.monthSumm = monthSumm;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getBeginpaysumm() {
        return beginpaysumm;
    }

    public void setBeginpaysumm(BigDecimal beginpaysumm) {
        this.beginpaysumm = beginpaysumm;
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

    public Integer getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(Integer monthCount) {
        this.monthCount = monthCount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBeforeEnddate() {
        return beforeEnddate;
    }

    public void setBeforeEnddate(Date beforeEnddate) {
        this.beforeEnddate = beforeEnddate;
    }

    public Integer getBeforeEndCode() {
        return beforeEndCode;
    }

    public void setBeforeEndCode(Integer beforeEndCode) {
        this.beforeEndCode = beforeEndCode;
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
        if (!(object instanceof HAccountDogRestr)) {
            return false;
        }
        HAccountDogRestr other = (HAccountDogRestr) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HAccountDogRestr[ code=" + code + " ]";
    }
    
}
