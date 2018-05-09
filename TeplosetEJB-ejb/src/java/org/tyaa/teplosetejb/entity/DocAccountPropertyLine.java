/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
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

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "DOC_ACCOUNT_PROPERTY_LINE")
@NamedQueries({
    @NamedQuery(name = "DocAccountPropertyLine.findAll", query = "SELECT d FROM DocAccountPropertyLine d")})
public class DocAccountPropertyLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private long pos;
    @Basic(optional = false)
    @NotNull
    private int state;
    @Column(name = "PROPERTY_CODE")
    private Integer propertyCode;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos1")
    private List<ErrDocAccountProperty> errDocAccountPropertyList;

    public DocAccountPropertyLine() {
    }

    public DocAccountPropertyLine(Integer code) {
        this.code = code;
    }

    public DocAccountPropertyLine(Integer code, long pos, int state) {
        this.code = code;
        this.pos = pos;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public long getPos() {
        return pos;
    }

    public void setPos(long pos) {
        this.pos = pos;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Integer getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(Integer propertyCode) {
        this.propertyCode = propertyCode;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocAccountProperty> getErrDocAccountPropertyList() {
        return errDocAccountPropertyList;
    }

    public void setErrDocAccountPropertyList(List<ErrDocAccountProperty> errDocAccountPropertyList) {
        this.errDocAccountPropertyList = errDocAccountPropertyList;
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
        if (!(object instanceof DocAccountPropertyLine)) {
            return false;
        }
        DocAccountPropertyLine other = (DocAccountPropertyLine) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocAccountPropertyLine[ code=" + code + " ]";
    }
    
}
