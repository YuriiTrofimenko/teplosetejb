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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_ACCOUNT_FAMILY")
@NamedQueries({
    @NamedQuery(name = "DocAccountFamily.findAll", query = "SELECT d FROM DocAccountFamily d")})
public class DocAccountFamily implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private BigInteger accountcode;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocAccountFamily> errDocAccountFamilyList;
    @OneToMany(mappedBy = "pos")
    private List<DocAccountFamilyLine> docAccountFamilyLineList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;

    public DocAccountFamily() {
    }

    public DocAccountFamily(Integer code) {
        this.code = code;
    }

    public DocAccountFamily(Integer code, int state) {
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

    public BigInteger getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(BigInteger accountcode) {
        this.accountcode = accountcode;
    }

    public List<ErrDocAccountFamily> getErrDocAccountFamilyList() {
        return errDocAccountFamilyList;
    }

    public void setErrDocAccountFamilyList(List<ErrDocAccountFamily> errDocAccountFamilyList) {
        this.errDocAccountFamilyList = errDocAccountFamilyList;
    }

    public List<DocAccountFamilyLine> getDocAccountFamilyLineList() {
        return docAccountFamilyLineList;
    }

    public void setDocAccountFamilyLineList(List<DocAccountFamilyLine> docAccountFamilyLineList) {
        this.docAccountFamilyLineList = docAccountFamilyLineList;
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
        if (!(object instanceof DocAccountFamily)) {
            return false;
        }
        DocAccountFamily other = (DocAccountFamily) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAccountFamily[ code=" + code + " ]";
    }
    
}
