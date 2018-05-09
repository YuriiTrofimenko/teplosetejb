/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TPS_SPISOK_SUBS")
@NamedQueries({
    @NamedQuery(name = "TpsSpisokSubs.findAll", query = "SELECT t FROM TpsSpisokSubs t")})
public class TpsSpisokSubs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "ACCOUNT_CODE")
    private BigInteger accountCode;
    @Size(max = 48)
    @Column(name = "ACCOUNT_CHAR")
    private String accountChar;
    @Size(max = 128)
    private String fio;
    @Size(max = 48)
    @Column(name = "UL_TYPE")
    private String ulType;
    @Size(max = 128)
    @Column(name = "UL_NAME")
    private String ulName;
    @Size(max = 48)
    private String dom;
    @Size(max = 48)
    private String kvart;
    @Size(max = 48)
    private String inn;

    public TpsSpisokSubs() {
    }

    public TpsSpisokSubs(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BigInteger getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(BigInteger accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountChar() {
        return accountChar;
    }

    public void setAccountChar(String accountChar) {
        this.accountChar = accountChar;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getUlType() {
        return ulType;
    }

    public void setUlType(String ulType) {
        this.ulType = ulType;
    }

    public String getUlName() {
        return ulName;
    }

    public void setUlName(String ulName) {
        this.ulName = ulName;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getKvart() {
        return kvart;
    }

    public void setKvart(String kvart) {
        this.kvart = kvart;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
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
        if (!(object instanceof TpsSpisokSubs)) {
            return false;
        }
        TpsSpisokSubs other = (TpsSpisokSubs) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.TpsSpisokSubs[ code=" + code + " ]";
    }
    
}
