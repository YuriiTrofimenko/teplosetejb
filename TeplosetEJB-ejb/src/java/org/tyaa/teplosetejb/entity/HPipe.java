/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "H_PIPE")
@NamedQueries({
    @NamedQuery(name = "HPipe.findAll", query = "SELECT h FROM HPipe h")})
public class HPipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Basic(optional = false)
    @NotNull
    private int pipecode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PIPE_LEVEL")
    private int pipeLevel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "PIPE_SHIFR")
    private String pipeShifr;
    @Basic(optional = false)
    @NotNull
    private int service;
    private Integer hidden;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;

    public HPipe() {
    }

    public HPipe(Integer code) {
        this.code = code;
    }

    public HPipe(Integer code, int pipecode, int pipeLevel, String pipeShifr, int service) {
        this.code = code;
        this.pipecode = pipecode;
        this.pipeLevel = pipeLevel;
        this.pipeShifr = pipeShifr;
        this.service = service;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getHProcdate() {
        return hProcdate;
    }

    public void setHProcdate(Integer hProcdate) {
        this.hProcdate = hProcdate;
    }

    public int getPipecode() {
        return pipecode;
    }

    public void setPipecode(int pipecode) {
        this.pipecode = pipecode;
    }

    public int getPipeLevel() {
        return pipeLevel;
    }

    public void setPipeLevel(int pipeLevel) {
        this.pipeLevel = pipeLevel;
    }

    public String getPipeShifr() {
        return pipeShifr;
    }

    public void setPipeShifr(String pipeShifr) {
        this.pipeShifr = pipeShifr;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public Integer getDoccode() {
        return doccode;
    }

    public void setDoccode(Integer doccode) {
        this.doccode = doccode;
    }

    public Integer getDocpos() {
        return docpos;
    }

    public void setDocpos(Integer docpos) {
        this.docpos = docpos;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
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
        if (!(object instanceof HPipe)) {
            return false;
        }
        HPipe other = (HPipe) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HPipe[ code=" + code + " ]";
    }
    
}
