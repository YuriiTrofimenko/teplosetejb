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
@Table(name = "CALC_PP_ACCOUNT_TEMP")
@NamedQueries({
    @NamedQuery(name = "CalcPpAccountTemp.findAll", query = "SELECT c FROM CalcPpAccountTemp c")})
public class CalcPpAccountTemp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCOUNT_CODE")
    private Long accountCode;

    public CalcPpAccountTemp() {
    }

    public CalcPpAccountTemp(Long accountCode) {
        this.accountCode = accountCode;
    }

    public Long getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(Long accountCode) {
        this.accountCode = accountCode;
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
        if (!(object instanceof CalcPpAccountTemp)) {
            return false;
        }
        CalcPpAccountTemp other = (CalcPpAccountTemp) object;
        if ((this.accountCode == null && other.accountCode != null) || (this.accountCode != null && !this.accountCode.equals(other.accountCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.CalcPpAccountTemp[ accountCode=" + accountCode + " ]";
    }
    
}
