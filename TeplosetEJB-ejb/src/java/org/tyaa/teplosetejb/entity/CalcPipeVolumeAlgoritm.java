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
@Table(name = "CALC_PIPE_VOLUME_ALGORITM")
@NamedQueries({
    @NamedQuery(name = "CalcPipeVolumeAlgoritm.findAll", query = "SELECT c FROM CalcPipeVolumeAlgoritm c")})
public class CalcPipeVolumeAlgoritm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int service;
    @Basic(optional = false)
    @NotNull
    private int procdatefrom;
    private Integer procdatetill;
    private Integer algoritm;

    public CalcPipeVolumeAlgoritm() {
    }

    public CalcPipeVolumeAlgoritm(Integer code) {
        this.code = code;
    }

    public CalcPipeVolumeAlgoritm(Integer code, int service, int procdatefrom) {
        this.code = code;
        this.service = service;
        this.procdatefrom = procdatefrom;
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
        if (!(object instanceof CalcPipeVolumeAlgoritm)) {
            return false;
        }
        CalcPipeVolumeAlgoritm other = (CalcPipeVolumeAlgoritm) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.CalcPipeVolumeAlgoritm[ code=" + code + " ]";
    }
    
}
