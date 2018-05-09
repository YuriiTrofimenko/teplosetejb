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

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "CALC_PERIOD_SOURCE_EXCLUDE")
@NamedQueries({
    @NamedQuery(name = "CalcPeriodSourceExclude.findAll", query = "SELECT c FROM CalcPeriodSourceExclude c")})
public class CalcPeriodSourceExclude implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int formnachcode;
    private Integer service;
    @Basic(optional = false)
    @NotNull
    private int procdatefrom;
    private Integer procdatetill;
    @Column(name = "PERIOD_SOURCECODE")
    private Integer periodSourcecode;

    public CalcPeriodSourceExclude() {
    }

    public CalcPeriodSourceExclude(Integer code) {
        this.code = code;
    }

    public CalcPeriodSourceExclude(Integer code, int formnachcode, int procdatefrom) {
        this.code = code;
        this.formnachcode = formnachcode;
        this.procdatefrom = procdatefrom;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getFormnachcode() {
        return formnachcode;
    }

    public void setFormnachcode(int formnachcode) {
        this.formnachcode = formnachcode;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public int getProcdatefrom() {
        return procdatefrom;
    }

    public void setProcdatefrom(int procdatefrom) {
        this.procdatefrom = procdatefrom;
    }

    public Integer getProcdatetill() {
        return procdatetill;
    }

    public void setProcdatetill(Integer procdatetill) {
        this.procdatetill = procdatetill;
    }

    public Integer getPeriodSourcecode() {
        return periodSourcecode;
    }

    public void setPeriodSourcecode(Integer periodSourcecode) {
        this.periodSourcecode = periodSourcecode;
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
        if (!(object instanceof CalcPeriodSourceExclude)) {
            return false;
        }
        CalcPeriodSourceExclude other = (CalcPeriodSourceExclude) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.CalcPeriodSourceExclude[ code=" + code + " ]";
    }
    
}
