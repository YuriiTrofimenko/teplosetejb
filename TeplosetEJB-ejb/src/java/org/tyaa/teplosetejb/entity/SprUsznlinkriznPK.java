/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Embeddable
public class SprUsznlinkriznPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    private int weal;
    @Basic(optional = false)
    @NotNull
    private int formnach;
    @Basic(optional = false)
    @NotNull
    private int codern;
    @Basic(optional = false)
    @NotNull
    private int rizn;

    public SprUsznlinkriznPK() {
    }

    public SprUsznlinkriznPK(int weal, int formnach, int codern, int rizn) {
        this.weal = weal;
        this.formnach = formnach;
        this.codern = codern;
        this.rizn = rizn;
    }

    public int getWeal() {
        return weal;
    }

    public void setWeal(int weal) {
        this.weal = weal;
    }

    public int getFormnach() {
        return formnach;
    }

    public void setFormnach(int formnach) {
        this.formnach = formnach;
    }

    public int getCodern() {
        return codern;
    }

    public void setCodern(int codern) {
        this.codern = codern;
    }

    public int getRizn() {
        return rizn;
    }

    public void setRizn(int rizn) {
        this.rizn = rizn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) weal;
        hash += (int) formnach;
        hash += (int) codern;
        hash += (int) rizn;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprUsznlinkriznPK)) {
            return false;
        }
        SprUsznlinkriznPK other = (SprUsznlinkriznPK) object;
        if (this.weal != other.weal) {
            return false;
        }
        if (this.formnach != other.formnach) {
            return false;
        }
        if (this.codern != other.codern) {
            return false;
        }
        if (this.rizn != other.rizn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprUsznlinkriznPK[ weal=" + weal + ", formnach=" + formnach + ", codern=" + codern + ", rizn=" + rizn + " ]";
    }
    
}
