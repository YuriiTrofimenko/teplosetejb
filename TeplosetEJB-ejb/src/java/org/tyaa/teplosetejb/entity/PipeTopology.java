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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "PIPE_TOPOLOGY")
@NamedQueries({
    @NamedQuery(name = "PipeTopology.findAll", query = "SELECT p FROM PipeTopology p")})
public class PipeTopology implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    private Integer hidden;
    @JoinColumn(name = "PIPECODE", referencedColumnName = "CODE")
    @ManyToOne
    private Pipe pipecode;
    @JoinColumn(name = "OWNER_PIPECODE", referencedColumnName = "CODE")
    @ManyToOne
    private Pipe ownerPipecode;

    public PipeTopology() {
    }

    public PipeTopology(Integer code) {
        this.code = code;
    }

    public PipeTopology(Integer code, Date begindate) {
        this.code = code;
        this.begindate = begindate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Pipe getPipecode() {
        return pipecode;
    }

    public void setPipecode(Pipe pipecode) {
        this.pipecode = pipecode;
    }

    public Pipe getOwnerPipecode() {
        return ownerPipecode;
    }

    public void setOwnerPipecode(Pipe ownerPipecode) {
        this.ownerPipecode = ownerPipecode;
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
        if (!(object instanceof PipeTopology)) {
            return false;
        }
        PipeTopology other = (PipeTopology) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.PipeTopology[ code=" + code + " ]";
    }
    
}
