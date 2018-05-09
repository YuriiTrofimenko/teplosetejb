/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "ERR_DOC_ACCOUNT")
@NamedQueries({
    @NamedQuery(name = "ErrDocAccount.findAll", query = "SELECT e FROM ErrDocAccount e")})
public class ErrDocAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer systemmessagecode;
    @Size(max = 128)
    private String remark;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @JoinColumn(name = "POS", referencedColumnName = "CODE")
    @ManyToOne
    private DocAccount pos;
    @JoinColumn(name = "POS1", referencedColumnName = "CODE")
    @ManyToOne
    private DocAccountentry pos1;
    @JoinColumn(name = "POS2", referencedColumnName = "CODE")
    @ManyToOne
    private DocAccountmeter pos2;

    public ErrDocAccount() {
    }

    public ErrDocAccount(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getSystemmessagecode() {
        return systemmessagecode;
    }

    public void setSystemmessagecode(Integer systemmessagecode) {
        this.systemmessagecode = systemmessagecode;
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

    public DocAccount getPos() {
        return pos;
    }

    public void setPos(DocAccount pos) {
        this.pos = pos;
    }

    public DocAccountentry getPos1() {
        return pos1;
    }

    public void setPos1(DocAccountentry pos1) {
        this.pos1 = pos1;
    }

    public DocAccountmeter getPos2() {
        return pos2;
    }

    public void setPos2(DocAccountmeter pos2) {
        this.pos2 = pos2;
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
        if (!(object instanceof ErrDocAccount)) {
            return false;
        }
        ErrDocAccount other = (ErrDocAccount) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.ErrDocAccount[ code=" + code + " ]";
    }
    
}
