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
@Table(name = "DOC_BOILER")
@NamedQueries({
    @NamedQuery(name = "DocBoiler.findAll", query = "SELECT d FROM DocBoiler d")})
public class DocBoiler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int state;
    private Integer boilercode;
    @Size(max = 16)
    private String shifr;
    @Size(max = 64)
    private String name;
    @Size(max = 16)
    private String shortname;
    @Size(max = 128)
    private String address;
    @Size(max = 128)
    private String remark;
    private Integer hidden;
    private Integer tarea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pos")
    private List<DocBoilerentry> docBoilerentryList;
    @JoinColumn(name = "DOC", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private Docheaders doc;
    @OneToMany(mappedBy = "pos")
    private List<ErrDocBoiler> errDocBoilerList;

    public DocBoiler() {
    }

    public DocBoiler(Integer code) {
        this.code = code;
    }

    public DocBoiler(Integer code, int state) {
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

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getTarea() {
        return tarea;
    }

    public void setTarea(Integer tarea) {
        this.tarea = tarea;
    }

    public List<DocBoilerentry> getDocBoilerentryList() {
        return docBoilerentryList;
    }

    public void setDocBoilerentryList(List<DocBoilerentry> docBoilerentryList) {
        this.docBoilerentryList = docBoilerentryList;
    }

    public Docheaders getDoc() {
        return doc;
    }

    public void setDoc(Docheaders doc) {
        this.doc = doc;
    }

    public List<ErrDocBoiler> getErrDocBoilerList() {
        return errDocBoilerList;
    }

    public void setErrDocBoilerList(List<ErrDocBoiler> errDocBoilerList) {
        this.errDocBoilerList = errDocBoilerList;
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
        if (!(object instanceof DocBoiler)) {
            return false;
        }
        DocBoiler other = (DocBoiler) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.DocBoiler[ code=" + code + " ]";
    }
    
}
