/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Pipe.findAll", query = "SELECT p FROM Pipe p")})
public class Pipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PIPE_LEVEL")
    private int pipeLevel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "PIPE_SHIFR")
    private String pipeShifr;
    private Integer hidden;
    @Size(max = 16)
    @Column(name = "LINK_CODE")
    private String linkCode;
    private Integer doccode;
    private Integer docpos;
    private BigInteger rversion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "housePipecode")
    private List<HouseService> houseServiceList;
    @OneToMany(mappedBy = "pipecode")
    private List<PipeTopology> pipeTopologyList;
    @OneToMany(mappedBy = "ownerPipecode")
    private List<PipeTopology> pipeTopologyList1;
    @JoinColumn(name = "SERVICE", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private SprService service;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pipecode")
    private List<PipeEntry> pipeEntryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "housePipecode")
    private List<HouseArenda> houseArendaList;
    @OneToMany(mappedBy = "pipecode")
    private List<Stopper> stopperList;

    public Pipe() {
    }

    public Pipe(Integer code) {
        this.code = code;
    }

    public Pipe(Integer code, int pipeLevel, String pipeShifr) {
        this.code = code;
        this.pipeLevel = pipeLevel;
        this.pipeShifr = pipeShifr;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public List<HouseService> getHouseServiceList() {
        return houseServiceList;
    }

    public void setHouseServiceList(List<HouseService> houseServiceList) {
        this.houseServiceList = houseServiceList;
    }

    public List<PipeTopology> getPipeTopologyList() {
        return pipeTopologyList;
    }

    public void setPipeTopologyList(List<PipeTopology> pipeTopologyList) {
        this.pipeTopologyList = pipeTopologyList;
    }

    public List<PipeTopology> getPipeTopologyList1() {
        return pipeTopologyList1;
    }

    public void setPipeTopologyList1(List<PipeTopology> pipeTopologyList1) {
        this.pipeTopologyList1 = pipeTopologyList1;
    }

    public SprService getService() {
        return service;
    }

    public void setService(SprService service) {
        this.service = service;
    }

    public List<PipeEntry> getPipeEntryList() {
        return pipeEntryList;
    }

    public void setPipeEntryList(List<PipeEntry> pipeEntryList) {
        this.pipeEntryList = pipeEntryList;
    }

    public List<HouseArenda> getHouseArendaList() {
        return houseArendaList;
    }

    public void setHouseArendaList(List<HouseArenda> houseArendaList) {
        this.houseArendaList = houseArendaList;
    }

    public List<Stopper> getStopperList() {
        return stopperList;
    }

    public void setStopperList(List<Stopper> stopperList) {
        this.stopperList = stopperList;
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
        if (!(object instanceof Pipe)) {
            return false;
        }
        Pipe other = (Pipe) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.Pipe[ code=" + code + " ]";
    }
    
}
