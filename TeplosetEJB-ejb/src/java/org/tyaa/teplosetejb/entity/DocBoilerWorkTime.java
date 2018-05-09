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
import javax.persistence.CascadeType;
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
@Table(name = "DOC_BOILER_WORK_TIME")
@NamedQueries({
    @NamedQuery(name = "DocBoilerWorkTime.findAll", query = "SELECT d FROM DocBoilerWorkTime d")})
public class DocBoilerWorkTime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer boilercode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "WORK_TIME")
    private BigDecimal workTime;
    @Size(max = 128)
    private String remark;
    private BigDecimal temperature;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocPipeWorkTime> errDocPipeWorkTimeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pos")
    private List<DocPipeWorkTime> docPipeWorkTimeList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocBoilerWorkTime() {
    }

    public DocBoilerWorkTime(Integer code) {
        this.code = code;
    }

    public DocBoilerWorkTime(Integer code, int state) {
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

    public Integer getBoilercode() {
        return boilercode;
    }

    public void setBoilercode(Integer boilercode) {
        this.boilercode = boilercode;
    }

    public BigDecimal getWorkTime() {
        return workTime;
    }

    public void setWorkTime(BigDecimal workTime) {
        this.workTime = workTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public List<ErrDocPipeWorkTime> getErrDocPipeWorkTimeList() {
        return errDocPipeWorkTimeList;
    }

    public void setErrDocPipeWorkTimeList(List<ErrDocPipeWorkTime> errDocPipeWorkTimeList) {
        this.errDocPipeWorkTimeList = errDocPipeWorkTimeList;
    }

    public List<DocPipeWorkTime> getDocPipeWorkTimeList() {
        return docPipeWorkTimeList;
    }

    public void setDocPipeWorkTimeList(List<DocPipeWorkTime> docPipeWorkTimeList) {
        this.docPipeWorkTimeList = docPipeWorkTimeList;
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
        if (!(object instanceof DocBoilerWorkTime)) {
            return false;
        }
        DocBoilerWorkTime other = (DocBoilerWorkTime) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocBoilerWorkTime[ code=" + code + " ]";
    }
    
}
