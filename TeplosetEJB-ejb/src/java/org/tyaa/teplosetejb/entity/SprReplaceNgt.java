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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yurii
 */
@Entity
@Table(name = "SPR_REPLACE_NGT")
@NamedQueries({
    @NamedQuery(name = "SprReplaceNgt.findAll", query = "SELECT s FROM SprReplaceNgt s")})
public class SprReplaceNgt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    private int service;
    @Basic(optional = false)
    @NotNull
    private int fn;
    @Column(name = "NORM_OLD")
    private Integer normOld;
    @Column(name = "NORM_NEW")
    private Integer normNew;
    @Column(name = "GT_OLD")
    private Integer gtOld;
    @Column(name = "GT_NEW")
    private Integer gtNew;

    public SprReplaceNgt() {
    }

    public SprReplaceNgt(Integer code) {
        this.code = code;
    }

    public SprReplaceNgt(Integer code, int service, int fn) {
        this.code = code;
        this.service = service;
        this.fn = fn;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public int getFn() {
        return fn;
    }

    public void setFn(int fn) {
        this.fn = fn;
    }

    public Integer getNormOld() {
        return normOld;
    }

    public void setNormOld(Integer normOld) {
        this.normOld = normOld;
    }

    public Integer getNormNew() {
        return normNew;
    }

    public void setNormNew(Integer normNew) {
        this.normNew = normNew;
    }

    public Integer getGtOld() {
        return gtOld;
    }

    public void setGtOld(Integer gtOld) {
        this.gtOld = gtOld;
    }

    public Integer getGtNew() {
        return gtNew;
    }

    public void setGtNew(Integer gtNew) {
        this.gtNew = gtNew;
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
        if (!(object instanceof SprReplaceNgt)) {
            return false;
        }
        SprReplaceNgt other = (SprReplaceNgt) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprReplaceNgt[ code=" + code + " ]";
    }
    
}
