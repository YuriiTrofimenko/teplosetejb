/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "ACCOUNT_QR")
@NamedQueries({
    @NamedQuery(name = "AccountQr.findAll", query = "SELECT a FROM AccountQr a")})
public class AccountQr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccountQrPK accountQrPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String accountshifr;
    @Lob
    @Column(name = "ACCOUNT_QR_CODE")
    private byte[] accountQrCode;

    public AccountQr() {
    }

    public AccountQr(AccountQrPK accountQrPK) {
        this.accountQrPK = accountQrPK;
    }

    public AccountQr(AccountQrPK accountQrPK, String accountshifr) {
        this.accountQrPK = accountQrPK;
        this.accountshifr = accountshifr;
    }

    public AccountQr(long accountcode, int qrAlgoritm) {
        this.accountQrPK = new AccountQrPK(accountcode, qrAlgoritm);
    }

    public AccountQrPK getAccountQrPK() {
        return accountQrPK;
    }

    public void setAccountQrPK(AccountQrPK accountQrPK) {
        this.accountQrPK = accountQrPK;
    }

    public String getAccountshifr() {
        return accountshifr;
    }

    public void setAccountshifr(String accountshifr) {
        this.accountshifr = accountshifr;
    }

    public byte[] getAccountQrCode() {
        return accountQrCode;
    }

    public void setAccountQrCode(byte[] accountQrCode) {
        this.accountQrCode = accountQrCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountQrPK != null ? accountQrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountQr)) {
            return false;
        }
        AccountQr other = (AccountQr) object;
        if ((this.accountQrPK == null && other.accountQrPK != null) || (this.accountQrPK != null && !this.accountQrPK.equals(other.accountQrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.AccountQr[ accountQrPK=" + accountQrPK + " ]";
    }
    
}
