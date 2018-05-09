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
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "SPR_USZNLINKSTREET")
@NamedQueries({
    @NamedQuery(name = "SprUsznlinkstreet.findAll", query = "SELECT s FROM SprUsznlinkstreet s")})
public class SprUsznlinkstreet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KL_CODERN")
    private int klCodern;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KL_CODEUL")
    private int klCodeul;
    private Integer street;
    @Column(name = "KL_CODEKUL")
    private Integer klCodekul;
    @Column(name = "IS_NOT_EXISTS")
    private Integer isNotExists;
    @Size(max = 128)
    private String remark;

    public SprUsznlinkstreet() {
    }

    public SprUsznlinkstreet(Integer code) {
        this.code = code;
    }

    public SprUsznlinkstreet(Integer code, int klCodern, int klCodeul) {
        this.code = code;
        this.klCodern = klCodern;
        this.klCodeul = klCodeul;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getKlCodern() {
        return klCodern;
    }

    public void setKlCodern(int klCodern) {
        this.klCodern = klCodern;
    }

    public int getKlCodeul() {
        return klCodeul;
    }

    public void setKlCodeul(int klCodeul) {
        this.klCodeul = klCodeul;
    }

    public Integer getStreet() {
        return street;
    }

    public void setStreet(Integer street) {
        this.street = street;
    }

    public Integer getKlCodekul() {
        return klCodekul;
    }

    public void setKlCodekul(Integer klCodekul) {
        this.klCodekul = klCodekul;
    }

    public Integer getIsNotExists() {
        return isNotExists;
    }

    public void setIsNotExists(Integer isNotExists) {
        this.isNotExists = isNotExists;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        if (!(object instanceof SprUsznlinkstreet)) {
            return false;
        }
        SprUsznlinkstreet other = (SprUsznlinkstreet) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprUsznlinkstreet[ code=" + code + " ]";
    }
    
}
