/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "ACCOUNT_LGOTA_CALCPERIOD")
@NamedQueries({
    @NamedQuery(name = "AccountLgotaCalcperiod.findAll", query = "SELECT a FROM AccountLgotaCalcperiod a")})
public class AccountLgotaCalcperiod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private BigInteger pipecode;
    @Temporal(TemporalType.DATE)
    private Date datefrom;
    @Temporal(TemporalType.DATE)
    private Date datetill;
    @Temporal(TemporalType.DATE)
    private Date mincalcdate;
    private Integer docpos;
    private Integer doccode;

    public AccountLgotaCalcperiod() {
    }

    public AccountLgotaCalcperiod(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BigInteger getPipecode() {
        return pipecode;
    }

    public void setPipecode(BigInteger pipecode) {
        this.pipecode = pipecode;
    }

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDatetill() {
        return datetill;
    }

    public void setDatetill(Date datetill) {
        this.datetill = datetill;
    }

    public Date getMincalcdate() {
        return mincalcdate;
    }

    public void setMincalcdate(Date mincalcdate) {
        this.mincalcdate = mincalcdate;
    }

    public Integer getDocpos() {
        return docpos;
    }

    public void setDocpos(Integer docpos) {
        this.docpos = docpos;
    }

    public Integer getDoccode() {
        return doccode;
    }

    public void setDoccode(Integer doccode) {
        this.doccode = doccode;
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
        if (!(object instanceof AccountLgotaCalcperiod)) {
            return false;
        }
        AccountLgotaCalcperiod other = (AccountLgotaCalcperiod) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.AccountLgotaCalcperiod[ code=" + code + " ]";
    }
    
}
