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
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Datachanges.findAll", query = "SELECT d FROM Datachanges d")})
public class Datachanges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int procdate;
    @Basic(optional = false)
    @NotNull
    private int recalcprocdate;
    @Basic(optional = false)
    @NotNull
    private int pipecode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PIPE_LEVEL")
    private int pipeLevel;
    private Integer doc;
    private Integer docpos;
    private Integer calcprocdate;
    private Integer excl;
    private Integer saldokind;

    public Datachanges() {
    }

    public Datachanges(Integer code) {
        this.code = code;
    }

    public Datachanges(Integer code, int procdate, int recalcprocdate, int pipecode, int pipeLevel) {
        this.code = code;
        this.procdate = procdate;
        this.recalcprocdate = recalcprocdate;
        this.pipecode = pipecode;
        this.pipeLevel = pipeLevel;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getProcdate() {
        return procdate;
    }

    public void setProcdate(int procdate) {
        this.procdate = procdate;
    }

    public int getRecalcprocdate() {
        return recalcprocdate;
    }

    public void setRecalcprocdate(int recalcprocdate) {
        this.recalcprocdate = recalcprocdate;
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

    public Integer getDoc() {
        return doc;
    }

    public void setDoc(Integer doc) {
        this.doc = doc;
    }

    public Integer getDocpos() {
        return docpos;
    }

    public void setDocpos(Integer docpos) {
        this.docpos = docpos;
    }

    public Integer getCalcprocdate() {
        return calcprocdate;
    }

    public void setCalcprocdate(Integer calcprocdate) {
        this.calcprocdate = calcprocdate;
    }

    public Integer getExcl() {
        return excl;
    }

    public void setExcl(Integer excl) {
        this.excl = excl;
    }

    public Integer getSaldokind() {
        return saldokind;
    }

    public void setSaldokind(Integer saldokind) {
        this.saldokind = saldokind;
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
        if (!(object instanceof Datachanges)) {
            return false;
        }
        Datachanges other = (Datachanges) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Datachanges[ code=" + code + " ]";
    }
    
}
