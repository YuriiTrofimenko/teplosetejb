/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
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
@Table(name = "ACCOUNT_LOCK")
@NamedQueries({
    @NamedQuery(name = "AccountLock.findAll", query = "SELECT a FROM AccountLock a")})
public class AccountLock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCOUNT_CODE")
    private Long accountCode;
    @Column(name = "IS_LOCK")
    private Integer isLock;

    public AccountLock() {
    }

    public AccountLock(Long accountCode) {
        this.accountCode = accountCode;
    }

    public Long getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(Long accountCode) {
        this.accountCode = accountCode;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountCode != null ? accountCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountLock)) {
            return false;
        }
        AccountLock other = (AccountLock) object;
        if ((this.accountCode == null && other.accountCode != null) || (this.accountCode != null && !this.accountCode.equals(other.accountCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.AccountLock[ accountCode=" + accountCode + " ]";
    }
    
}
