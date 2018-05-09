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
@Table(name = "SPR_WEAL_EXTERNAL_LINK")
@NamedQueries({
    @NamedQuery(name = "SprWealExternalLink.findAll", query = "SELECT s FROM SprWealExternalLink s")})
public class SprWealExternalLink implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    private Integer owner;
    private Integer normcode;
    private Integer service;
    private Integer formnach;
    private Integer gt;
    private Integer code0;
    private Integer code1;
    private Integer code2;
    private Integer code3;
    @Size(max = 128)
    private String remark;

    public SprWealExternalLink() {
    }

    public SprWealExternalLink(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Integer getNormcode() {
        return normcode;
    }

    public void setNormcode(Integer normcode) {
        this.normcode = normcode;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getFormnach() {
        return formnach;
    }

    public void setFormnach(Integer formnach) {
        this.formnach = formnach;
    }

    public Integer getGt() {
        return gt;
    }

    public void setGt(Integer gt) {
        this.gt = gt;
    }

    public Integer getCode0() {
        return code0;
    }

    public void setCode0(Integer code0) {
        this.code0 = code0;
    }

    public Integer getCode1() {
        return code1;
    }

    public void setCode1(Integer code1) {
        this.code1 = code1;
    }

    public Integer getCode2() {
        return code2;
    }

    public void setCode2(Integer code2) {
        this.code2 = code2;
    }

    public Integer getCode3() {
        return code3;
    }

    public void setCode3(Integer code3) {
        this.code3 = code3;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        if (!(object instanceof SprWealExternalLink)) {
            return false;
        }
        SprWealExternalLink other = (SprWealExternalLink) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprWealExternalLink[ code=" + code + " ]";
    }
    
}
