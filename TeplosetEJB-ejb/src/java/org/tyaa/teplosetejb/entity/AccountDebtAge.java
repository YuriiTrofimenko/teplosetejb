/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "ACCOUNT_DEBT_AGE")
@NamedQueries({
    @NamedQuery(name = "AccountDebtAge.findAll", query = "SELECT a FROM AccountDebtAge a")})
public class AccountDebtAge implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    private int firmcode;
    @Basic(optional = false)
    @NotNull
    private int saldokind;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Basic(optional = false)
    @NotNull
    private int algoritm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBT_SUMM")
    private BigDecimal debtSumm;
    private Integer age;
    @Column(name = "IS_EQUAL")
    private Integer isEqual;
    @Column(name = "EXACT_EQUALITY")
    private Integer exactEquality;

    public AccountDebtAge() {
    }

    public AccountDebtAge(Integer code) {
        this.code = code;
    }

    public AccountDebtAge(Integer code, long accountcode, int firmcode, int saldokind, int procdate, int algoritm) {
        this.code = code;
        this.accountcode = accountcode;
        this.firmcode = firmcode;
        this.saldokind = saldokind;
        this.procdate = procdate;
        this.algoritm = algoritm;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public long getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(long accountcode) {
        this.accountcode = accountcode;
    }

    public int getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(int firmcode) {
        this.firmcode = firmcode;
    }

    public int getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(int saldokind) {
        this.saldokind = saldokind;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public int getAlgoritm() {
        return algoritm;
    }

    public void setAlgoritm(int algoritm) {
        this.algoritm = algoritm;
    }

    public BigDecimal getDebtSumm() {
        return debtSumm;
    }

    public void setDebtSumm(BigDecimal debtSumm) {
        this.debtSumm = debtSumm;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIsEqual() {
        return isEqual;
    }

    public void setIsEqual(Integer isEqual) {
        this.isEqual = isEqual;
    }

    public Integer getExactEquality() {
        return exactEquality;
    }

    public void setExactEquality(Integer exactEquality) {
        this.exactEquality = exactEquality;
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
        if (!(object instanceof AccountDebtAge)) {
            return false;
        }
        AccountDebtAge other = (AccountDebtAge) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.AccountDebtAge[ code=" + code + " ]";
    }
    
}
