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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "PIPE_ENTRY")
@NamedQueries({
    @NamedQuery(name = "PipeEntry.findAll", query = "SELECT p FROM PipeEntry p")})
public class PipeEntry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PIPE_OBJECT")
    private long pipeObject;
    private BigInteger rversion;
    @Column(name = "PIPE_LEVEL")
    private Integer pipeLevel;
    private Integer doccode;
    private Integer docpos;
    @JoinColumn(name = "PIPECODE", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Pipe pipecode;

    public PipeEntry() {
    }

    public PipeEntry(Integer code) {
        this.code = code;
    }

    public PipeEntry(Integer code, long pipeObject) {
        this.code = code;
        this.pipeObject = pipeObject;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public Pipe getPipecode() {
        return pipecode;
    }

    public void setPipecode(Pipe pipecode) {
        this.pipecode = pipecode;
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
        if (!(object instanceof PipeEntry)) {
            return false;
        }
        PipeEntry other = (PipeEntry) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.PipeEntry[ code=" + code + " ]";
    }
    
}
