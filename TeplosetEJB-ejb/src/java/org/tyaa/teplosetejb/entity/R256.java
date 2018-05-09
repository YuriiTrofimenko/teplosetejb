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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "R256.findAll", query = "SELECT r FROM R256 r")})
public class R256 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "R256_KIND")
    private Integer r256Kind;
    @Basic(optional = false)
    @NotNull
    private int firmcode;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Column(name = "GROUP_SERVICE_CODE")
    private Integer groupServiceCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCOUNT_CODE")
    private long accountCode;
    @Size(max = 16)
    private String inn;
    @Size(max = 128)
    private String fio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal k3;
    private BigDecimal k4;
    private BigDecimal k5;
    private BigDecimal k6;
    private BigDecimal k7;
    private BigDecimal k8;
    private BigDecimal k9;
    private BigDecimal k10;
    private BigDecimal k11;

    public R256() {
    }

    public R256(Integer code) {
        this.code = code;
    }

    public R256(Integer code, int firmcode, int procdate, long accountCode) {
        this.code = code;
        this.firmcode = firmcode;
        this.procdate = procdate;
        this.accountCode = accountCode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getR256Kind() {
        return r256Kind;
    }

    public void setR256Kind(Integer r256Kind) {
        this.r256Kind = r256Kind;
    }

    public int getFirmcode() {
        return firmcode;
    }

    public void setFirmcode(int firmcode) {
        this.firmcode = firmcode;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public Integer getGroupServiceCode() {
        return groupServiceCode;
    }

    public void setGroupServiceCode(Integer groupServiceCode) {
        this.groupServiceCode = groupServiceCode;
    }

    public long getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(long accountCode) {
        this.accountCode = accountCode;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public BigDecimal getK3() {
        return k3;
    }

    public void setK3(BigDecimal k3) {
        this.k3 = k3;
    }

    public BigDecimal getK4() {
        return k4;
    }

    public void setK4(BigDecimal k4) {
        this.k4 = k4;
    }

    public BigDecimal getK5() {
        return k5;
    }

    public void setK5(BigDecimal k5) {
        this.k5 = k5;
    }

    public BigDecimal getK6() {
        return k6;
    }

    public void setK6(BigDecimal k6) {
        this.k6 = k6;
    }

    public BigDecimal getK7() {
        return k7;
    }

    public void setK7(BigDecimal k7) {
        this.k7 = k7;
    }

    public BigDecimal getK8() {
        return k8;
    }

    public void setK8(BigDecimal k8) {
        this.k8 = k8;
    }

    public BigDecimal getK9() {
        return k9;
    }

    public void setK9(BigDecimal k9) {
        this.k9 = k9;
    }

    public BigDecimal getK10() {
        return k10;
    }

    public void setK10(BigDecimal k10) {
        this.k10 = k10;
    }

    public BigDecimal getK11() {
        return k11;
    }

    public void setK11(BigDecimal k11) {
        this.k11 = k11;
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
        if (!(object instanceof R256)) {
            return false;
        }
        R256 other = (R256) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.R256[ code=" + code + " ]";
    }
    
}
