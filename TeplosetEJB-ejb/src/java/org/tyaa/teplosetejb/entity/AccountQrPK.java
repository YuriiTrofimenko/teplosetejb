/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Embeddable
public class AccountQrPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    private long accountcode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QR_ALGORITM")
    private int qrAlgoritm;

    public AccountQrPK() {
    }

    public AccountQrPK(long accountcode, int qrAlgoritm) {
        this.accountcode = accountcode;
        this.qrAlgoritm = qrAlgoritm;
    }

    public long getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(long accountcode) {
        this.accountcode = accountcode;
    }

    public int getQrAlgoritm() {
        return qrAlgoritm;
    }

    public void setQrAlgoritm(int qrAlgoritm) {
        this.qrAlgoritm = qrAlgoritm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) accountcode;
        hash += (int) qrAlgoritm;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountQrPK)) {
            return false;
        }
        AccountQrPK other = (AccountQrPK) object;
        if (this.accountcode != other.accountcode) {
            return false;
        }
        if (this.qrAlgoritm != other.qrAlgoritm) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.AccountQrPK[ accountcode=" + accountcode + ", qrAlgoritm=" + qrAlgoritm + " ]";
    }
    
}
