/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "MOV_ADD_PIPE")
@NamedQueries({
    @NamedQuery(name = "MovAddPipe.findAll", query = "SELECT m FROM MovAddPipe m")})
public class MovAddPipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long account;
    private Integer normcode;
    @Size(max = 16)
    private String uvid2;
    @Column(name = "UVID2_BEGINDATE")
    @Temporal(TemporalType.DATE)
    private Date uvid2Begindate;

    public MovAddPipe() {
    }

    public MovAddPipe(Long account) {
        this.account = account;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Integer getNormcode() {
        return normcode;
    }

    public void setNormcode(Integer normcode) {
        this.normcode = normcode;
    }

    public String getUvid2() {
        return uvid2;
    }

    public void setUvid2(String uvid2) {
        this.uvid2 = uvid2;
    }

    public Date getUvid2Begindate() {
        return uvid2Begindate;
    }

    public void setUvid2Begindate(Date uvid2Begindate) {
        this.uvid2Begindate = uvid2Begindate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (account != null ? account.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovAddPipe)) {
            return false;
        }
        MovAddPipe other = (MovAddPipe) object;
        if ((this.account == null && other.account != null) || (this.account != null && !this.account.equals(other.account))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tyaa.teplosetejb.entity.MovAddPipe[ account=" + account + " ]";
    }
    
}
