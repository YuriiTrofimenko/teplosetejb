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
public class SprUsznriznPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "RIZN_CODE")
    private int riznCode;
    @Basic(optional = false)
    @NotNull
    private int codern;

    public SprUsznriznPK() {
    }

    public SprUsznriznPK(int riznCode, int codern) {
        this.riznCode = riznCode;
        this.codern = codern;
    }

    public int getRiznCode() {
        return riznCode;
    }

    public void setRiznCode(int riznCode) {
        this.riznCode = riznCode;
    }

    public int getCodern() {
        return codern;
    }

    public void setCodern(int codern) {
        this.codern = codern;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) riznCode;
        hash += (int) codern;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprUsznriznPK)) {
            return false;
        }
        SprUsznriznPK other = (SprUsznriznPK) object;
        if (this.riznCode != other.riznCode) {
            return false;
        }
        if (this.codern != other.codern) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprUsznriznPK[ riznCode=" + riznCode + ", codern=" + codern + " ]";
    }
    
}
