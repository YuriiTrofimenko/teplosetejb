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
@Table(name = "DOC_FOR_PAY_USZN")
@NamedQueries({
    @NamedQuery(name = "DocForPayUszn.findAll", query = "SELECT d FROM DocForPayUszn d")})
public class DocForPayUszn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "DOC_FOR_PAY")
    private Integer docForPay;
    @Column(name = "GROUP_SERVICE")
    private Integer groupService;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocForPayUszn() {
    }

    public DocForPayUszn(Integer code) {
        this.code = code;
    }

    public DocForPayUszn(Integer code, int state) {
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

    public Integer getDocForPay() {
        return docForPay;
    }

    public void setDocForPay(Integer docForPay) {
        this.docForPay = docForPay;
    }

    public Integer getGroupService() {
        return groupService;
    }

    public void setGroupService(Integer groupService) {
        this.groupService = groupService;
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
        if (!(object instanceof DocForPayUszn)) {
            return false;
        }
        DocForPayUszn other = (DocForPayUszn) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocForPayUszn[ code=" + code + " ]";
    }
    
}
