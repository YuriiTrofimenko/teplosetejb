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
public class RptTempBillPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "HOUSE_CODE")
    private int houseCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HOUSE_PIPE_CODE")
    private int housePipeCode;

    public RptTempBillPK() {
    }

    public RptTempBillPK(int houseCode, int housePipeCode) {
        this.houseCode = houseCode;
        this.housePipeCode = housePipeCode;
    }

    public int getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(int houseCode) {
        this.houseCode = houseCode;
    }

    public int getHousePipeCode() {
        return housePipeCode;
    }

    public void setHousePipeCode(int housePipeCode) {
        this.housePipeCode = housePipeCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) houseCode;
        hash += (int) housePipeCode;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RptTempBillPK)) {
            return false;
        }
        RptTempBillPK other = (RptTempBillPK) object;
        if (this.houseCode != other.houseCode) {
            return false;
        }
        if (this.housePipeCode != other.housePipeCode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.RptTempBillPK[ houseCode=" + houseCode + ", housePipeCode=" + housePipeCode + " ]";
    }
    
}
