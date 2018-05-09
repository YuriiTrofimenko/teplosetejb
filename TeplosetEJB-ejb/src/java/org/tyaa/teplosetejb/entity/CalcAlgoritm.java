/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "CALC_ALGORITM")
@NamedQueries({
    @NamedQuery(name = "CalcAlgoritm.findAll", query = "SELECT c FROM CalcAlgoritm c")})
public class CalcAlgoritm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int service;
    private Integer formnach;
    private Integer calctype;
    private Integer algoritm;

    public CalcAlgoritm() {
    }

    public CalcAlgoritm(Integer code) {
        this.code = code;
    }

    public CalcAlgoritm(Integer code, int service) {
        this.code = code;
        this.service = service;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getCalctype() {
        return calctype;
    }

    public void setCalctype(Integer calctype) {
        this.calctype = calctype;
    }

    public Integer getAlgoritm() {
        return algoritm;
    }

    public void setAlgoritm(Integer algoritm) {
        this.algoritm = algoritm;
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
        if (!(object instanceof CalcAlgoritm)) {
            return false;
        }
        CalcAlgoritm other = (CalcAlgoritm) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.CalcAlgoritm[ code=" + code + " ]";
    }
    
}
