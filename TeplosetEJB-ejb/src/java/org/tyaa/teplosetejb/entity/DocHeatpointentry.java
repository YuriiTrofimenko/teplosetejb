/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "DOC_HEATPOINTENTRY")
@NamedQueries({
    @NamedQuery(name = "DocHeatpointentry.findAll", query = "SELECT d FROM DocHeatpointentry d")})
public class DocHeatpointentry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "TOPOLOGY_CODE")
    private Integer topologyCode;
    private Integer pipecode;
    @Size(max = 16)
    @Column(name = "PIPE_SHIFR")
    private String pipeShifr;
    @Column(name = "OWNER_PIPECODE")
    private Integer ownerPipecode;
    @Column(name = "OWNER_OBJECT")
    private BigInteger ownerObject;
    private Integer service;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Size(max = 128)
    private String remark;
    @Column(name = "IS_DELETE")
    private Integer isDelete;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private DocHeatpoint pos;
    @OneToMany(mappedBy = "pos1")
    private List<ErrDocHeatpoint> errDocHeatpointList;

    public DocHeatpointentry() {
    }

    public DocHeatpointentry(Integer code) {
        this.code = code;
    }

    public DocHeatpointentry(Integer code, int state) {
        this.code = code;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Integer getTopologyCode() {
        return topologyCode;
    }

    public void setTopologyCode(Integer topologyCode) {
        this.topologyCode = topologyCode;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public String getPipeShifr() {
        return pipeShifr;
    }

    public void setPipeShifr(String pipeShifr) {
        this.pipeShifr = pipeShifr;
    }

    public Integer getOwnerPipecode() {
        return ownerPipecode;
    }

    public void setOwnerPipecode(Integer ownerPipecode) {
        this.ownerPipecode = ownerPipecode;
    }

    public BigInteger getOwnerObject() {
        return ownerObject;
    }

    public void setOwnerObject(BigInteger ownerObject) {
        this.ownerObject = ownerObject;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public DocHeatpoint getPos() {
        return pos;
    }

    public void setPos(DocHeatpoint pos) {
        this.pos = pos;
    }

    public List<ErrDocHeatpoint> getErrDocHeatpointList() {
        return errDocHeatpointList;
    }

    public void setErrDocHeatpointList(List<ErrDocHeatpoint> errDocHeatpointList) {
        this.errDocHeatpointList = errDocHeatpointList;
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
        if (!(object instanceof DocHeatpointentry)) {
            return false;
        }
        DocHeatpointentry other = (DocHeatpointentry) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocHeatpointentry[ code=" + code + " ]";
    }
    
}
