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
@Table(name = "SPR_USZNLGOTA")
@NamedQueries({
    @NamedQuery(name = "SprUsznlgota.findAll", query = "SELECT s FROM SprUsznlgota s")})
public class SprUsznlgota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "KLPLG_CODE")
    private Integer klplgCode;
    @Size(max = 128)
    @Column(name = "KLPLG_NAME")
    private String klplgName;
    @Column(name = "KLPLG_LCD")
    private Integer klplgLcd;
    @Size(max = 256)
    @Column(name = "KLPLG_STAT")
    private String klplgStat;

    public SprUsznlgota() {
    }

    public SprUsznlgota(Integer klplgCode) {
        this.klplgCode = klplgCode;
    }

    public Integer getKlplgCode() {
        return klplgCode;
    }

    public void setKlplgCode(Integer klplgCode) {
        this.klplgCode = klplgCode;
    }

    public String getKlplgName() {
        return klplgName;
    }

    public void setKlplgName(String klplgName) {
        this.klplgName = klplgName;
    }

    public Integer getKlplgLcd() {
        return klplgLcd;
    }

    public void setKlplgLcd(Integer klplgLcd) {
        this.klplgLcd = klplgLcd;
    }

    public String getKlplgStat() {
        return klplgStat;
    }

    public void setKlplgStat(String klplgStat) {
        this.klplgStat = klplgStat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (klplgCode != null ? klplgCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprUsznlgota)) {
            return false;
        }
        SprUsznlgota other = (SprUsznlgota) object;
        if ((this.klplgCode == null && other.klplgCode != null) || (this.klplgCode != null && !this.klplgCode.equals(other.klplgCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprUsznlgota[ klplgCode=" + klplgCode + " ]";
    }
    
}
