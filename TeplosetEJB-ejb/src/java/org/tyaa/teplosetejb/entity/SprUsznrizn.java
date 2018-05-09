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
@Table(name = "SPR_USZNRIZN")
@NamedQueries({
    @NamedQuery(name = "SprUsznrizn.findAll", query = "SELECT s FROM SprUsznrizn s")})
public class SprUsznrizn implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SprUsznriznPK sprUsznriznPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RIZN_CDPOS")
    private int riznCdpos;
    @Size(max = 256)
    @Column(name = "RIZN_NAME")
    private String riznName;
    @Column(name = "RIZN_LICH")
    private Integer riznLich;
    @Column(name = "RIZN_TO")
    private Integer riznTo;
    @Column(name = "RIZN_TP")
    private Integer riznTp;

    public SprUsznrizn() {
    }

    public SprUsznrizn(SprUsznriznPK sprUsznriznPK) {
        this.sprUsznriznPK = sprUsznriznPK;
    }

    public SprUsznrizn(SprUsznriznPK sprUsznriznPK, int riznCdpos) {
        this.sprUsznriznPK = sprUsznriznPK;
        this.riznCdpos = riznCdpos;
    }

    public SprUsznrizn(int riznCode, int codern) {
        this.sprUsznriznPK = new SprUsznriznPK(riznCode, codern);
    }

    public SprUsznriznPK getSprUsznriznPK() {
        return sprUsznriznPK;
    }

    public void setSprUsznriznPK(SprUsznriznPK sprUsznriznPK) {
        this.sprUsznriznPK = sprUsznriznPK;
    }

    public int getRiznCdpos() {
        return riznCdpos;
    }

    public void setRiznCdpos(int riznCdpos) {
        this.riznCdpos = riznCdpos;
    }

    public String getRiznName() {
        return riznName;
    }

    public void setRiznName(String riznName) {
        this.riznName = riznName;
    }

    public Integer getRiznLich() {
        return riznLich;
    }

    public void setRiznLich(Integer riznLich) {
        this.riznLich = riznLich;
    }

    public Integer getRiznTo() {
        return riznTo;
    }

    public void setRiznTo(Integer riznTo) {
        this.riznTo = riznTo;
    }

    public Integer getRiznTp() {
        return riznTp;
    }

    public void setRiznTp(Integer riznTp) {
        this.riznTp = riznTp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sprUsznriznPK != null ? sprUsznriznPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprUsznrizn)) {
            return false;
        }
        SprUsznrizn other = (SprUsznrizn) object;
        if ((this.sprUsznriznPK == null && other.sprUsznriznPK != null) || (this.sprUsznriznPK != null && !this.sprUsznriznPK.equals(other.sprUsznriznPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprUsznrizn[ sprUsznriznPK=" + sprUsznriznPK + " ]";
    }
    
}
