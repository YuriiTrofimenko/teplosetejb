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

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "H_PIPE_ENTRY")
@NamedQueries({
    @NamedQuery(name = "HPipeEntry.findAll", query = "SELECT h FROM HPipeEntry h")})
public class HPipeEntry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Column(name = "H_PROCDATE")
    private Integer hProcdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PIPE_ENTRYCODE")
    private int pipeEntrycode;
    @Basic(optional = false)
    @NotNull
    private int pipecode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PIPE_OBJECT")
    private long pipeObject;
    private BigInteger rversion;
    @Column(name = "PIPE_LEVEL")
    private Integer pipeLevel;
    @Column(name = "SET_RVERSION")
    private Integer setRversion;
    private Integer doccode;
    private Integer docpos;

    public HPipeEntry() {
    }

    public HPipeEntry(Integer code) {
        this.code = code;
    }

    public HPipeEntry(Integer code, int pipeEntrycode, int pipecode, long pipeObject) {
        this.code = code;
        this.pipeEntrycode = pipeEntrycode;
        this.pipecode = pipecode;
        this.pipeObject = pipeObject;
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

    public int getPipeEntrycode() {
        return pipeEntrycode;
    }

    public void setPipeEntrycode(int pipeEntrycode) {
        this.pipeEntrycode = pipeEntrycode;
    }

    public int getPipecode() {
        return pipecode;
    }

    public void setPipecode(int pipecode) {
        this.pipecode = pipecode;
    }

    public long getPipeObject() {
        return pipeObject;
    }

    public void setPipeObject(long pipeObject) {
        this.pipeObject = pipeObject;
    }

    public BigInteger getRversion() {
        return rversion;
    }

    public void setRversion(BigInteger rversion) {
        this.rversion = rversion;
    }

    public Integer getPipeLevel() {
        return pipeLevel;
    }

    public void setPipeLevel(Integer pipeLevel) {
        this.pipeLevel = pipeLevel;
    }

    public Integer getSetRversion() {
        return setRversion;
    }

    public void setSetRversion(Integer setRversion) {
        this.setRversion = setRversion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HPipeEntry)) {
            return false;
        }
        HPipeEntry other = (HPipeEntry) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.HPipeEntry[ code=" + code + " ]";
    }
    
}
