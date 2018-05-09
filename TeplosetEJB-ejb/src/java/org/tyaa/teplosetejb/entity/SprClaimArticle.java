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
@Table(name = "SPR_CLAIM_ARTICLE")
@NamedQueries({
    @NamedQuery(name = "SprClaimArticle.findAll", query = "SELECT s FROM SprClaimArticle s")})
public class SprClaimArticle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    private String shifr;
    @Size(max = 48)
    private String name;
    @Size(max = 16)
    private String shortname;
    @Size(max = 128)
    private String remark;
    private Integer owner;
    private Integer iselement;

    public SprClaimArticle() {
    }

    public SprClaimArticle(Integer code) {
        this.code = code;
    }

    public SprClaimArticle(Integer code, String shifr) {
        this.code = code;
        this.shifr = shifr;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Integer getIselement() {
        return iselement;
    }

    public void setIselement(Integer iselement) {
        this.iselement = iselement;
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
        if (!(object instanceof SprClaimArticle)) {
            return false;
        }
        SprClaimArticle other = (SprClaimArticle) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.SprClaimArticle[ code=" + code + " ]";
    }
    
}
