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
@Table(name = "DOC_OPEN_PIPE")
@NamedQueries({
    @NamedQuery(name = "DocOpenPipe.findAll", query = "SELECT d FROM DocOpenPipe d")})
public class DocOpenPipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "PIPE_LEVEL")
    private Integer pipeLevel;
    @Column(name = "OBJECT_CODE")
    private BigInteger objectCode;
    private Integer service;
    private Integer pipecode;
    @Size(max = 16)
    @Column(name = "PIPE_SHIFR")
    private String pipeShifr;
    @Column(name = "OWNER_OBJECT")
    private BigInteger ownerObject;
    @Column(name = "OWNER_PIPECODE")
    private Integer ownerPipecode;
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Temporal(TemporalType.DATE)
    private Date enddate;
    private Integer normcode;
    private Integer gt;
    @Size(max = 128)
    private String remark;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocOpenPipe> errDocOpenPipeList;

    public DocOpenPipe() {
    }

    public DocOpenPipe(Integer code) {
        this.code = code;
    }

    public DocOpenPipe(Integer code, int state) {
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

    public Integer getPipeLevel() {
        return pipeLevel;
    }

    public void setPipeLevel(Integer pipeLevel) {
        this.pipeLevel = pipeLevel;
    }

    public BigInteger getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(BigInteger objectCode) {
        this.objectCode = objectCode;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
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

    public BigInteger getOwnerObject() {
        return ownerObject;
    }

    public void setOwnerObject(BigInteger ownerObject) {
        this.ownerObject = ownerObject;
    }

    public Integer getOwnerPipecode() {
        return ownerPipecode;
    }

    public void setOwnerPipecode(Integer ownerPipecode) {
        this.ownerPipecode = ownerPipecode;
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

    public Integer getNormcode() {
        return normcode;
    }

    public void setNormcode(Integer normcode) {
        this.normcode = normcode;
    }

    public Integer getGt() {
        return gt;
    }

    public void setGt(Integer gt) {
        this.gt = gt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocOpenPipe> getErrDocOpenPipeList() {
        return errDocOpenPipeList;
    }

    public void setErrDocOpenPipeList(List<ErrDocOpenPipe> errDocOpenPipeList) {
        this.errDocOpenPipeList = errDocOpenPipeList;
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
        if (!(object instanceof DocOpenPipe)) {
            return false;
        }
        DocOpenPipe other = (DocOpenPipe) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocOpenPipe[ code=" + code + " ]";
    }
    
}
