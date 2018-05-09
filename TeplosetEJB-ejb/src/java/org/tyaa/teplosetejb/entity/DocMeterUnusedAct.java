/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
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
@Table(name = "DOC_METER_UNUSED_ACT")
@NamedQueries({
    @NamedQuery(name = "DocMeterUnusedAct.findAll", query = "SELECT d FROM DocMeterUnusedAct d")})
public class DocMeterUnusedAct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Size(max = 16)
    @Column(name = "ACT_NUMBER")
    private String actNumber;
    @Column(name = "ACT_DATE")
    @Temporal(TemporalType.DATE)
    private Date actDate;
    @Column(name = "ACT_SERVICE")
    private Integer actService;
    @Column(name = "ACT_TYPE")
    private Integer actType;
    @Size(max = 128)
    private String remark;
    @Column(name = "IS_DELETE")
    private Integer isDelete;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocMeterUnusedAct> errDocMeterUnusedActList;

    public DocMeterUnusedAct() {
    }

    public DocMeterUnusedAct(Integer code) {
        this.code = code;
    }

    public DocMeterUnusedAct(Integer code, int state) {
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

    public String getActNumber() {
        return actNumber;
    }

    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    public Date getActDate() {
        return actDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    public Integer getActService() {
        return actService;
    }

    public void setActService(Integer actService) {
        this.actService = actService;
    }

    public Integer getActType() {
        return actType;
    }

    public void setActType(Integer actType) {
        this.actType = actType;
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

    public List<ErrDocMeterUnusedAct> getErrDocMeterUnusedActList() {
        return errDocMeterUnusedActList;
    }

    public void setErrDocMeterUnusedActList(List<ErrDocMeterUnusedAct> errDocMeterUnusedActList) {
        this.errDocMeterUnusedActList = errDocMeterUnusedActList;
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
        if (!(object instanceof DocMeterUnusedAct)) {
            return false;
        }
        DocMeterUnusedAct other = (DocMeterUnusedAct) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocMeterUnusedAct[ code=" + code + " ]";
    }
    
}
