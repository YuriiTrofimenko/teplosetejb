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
import javax.persistence.Lob;
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
@Table(name = "SYS_DFM")
@NamedQueries({
    @NamedQuery(name = "SysDfm.findAll", query = "SELECT s FROM SysDfm s")})
public class SysDfm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    private String id;
    @Size(max = 32)
    @Column(name = "CLASS_NAME")
    private String className;
    @Lob
    @Size(max = 2147483647)
    private String dfm;
    @Size(max = 32)
    @Column(name = "ANCESTOR_ID")
    private String ancestorId;
    @Lob
    @Size(max = 2147483647)
    private String description;

    public SysDfm() {
    }

    public SysDfm(Integer code) {
        this.code = code;
    }

    public SysDfm(Integer code, String id) {
        this.code = code;
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDfm() {
        return dfm;
    }

    public void setDfm(String dfm) {
        this.dfm = dfm;
    }

    public String getAncestorId() {
        return ancestorId;
    }

    public void setAncestorId(String ancestorId) {
        this.ancestorId = ancestorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof SysDfm)) {
            return false;
        }
        SysDfm other = (SysDfm) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SysDfm[ code=" + code + " ]";
    }
    
}
