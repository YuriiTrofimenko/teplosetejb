/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_PIPE_HEAT")
@NamedQueries({
    @NamedQuery(name = "DocPipeHeat.findAll", query = "SELECT d FROM DocPipeHeat d")})
public class DocPipeHeat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer pipecode;
    @Size(max = 128)
    private String remark;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocPipeHeatLoad> errDocPipeHeatLoadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pos")
    private List<DocPipeHeatLoad> docPipeHeatLoadList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocPipeHeat() {
    }

    public DocPipeHeat(Integer code) {
        this.code = code;
    }

    public DocPipeHeat(Integer code, int state) {
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

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<ErrDocPipeHeatLoad> getErrDocPipeHeatLoadList() {
        return errDocPipeHeatLoadList;
    }

    public void setErrDocPipeHeatLoadList(List<ErrDocPipeHeatLoad> errDocPipeHeatLoadList) {
        this.errDocPipeHeatLoadList = errDocPipeHeatLoadList;
    }

    public List<DocPipeHeatLoad> getDocPipeHeatLoadList() {
        return docPipeHeatLoadList;
    }

    public void setDocPipeHeatLoadList(List<DocPipeHeatLoad> docPipeHeatLoadList) {
        this.docPipeHeatLoadList = docPipeHeatLoadList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
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
        if (!(object instanceof DocPipeHeat)) {
            return false;
        }
        DocPipeHeat other = (DocPipeHeat) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocPipeHeat[ code=" + code + " ]";
    }
    
}
