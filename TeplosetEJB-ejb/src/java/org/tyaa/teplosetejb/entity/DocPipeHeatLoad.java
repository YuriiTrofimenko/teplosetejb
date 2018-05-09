/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_PIPE_HEAT_LOAD")
@NamedQueries({
    @NamedQuery(name = "DocPipeHeatLoad.findAll", query = "SELECT d FROM DocPipeHeatLoad d")})
public class DocPipeHeatLoad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "CALC_PROCDATE_FROM")
    private Integer calcProcdateFrom;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HEAT_LOAD")
    private BigDecimal heatLoad;
    @Size(max = 128)
    private String remark;
    @Column(name = "PIPE_HEAT_LOAD_CODE")
    private Integer pipeHeatLoadCode;
    private Integer pipecode;
    @OneToMany(mappedBy = "pos1")
    private List<ErrDocPipeHeatLoad> errDocPipeHeatLoadList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private DocPipeHeat pos;

    public DocPipeHeatLoad() {
    }

    public DocPipeHeatLoad(Integer code) {
        this.code = code;
    }

    public DocPipeHeatLoad(Integer code, int state) {
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

    public Integer getCalcProcdateFrom() {
        return calcProcdateFrom;
    }

    public void setCalcProcdateFrom(Integer calcProcdateFrom) {
        this.calcProcdateFrom = calcProcdateFrom;
    }

    public BigDecimal getHeatLoad() {
        return heatLoad;
    }

    public void setHeatLoad(BigDecimal heatLoad) {
        this.heatLoad = heatLoad;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPipeHeatLoadCode() {
        return pipeHeatLoadCode;
    }

    public void setPipeHeatLoadCode(Integer pipeHeatLoadCode) {
        this.pipeHeatLoadCode = pipeHeatLoadCode;
    }

    public Integer getPipecode() {
        return pipecode;
    }

    public void setPipecode(Integer pipecode) {
        this.pipecode = pipecode;
    }

    public List<ErrDocPipeHeatLoad> getErrDocPipeHeatLoadList() {
        return errDocPipeHeatLoadList;
    }

    public void setErrDocPipeHeatLoadList(List<ErrDocPipeHeatLoad> errDocPipeHeatLoadList) {
        this.errDocPipeHeatLoadList = errDocPipeHeatLoadList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public DocPipeHeat getPos() {
        return pos;
    }

    public void setPos(DocPipeHeat pos) {
        this.pos = pos;
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
        if (!(object instanceof DocPipeHeatLoad)) {
            return false;
        }
        DocPipeHeatLoad other = (DocPipeHeatLoad) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocPipeHeatLoad[ code=" + code + " ]";
    }
    
}
