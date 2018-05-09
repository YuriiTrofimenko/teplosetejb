/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Embeddable
public class SprUszntarifPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "TAR_CODE")
    private int tarCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TAR_DATEB")
    @Temporal(TemporalType.DATE)
    private Date tarDateb;
    @Basic(optional = false)
    @NotNull
    private int codern;

    public SprUszntarifPK() {
    }

    public SprUszntarifPK(int tarCode, Date tarDateb, int codern) {
        this.tarCode = tarCode;
        this.tarDateb = tarDateb;
        this.codern = codern;
    }

    public int getTarCode() {
        return tarCode;
    }

    public void setTarCode(int tarCode) {
        this.tarCode = tarCode;
    }

    public Date getTarDateb() {
        return tarDateb;
    }

    public void setTarDateb(Date tarDateb) {
        this.tarDateb = tarDateb;
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
        hash += (int) tarCode;
        hash += (tarDateb != null ? tarDateb.hashCode() : 0);
        hash += (int) codern;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprUszntarifPK)) {
            return false;
        }
        SprUszntarifPK other = (SprUszntarifPK) object;
        if (this.tarCode != other.tarCode) {
            return false;
        }
        if ((this.tarDateb == null && other.tarDateb != null) || (this.tarDateb != null && !this.tarDateb.equals(other.tarDateb))) {
            return false;
        }
        if (this.codern != other.codern) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprUszntarifPK[ tarCode=" + tarCode + ", tarDateb=" + tarDateb + ", codern=" + codern + " ]";
    }
    
}
