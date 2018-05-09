/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "SPR_USZNLINKRIZN")
@NamedQueries({
    @NamedQuery(name = "SprUsznlinkrizn.findAll", query = "SELECT s FROM SprUsznlinkrizn s")})
public class SprUsznlinkrizn implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SprUsznlinkriznPK sprUsznlinkriznPK;
    private Integer lgcode;

    public SprUsznlinkrizn() {
    }

    public SprUsznlinkrizn(SprUsznlinkriznPK sprUsznlinkriznPK) {
        this.sprUsznlinkriznPK = sprUsznlinkriznPK;
    }

    public SprUsznlinkrizn(int weal, int formnach, int codern, int rizn) {
        this.sprUsznlinkriznPK = new SprUsznlinkriznPK(weal, formnach, codern, rizn);
    }

    public SprUsznlinkriznPK getSprUsznlinkriznPK() {
        return sprUsznlinkriznPK;
    }

    public void setSprUsznlinkriznPK(SprUsznlinkriznPK sprUsznlinkriznPK) {
        this.sprUsznlinkriznPK = sprUsznlinkriznPK;
    }

    public Integer getLgcode() {
        return lgcode;
    }

    public void setLgcode(Integer lgcode) {
        this.lgcode = lgcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sprUsznlinkriznPK != null ? sprUsznlinkriznPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprUsznlinkrizn)) {
            return false;
        }
        SprUsznlinkrizn other = (SprUsznlinkrizn) object;
        if ((this.sprUsznlinkriznPK == null && other.sprUsznlinkriznPK != null) || (this.sprUsznlinkriznPK != null && !this.sprUsznlinkriznPK.equals(other.sprUsznlinkriznPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprUsznlinkrizn[ sprUsznlinkriznPK=" + sprUsznlinkriznPK + " ]";
    }
    
}
